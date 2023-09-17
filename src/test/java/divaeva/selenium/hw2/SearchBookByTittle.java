package divaeva.selenium.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class SearchBookByTittle {
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

    private static void prepareSearchQuery() {
        WebElement searchInput = TestUtils.DRIVER.findElement(By.xpath("//input[@placeholder='Шукати...']"));
        searchInput.sendKeys("Тема для медитації");
    }

    private static void submitSearchQuery() {
        By searchButtonSelector = By.xpath("//a[ text()='Переглянути більше']");
        WebDriverWait wait = new WebDriverWait(TestUtils.DRIVER, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(visibilityOfElementLocated(searchButtonSelector));
        searchButton.click();
        List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("// h2/a[@href='/knyga-tema-dlya-medytaciyi']")));

        Assert.assertEquals(products.size(), 1);

        WebElement fountBook = products.get(0);
        String fountBookTitle = fountBook.getText();
        Assert.assertEquals(fountBookTitle, "Тема для медитації");
    }

    public static void main(String[] args) {
        openSite();
        doLogin();
        prepareSearchQuery();
        submitSearchQuery();
        TestUtils.DRIVER.close();
    }
}
