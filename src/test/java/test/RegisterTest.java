package test;

import EmailGenerator.EmailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class RegisterTest extends BaseTest{
    private LoginPage loginPage;

    @Test
    public void registerTest(){
        loginPage = getLoginPage();
        loginPage.signUpPage();
        loginPage.userSignUp();
    }


}
