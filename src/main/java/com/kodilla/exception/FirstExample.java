package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String userName = "jan pawel II";
        String[] nameParts = userName.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);
        System.out.println("index: " + nameParts[2]);
    }
}
