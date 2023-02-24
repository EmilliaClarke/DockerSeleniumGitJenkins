package org.docker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleResultPage {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public GoogleResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofMillis(500L));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(linkText = "Новини")
    private WebElement newsLink;

    public boolean isDisplayed(){
        this.webDriverWait.until(ExpectedConditions.visibilityOf(newsLink));
        return true;
    }
}
