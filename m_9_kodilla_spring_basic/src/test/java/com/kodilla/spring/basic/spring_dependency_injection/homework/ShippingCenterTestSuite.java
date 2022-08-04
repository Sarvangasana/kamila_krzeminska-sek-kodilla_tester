package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldNotifySuccessfulDeliveryOfAPackageIfWeightIs30() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String aPackage = bean.sendPackage("Ziołowa 43/26, Katowice", 29);
        Assertions.assertEquals("Package delivered to: Ziołowa 43/26, Katowice",aPackage);
    }

    @Test
    public void shouldNotifySuccessfulDeliveryOfAPackageIfWeightUnder30() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String aPackage = bean.sendPackage("Ziołowa 43/26, Katowice", 29);
        Assertions.assertEquals("Package delivered to: Ziołowa 43/26, Katowice",aPackage);
    }

    @Test
    public void shouldNotifyFailedDeliveryOfAPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String aPackage = bean.sendPackage("Ziołowa 43/26, Katowice", 31);
        Assertions.assertEquals("Package not delivered to: Ziołowa 43/26, Katowice",aPackage);
    }
}
