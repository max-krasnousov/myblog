package my.sumdu.blog.controllers;

import my.sumdu.blog.dao.DAOComment;
import my.sumdu.blog.dao.DAOPost;
import my.sumdu.blog.dao.DAOUser;
import my.sumdu.blog.entities.User;
import my.sumdu.blog.tools.exceptions.WrongEntityIdException;
import my.sumdu.blog.tools.exceptions.WrongLoginDataException;
import my.sumdu.blog.tools.strings.AttributeName;
import my.sumdu.blog.tools.strings.PageName;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.sql.SQLException;

import static my.sumdu.blog.tools.strings.PageName.LOGIN_PAGE;
import static my.sumdu.blog.tools.strings.PageName.REGISTRATION_PAGE;

@org.springframework.stereotype.Controller
public class CommonController extends Controller {

    private final DAOPost daoPost;
    private final DAOComment daoComment;
    private final DAOUser daoUser;
    private static final Logger logger = Logger.getLogger(CommonController.class);
    private final static String LOGIN_USER_EMAIL = "test@gmail.com";
    private final static String REG_USER_EMAIL = "reg@gmail.com";


    @Autowired
    public CommonController(DAOPost daoPost, DAOComment daoComment, DAOUser daoUser) {
        this.daoPost = daoPost;
        this.daoComment = daoComment;
        this.daoUser = daoUser;
    }

    @RequestMapping(value = "/redirect/login", method= RequestMethod.GET)
    public ModelAndView redirectLogin() {
        return new ModelAndView(PageName.LOGIN_PAGE.getPageName());
    }

    @RequestMapping(value = "/redirect/registration", method= RequestMethod.GET)
    public ModelAndView redirectRegistration() {
        return new ModelAndView(PageName.REGISTRATION_PAGE.getPageName());
    }

    @RequestMapping(value = "/edit/clean-test-user", method= RequestMethod.GET)
    public ModelAndView editUserCommon(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        try {
            User testUser = daoUser.getUserByEmail(LOGIN_USER_EMAIL);
            daoComment.deleteCommentsByUserId(testUser.getUserId());
            daoPost.deletePostsByUserId(testUser.getUserId());
            daoUser.deleteUserByEmail(REG_USER_EMAIL);
        } catch (WrongEntityIdException e) {
            logger.warn(e);
        }
        modelAndView.setViewName(LOGIN_PAGE.getPageName());
        return modelAndView;
    }

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public ModelAndView start() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(LOGIN_PAGE.getPageName());
        return modelAndView;
    }

    @RequestMapping(value = "/logout", method= RequestMethod.GET)
    public ModelAndView logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        session.invalidate();
        return new ModelAndView("redirect:/redirect/login");
    }

    @RequestMapping(value = "/login", method= RequestMethod.POST)
    public ModelAndView checkUser(@RequestParam("loginUserName") String email,
                                  @RequestParam("loginPassword") String password,
                                  HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        try {
            if (daoUser.isExistUserByEmail(email)) {
                User user = daoUser.getUserByEmailAndPassword(email, password);
                setBaseBlogSessionVariables(request, user);
                modelAndView.setViewName("redirect:/show/post-list");
            } else {
                modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "You entered wrong login!");
                modelAndView.setViewName(LOGIN_PAGE.getPageName());
            }
        } catch (SQLException e) {
            logger.warn(e);
            modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "Sorry, we have unexpected error!");
            modelAndView.setViewName(LOGIN_PAGE.getPageName());
        } catch (WrongLoginDataException e) {
            logger.warn(e);
            modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "You entered wrong password!");
            modelAndView.setViewName(LOGIN_PAGE.getPageName());
        }
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method= RequestMethod.POST)
    public ModelAndView registrationUser(@RequestParam("email") String email,
                                         @RequestParam("firstName") String firstName,
                                         @RequestParam("lastName") String lastName,
                                         @RequestParam("birthday") String birthday,
                                         @RequestParam("password") String password,
                                         @RequestParam("cPassword") String cPassword) {

        ModelAndView modelAndView = new ModelAndView();
        try {
            if (daoUser.isExistUserByEmail(email)) {
                modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "This email already registered!");
                modelAndView.setViewName(REGISTRATION_PAGE.getPageName());
            } else if (!password.equals(cPassword)) {
                modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "Password and Confirm Password are different!");
                modelAndView.setViewName(REGISTRATION_PAGE.getPageName());
            } else {

                daoUser.addUser(new User(
                        null, email,
                        firstName, lastName,
                        password, birthday
                ));
                modelAndView.setViewName(LOGIN_PAGE.getPageName());
            }
        } catch (SQLException e) {
            logger.warn(e);
            modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "Sorry, we have unexpected error!");
            modelAndView.setViewName(REGISTRATION_PAGE.getPageName());
        }
        return modelAndView;
    }
}
