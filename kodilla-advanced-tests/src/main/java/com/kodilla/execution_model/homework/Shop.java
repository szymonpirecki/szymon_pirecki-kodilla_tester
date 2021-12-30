package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    Shop shop = new Shop();

    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order){this.orders.add(order);}

    public int getNumberOfOrders(){return this.orders.size();}

    public double getSumOfOrderValues(){
        double sum = 0;
        for(int i = 0; i < orders.size(); i++){
            sum = sum + orders.get(i).getValue();
        }
        return sum;
    }

    public List<Order> getListOfOrdersFromAGivenPeriod(LocalDate min, LocalDate max){

        List<Order> listOfOrdersFromAGivenPeriod = shop.getOrders();
        listOfOrdersFromAGivenPeriod = shop.getOrders()
                .stream()
                .filter(o -> o.getDateOfOrder().isAfter(min))
                .filter(o -> o.getDateOfOrder().isBefore(max))
                .collect(Collectors.toList());
        return listOfOrdersFromAGivenPeriod;
    }

    public List<Order> getListOfOrdersFromAGivenValueRange(double minValue, double maxValue){

        List<Order> listOfOrdersFromAGivenValueRange = shop.getOrders();
        listOfOrdersFromAGivenValueRange = shop.getOrders()
                .stream()
                .filter(o -> o.getValue()>minValue)
                .filter(o -> o.getValue()<maxValue)
                .collect(Collectors.toList());
        return listOfOrdersFromAGivenValueRange;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Order testOrder1 = new Order(10, LocalDate.of(2021,1,1), "login1");
        Order testOrder2 = new Order(20, LocalDate.of(2021,1,2), "login2" );
        Order testOrder3 = new Order(30, LocalDate.of(2021,1,3), "login3" );
        Order testOrder4 = new Order(40, LocalDate.of(2021,1,4), "login4" );

        shop.addOrder(testOrder1);
        shop.addOrder(testOrder2);
        shop.addOrder(testOrder3);
        shop.addOrder(testOrder4);
        System.out.println(shop.getListOfOrdersFromAGivenPeriod(LocalDate.of(2021,1,1), LocalDate.of(2021,1,3)));
        System.out.println(shop.getSumOfOrderValues());
        System.out.println(shop.getListOfOrdersFromAGivenValueRange(20, 50));
    }}


