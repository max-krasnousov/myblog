package my.sumdu.blog.selenium.pattern;

import my.sumdu.blog.selenium.pattern.pages.*;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.core.annotation.Order;

import java.io.File;
import java.io.IOException;


public class SeleniumPatternTest {
    private final static String USER_FDN = "FirstT";
    private final static String USER_LDN = "LastT";
    private final static String USER_DA = "2003/09/23";
    private final static String USER_FNN = "FirstTN";
    private final static String USER_LNN = "LastTN";
    private final static String USER_NA = "2002/12/20";
    private final static String LOGIN_UE = "test@gmail.com";
    private final static String LOGIN_UP = "1234abcD@";
    private final static String LOGIN_UWE = "wrong@gmail.com";
    private final static String LOGIN_UWP = "1234abcD$$";
    private final static String REG_UE = "reg@gmail.com";
    private final static String REG_UP = "1234abcD@";
    private final static String REG_FN = "FirstR";
    private final static String REG_LN = "LastR";
    private final static String REG_A = "2002/05/28";
    private final static String URL = "http://localhost:7001/my-blog/";
    private final static String CLEAN = "http://localhost:7001/my-blog/edit/clean-test-user";
    private final static String POST_N = "TEST POST NAME";
    private final static String POST_T = "TEST POST TEXT";
    private final static String COMMENT_T = "TEST COMMENT TEXT";

    private static WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private PostPage postPage;
    private ProfilePage profilePage;
    private RegistrationPage registrationPage;
    private ForgotPasswordPage forgotPasswordPage;
    private static final Logger logger = Logger.getLogger(SeleniumPatternTest.class);
    public final static String WEB = "webdriver.chrome.driver";
    public final static String PATH = ".\\driver\\chromedriver.exe";

    @BeforeEach
    public void setUp() {
        setDriver();
        driver.get(URL);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        postPage = new PostPage(driver);
        profilePage = new ProfilePage(driver);
        registrationPage = new RegistrationPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    public void setDriver() {
        System.setProperty(WEB, PATH);
        driver = new ChromeDriver();
    }

    public void cleanTestData() {
        driver.quit();
        setDriver();
        driver.get(CLEAN);
        driver.close();
    }

    public void doScreenShot(String screenName) {
        try {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(".\\Screens\\" + screenName + ".png"));
        } catch (IOException e) {
            logger.warn("unable to save screenshots", e);
        }
    }

    @Test
    @Order(1)
    @DisplayName("Test of registration by using valid data")
    public void registrationWithValidDataTest() {
        driver.manage().window().maximize();

        driver.manage().window().maximize();
        loginPage.clickRegistrationButton();
        registrationPage.fillRegFieldsWithoutCPassword(REG_FN, REG_LN, REG_UE, REG_A, REG_UP);
        registrationPage.fillConfirmPassword(REG_UP);
        registrationPage.clickRegistrationButton();
        loginPage.isLoginPage();
        loginPage.fillUserInfo(REG_UE, REG_UP);
        loginPage.clickLoginButton();
        homePage.isHomePage();
        homePage.clickLogoutButton();
        driver.close();
        cleanTestData();
    }

    @Test
    @Order(2)
    @DisplayName("Test of registration by using invalid data")
    public void registrationWithInvalidDataTest() {
        driver.manage().window().maximize();
        loginPage.clickRegistrationButton();
        registrationPage.fillRegFieldsWithoutCPassword(REG_FN, REG_LN, REG_UE, REG_A, REG_UP
        );
        registrationPage.clickRegistrationButton();
        registrationPage.isRegistrationPage();
        driver.close();
    }

    @Test
    @Order(3)
    @DisplayName("Test of login by using empty password")
    public void loginWithEmptyPasswordTest() {
        loginPage.fillUserInfo(LOGIN_UE, "");
        loginPage.clickLoginButton();
        loginPage.isLoginPage();
        driver.close();
    }

    @Test
    @Order(4)
    @DisplayName("Test of login by using empty email")
    public void loginWithEmptyEmailTest() {
        loginPage.fillUserInfo("", LOGIN_UP);
        loginPage.clickLoginButton();
        loginPage.isLoginPage();
        driver.close();
    }

