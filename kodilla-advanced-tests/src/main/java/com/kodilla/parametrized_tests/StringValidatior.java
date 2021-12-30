package com.kodilla.parametrized_tests;

public class StringValidatior {
    public boolean isBlank(String text){
        return text == null || text.trim().isEmpty();
    }
}
