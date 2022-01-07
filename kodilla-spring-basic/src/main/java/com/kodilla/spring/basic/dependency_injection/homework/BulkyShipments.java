package com.kodilla.spring.basic.dependency_injection.homework;

public class BulkyShipments implements DeliveryService{

    @Override
    public boolean deliverPackage(String address, double weight) {
            if (weight > 30) {
                System.out.println("Your big package too heavy");
                return false;
            }
            System.out.println("Delivering your big package in progress...");
            return true;
        }
    }

