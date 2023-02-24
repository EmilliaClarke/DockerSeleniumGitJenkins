package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public WebDriver webDriver;

    @BeforeTest
    public void setUpDriver() throws MalformedURLException {
        String host = "localhost";

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");

        if (System.getProperty("BROWSER") != null && System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
            dc.setBrowserName("firefox");
        }
        if (System.getProperty("HUB_HOST") != null) {
            host = System.getProperty("HUB_HOST");
        }

        String completeURL = "http://" + host + ":4444/wd/hub";
        this.webDriver = new RemoteWebDriver(new URL(completeURL), dc);


//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Oleksii_Kukhar1\\Desktop\\Learning\\Docker\\DockerJenkinsSelenium\\chromedriver_win32\\chromedriver.exe");

//        webDriver = new ChromeDriver();
    }

    @AfterTest
    public void close() {
        this.webDriver.quit();
    }
}
