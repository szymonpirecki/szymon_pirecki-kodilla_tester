package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {


    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }

    public double getSumOfOrderValues() {
        double sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum = sum + orders.get(i).getValue();
        }
        return sum;
    }

    public List<Order> getListOfOrdersFromAGivenPeriod(LocalDate min, LocalDate max) {
        List<Order> listOfOrdersFromAGivenPeriod = orders.stream()
                .filter(o -> o.getDateOfOrder().isAfter(min.minusDays(1)))
                .filter(o -> o.getDateOfOrder().isBefore(max.plusDays(1)))
                .collect(Collectors.toList());
        return listOfOrdersFromAGivenPeriod;
    }

    public List<Order> getListOfOrdersFromAGivenValueRange(double minValue, double maxValue) {
        List<Order> listOfOrdersFromAGivenValueRange = orders.stream()
                .filter(o -> o.getValue() >= minValue)
                .filter(o -> o.getValue() <= maxValue)
                .collect(Collectors.toList());
        return listOfOrdersFromAGivenValueRange;
    }

}




