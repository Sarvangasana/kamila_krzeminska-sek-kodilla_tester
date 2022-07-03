package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Warehouse {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(o -> Objects.equals(o.getNumber(), number))
                .findFirst() //znajdź pierwsze wystąpienie spełniające podane warunki
                .orElseThrow(() -> new OrderDoesntExistException());
    }
}
