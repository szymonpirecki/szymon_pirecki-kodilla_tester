package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidUserNumbers.csv")
    public void shouldThrowAnException(String input){
        Set<Integer> userNumbers = new HashSet<>();
        String numbers[] = input.split(",");
        for (String number : numbers) {
            Integer numberAsInteger = Integer.parseInt(number);
            userNumbers.add(numberAsInteger);
        }
        Assertions.assertThrows(InvalidNumbersException.class, () ->gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validUserNumbers.csv")
    public void shouldNotThrowAnException(String input){
        Set<Integer> userNumbers = new HashSet<>();
        String numbers[] = input.split(",");
        for (String number : numbers) {
            Integer numberAsInteger = Integer.parseInt(number);
            userNumbers.add(numberAsInteger);
        }
        Assertions.assertDoesNotThrow(() -> gamblingMachine.howManyWins(userNumbers));

    }

}