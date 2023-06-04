package my.sumdu.blog.dao;

import my.sumdu.blog.entities.User;
import org.apache.log4j.Logger;
import my.sumdu.blog.entities.Comment;
import my.sumdu.blog.entities.CommentUserParent;
import my.sumdu.blog.tools.exceptions.WrongEntityIdException;
import my.sumdu.blog.tools.strings.SQLRequests;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DAOComment extends OracleConnection {

    private static final Logger logger = Logger.getLogger(DAOComment.class);

    public Comment getCommentById(String id) throws WrongEntityIdException {
        try {
            connect();
            statement = connection.prepareStatement(
                    SQLRequests.COMMENT_BY_ID.getQuery());

            statement.setInt(1, Integer.parseInt(id));
            result = statement.executeQuery();
            if(result.next()) {
                return Comment.parse(result);
            } else {
                throw new WrongEntityIdException("desc ");
            }
        } catch (SQLException | WrongEntityIdException e) {
            logger.warn(e);
            throw new WrongEntityIdException("desc ", e);
        } finally {
            disconnect();
        }
    }

    public void addComment(Comment comment) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.ADD_COMMENT.getQuery());
            statement.setString(1, comment.getCommentText());
            statement.setString(2, comment.getCommentDateTime());
            statement.setInt(3, Integer.parseInt(comment.getCommentUserId()));
            statement.setInt(4, Integer.parseInt(comment.getCommentPostId()));
            if (comment.getCommentParentId() == null || comment.getCommentParentId().isEmpty()) {
                statement.setNull(5, Types.INTEGER);
            } else {
                statement.setInt(5, Integer.parseInt(comment.getCommentParentId()));
            }
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public void updateComment(String commentId, String commentText, String commentDateTime) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.UPDATE_COMMENT.getQuery());
            statement.setString(1, commentText);
            statement.setString(2, commentDateTime);
            statement.setInt(3, Integer.parseInt(commentId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public void updateComment(Comment comment) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.UPDATE_COMMENT.getQuery());
            statement.setString(1, comment.getCommentText());
            statement.setString(2, comment.getCommentDateTime());
            statement.setInt(3, Integer.parseInt(comment.getCommentId()));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public List<Comment> getCommentsByPostId(String postId) throws WrongEntityIdException {
        try {
            connect();
            java.util.List<Comment> list = new ArrayList<>();
            statement = connection.prepareStatement(SQLRequests.SELECT_COMMENTS_PER_POST.getQuery());
            statement.setInt(1, Integer.parseInt(postId));
            result = statement.executeQuery();
            while (result.next()) {
                list.add(Comment.parse(result));
            }
            return list;
        } catch (SQLException e) {
            logger.warn(e);
            throw new WrongEntityIdException("desc", e);
        } finally {
            disconnect();
        }
    }

    public void deleteCommentTree(String commentId) {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.DELETE_COMMENT_TREE_BY_COMMENT_ID.getQuery());
            statement.setInt(1, Integer.parseInt(commentId));
            statement.setInt(2, Integer.parseInt(commentId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
        } finally {
            disconnect();
        }
    }

    public CommentUserParent getCommentSet(String commentId) throws WrongEntityIdException {
        DAOUser daoUser = new DAOUser();

        Comment comment = getCommentById(commentId);
        User commentUser = daoUser.getUserById(comment.getCommentUserId());
        User parentUser = null;

        if (comment.getCommentParentId() != null
                && !"".equals(comment.getCommentParentId())) {
            parentUser = daoUser.getUserById(
                    getCommentById(comment.getCommentParentId())
                    .getCommentUserId()
            );
        }

        return new CommentUserParent(comment, commentUser, parentUser);
    }

    public List<CommentUserParent> getCommentSetList(List<Comment> list) throws WrongEntityIdException {
        List<CommentUserParent> commentUserParent =  new ArrayList<>();
        for (Comment c: list) {
            commentUserParent.add(getCommentSet(c.getCommentId()));
        }
        return commentUserParent;
    }

    public List<CommentUserParent> getCommentSetByPostId(String postId) throws WrongEntityIdException {
        List<Comment> comments = getCommentsByPostId(postId);
        return getCommentSetList(comments);
    }

    public void deleteCommentsByUserId(String userId) {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.DELETE_COMMENT_BY_USER_ID.getQuery());
            statement.setInt(1, Integer.parseInt(userId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
        } finally {
            disconnect();
        }
    }
}
