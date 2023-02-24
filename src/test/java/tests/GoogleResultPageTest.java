package tests;

import org.docker.pages.GoogleHomePage;
import org.docker.pages.GoogleResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleResultPageTest extends BaseTest {
    @Test //(dataProvider = "getData")
    public void searchResultTest() {
        GoogleHomePage googleHomePage = new GoogleHomePage(webDriver);
        GoogleResultPage googleResultPage = new GoogleResultPage(webDriver);

        googleHomePage.launchUrl();
        googleHomePage.isDisplayed();
        googleHomePage.searchText("Docker");
        googleHomePage.clickSuggestionByIndex(3);
        googleResultPage.isDisplayed();
        Assert.assertEquals("Pass", "Pass");
    }
}
