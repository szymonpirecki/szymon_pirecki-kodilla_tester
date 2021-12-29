package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    public static List<Order> getOrders() {
        return orders;
    }

    private static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){this.orders.add(order);}

    public int getNumberOfOrders(){return this.orders.size();}

    public List<Order> getListOfOrdersFromAGivenPeriod(Date min, Date max){
        List<Order> listOfOrdersFromAGivenPeriod = Shop.getOrders();
        Shop.getOrders()
                .stream()
                .filter(o -> o.getDateOfOrder().after(min))
                .filter(o -> o.getDateOfOrder().before(max))
                .collect(Collectors.toList());
        return listOfOrdersFromAGivenPeriod;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Order testOrder = new Order(100, new Date(2021,12,24), "login" );
        Order testOrder1 = new Order(10, new Date(2021,1,24), "login1" );
        Order testOrder2 = new Order(20, new Date(2021,2,24), "login2" );
        Order testOrder3 = new Order(30, new Date(2021,3,24), "login3" );

        shop.addOrder(testOrder);
        shop.addOrder(testOrder1);
        shop.addOrder(testOrder2);
        shop.addOrder(testOrder3);
        System.out.println(shop.getListOfOrdersFromAGivenPeriod(new Date(2021,1,23), new Date(2021,2,25)));
    //dlaczego do listy listOfOrdersFromAGivenPeriod trafiaja wszystkie zamowienia pomimo filtrow w streamie?
    }
}
