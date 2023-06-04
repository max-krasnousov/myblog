package my.sumdu.blog.tools.strings;

public enum SQLRequests {
    ADD_USER("INSERT INTO blog_users VALUES(b_user_id_seq.nextval, ?, ?, ?, ?, ?, null)"),
    ADD_POST("INSERT INTO blog_posts VALUES(post_id_seq.nextval, ?, ?, ?, ?, 0)"),
    ADD_COMMENT("INSERT INTO blog_comments VALUES(comment_id_seq.nextval, ?, ?, ?, ?, ?, 0)"),

    UPDATE_USER_COMMON("UPDATE blog_users SET first_name=?, last_name=?, birthday=? WHERE user_id=?"),
    UPDATE_POST("UPDATE blog_posts SET post_text=?, post_name=?, post_date_time_name=?, version=version+1 WHERE post_id=?"),
    UPDATE_COMMENT("UPDATE blog_comments SET comment_text=?, comment_date_time=?, version=version+1 WHERE comment_id=?"),

    USER_BY_ID("SELECT * FROM blog_users WHERE user_id = ?"),
    POST_BY_ID("SELECT * FROM blog_posts WHERE post_id = ?"),
    POSTS_BY_USER_ID("SELECT * FROM blog_posts WHERE post_user_id = ?"),
    COMMENT_BY_ID("SELECT * FROM blog_comments WHERE comment_id = ?"),
    USER_BY_EMAIL_AND_PASSWORD("SELECT * FROM blog_users WHERE email = ? AND password = ?"),
    EXIST_USER_BY_EMAIL("SELECT * FROM blog_users WHERE email = ?"),
    SELECT_POSTS_PER_PAGE("SELECT * FROM blog_posts ORDER BY post_id DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY"),
    SELECT_COMMENTS_PER_POST("SELECT * FROM blog_comments WHERE comment_post_id = ?"),

    DELETE_COMMENT_TREE_BY_COMMENT_ID("DELETE FROM blog_comments WHERE parent_id = ? OR comment_id = ?"),
    DELETE_COMMENTS_BY_PARENT_ID("DELETE FROM blog_comments WHERE parent_id = ?"),
    DELETE_COMMENT_BY_COMMENT_ID("DELETE FROM blog_comments WHERE comment_id = ?"),
    DELETE_COMMENTS_BY_POST_ID("DELETE FROM blog_comments WHERE post_id = ?"),
    DELETE_POST_BY_POST_ID("DELETE FROM blog_posts WHERE post_id = ?"),
    DELETE_POST_BY_USER_ID("DELETE FROM blog_posts WHERE post_user_id = ?"),
    DELETE_COMMENT_BY_USER_ID("DELETE FROM blog_comments WHERE comment_user_id = ?"),

    POST_COUNT("SELECT COUNT(*) count FROM blog_posts"),
    COMMENTS_BY_POST_COUNT("SELECT COUNT(*) count FROM blog_comments WHERE comment_post_id = ?"),
    SET_RESET_PASSWORD_TOKEN("UPDATE blog_users SET reset_token=? WHERE user_id=?"),
    GET_USER_BY_RESET_PASSWORD_TOKEN("SELECT * FROM blog_users WHERE reset_token=?"),
    SET_NEW_PASSWORD("UPDATE blog_users SET password=? WHERE user_id=?"),
    GET_USER_BY_EMAIL("SELECT * FROM blog_users WHERE email = ?"),
    DELETE_USER_BY_EMAIL("DELETE FROM blog_users WHERE email = ? ");

    public final String query;

    private SQLRequests(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
