package my.sumdu.blog.selenium.pattern.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfilePage {
    private final static String PROFILE_PAGE = "Profile";
    WebDriver driver;
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By birthday = By.id("birthday");
    By profileUpdateButton = By.cssSelector(".btn:nth-child(5)");

    public ProfilePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void isProfilePage() {
        Assertions.assertEquals(driver.getTitle(), PROFILE_PAGE);
    }

    public void fillUserInfo(String fName, String lName, String age) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(birthday).clear();
        driver.findElement(birthday).sendKeys(age);
    }

    public void clickProfileUpdate() {
        driver.findElement(profileUpdateButton).click();
    }

    public void verifyFieldsIsChanged(String fName, String lName, String age) {
        assertEquals(driver.findElement(firstName).getAttribute("value"), fName);
        assertEquals(driver.findElement(lastName).getAttribute("value"), lName);
        assertEquals(driver.findElement(birthday).getAttribute("value"), age);
    }
}
