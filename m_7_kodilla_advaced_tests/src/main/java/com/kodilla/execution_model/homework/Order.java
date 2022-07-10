package com.kodilla.execution_model.homework;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order {
    private int value;
    private LocalDateTime date;
    private String login;

    public Order (int value, LocalDateTime date, String login) {
        this.value = value;
        this.date = date;
        this.login = login;
    }

    public int getValue() {
        return value;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return value == order.value && Objects.equals(date, order.date) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, date, login);
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date='" + date + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
