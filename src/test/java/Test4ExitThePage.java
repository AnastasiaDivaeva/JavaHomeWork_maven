import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Test4ExitThePage {
    public static void main(String[] args) {
        String login = "sekach.199855@gmail.com";
        String password = "qazwsxedc";
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
        driver.navigate().to("https://starylev.com.ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement buttonLogin = driver.findElement(By.xpath("//button[text()='Вхід | Реєстрація']"));
        buttonLogin.click();

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(login);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(password);

        WebElement enterButton = driver.findElement(By.xpath("//button[text()='Увійти']"));
        enterButton.click();

        WebElement myOffice = driver.findElement(By.xpath("//a[text()='Мій кабінет']"));
        myOffice.click();

        WebElement exit = driver.findElement(By.xpath("//button[text()='Вихід']"));
        exit.click();

        driver.close();


    }
}
