import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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

        WebElement paperBooks = driver.findElement(By.cssSelector("nav li a[class='gilroy-h4']"));
        paperBooks.click();

        List<WebElement> newsElements = driver.findElements(By.xpath("//div[contains(@class, 'product-card')]"));
        Assert.assertEquals(28,newsElements.size());

        driver.close();

    }
}
