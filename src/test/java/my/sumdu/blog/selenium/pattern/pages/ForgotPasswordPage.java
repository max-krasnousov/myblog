package my.sumdu.blog.selenium.pattern.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ForgotPasswordPage {
    private final static String FORGOT_PAGE = "Forgot Password Page";
    WebDriver driver;
    By email = By.id("email");
    By resetButton = By.cssSelector(".row:nth-child(2) .btn");
    By alertDanger = By.cssSelector(".alert-danger");
    By alertSuccess = By.cssSelector(".alert-success");

    public ForgotPasswordPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void fillEmail(String fEmail) {
        driver.findElement(email).sendKeys(fEmail);
    }

    public void clickResetButton() {
        driver.findElement(resetButton).click();
    }

    public void isForgotPasswordPage() {
        Assertions.assertEquals(driver.getTitle(), FORGOT_PAGE);
    }

    public void isAlertDangerPresent() {
        assertDoesNotThrow(() -> {
            driver.findElement(alertDanger);
        });
    }

    public void isAlertSuccessPresent() {
        assertDoesNotThrow(() -> {
            driver.findElement(alertSuccess);
        });
    }
}
