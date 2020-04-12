import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChromeTest {
    private WebDriver driver;
    private Logger logger = LogManager.getLogger(ChromeTest.class);


    @Before
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Chrome Driver is setup");
    }

    @Test
    public void openPage() {
        driver.get("https://otus.ru");
        logger.info("Page is open in Chrome browser");
    }

    @After
    public void closePage() {
        if (driver != null) {
            driver.quit();
            logger.info("Chrome browser is closed");
        }
    }

}

