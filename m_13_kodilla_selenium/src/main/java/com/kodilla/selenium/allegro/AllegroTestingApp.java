package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div/div/div[2]/button")).click();

        Thread.sleep(10000);
////        PYTANIE: Jak zastosować prawidłowo - zamiast thread.sleep - opcję z wait.until(ExpectedConditions)??
//        Jak próbuję wg modelu poniżej, to podkreśla mi na czerwono
////        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//                "//*[@aria-label=\"Kategoria i opcje wyszukiwania\"]/optgroup/option[3]")));
        driver.findElement(By.xpath("//*[@aria-label=\"Kategoria i opcje wyszukiwania\"]/optgroup/option[3]")).click();

        Thread.sleep(10000);
        WebElement inputField = driver.findElement(By.xpath("//*[@data-role=\"search-input\"]"));
        Thread.sleep(10000);
        inputField.sendKeys("mavic mini");
        Thread.sleep(10000);
        inputField.submit();
    }
}
