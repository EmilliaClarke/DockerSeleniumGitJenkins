package org.docker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleHomePage {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public GoogleHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofMillis(500L));
        PageFactory.initElements(webDriver, this);
    }

    public void searchText(String searchKey) {
        this.searchBox.sendKeys(searchKey);

        this.webDriverWait.until((d) -> this.searchSuggestions.size() > 3);
    }

    public void clickSuggestionByIndex(int index) {
        this.searchSuggestions.get(index-1).click();
    }

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(css = "li.sbct")
    private List<WebElement> searchSuggestions;

    public void launchUrl(){
        this.webDriver.get("https://www.google.com");
    }

    public boolean isDisplayed(){
        this.webDriverWait.until(ExpectedConditions.visibilityOf(searchBox));
        return true;
    }

}
