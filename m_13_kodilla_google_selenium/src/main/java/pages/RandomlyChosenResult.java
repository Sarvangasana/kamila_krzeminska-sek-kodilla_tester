package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RandomlyChosenResult extends AbstractPage {

    public RandomlyChosenResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeRandomlyChosenResult() {
        System.out.println("I see randomly chosen result.");
    }
}
