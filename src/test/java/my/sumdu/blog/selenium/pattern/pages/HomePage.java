package my.sumdu.blog.selenium.pattern.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class HomePage {
    private final static String CREATE_PB = "Create New Post";
    private final static String HOME_PAGE = "Home Page";
    private final static String POST_N = "TEST POST NAME";
    WebDriver driver;
    By logoutButton = By.linkText("Logout");
    By postName = By.id("postName");
    By postText = By.id("postText");
    By createPostButton = By.cssSelector(".btn:nth-child(3)");
    By createPostLink = By.linkText(CREATE_PB);
    By showMoreButton = By.linkText("Show more...");
    By newPost = By.xpath("//*[text()='" + POST_N + "']");

    public HomePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public void createPost(String name, String text) {
        driver.findElement(createPostLink).click();
        driver.findElement(postName).sendKeys(name);
        driver.findElement(postText).sendKeys(text);
        driver.findElement(createPostButton).click();
    }

    public void clickShowMore() {
        driver.findElement(showMoreButton).click();
    }

    public void verifyPostCreated() {
        assertDoesNotThrow(() -> {
            driver.findElement(newPost);
        });
    }

    public void isHomePage() {
        Assertions.assertEquals(driver.getTitle(), HOME_PAGE);
    }

    public void clickProfileLink(String fName, String lName) {
        driver.findElement(By.linkText( fName + " " + lName)).click();
    }
}
