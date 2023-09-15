import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test3BooksShouldBePlacedOnThePage28 {
    public static void main(String[] args) {
        String login = "sekach.199855@gmail.com";
        String password = "qazwsxedc";
        WebDriver driver = new ChromeDriver();
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='gilroy-h4']")));


        WebElement paperBooks = driver.findElement(By.xpath("//a[@class='gilroy-h4']"));
        paperBooks.click();

        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(30));
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'catalogue-products')]")));

        WebElement newsElement = driver.findElement(By.xpath("//div[contains(@class, 'catalogue-products')]"));
        List<WebElement> newsElements = newsElement.findElements(By.xpath("//div[contains(@class, 'product-card')]"));
        Assert.assertEquals(28, newsElements.size());

        driver.close();

    }
}
