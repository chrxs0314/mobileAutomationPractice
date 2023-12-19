package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;

public class MainPageTest extends BaseTest{
    MainPage mainPage;


    @Test
    public void navigationTest(){
        mainPage = getMainPage();
//        mainPage.clickOnDrag();
        mainPage.clickOnItemMenu();
    }
}
