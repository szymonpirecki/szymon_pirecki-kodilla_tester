package com.kodilla.spring.basic.dependency_injection.homework;

public class FragileShipping implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Your fragile package too heavy");
            return false;
        }
        System.out.println("Delivering your fragile package in progress...");
        return true;
    }
    }

