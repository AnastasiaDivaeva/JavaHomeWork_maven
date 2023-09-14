import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Test1RegistrationOnTheSite {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
        driver.navigate().to("https://starylev.com.ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement buttonLogin = driver.findElement(By.xpath("//button[text()='Вхід | Реєстрація']"));
        buttonLogin.click();

        WebElement buttonRegister = driver.findElement(By.xpath("//button[text()='Зареєструватися']"));
        buttonRegister.click();

        WebElement name = driver.findElement(By.name("firstName"));
        name.sendKeys("Лера");
        WebElement surname = driver.findElement(By.name("lastName"));
        surname.sendKeys("Секач");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("sekach873@gmail.com");
        WebElement phoneNumber = driver.findElement(By.name("phone"));
        phoneNumber.sendKeys("380953005787");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("qazwsxedc");
        WebElement checkbox = driver.findElement(By.className("ant-checkbox-input"));
        checkbox.click();
        WebElement register = driver.findElement(By.xpath("//button[text()='Зареєструватись']"));
        register.click();

        driver.close();
    }
}
