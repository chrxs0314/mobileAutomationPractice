package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragPage extends BasePage{
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag and Drop\")")
    WebElement title;

    @Override
    protected Boolean verifyPage() {
        return isElementDisplayed(title);
    }
    public DragPage(AndroidDriver driver) {
        super(driver);
    }
}
