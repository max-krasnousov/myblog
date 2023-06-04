package my.sumdu.blog.controllers;

import my.sumdu.blog.dao.DAOComment;
import my.sumdu.blog.dao.DAOPost;
import my.sumdu.blog.dao.DAOUser;
import my.sumdu.blog.entities.CommentUserParent;
import my.sumdu.blog.entities.Post;
import my.sumdu.blog.entities.PostAndUser;
import my.sumdu.blog.entities.User;
import my.sumdu.blog.tools.exceptions.WrongEntityIdException;
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static my.sumdu.blog.tools.strings.PageName.*;

@org.springframework.stereotype.Controller
public class PostController extends Controller {
    private final DAOPost daoPost;
    private final DAOComment daoComment;
    private final DAOUser daoUser;
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final Logger logger = Logger.getLogger(PostController.class);


    @Autowired
    public PostController(DAOPost daoPost, DAOComment daoComment, DAOUser daoUser) {
        this.daoPost = daoPost;
        this.daoComment = daoComment;
        this.daoUser = daoUser;
    }

    @RequestMapping(value = "/add/post", method= RequestMethod.POST)
    public ModelAndView addNewPost(@RequestParam("postName") String postName,
                                   @RequestParam("postText") String postText,
                                   HttpServletRequest request) {

        if (!isLogInUserAction(request))
            return redirectToLogin(request);

        ModelAndView modelAndView = new ModelAndView();
        LocalDateTime now = LocalDateTime.now();
        HttpSession session = request.getSession(false);
        String currentUserId = (String) session.getAttribute(AttributeName.CURRENT_USER_ID.getAttributeName());

        try {
            daoPost.addPost(new Post(
                    null, postText, postName,
                    DATE_TIME_FORMATTER.format(now),
                    currentUserId, null
            ));
            modelAndView.setViewName("redirect:/show/post-list");
        } catch (SQLException e) {
            logger.warn(e);
            modelAndView.setViewName(ERROR_PAGE.getPageName());
        }

        return modelAndView;
    }

    @RequestMapping(value = "/redirect/add/post", method= RequestMethod.GET)
    public ModelAndView redirectAddPost(HttpServletRequest request) {

        if (!isLogInUserAction(request))
            return redirectToLogin(request);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(PageName.ADD_POST_PAGE.getPageName());
        return modelAndView;
    }

    @RequestMapping(value = "/show/post", method= RequestMethod.GET)
    public ModelAndView showByPostId(@RequestParam("postId") String postId,
                                     HttpServletRequest request) {

        if (!isLogInUserAction(request))
            return redirectToLogin(request);

        ModelAndView modelAndView = new ModelAndView();
        Post post = null;
        User postUser = null;
        List<CommentUserParent> comments = null;

        try {
            post = daoPost.getPostById(postId);
            postUser = daoUser.getUserById(post.getPostUserId());
            comments = daoComment.getCommentSetByPostId(postId);
            modelAndView.addObject("post", post);
            modelAndView.addObject("postUser", postUser);
            modelAndView.addObject("comments", comments);
            modelAndView.setViewName(SHOW_POST_PAGE.getPageName());
        } catch (WrongEntityIdException e) {
            logger.warn(e);
            modelAndView.setViewName(ERROR_PAGE.getPageName());
        }

        return modelAndView;
    }

    @RequestMapping(value = "/show/post-list", method= RequestMethod.GET)
    public ModelAndView showPostsList(@RequestParam(required = false) String page,
                                      HttpServletRequest request) {

        if (!isLogInUserAction(request))
            return redirectToLogin(request);

        ModelAndView modelAndView = new ModelAndView();
        int currentPage;
        Integer countOfPages = daoPost.getPageCount();
        List<PostAndUser> posts = null;
        if (page == null || "".equals(page))  {
            currentPage = 1;
        } else {
            currentPage = Integer.parseInt(page);
            if (currentPage < 1 || currentPage > countOfPages)
                currentPage = 1;
        }
        try {
            posts = daoPost.getPostSetByPage(currentPage);
            modelAndView.addObject("posts", posts);
            modelAndView.addObject("currentPage", currentPage);
            modelAndView.addObject("countOfPages", countOfPages);
            modelAndView.setViewName(SHOW_POSTS_PAGE.getPageName());
        } catch (WrongEntityIdException e) {
            logger.warn(e);
            modelAndView.setViewName(ERROR_PAGE.getPageName());
        }

        return modelAndView;
    }
}
