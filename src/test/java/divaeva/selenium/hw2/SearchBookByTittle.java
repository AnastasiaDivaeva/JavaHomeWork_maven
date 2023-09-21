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
        int expectedSearchResultsCount = 4;
        openSite();
        doLogin();
        WebElement searchInput = prepareSearchQuery();
        submitSearchQuery(searchInput);
        List<WebElement> searchResult = getSearchResult();
        Assert.assertEquals(searchResult.size(), expectedSearchResultsCount);
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

    private static WebElement prepareSearchQuery() {
        WebElement searchInput = TestUtils.DRIVER.findElement(By.xpath("//input[@placeholder='Шукати...']"));
        searchInput.sendKeys("Тема для медитації");
        return searchInput;
    }

    private static void submitSearchQuery( WebElement searchInput) {
        By searchButtonSelector = By.xpath("//a[ text()='Переглянути більше']");
        WebDriverWait wait = new WebDriverWait(TestUtils.DRIVER, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(visibilityOfElementLocated(searchButtonSelector));
        searchButton.click();
    }

    private static List<WebElement> getSearchResult() {
        WebElement allResults = TestUtils.DRIVER.findElement(By.className("Search_search__results__YQ7KH"));
        return allResults.findElements(By.xpath("//div[contains(@class, 'Search_search__result-item__7')]"));
    }
}
