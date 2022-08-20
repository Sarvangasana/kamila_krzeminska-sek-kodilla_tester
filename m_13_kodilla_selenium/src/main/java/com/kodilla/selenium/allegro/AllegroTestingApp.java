package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement gdprConsentButton = driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div/div/div[2]/button"));
        wait.until(ExpectedConditions.visibilityOf(gdprConsentButton)).click();

        WebElement electronicsSearchOption = driver.findElement(By.xpath("//*[@aria-label=\"Kategoria i opcje wyszukiwania\"]/optgroup/option[3]"));
        wait.until(ExpectedConditions.visibilityOf(electronicsSearchOption)).click();

        WebElement inputField = driver.findElement(By.xpath("//*[@data-role=\"search-input\"]"));
        wait.until(ExpectedConditions.visibilityOf(inputField));
        inputField.sendKeys("mavic mini");
        inputField.submit();
    }
}
