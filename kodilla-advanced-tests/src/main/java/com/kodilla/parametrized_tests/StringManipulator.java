package com.kodilla.parametrized_tests;


public class StringManipulator {

    public String reverseWithLowerCase (String input){
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }
    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }
    public int getNumberOfComas(String input){
        int count = input.length() - input.replaceAll(",", "").length();
        return count;
    }
}
