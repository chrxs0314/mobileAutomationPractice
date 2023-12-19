package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WEBDRIVER\")")
    WebElement title;

    @Override
    protected Boolean verifyPage() {
        return isElementDisplayed(title);
    }

    //    public Boolean verifyPage(){
//        return isElementDisplayed(title);
//    }
    public HomePage(AndroidDriver driver) {
        super(driver);
    }
}
