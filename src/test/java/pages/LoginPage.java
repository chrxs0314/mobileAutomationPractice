package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login / Sign up Form\")")
    WebElement title;
    @Override
    protected Boolean verifyPage() {
        return isElementDisplayed(title);
    }
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }
}
