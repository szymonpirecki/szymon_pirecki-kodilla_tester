package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldGetDifferentTime(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock first = context.getBean(Clock.class);
        LocalDateTime firstTiming = first.actualTime();
        Clock second = context.getBean(Clock.class);
        LocalDateTime secondTiming = second.actualTime();
        Assertions.assertNotEquals(firstTiming, secondTiming);
    }



}