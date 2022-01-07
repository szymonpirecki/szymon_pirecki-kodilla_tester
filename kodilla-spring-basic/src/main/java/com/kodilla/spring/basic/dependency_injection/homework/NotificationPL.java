package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationPL implements NotificationService{
    @Override
    public void success(String address) {
        System.out.println("Dostarczono Twoją przesyłkę na adres: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Nie dostarczono Twojej przesyłki na adres: " + address);

    }
}
