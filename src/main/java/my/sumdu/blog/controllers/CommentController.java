package my.sumdu.blog.controllers;


import my.sumdu.blog.dao.DAOComment;
import my.sumdu.blog.dao.DAOPost;
import my.sumdu.blog.dao.DAOUser;
import my.sumdu.blog.entities.Comment;
import my.sumdu.blog.entities.Post;
import my.sumdu.blog.tools.exceptions.WrongEntityIdException;
import my.sumdu.blog.tools.strings.AttributeName;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static my.sumdu.blog.tools.strings.PageName.ERROR_PAGE;

@Controller
public class CommentController {
    private final DAOPost daoPost;
    private final DAOComment daoComment;
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final Logger logger = Logger.getLogger(CommentController.class);


    @Autowired
    public CommentController(DAOPost daoPost, DAOComment daoComment, DAOUser daoUser) {
        this.daoPost = daoPost;
        this.daoComment = daoComment;
    }

    @RequestMapping(value = "/add/comment", method= RequestMethod.POST)
    public ModelAndView addNewComment(@RequestParam("commentText") String commentText,
                                      @RequestParam("postId") String postId,
                                      @RequestParam("parentId") String parentId,
                                      HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        LocalDateTime now = LocalDateTime.now();
        HttpSession session = request.getSession(false);
        String currentUserId = (String) session.getAttribute(AttributeName.CURRENT_USER_ID.getAttributeName());

        try {
            Post post = daoPost.getPostById(postId);
            daoComment.addComment(new Comment(
                    null, commentText, DATE_TIME_FORMATTER.format(now),
                    currentUserId, postId, "".equals(parentId) ? null : parentId, null
            ));
            modelAndView.setViewName("redirect:/show/post?postId=" + post.getPostId());
        } catch (SQLException | WrongEntityIdException e) {
            logger.warn(e);
            modelAndView.setViewName(ERROR_PAGE.getPageName());
        }

        return modelAndView;
    }


}
