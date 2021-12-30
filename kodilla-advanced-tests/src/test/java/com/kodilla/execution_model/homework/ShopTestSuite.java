package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {

    Shop shop = new Shop();
    Order testOrder1 = new Order(10, LocalDate.of(2021,1,1), "login1");
    Order testOrder2 = new Order(20, LocalDate.of(2021,1,2), "login2" );
    Order testOrder3 = new Order(30, LocalDate.of(2021,1,3), "login3" );
    Order testOrder4 = new Order(40, LocalDate.of(2021,1,4), "login4" );

    @BeforeEach
    public void initializeList(){
        shop.addOrder(testOrder1);
        shop.addOrder(testOrder2);
        shop.addOrder(testOrder3);
        shop.addOrder(testOrder4);
    }
    @Test
    public void shouldAddOrderToTheListAnd(){
        assertEquals(4, shop.getNumberOfOrders());
    }

    @Test
    public void shouldReturnNumberOfElements(){
        assertEquals(4,shop.getNumberOfOrders());
    }

    @Test
    public void shouldReturnSumOfOrderValues(){
        assertEquals(100, shop.getSumOfOrderValues());
    }

    @Test
    @CsvSource(value = "2021,1,1:2021,1,2", delimiter = ':')
    public void shouldReturnListOfOrdersFromAGivenPeriod(LocalDate min, LocalDate max){
        List<Order> expected = new ArrayList<>();
        expected.add(testOrder1);
        expected.add(testOrder2);
        assertEquals(expected, shop.getListOfOrdersFromAGivenPeriod(min, max));
    }
    @Test
    public void shouldReturnListOfOrdersFromAGivenValueRange(double minValue, double maxValue){
        List<Order> expected = new ArrayList<>();
        expected.add(testOrder1);
        assertEquals(expected, shop.getListOfOrdersFromAGivenValueRange(5,15));
    }

    //jak podawac w testach listy obiektow jako argumenty? jak robie to tym sposobem to mi wyrzuca błędy
}