package tests;

import org.docker.pages.GoogleHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleHomePageTest extends BaseTest {

    @Test
    public void test1(){
        GoogleHomePage googleHomePage = new GoogleHomePage(webDriver);
        googleHomePage.launchUrl();
        googleHomePage.isDisplayed();
        Assert.assertEquals(1,1);
    }
}
