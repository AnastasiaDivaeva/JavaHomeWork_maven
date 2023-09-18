package divaeva.selenium.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class SearchBookByTittle {
    public static void main(String[] args) {
        openSite();
        doLogin();
        prepareSearchQuery();
        List<WebElement> searchResult = submitSearchQuery();
        for (WebElement webElement : searchResult) {
            String resultText = webElement.getText();
            Assert.assertTrue(resultText.contains("Тема для медитації"));
        }
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

    private static void prepareSearchQuery() {
        WebElement searchInput = TestUtils.DRIVER.findElement(By.xpath("//input[@placeholder='Шукати...']"));
        searchInput.sendKeys("Тема для медитації");
    }

    private static List<WebElement> submitSearchQuery() {
        By searchButtonSelector = By.xpath("//a[ text()='Переглянути більше']");
        WebDriverWait wait = new WebDriverWait(TestUtils.DRIVER, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(visibilityOfElementLocated(searchButtonSelector));
        searchButton.click();
        WebElement allResults = TestUtils.DRIVER.findElement(By.className("Search_search__results__YQ7KH"));
        List<WebElement> searchResult = allResults.findElements(By.xpath("//div[contains(@class, 'Search_search__result-item__7')]"));
        Assert.assertEquals(searchResult.size(), 4);
        return searchResult;
    }
}
