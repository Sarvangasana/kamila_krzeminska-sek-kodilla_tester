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

        Thread.sleep(10000);
        driver.findElement(By.cssSelector("button[class*='mgn2_14 mp0t_0a m9qz_yp mp7g_oh mse2_40 mqu1_40 mtsp_ib " +
                "mli8_k4 mp4t_0 munh_0 m911_5r mefy_5r mnyp_5r mdwl_5r msbw_2 mldj_2 mtag_2 mm2b_2 mqvr_2 msa3_z4 " +
                "mqen_m6 meqh_en m0qj_5r mh36_16 mvrt_16 mg9e_0 mj7a_0 mjir_sv m2ha_2 m8qd_qh mjt1_n2 b1vf8 mgmw_9u " +
                "msts_enp mrmn_qo mrhf_u8 m31c_kb m0ux_fp bnpxh mjru_k4 _158e2_4-oWM m3h2_0 m3h2_16_s mryx_24 mryx_0_s" +
                " mryx_24_x m7er_0k']")).click();

        Thread.sleep(10000);
        driver.findElement(By.cssSelector("select[class*='mr3m_1 m7er_k4 mj6k_n7 sy40i mgn2_14 mp0t_0a mqu1_21 mgmw_wo" +
                " mli8_k4'] > optgroup > option[value*='/kategoria/elektronika']")).click();

        Thread.sleep(10000);
        WebElement inputField = driver.findElement(By.cssSelector("input[data-role*='search-input']"));
        Thread.sleep(10000);
        inputField.sendKeys("mavic mini");
        Thread.sleep(10000);
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("section > article[data-analytics-view-custom-index0*='0']")));

        List<WebElement> articles = driver.findElements(By.cssSelector("section > article"));
        for (WebElement article : articles) {
            System.out.println(article.getText());
        }
    }
}
