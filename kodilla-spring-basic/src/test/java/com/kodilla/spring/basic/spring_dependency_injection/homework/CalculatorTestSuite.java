package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldReturnTheSum(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double sum = bean.add(10, 5);
        Assertions.assertEquals(15, sum);
    }

    @Test
    public void shouldReturnTheDifference(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double difference = bean.subtract(10, 5);
        Assertions.assertEquals(5, difference);
    }

    @Test
    public void shouldReturnTheProduct(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double product = bean.multiply(10, 5);
        Assertions.assertEquals(50, product);
    }

    @Test
    public void shouldReturnTheQuotient(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double quotient = bean.divide(50, 5);
        Assertions.assertEquals(10, quotient);
    }
}