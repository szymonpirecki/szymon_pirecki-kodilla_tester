import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;

public class TestGoogle {

    WebDriver driver;
    @Before
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/szymon_pirecki-kodilla_tester/src/main/resources/chromedriver-kopia");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        WebElement acceptCookies = driver.findElement(By.id("L2AGLb"));
        acceptCookies.click();
    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void testGooglePage() throws InterruptedException {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        googleResults.pickRandomResult(driver);
    }
}
