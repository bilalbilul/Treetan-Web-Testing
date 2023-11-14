package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
        // Set up WebDriverManager
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(chromeOptions);
        String appUrl = "https://stg.marketplace.treetan.com/";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
