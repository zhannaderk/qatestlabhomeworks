package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    static {
        System.setProperty("webdriver.chrome.driver", getChromeDriverName());
    }

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        return new ChromeDriver();
    }

    private static String getChromeDriverName() {
        String osName = System.getProperty("os.name").toLowerCase();
        String result;
        if (osName.contains("mac")) {
            result = "chromedriver-mac";
        } else if (osName.contains("linux")) {
            result = "chromedriver-linux";
        } else {
            result = "chromedriver.exe";
        }
        return "src/main/resources/" + result;
    }
}
