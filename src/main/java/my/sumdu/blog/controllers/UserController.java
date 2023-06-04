package my.sumdu.blog.controllers;


import my.sumdu.blog.dao.DAOComment;
import my.sumdu.blog.dao.DAOPost;
import my.sumdu.blog.dao.DAOUser;
import my.sumdu.blog.entities.Post;
import my.sumdu.blog.entities.User;
import my.sumdu.blog.tools.MailUtils;
import my.sumdu.blog.tools.exceptions.WrongEntityIdException;
import my.sumdu.blog.tools.strings.AttributeName;
import my.sumdu.blog.tools.strings.PageName;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.MessagingException;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.UUID;

import static my.sumdu.blog.tools.strings.PageName.*;
import static my.sumdu.blog.tools.strings.PageName.LOGIN_PAGE;

@org.springframework.stereotype.Controller
public class UserController extends Controller {
    private final DAOPost daoPost;
    private final DAOComment daoComment;
    private final DAOUser daoUser;
    private static final Logger logger = Logger.getLogger(UserController.class);


    @Autowired
    public UserController(DAOPost daoPost, DAOComment daoComment, DAOUser daoUser) {
        this.daoPost = daoPost;
        this.daoComment = daoComment;
        this.daoUser = daoUser;
    }


    @RequestMapping(value = "/show/profile", method= RequestMethod.GET)
    public ModelAndView showByUserId(@RequestParam("userId") String userId,
                                     HttpServletRequest request) {

        if (!isLogInUserAction(request))
            return redirectToLogin(request);

        ModelAndView modelAndView = new ModelAndView();
        String profileUserId = null;
        User user = null;
        HashMap<Post, String> postsWithC = null;

        if (userId == null || "".equals(userId)) {
            profileUserId = userId;
        } else {
            HttpSession session = request.getSession(false);
            profileUserId = (String) session.getAttribute(AttributeName.CURRENT_USER_ID.getAttributeName());
        }

        try {
            user = daoUser.getUserById(profileUserId);
            postsWithC = daoPost.getPostWithCommentCount(profileUserId);
            modelAndView.addObject("user", user);
            modelAndView.addObject("postsWithC", postsWithC);
            modelAndView.setViewName(BLOG_PROFILE_PAGE.getPageName());
        } catch (WrongEntityIdException e) {
            logger.warn(e);
            modelAndView.setViewName(ERROR_PAGE.getPageName());
        }


        return modelAndView;
    }

    @RequestMapping(value = "/redirect/reset-password", method= RequestMethod.GET)
    public ModelAndView redirectResetPassword(@RequestParam("token") String token) {
        ModelAndView modelAndView = new ModelAndView();

        try {
            if (token != null && !"".equals(token)) {
                daoUser.getUserByToken(token);
                modelAndView.addObject("userToken", token);
                modelAndView.setViewName(PageName.BLOG_RESET_PASSWORD_PAGE.getPageName());
            } else {
                throw new WrongEntityIdException("Empty token");
            }
        } catch (WrongEntityIdException e) {
            logger.warn(e);
            modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "Invalid Token, try again!");
            modelAndView.setViewName(PageName.BLOG_RESET_PASSWORD_PAGE.getPageName());
        }

        return modelAndView;
    }

    @RequestMapping(value = "/redirect/forgot-password", method= RequestMethod.GET)
    public ModelAndView redirectForgotPassword() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(PageName.BLOG_FORGOT_PASSWORD_PAGE.getPageName());
        return modelAndView;
    }

    @RequestMapping(value = "/edit/forgot-password", method= RequestMethod.POST)
    public ModelAndView editUserResetToken(@RequestParam("email") String email) {
        ModelAndView modelAndView = new ModelAndView();

        try {
            if (daoUser.isExistUserByEmail(email)) {
                User user = daoUser.getUserByEmail(email);
                daoUser.setResetToken(user.getUserId(), UUID.randomUUID().toString());
                user = daoUser.getUserById(user.getUserId());
                MailUtils.sendEmail(user);
                modelAndView.addObject(AttributeName.SUCCESS_MESSAGE.getAttributeName(), "Check your mail box!");
            } else {
                modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "Wrong Email!");
            }
            modelAndView.setViewName(BLOG_FORGOT_PASSWORD_PAGE.getPageName());
        } catch (SQLException | WrongEntityIdException | MessagingException | NamingException e) {
            logger.warn(e);
            modelAndView.setViewName(ERROR_PAGE.getPageName());
        }
        return modelAndView;
    }

    @RequestMapping(value = "/edit/reset-password/{token}", method= RequestMethod.POST)
    public ModelAndView resetUserPassword(@RequestParam("newPassword") String newPassword,
                                          @RequestParam("cPassword") String cPassword,
                                          @PathVariable String token) {

        ModelAndView modelAndView = new ModelAndView();

        if (newPassword.isEmpty() || cPassword.isEmpty()
                || !newPassword.equals(cPassword)) {
            modelAndView.addObject("userToken", token);
            modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "Please enter valid password!");
            modelAndView.setViewName(BLOG_RESET_PASSWORD_PAGE.getPageName());
        } else {
            try {
                User user = daoUser.getUserByToken(token);
                daoUser.setNewPassword(user.getUserId(), newPassword);
                daoUser.setResetToken(user.getUserId(), null);
                modelAndView.addObject(AttributeName.SUCCESS_MESSAGE.getAttributeName(), "Password changed successfully!");
                modelAndView.setViewName(LOGIN_PAGE.getPageName());
            } catch (WrongEntityIdException e) {
                logger.warn(e);
                modelAndView.addObject(AttributeName.EXCEPTION_MESSAGE.getAttributeName(), "Wrong token!");
                modelAndView.setViewName(LOGIN_PAGE.getPageName());
            } catch (SQLException e) {
                logger.warn(e);
                modelAndView.setViewName(ERROR_PAGE.getPageName());
            }
        }

        return modelAndView;
    }

    @RequestMapping(value = "/edit/userCommon/{userId}", method= RequestMethod.POST)
    public ModelAndView editUserCommon(@RequestParam("firstName") String firstName,
                                       @RequestParam("lastName") String lastName,
                                       @RequestParam("birthday") String birthday,
                                       @PathVariable String userId,
                                       HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        try {
            daoUser.updateUserCommon(userId, firstName, lastName, birthday);
            User user = daoUser.getUserById(userId);
            setBaseBlogSessionVariables(request, user);
            modelAndView.setViewName("redirect:/show/profile?userId=" + user.getUserId());
        } catch (SQLException | WrongEntityIdException e) {
            logger.warn(e);
            modelAndView.setViewName(ERROR_PAGE.getPageName());
        }
        return modelAndView;
    }
}
