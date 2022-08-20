package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCssSelectors {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement acceptButton = driver.findElement(By.cssSelector("button[data-role*='accept-consent']"));
        wait.until(ExpectedConditions.visibilityOf(acceptButton)).click();

        WebElement electronicsSearchOption = driver.findElement(By
                .cssSelector("select[data-role*='filters-dropdown-toggle'] > optgroup > option[value*='/kategoria/elektronika']"));
        wait.until(ExpectedConditions.visibilityOf(electronicsSearchOption)).click();

        WebElement inputField = driver.findElement(By.cssSelector("input[data-role*='search-input']"));
        wait.until(ExpectedConditions.visibilityOf(inputField));
        inputField.sendKeys("mavic mini");
        inputField.submit();

        WebElement firstArticle = driver.findElement(By.cssSelector("section > article[data-analytics-view-custom-index0*='0']"));
        wait.until(ExpectedConditions.visibilityOf(firstArticle));

        List<WebElement> articles = driver.findElements(By.cssSelector("section > article"));
        for (WebElement article : articles) {
            System.out.println(article.getText());
        }
    }
}
