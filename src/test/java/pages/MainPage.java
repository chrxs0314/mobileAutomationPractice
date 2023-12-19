package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class MainPage extends BasePage{
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Drag\")")
    WebElement btnDrag;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Login\")")
    WebElement btnLogin;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Drag-drop-screen\").childSelector(new UiSelector().text(\"Drag and Drop\"))")
    WebElement titleDrag;


    SoftAssert softAssert = new SoftAssert();

    public void clickOnLogin(){

    }

    public void clickOnDrag(){
        softAssert.assertTrue(isElementDisplayed(btnDrag));
        btnDrag.click();
        softAssert.assertTrue(isElementDisplayed(titleDrag));
        softAssert.assertAll();
//        if(isElementDisplayed(btnDrag)){
//            btnDrag.click();
//            if(isElementDisplayed(titleDrag)){
//                System.out.println("Titulo encontrado con exito");
//
//            }
//        }else{
//            System.out.println("No acepta el elemento btnDrag");
//        }
    }

    public MainPage(AndroidDriver driver) {
        super(driver);
    }
}
