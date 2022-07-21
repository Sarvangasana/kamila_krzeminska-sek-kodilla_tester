package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "c:\\selenium-drivers\\firefox\\geckodriver.exe");      // [1]
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.pl");

        WebElement inputField = driver.findElement(By.name("_nkw")); // [4]
        inputField.sendKeys("Laptop");
        inputField.submit();
    }
}
