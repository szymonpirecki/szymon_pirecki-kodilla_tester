package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Cabrio implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return LocalTime.now().isAfter(LocalTime.of(19, 59, 59)) &&
                LocalTime.now().isBefore(LocalTime.of(6, 0, 0));
    }


    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
