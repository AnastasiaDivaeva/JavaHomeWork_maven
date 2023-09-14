import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Test2SearchTheSiteByBookTitle {
    public static void main(String[] args) {
        String login = "sekach.199855@gmail.com";
        String password = "qazwsxedc";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
        driver.navigate().to("https://starylev.com.ua/");

        WebElement buttonLogin = driver.findElement(By.xpath("//button[text()='Вхід | Реєстрація']"));
        buttonLogin.click();

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(login);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(password);

        WebElement enterButton = driver.findElement(By.xpath("//button[text()='Увійти']"));
        enterButton.click();

        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Шукати...']"));
        search.sendKeys("Тема для медитаці");

        By searchButtonSelector = By.xpath("//a[ text()='Переглянути більше']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(visibilityOfElementLocated(searchButtonSelector));
        searchButton.click();

        driver.close();

    }
}
