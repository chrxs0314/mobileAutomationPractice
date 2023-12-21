package pages;

import EmailGenerator.EmailPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Login\")")
    WebElement btnLoginMenu;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login / Sign up Form\")")
    WebElement title;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You successfully signed up!\")")
    WebElement signedUpConfirm;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"button-sign-up-container\")")
    WebElement signUpPageBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"button-login-container\")")
    WebElement logInPageBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"button-LOGIN\").childSelector(new UiSelector().text(\"LOGIN\"))")
    WebElement btnLogIn;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"button-SIGN UP\")")
    WebElement btnSignUp;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"input-email\")")
    WebElement inputEmail;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"input-password\")")
    WebElement inputPass;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"input-repeat-password\")")
    WebElement inputRepeatPass;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You are logged in!\")")
    WebElement loginConfirm;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    WebElement okLoginbtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    WebElement okBtn;
    private EmailPage emailPage;
    private String email;

    public void signUpPage(){
        btnLoginMenu.click();
        softAssert.assertTrue(isElementDisplayed(title));

        softAssert.assertTrue(isElementDisplayed(signUpPageBtn));
        signUpPageBtn.click();
        softAssert.assertTrue(isElementDisplayed(btnSignUp));

        softAssert.assertAll();
    }

    public void userLogIn(){
        softAssert.assertTrue(isElementDisplayed(logInPageBtn));
        logInPageBtn.click();

        softAssert.assertTrue(isElementDisplayed(inputEmail));
        softAssert.assertTrue(isElementDisplayed(inputPass));

        inputEmail.sendKeys(email);
        inputPass.sendKeys("testPass");
        btnLogIn.click();

        softAssert.assertTrue(isElementDisplayed(loginConfirm));
        okLoginbtn.click();
        softAssert.assertAll();
    }

    public void userSignUp(){
        emailPage = getEmailPage();
        this.email = emailPage.generateEmail();

        softAssert.assertTrue(isElementDisplayed(inputEmail));
        softAssert.assertTrue(isElementDisplayed(inputPass));
        softAssert.assertTrue(isElementDisplayed(inputRepeatPass));

        inputEmail.sendKeys(email);
        inputPass.sendKeys("testPass");
        inputRepeatPass.sendKeys("testPass");
        btnSignUp.click();
        softAssert.assertTrue(isElementDisplayed(signedUpConfirm));
        System.out.println("El usuario " + email + " con contraseña testPass se registro con exito");
        okBtn.click();
    }

    @Override
    protected Boolean verifyPage() {
        return isElementDisplayed(title);
    }
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public EmailPage getEmailPage(){return new EmailPage();}
}
