package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class BasePage {
    AndroidDriver driver;
    SoftAssert softAssert = new SoftAssert();

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    protected Boolean isElementDisplayed(WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void swipe(int x, int y){
        Dimension size = driver.manage().window().getSize();
        int startX = x;
        int endX = x-400;
        int centerY = y;

        //Type of Pointer input
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        //Creating Sequence object  to add actions
        Sequence swipe = new Sequence(finger, 1);
        //Move finger into starting potition;
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),startX,centerY));
        //Finger comes down into contact with screen
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        //Finger moves to end position
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(),endX,centerY));
        //Get up Finger from Screen
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        //Perform the actions
        driver.perform(List.of(swipe));
    }

    protected Boolean verifyPage() {
        return false;
    }
}
