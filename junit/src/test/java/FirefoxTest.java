import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirefoxTest {
    private WebDriver driver;
    private Logger logger = LogManager.getLogger(FirefoxTest.class);

    @Before
    public void setupDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        logger.info("Firefox Driver is setup");
    }

    @Test
    public void openPage() {
        driver.get("https://otus.ru");
        logger.info("Page is open in Firefox browser");
    }

    @After
    public void closePage() {
        if (driver != null) {
            driver.quit();
            logger.info("Firefox browser is closed");
        }
    }
}
