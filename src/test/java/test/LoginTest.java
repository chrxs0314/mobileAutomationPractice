package test;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    private LoginPage loginPage;

    @Test
    public void registerTest(){
        loginPage = getLoginPage();
        loginPage.signUpPage();
        loginPage.userSignUp();

        loginPage.userLogIn();
    }
}
