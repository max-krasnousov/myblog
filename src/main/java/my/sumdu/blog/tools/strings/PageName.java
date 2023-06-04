package my.sumdu.blog.tools.strings;

public enum PageName {
    ERROR_PAGE("error-page"),
    LOGIN_PAGE("login"),
    REGISTRATION_PAGE("registration"),
    BLOG_PROFILE_PAGE("profile"),
    BLOG_FORGOT_PASSWORD_PAGE("forgot-password"),
    BLOG_RESET_PASSWORD_PAGE("reset-password"),
    ADD_POST_PAGE("add-post"),
    SHOW_POST_PAGE("show-post"),
    SHOW_POSTS_PAGE("show-posts");

    public final String pageName;

    private PageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageName() {
        return pageName;
    }
}
