package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    //Random random = new Random();
    // Na razie robię tylko wyszukanie WebElementu result, bez losowego wybierania 'result' z 'results'

    @FindBy(css = "a[href='https://kodilla.com/pl']")
    List <WebElement> result;

    // WebElement url = result.get(1).findElement(By.cssSelector("https://kodilla.com/pl"));

    private RandomlyChosenResult randomlyChosenResult;


    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void searchRandomResult() throws InterruptedException {
        PageFactory.initElements(this.driver, this);
        randomlyChosenResult = loadRandomlyChosenResult(driver);
        randomlyChosenResult.iSeeRandomlyChosenResult();
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public RandomlyChosenResult loadRandomlyChosenResult(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        result.get(1).click();
        RandomlyChosenResult randomlyChosenResult = new RandomlyChosenResult(driver);
        return randomlyChosenResult;
    }
}
