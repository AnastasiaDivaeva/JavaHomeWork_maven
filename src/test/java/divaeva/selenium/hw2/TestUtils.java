package divaeva.selenium.hw2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestUtils {
    public static final String USERNAME = "sekach.199855@gmail.com";
    public static final String PASSWORD = "qazwsxedc";

    public static final WebDriver DRIVER = initDriver();

    private static WebDriver initDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}
