package com.kodilla.execution_model.homework;

import java.time.LocalDateTime;

public class ShopApp {
    public static void main(String[] args) {
        // JAKUB: Tą klasę napisałam dla siebie, żeby zobaczyć niektóre metody - czy działają;
        Shop shop = new Shop();
        shop.addOrder(new Order (25, LocalDateTime.of(2000, 1, 15, 5, 45), "Oskar"));
        shop.addOrder(new Order(30, LocalDateTime.of(1990, 12, 20, 8, 55), "Kamila"));
        shop.addOrder(new Order(45, LocalDateTime.of(1999, 3, 25, 3, 30), "Natalia"));
        shop.addOrder(new Order(10, LocalDateTime.of(2020, 11, 2, 9, 25), "Maria"));
        shop.addOrder(new Order(5, LocalDateTime.of(2021, 5, 31, 10, 20), "Michał"));
        shop.addOrder(new Order(50, LocalDateTime.of(2018, 6, 5, 12, 59), "Adam"));
        System.out.println(shop.getSumOfAllOrdersValues());

        System.out.println(shop.filterOrdersSublistFromGivenValueRange(10, 45));

       LocalDateTime localDateTime = LocalDateTime.now();
       System.out.println(localDateTime);
    }
}
