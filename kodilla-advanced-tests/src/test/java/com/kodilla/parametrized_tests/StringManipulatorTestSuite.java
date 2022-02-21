package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManipulatorTestSuite {

    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReturnReverseStringWithLowerCase(String input, String expected){
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }



    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }



    @ParameterizedTest
    @CsvFileSource(resources = "/numberOfComas.csv", delimiter = ':')
    public void shouldReturnNumberOfComas(String input, int expected){
        assertEquals(expected, manipulator.getNumberOfComas(input));
    }

}