package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {

    static Stream<Arguments> providePeopleForTestingBmi(){
        return Stream.of(
                Arguments.of(new Person(1.9, 89.0), "Normal (healthy weight)"),
                Arguments.of(new Person(1.8, 10.0), "Very severely underweight"),
                Arguments.of(new Person(1.7, 690.0), "Obese Class VI (Hyper Obese)")
        );
    }

}
