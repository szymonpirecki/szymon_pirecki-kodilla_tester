package com.kodilla.abstracts.homework.job;

public class Person {
    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Job actor = new Actor();
        System.out.println(actor.getResponsibilities());

        Job barber = new Barber();
        System.out.println(barber.getResponsibilities());

        Job clown = new Clown();
        System.out.println(clown.getResponsibilities());

        Job driver = new Driver();
        System.out.println(driver.getResponsibilities());

        Job electrician = new Electrician();
        System.out.println(electrician.getResponsibilities());
    }

}
