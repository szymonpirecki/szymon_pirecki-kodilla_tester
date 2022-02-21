package com.kodilla.jacoco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {

    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1200, 1600})
    void shouldBeLeapYearIfDivisibleBy400(int number){
        Year year = new Year(number);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12, 16})
    void shouldBeLeapYearIfDivisibleBy4andNotBy100(int number){
        Year year = new Year(number);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {399, 401, 799, 801, 1199, 1201})
    void shouldNotBeLeapYearIfNotDivisibleBy400(int number){
        Year year = new Year(number);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }
}