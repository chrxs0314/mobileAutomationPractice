package test;

import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTest extends BaseTest{
    MainPage mainPage;

    @Test
    public void navigationTest(){
        mainPage = getMainPage();
        mainPage.clickOnDrag();
    }
}
