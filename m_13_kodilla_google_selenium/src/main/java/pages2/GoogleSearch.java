package pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearch extends AbstractPage {
    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;

    private static GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {                  // [2]
        super(driver);
    }

    public void searchResults() throws InterruptedException {
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        driver.close();
    }
    public GoogleResults loadResults(WebDriver driver) throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        Thread.sleep(6000);
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
