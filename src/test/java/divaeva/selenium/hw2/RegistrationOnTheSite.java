package divaeva.selenium.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RegistrationOnTheSite {

    private static void openSite() {
        TestUtils.DRIVER.navigate().to("https://starylev.com.ua/");
    }

    private static void findRegistrationButton() {
        WebElement buttonLogin = TestUtils.DRIVER.findElement(By.xpath("//button[text()='Вхід | Реєстрація']"));
        buttonLogin.click();

        WebDriverWait waiter = new WebDriverWait(TestUtils.DRIVER, Duration.ofSeconds(30));
        WebElement buttonRegister = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Зареєструватися']")));
        buttonRegister.click();
    }

    private static void fillInRegistrationInfo() {
        WebElement name = TestUtils.DRIVER.findElement(By.name("firstName"));
        name.sendKeys("Лера");

        WebElement surname = TestUtils.DRIVER.findElement(By.name("lastName"));
        surname.sendKeys("Секач");

        WebElement email = TestUtils.DRIVER.findElement(By.name("email"));
        email.sendKeys("sekach873@gmail.com");

        WebElement phoneNumber = TestUtils.DRIVER.findElement(By.name("phone"));
        phoneNumber.sendKeys("380953005787");

        WebElement password = TestUtils.DRIVER.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("qazwsxedc");

        WebElement checkbox = TestUtils.DRIVER.findElement(By.className("ant-checkbox-input"));
        checkbox.click();
    }

    private static void submitRegistration() {
        WebElement register = TestUtils.DRIVER.findElement(By.xpath("//button[text()='Зареєструватись']"));
        register.click();

        WebElement registerSMS = TestUtils.DRIVER.findElement(By.xpath("//h3[text()='СМС-підтвердження']"));

        Assert.assertEquals("СМС-підтвердження", registerSMS.getText());
    }

    public static void main(String[] args) {
        openSite();
        findRegistrationButton();
        fillInRegistrationInfo();
        submitRegistration();
        TestUtils.DRIVER.close();
    }
}
