package divaeva.selenium.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class The28BooksShouldBePlacedOnThePage {
    public static void main(String[] args) {
        WebDriverWait wait = new WebDriverWait(TestUtils.DRIVER, Duration.ofSeconds(30));

        openSite();
        doLogin();
        searchBooks(wait);
        List<WebElement> books = assertBooksCount(wait);
        Assert.assertEquals(books.size(), 28);
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

    private static void searchBooks(WebDriverWait wait) {
        WebElement paperBooks = wait
                .withMessage("The waiter for paper books is failed due to timeout: 30 sec.")
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='gilroy-h4']")));
        paperBooks.click();
    }

    private static List<WebElement> assertBooksCount(WebDriverWait wait) {
        WebElement booksCatalog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'catalogue-products')]")));
        return booksCatalog.findElements(By.xpath("//div[contains(@class, 'product-card')]"));
    }
}
