package divaeva.selenium.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ExitStaryLev {
    public static void main(String[] args) {
        openSite();
        doLogin();
        openMyAccount();
        logoutFromMyAccount();
        WebElement buttonLoginAfterExit = TestUtils.DRIVER.findElement(By.xpath("//button[text()='Вхід | Реєстрація']"));
        Assert.assertEquals(buttonLoginAfterExit.getText(), "Вхід | Реєстрація");
        TestUtils.DRIVER.close();
    }

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

        WebElement enterButton = TestUtils.DRIVER.findElement(By.xpath("//button[text()='Увійти']"));
        enterButton.click();
    }

    private static void openMyAccount() {
        WebElement myAccountButton = TestUtils.DRIVER.findElement(By.xpath("//a[text()='Мій кабінет']"));
        myAccountButton.click();
    }

    private static void logoutFromMyAccount() {
        WebElement exit = TestUtils.DRIVER.findElement(By.xpath("//button[text()='Вихід']"));
        exit.click();
    }
}
