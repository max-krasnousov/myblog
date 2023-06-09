package my.sumdu.blog.selenium.pattern.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostPage {
    private final static String POST_T = "TEST POST TEXT";
    WebDriver driver;
    By commentText = By.id("commentText");
    By createCommentButton = By.cssSelector(".btn:nth-child(2)");
    By newComment = By.cssSelector(".row:nth-child(1) > .col-xs-12 > .panel > .panel-body");

    public PostPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void createComment(String comment) {
        driver.findElement(commentText).sendKeys(comment);
        driver.findElement(createCommentButton).click();
    }

    public void verifyCommentCreated() {
        assertDoesNotThrow(() -> {
            driver.findElement(newComment);
        });
        assertEquals(
                driver.findElement(newComment).getText(),
                POST_T
        );
    }
}
