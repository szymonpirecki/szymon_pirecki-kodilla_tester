package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource (strings = {"kacper97", "Michauem_99", "PABLO.03", "OlA-Lola", "jan", "._-"})
    public void shouldReturnTrueForLegitUsernames(String username){
        assertTrue(validator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource (strings = {"żanklod20", "alek$", "lechu40%", "a", "ab", "@@@"})
    public void shouldReturnFalseForNotLegitUsernames(String username){
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource (strings = {"szymon.pirecki@gmail.com", "a@tlen.pl", "kamil@wp.pl"})
    public void shouldReturnTrueForLegitEmails(String email){
        assertTrue(validator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource (strings = {"szymon.pirecki*gmail.com", "szymon@gmail,com", "!!!@tlen.pl"})
    public void shouldReturnFalseForNotLegitEmails(String email){
        assertFalse(validator.validateEmail(email));
    }


}