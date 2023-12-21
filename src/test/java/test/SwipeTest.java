package test;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SwipePage;

public class SwipeTest extends BaseTest{
    private SwipePage swipePage;

    @Test
    public void swipePageTest(){
        swipePage = getSwipePage();
        swipePage.swipePage();
    }
}
