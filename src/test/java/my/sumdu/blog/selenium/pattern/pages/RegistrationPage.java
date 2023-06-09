package my.sumdu.blog.selenium.pattern.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationPage {
    private final static String REG_PAGE = "Registration page";
    WebDriver driver;
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("email");
    By birthday = By.id("birthday");
    By password = By.id("password");
    By cPassword = By.id("cPassword");
    By registrationButton = By.cssSelector(".btn");

    public RegistrationPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void fillRegFieldsWithoutCPassword(String fName, String lName, String rEmail, String rAge, String rPassword) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(email).sendKeys(rEmail);
        driver.findElement(birthday).sendKeys(rAge);
        driver.findElement(password).sendKeys(rPassword);
    }

    public void fillConfirmPassword(String conPassword) {
        driver.findElement(cPassword).sendKeys(conPassword);
    }

    public void clickRegistrationButton() {
        driver.findElement(registrationButton).click();
    }

    public void isRegistrationPage() {
        Assertions.assertEquals(driver.getTitle(), REG_PAGE);
    }
}
