package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double value;
    private LocalDate dateOfOrder;
    private String customerLogin;

    public Order(double value, LocalDate dateOfOrder, String customerLogin) {
        this.value = value;
        this.dateOfOrder = dateOfOrder;
        this.customerLogin = customerLogin;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public String getCustomerLogin() {
        return customerLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 && Objects.equals(dateOfOrder, order.dateOfOrder) && Objects.equals(customerLogin, order.customerLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, dateOfOrder, customerLogin);
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", dateOfOrder=" + dateOfOrder +
                ", customerLogin='" + customerLogin + '\'' +
                '}';
    }
}
