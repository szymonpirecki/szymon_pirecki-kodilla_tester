package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {

    Shop shop = new Shop();
    Order testOrder = new Order(100, new Date(2021,12,24), "login" );
    Order testOrder1 = new Order(10, new Date(2021,1,24), "login1" );
    Order testOrder2 = new Order(20, new Date(2021,2,24), "login2" );
    Order testOrder3 = new Order(30, new Date(2021,3,24), "login3" );

    @Test
    public void shouldAddOrderToTheList(){
    shop.addOrder(testOrder);
    assertEquals(1, shop.getNumberOfOrders());
    }

    @Test
    @CsvSource(value = "2021,1,23:2021,2,25", delimiter = ':')
    public void shouldReturnOrdersFromAGivenPeriod(Date min, Date max){
        List<Order> expected = new ArrayList<>();
        expected.add(testOrder1);
        expected.add(testOrder2);
        assertEquals(expected, shop.getListOfOrdersFromAGivenPeriod(min, max));
    }
}