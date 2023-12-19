package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebviewPage extends BasePage{
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Next-gen browser and mobile automation test framework for Node.js\")")
    WebElement title;
    @Override
    protected Boolean verifyPage() {
        return isElementDisplayed(title);
    }
    public WebviewPage(AndroidDriver driver) {
        super(driver);
    }
}