    @Test
    @Order(5)
    @DisplayName("Test of login by using wrong password")
    public void loginWithWrongPasswordTest() {
        loginPage.fillUserInfo(LOGIN_UE, LOGIN_UWP);
        loginPage.clickLoginButton();
        loginPage.isLoginPage();
        loginPage.isDangerAlertPresent();
        driver.close();
    }

    @Test
    @Order(6)
    @DisplayName("Test of login by using wrong email")
    public void loginWithWrongEmailTest() {
        loginPage.fillUserInfo(LOGIN_UWE, LOGIN_UP);
        loginPage.clickLoginButton();
        loginPage.isLoginPage();
        loginPage.isDangerAlertPresent();
        driver.close();
    }

    @Test
    @Order(7)
    @DisplayName("Test of login by using valid data")
    public void loginWithValidDataTest() {
        loginPage.fillUserInfo(LOGIN_UE, LOGIN_UP);
        loginPage.clickLoginButton();
        homePage.isHomePage();
        homePage.clickLogoutButton();
        driver.close();
    }

    @Test
    @Order(8)
    @DisplayName("Test of post creation process")
    public void postCreationProcessTest() {
        loginPage.fillUserInfo(LOGIN_UE, LOGIN_UP);
        loginPage.clickLoginButton();
        homePage.createPost(POST_N, POST_T);
        homePage.verifyPostCreated();
        homePage.clickLogoutButton();
        driver.close();
        cleanTestData();
    }

    @Test
    @Order(9)
    @DisplayName("Test of comment creation process")
    public void commentCreationProcessTest() {
        loginPage.fillUserInfo(LOGIN_UE, LOGIN_UP);
        loginPage.clickLoginButton();
        homePage.createPost(POST_N, POST_T);
        homePage.clickShowMore();
        postPage.createComment(COMMENT_T);
        postPage.verifyCommentCreated();
        homePage.clickLogoutButton();
        driver.close();
        cleanTestData();
    }

    @Test
    @Order(10)
    @DisplayName("Test of profile edition process")
    public void profileEditionProcessTest() {
        loginPage.fillUserInfo(LOGIN_UE, LOGIN_UP);
        doScreenShot("Profile\\Login_Page");
        loginPage.clickLoginButton();
        doScreenShot("Profile\\Home_Page");
        homePage.clickProfileLink(USER_FDN, USER_LDN);
        profilePage.isProfilePage();
        doScreenShot("Profile\\Profile_Before_Page");
        profilePage.fillUserInfo(USER_FNN, USER_LNN, USER_NA);
        profilePage.clickProfileUpdate();
        profilePage.isProfilePage();
        homePage.clickProfileLink(USER_FNN, USER_LNN);
        profilePage.isProfilePage();
        doScreenShot("Profile\\Profile_After_Page");
        profilePage.verifyFieldsIsChanged(USER_FNN, USER_LNN, USER_NA);
        profilePage.fillUserInfo(USER_FDN, USER_LDN, USER_DA);
        profilePage.clickProfileUpdate();
        homePage.clickLogoutButton();
        driver.close();
    }

    @Test
    @Order(11)
    @DisplayName("Test of logout process")
    public void logoutProcessTest() {
        loginPage.fillUserInfo(LOGIN_UE, LOGIN_UP);
        loginPage.clickLoginButton();
        homePage.isHomePage();
        homePage.clickLogoutButton();
        loginPage.isLoginPage();
        driver.close();
    }

    @Test
    @Order(12)
    @DisplayName("Test of forgot password process with valid data")
    public void forgotPasswordWithValidDataTest() {
        driver.manage().window().maximize();
        loginPage.clickForgotPasswordButton();
        forgotPasswordPage.fillEmail(LOGIN_UE);
        forgotPasswordPage.clickResetButton();
        forgotPasswordPage.isForgotPasswordPage();
        forgotPasswordPage.isAlertSuccessPresent();
        driver.close();
    }

    @Test
    @Order(13)
    @DisplayName("Test of forgot password process with invalid data")
    public void forgotPasswordWithInvalidDataTest()  {
        driver.manage().window().maximize();
        loginPage.clickForgotPasswordButton();
        forgotPasswordPage.fillEmail(LOGIN_UWE);
        forgotPasswordPage.clickResetButton();
        forgotPasswordPage.isForgotPasswordPage();
        forgotPasswordPage.isAlertDangerPresent();
        driver.close();
    }
}
