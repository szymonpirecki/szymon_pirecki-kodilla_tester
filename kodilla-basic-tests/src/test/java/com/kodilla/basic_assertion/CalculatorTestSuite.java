package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {
    private double delta = 0.1;
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        double a = 10;
        double b = 5;
      //  double delta = 0.1;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(5, subtractResult, delta);
    }
    @Test
    public void testSubtract2(){
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 10;
     //   double delta = 0.1;
        double subtractResult = calculator.subtract(a, b);
        assertEquals( -5,subtractResult, delta);
    }
    @Test
    public void testSquare(){
        Calculator calculator = new Calculator();
        double a = 2;
       // double delta = 0.1;
        double squareResult = calculator.square(a);
        assertEquals(4, squareResult, delta);
    }

    @Test
    public void testSquare2(){
        Calculator calculator = new Calculator();
        double a = 0;
     //   double delta = 0.1;
        double squareResult = calculator.square(a);
        assertEquals(0,squareResult, delta);
    }
    @Test
    public void testSquare3(){
        Calculator calculator = new Calculator();
        double a = -2;
      //  double delta = 0.1;
        double squareResult = calculator.square(a);
        assertEquals(4, squareResult, delta);
    }



}
