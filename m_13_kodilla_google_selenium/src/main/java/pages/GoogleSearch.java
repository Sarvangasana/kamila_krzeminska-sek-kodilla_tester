package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleSearch extends AbstractPage {
    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    private static List<WebElement> searchButton;

    private static GoogleResults googleResults;

    private static RandomlyChosenResult randomlyChosenResult;

    public GoogleSearch(WebDriver driver) {                  // [2]
        super(driver);
    }

    public void searchResults() throws InterruptedException {
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        randomlyChosenResult = loadRandomlyChosenResult(driver);
        randomlyChosenResult.iSeeRandomlyChosenResult();
    }

    public GoogleResults loadResults(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        //Thread.sleep(3000);
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }

    public RandomlyChosenResult loadRandomlyChosenResult(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOf(googleResults.chooseResultRandomly())).click();
        RandomlyChosenResult randomlyChosenResult = new RandomlyChosenResult(driver);
        return randomlyChosenResult;
    }
}