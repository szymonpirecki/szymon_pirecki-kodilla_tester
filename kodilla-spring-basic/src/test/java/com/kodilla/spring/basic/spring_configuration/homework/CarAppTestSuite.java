package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CarAppTestSuite {

    @Test
    public void shouldReturnSUV(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCar");
        String carType = car.getCarType();
        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void carShouldHasTurnedOffLights(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCar");
        boolean lightsOn = car.hasHeadlightsTurnedOn();
        Assertions.assertFalse(lightsOn);
    }
}