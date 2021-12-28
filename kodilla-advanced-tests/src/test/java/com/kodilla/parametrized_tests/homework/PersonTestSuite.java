package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {



    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.PersonSource#providePeopleForTestingBmi")
    public void shlouldCalculateBmiAndReturnComment(Person input, String expected){
        assertEquals(expected, input.getBMI());
    }
}