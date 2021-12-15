package com.kodilla.exception.homework;


import java.util.ArrayList;
import java.util.List;

public class Warehouse {

 private static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        Order theOrder = Warehouse.getOrders()
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny().orElseThrow(()->new OrderDoesntExistException());
        return theOrder;
    }

    public static List<Order> getOrders() {
        return orders;
    }
}
