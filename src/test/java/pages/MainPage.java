package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPage extends BasePage{
    class MenuItem{
        WebElement btn;
        BasePage page;

        MenuItem(WebElement btn, BasePage page){
            this.btn = btn;
            this.page = page;
        }
    }
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Home\")")
    WebElement btnHome;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Webview\")")
    WebElement btnWebview;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Login\")")
    WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Forms\")")
    WebElement btnForms;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Swipe\")")
    WebElement btnSwipe;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Drag\")")
    WebElement btnDrag;

    HomePage homePage = new HomePage(driver);
    WebviewPage webviewPage = new WebviewPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    FormsPage formsPage = new FormsPage(driver);
    SwipePage swipePage = new SwipePage(driver);
    DragPage dragPage = new DragPage(driver);

    List<MenuItem> menuItems = Arrays.asList(
            new MenuItem(btnHome,homePage),
            new MenuItem(btnWebview,webviewPage),
            new MenuItem(btnLogin,loginPage),
            new MenuItem(btnForms,formsPage),
            new MenuItem(btnSwipe,swipePage),
            new MenuItem(btnDrag,dragPage)
    );

    public void clickOnItemMenu(){
        for (MenuItem menuItem : menuItems){
            menuItem.btn.click();
            softAssert.assertTrue(menuItem.page.verifyPage());
        }
        softAssert.assertAll();
    }

    public MainPage(AndroidDriver driver) {
        super(driver);
    }
}
