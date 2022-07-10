package com.kodilla.execution_model.homework;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List <Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> filterOrdersSublistFromGivenDateRange(LocalDateTime initialDate, LocalDateTime borderDate) {
        return orders.stream()
                .filter(order -> (order.getDate().isEqual(borderDate) || order.getDate().isBefore(borderDate))
                    && (order.getDate().isEqual(initialDate) || order.getDate().isAfter(initialDate)))
                .collect(Collectors.toList());
    }

    public List<Order> filterOrdersSublistFromGivenValueRange(int smallestValue, int highestValue) {
        return orders.stream()
                .filter(order -> order.getValue() >= smallestValue)
                .filter(order -> order.getValue() <= highestValue)
                .collect(Collectors.toList());
    }

    public int getSize() {
        return this.orders.size();
    }

    public int getSumOfAllOrdersValues() { // spróbuję sobie później zrobić tę metodę używając Stream
        int valuesSum = 0;
        for (Order order : orders) valuesSum += order.getValue();
        return valuesSum;
    }
}
