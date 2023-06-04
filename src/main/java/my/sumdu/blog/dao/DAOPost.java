package my.sumdu.blog.dao;

import my.sumdu.blog.entities.Post;
import my.sumdu.blog.entities.PostAndUser;
import my.sumdu.blog.entities.User;
import my.sumdu.blog.tools.exceptions.WrongEntityIdException;
import my.sumdu.blog.tools.strings.SQLRequests;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class DAOPost extends OracleConnection {
    public static final Integer PAGINATION_POST_BY_PAGE = 6;
    private static final Logger logger = Logger.getLogger(DAOPost.class);

    public Post getPostById(String id) throws WrongEntityIdException {
        try {
            connect();
            statement = connection.prepareStatement(
                    SQLRequests.POST_BY_ID.getQuery());

            statement.setInt(1, Integer.parseInt(id));
            result = statement.executeQuery();
            if(result.next()) {
                return Post.parse(result);
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

    public List<Post> getPostsByUserId(String userId) throws WrongEntityIdException {

        try {
            connect();
            ArrayList<Post> posts =  new ArrayList<>();
            statement = connection.prepareStatement(
                    SQLRequests.POSTS_BY_USER_ID.getQuery());

            statement.setInt(1, Integer.parseInt(userId));
            result = statement.executeQuery();
            while(result.next()) {
                posts.add(Post.parse(result));
            }

            return posts;
        } catch (SQLException e) {
            logger.warn(e);
            throw new WrongEntityIdException("desc ", e);
        } finally {
            disconnect();
        }

    }

    public void addPost(Post post) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.ADD_POST.getQuery());
            statement.setString(1, post.getPostText());
            statement.setString(2, post.getPostName());
            statement.setString(3, post.getPostDateTime());
            statement.setInt(4, Integer.parseInt(post.getPostUserId()));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public void updatePost(String postId, String postText, String postName, String postDateTime) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.UPDATE_POST.getQuery());
            statement.setString(1, postText);
            statement.setString(2, postName);
            statement.setString(3, postDateTime);
            statement.setInt(4, Integer.parseInt(postId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public void updatePost(Post post) throws SQLException {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.UPDATE_POST.getQuery());
            statement.setString(1, post.getPostText());
            statement.setString(2, post.getPostName());
            statement.setString(3, post.getPostDateTime());
            statement.setInt(4, Integer.parseInt(post.getPostId()));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
            throw new SQLException("desc", e);
        } finally {
            disconnect();
        }
    }

    public List<Post> getPostsByPage(Integer pageNumber) throws WrongEntityIdException {
        try {
            connect();
            java.util.List<Post> list = new ArrayList<>();
            statement = connection.prepareStatement(SQLRequests.SELECT_POSTS_PER_PAGE.getQuery());
            statement.setInt(1, (pageNumber - 1) * PAGINATION_POST_BY_PAGE);
            statement.setInt(2, PAGINATION_POST_BY_PAGE);
            result = statement.executeQuery();
            while (result.next()) {
                list.add(Post.parse(result));
            }
            return list;
        } catch (SQLException e) {
            logger.warn(e);
            throw new WrongEntityIdException("desc", e);
        } finally {
            disconnect();
        }
    }

    public List<PostAndUser> getPostSet(List<Post> blogList) throws WrongEntityIdException {
        DAOUser daoUser = new DAOUser();
        ArrayList<PostAndUser> posts =  new ArrayList<>();

        for (Post post: blogList) {
            User user = daoUser.getUserById(post.getPostUserId());
            posts.add(new PostAndUser(post, user));
        }

        return posts;
    }

    public List<PostAndUser> getPostSetByPage(Integer pageNumber) throws WrongEntityIdException {
        return getPostSet(getPostsByPage(pageNumber));
    }

    public void deletePostTree(String postId) {
        deletePostComments(postId);
        deletePost(postId);
    }

    public void deletePost(String postId) {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.DELETE_POST_BY_POST_ID.getQuery());
            statement.setInt(1, Integer.parseInt(postId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
        } finally {
            disconnect();
        }
    }

    public void deletePostComments(String postId) {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.DELETE_COMMENTS_BY_POST_ID.getQuery());
            statement.setInt(1, Integer.parseInt(postId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
        } finally {
            disconnect();
        }
    }

    public Integer getPageCount() {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.POST_COUNT.getQuery());
            result = statement.executeQuery();
            if (result.next()) {
                Integer count = Integer.parseInt(result.getString("count"));
                if (count % PAGINATION_POST_BY_PAGE > 0) {
                    return (count / PAGINATION_POST_BY_PAGE) + 1;
                } else {
                    return count / PAGINATION_POST_BY_PAGE;
                }
            }
        } catch (SQLException e) {
            logger.warn(e);
        } finally {
            disconnect();
        }
        return 1;
    }

    public Integer getCommentsCountByPost(String postId) {
        int count = 0;

        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.COMMENTS_BY_POST_COUNT.getQuery());
            statement.setInt(1, Integer.parseInt(postId));
            result = statement.executeQuery();
            if (result.next()) {
                count = Integer.parseInt(result.getString("count"));
            }
        } catch (SQLException e) {
            logger.warn(e);
        } finally {
            disconnect();
        }
        return count;
    }

    public HashMap<Post, String> getPostWithCommentCount(List<Post> postList) {
        HashMap<Post, String> map = new HashMap<>();
        for (Post post: postList) {
            map.put(post, getCommentsCountByPost(post.getPostId()).toString());
        }
        return map;
    }

    public HashMap<Post, String> getPostWithCommentCount(String userId) throws WrongEntityIdException {
        List<Post> userPosts = getPostsByUserId(userId);
        return getPostWithCommentCount(userPosts);
    }

    public void deletePostsByUserId(String userId) {
        try {
            connect();
            statement = connection.prepareStatement(SQLRequests.DELETE_POST_BY_USER_ID.getQuery());
            statement.setInt(1, Integer.parseInt(userId));
            statement.execute();
        } catch (SQLException e) {
            logger.warn(e);
        } finally {
            disconnect();
        }
    }
}
