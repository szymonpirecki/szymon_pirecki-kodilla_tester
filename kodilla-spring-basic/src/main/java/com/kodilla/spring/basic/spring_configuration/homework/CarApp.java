package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarApp {

    @Bean
    public Car getCar(){
        Car car;
        if (LocalDate.now().getMonthValue() == 12 ||
                LocalDate.now().getMonthValue() == 1 ||
                LocalDate.now().getMonthValue() == 2){
            car = new SUV();
        } else if (LocalDate.now().getMonthValue() == 6 ||
                LocalDate.now().getMonthValue() == 7 ||
                LocalDate.now().getMonthValue() == 8){
            car = new Cabrio();
        }
        else {
            car = new Sedan();
        }
        return car;
    }


}
