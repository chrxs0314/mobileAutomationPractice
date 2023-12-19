package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipePage extends BasePage{
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    WebElement title;
    @Override
    protected Boolean verifyPage() {
        return isElementDisplayed(title);
    }
    public SwipePage(AndroidDriver driver) {
        super(driver);
    }
}
