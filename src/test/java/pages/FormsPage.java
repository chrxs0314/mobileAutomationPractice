package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsPage extends BasePage{
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Form components\")")
    WebElement title;
    @Override
    protected Boolean verifyPage() {
        return isElementDisplayed(title);
    }
    public FormsPage(AndroidDriver driver) {
        super(driver);
    }
}
