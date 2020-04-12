import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Launcher {
    String browser = System.getProperty("browser");

    @Test
    public void run() {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));

        if ("chrome".equals(browser)) {
            junit.run(ChromeTest.class);
        } else if ("firefox".equals(browser)) {
            junit.run(FirefoxTest.class);
        } else {
            junit.run(ChromeTest.class);
            junit.run(FirefoxTest.class);
        }

    }
}
