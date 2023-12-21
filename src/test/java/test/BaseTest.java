package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import EmailGenerator.EmailPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.SwipePage;


public class BaseTest {
    private AndroidDriver driver;

    @BeforeClass
    public void setUp() {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setCapability("deviceName", "emulator-5554");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("platformName", "Android");
        options.setCapability("platformVersion", "14");
        options.setCapability("appPackage", "com.wdiodemoapp");
        options.setCapability("appActivity", ".MainActivity");
        options.setCapability("appVersion", "0");
        options.setCapability("app", "C:\\Users\\christopher.ochoa\\Desktop\\Globant\\Mobile Automation\\Apkfiles\\Android-NativeDemoApp-0.4.0.apk");

        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
        }catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }

    public MainPage getMainPage(){return new MainPage(driver);}
    public LoginPage getLoginPage(){return new LoginPage(driver);}
    public SwipePage getSwipePage(){return new SwipePage(driver);}


    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}