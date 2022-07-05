package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("GZL/30/2022"));
        warehouse.addOrder(new Order("GZL/31/2022"));
        warehouse.addOrder(new Order("GZL/31/2022")); // Set nie powinien umożliwić dodania drugiego takiego samego Order
        try {
            Order order = warehouse.getOrder("GZL/351/2022");
            System.out.println(order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Order number doesn't exist.");
        } finally {
            System.out.println("Thank You for using our system.");
        }
    }
}
