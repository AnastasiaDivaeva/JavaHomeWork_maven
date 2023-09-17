package divaeva.selenium.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ExitStaryLev {
    private static void openSite() {
        TestUtils.DRIVER.navigate().to("https://starylev.com.ua/");
    }

    private static void doLogin() {
        WebElement loginButton = TestUtils.DRIVER.findElement(By.xpath("//button[text()='Вхід | Реєстрація']"));
        loginButton.click();

        WebElement emailInput = TestUtils.DRIVER.findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys(TestUtils.USERNAME);

        WebElement passwordInput = TestUtils.DRIVER.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys(TestUtils.PASSWORD);

        WebDriverWait waiter = new WebDriverWait(TestUtils.DRIVER, Duration.ofSeconds(30));
        WebElement enterButton = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Увійти']")));
        enterButton.click();
    }

    private static void openMyAccount() {
        WebElement myAccountButton = TestUtils.DRIVER.findElement(By.xpath("//a[text()='Мій кабінет']"));
        myAccountButton.click();
    }

    private static void logoutFromMyAccount() {
        WebElement exit = TestUtils.DRIVER.findElement(By.xpath("//button[text()='Вихід']"));
        exit.click();

        WebElement buttonLoginAfterExit = TestUtils.DRIVER.findElement(By.xpath("//button[text()='Вхід | Реєстрація']"));

        Assert.assertEquals(buttonLoginAfterExit.getText(), "Вхід | Реєстрація");
    }

    public static void main(String[] args) {
        openSite();
        doLogin();
        openMyAccount();
        logoutFromMyAccount();
        TestUtils.DRIVER.close();
    }
}
