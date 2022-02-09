package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage{

@FindBy(css = "h3>a[href*='http']")
private List<WebElement> results;


    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public PickedResult pickRandomResult(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        Random random = new Random();
        WebElement randomElement = results.get(random.nextInt(results.size()));
        randomElement.click();
        PickedResult pick = new PickedResult(driver);
        return pick;
    }
}
