package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidatiorTestSuite {

private StringValidatior stringValidatior = new StringValidatior();

@Test
    public void shouldReturnFalseIfStringIsNotEmpty(){
    assertFalse(stringValidatior.isBlank("test"));
}
@ParameterizedTest
@ValueSource(strings = {"", "    "})
    public void shouldReturnTrueIfStringIsEmpty(String text){
    assertTrue(stringValidatior.isBlank(text));
}
@ParameterizedTest
@NullAndEmptySource
    public void shouldReturnTrueIfStringIsANull(String text){
    assertTrue(stringValidatior.isBlank(text));
}

}