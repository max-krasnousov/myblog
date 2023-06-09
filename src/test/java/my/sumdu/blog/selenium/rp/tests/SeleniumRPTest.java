package my.sumdu.blog.selenium.rp.tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.core.annotation.Order;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumRPTest {
    private static WebDriver driver;
    private final static String DRIVER = "webdriver.chrome.driver";
    private final static String PATH = ".\\driver\\chromedriver.exe";
    public final static String URL = "http://localhost:7001/my-blog/";
    public final static String CLEAN = "http://localhost:7001/my-blog/edit/clean-test-user";

    @BeforeEach
    public void setUp() {
        System.setProperty(DRIVER, PATH);
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    @DisplayName("Test of registration by using valid data")
    public void registrationWithValidDataTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("registration-link")).click();
        driver.findElement(By.id("firstName")).sendKeys("FirstR");
        driver.findElement(By.id("lastName")).sendKeys("LastR");
        driver.findElement(By.id("email")).sendKeys("reg@gmail.com");
        driver.findElement(By.id("birthday")).sendKeys("2002/05/28");
        driver.findElement(By.id("password")).sendKeys("1234abcD@");
        driver.findElement(By.id("cPassword")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();

        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("reg@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Home Page");

        driver.findElement(By.linkText("Logout")).click();
        driver.close();
        driver.quit();
        System.setProperty(DRIVER, PATH);
        driver = new ChromeDriver();
        driver.get(CLEAN);
        driver.close();
    }

    @Test
    @Order(2)
    @DisplayName("Test of registration by using invalid data")
    public void registrationWithInvalidDataTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("registration-link")).click();
        driver.findElement(By.id("firstName")).sendKeys("FirstR");
        driver.findElement(By.id("lastName")).sendKeys("LastR");
        driver.findElement(By.id("email")).sendKeys("reg@gmail.com");
        driver.findElement(By.id("birthday")).sendKeys("2002/05/28");
        driver.findElement(By.id("password")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Registration page");
        driver.close();
    }

    @Test
    @Order(3)
    @DisplayName("Test of login by using empty password")
    public void loginWithEmptyPasswordTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("test@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("");
        driver.findElement(By.cssSelector(".btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Login Page");
        driver.close();
    }

    @Test
    @Order(4)
    @DisplayName("Test of login by using empty email")
    public void loginWithEmptyEmailTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("");
        driver.findElement(By.id("loginPassword")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Login Page");
        driver.close();
    }

    @Test
    @Order(5)
    @DisplayName("Test of login by using wrong password")
    public void loginWithWrongPasswordTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("test@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("1234abcD$$");
        driver.findElement(By.cssSelector(".btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Login Page");
        assertDoesNotThrow(() -> {
            driver.findElement(By.cssSelector(".alert-danger"));
        });
        driver.close();
    }

    @Test
    @Order(6)
    @DisplayName("Test of login by using wrong email")
    public void loginWithWrongEmailTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("wrong@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Login Page");
        assertDoesNotThrow(() -> {
            driver.findElement(By.cssSelector(".alert-danger"));
        });
        driver.close();
    }

    @Test
    @Order(7)
    @DisplayName("Test of login by using valid data")
    public void loginWithValidDataTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("test@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Home Page");
        driver.findElement(By.linkText("Logout")).click();
        driver.close();
    }

    @Test
    @Order(8)
    @DisplayName("Test of post creation process")
    public void postCreationProcessTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("test@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.linkText("Create New Post")).click();
        driver.findElement(By.id("postName")).sendKeys("TEST POST NAME");
        driver.findElement(By.id("postText")).sendKeys("TEST POST TEXT");
        driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
        assertEquals(driver.findElement(
                By.cssSelector(".row:nth-child(1) > .col-xs-12 > .panel > .panel-body")).getText(),
                "TEST POST TEXT"
        );

        driver.findElement(By.linkText("Logout")).click();
        driver.close();
        driver.quit();
        System.setProperty(DRIVER, PATH);
        driver = new ChromeDriver();
        driver.get(CLEAN);
        driver.close();
    }

    @Test
    @Order(9)
    @DisplayName("Test of comment creation process")
    public void commentCreationProcessTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("test@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.linkText("Create New Post")).click();
        driver.findElement(By.id("postName")).sendKeys("TEST POST NAME");
        driver.findElement(By.id("postText")).sendKeys("TEST POST TEXT");
        driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
        driver.findElement(By.linkText("Show more...")).click();
        driver.findElement(By.id("commentText")).sendKeys("TEST COMMENT TEXT");
        driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();

        assertEquals(driver.findElement(
                By.cssSelector(".row:nth-child(2) .panel-body")).getText(),
                "TEST COMMENT TEXT"
        );

        driver.findElement(By.linkText("Logout")).click();
        driver.close();
        driver.quit();
        System.setProperty(DRIVER, PATH);
        driver = new ChromeDriver();
        driver.get(CLEAN);
        driver.close();
    }

    @Test
    @Order(10)
    @DisplayName("Test of profile edition process")
    public void profileEditionProcessTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("test@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.linkText("FirstT LastT")).click();
        Assertions.assertEquals(driver.getTitle(), "Profile");

        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("FirstTN");
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("LastTN");
        driver.findElement(By.id("birthday")).clear();
        driver.findElement(By.id("birthday")).sendKeys("2002/12/20");
        driver.findElement(By.cssSelector(".btn:nth-child(5)")).click();

        Assertions.assertEquals(driver.getTitle(), "Profile");
        driver.findElement(By.linkText("FirstTN LastTN")).click();
        Assertions.assertEquals(driver.getTitle(), "Profile");
        Assertions.assertEquals(driver.findElement(By.id("firstName")).getAttribute("value"), "FirstTN");
        Assertions.assertEquals(driver.findElement(By.id("lastName")).getAttribute("value"), "LastTN");
        Assertions.assertEquals(driver.findElement(By.id("birthday")).getAttribute("value"), "2002/12/20");

        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("FirstT");
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("LastT");
        driver.findElement(By.id("birthday")).clear();
        driver.findElement(By.id("birthday")).sendKeys("2003/09/23");
        driver.findElement(By.cssSelector(".btn:nth-child(5)")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.close();
    }


    @Test
    @Order(11)
    @DisplayName("Test of logout process")
    public void logoutProcessTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("loginUserName")).sendKeys("test@gmail.com");
        driver.findElement(By.id("loginPassword")).sendKeys("1234abcD@");
        driver.findElement(By.cssSelector(".btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Home Page");
        driver.findElement(By.linkText("Logout")).click();
        Assertions.assertEquals(driver.getTitle(), "Login Page");
        driver.close();
    }

    @Test
    @Order(12)
    @DisplayName("Test of forgot password process with valid data")
    public void forgotPasswordWithValidDataTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("forgot-pass-link")).click();
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.cssSelector(".row:nth-child(2) .btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Forgot Password Page");
        assertDoesNotThrow(() -> {
            driver.findElement(By.cssSelector(".alert-success"));
        });
        driver.close();
    }

    @Test
    @Order(13)
    @DisplayName("Test of forgot password process with invalid data")
    public void forgotPasswordWithInvalidDataTest() {
        driver.manage().window().maximize();
        driver.findElement(By.id("forgot-pass-link")).click();
        driver.findElement(By.id("email")).sendKeys("wrong@gmail.com");
        driver.findElement(By.cssSelector(".row:nth-child(2) .btn")).click();
        Assertions.assertEquals(driver.getTitle(), "Forgot Password Page");
        assertDoesNotThrow(() -> {
            driver.findElement(By.cssSelector(".alert-danger"));
        });
        driver.close();
    }
}