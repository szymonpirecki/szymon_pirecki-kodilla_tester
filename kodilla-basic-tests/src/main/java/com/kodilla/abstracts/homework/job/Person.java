package com.kodilla.abstracts.homework.job;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }



    public static void main(String[] args) {
        JobMethods duties = new JobMethods();

        Job actor = new Actor();
        duties.showingResponsibilities(actor);
        // System.out.println(actor.getResponsibilities());

        Job barber = new Barber();
        duties.showingResponsibilities(barber);
       // System.out.println(barber.getResponsibilities());

        Job clown = new Clown();
        duties.showingResponsibilities(clown);
        //System.out.println(clown.getResponsibilities());

        Job driver = new Driver();
        duties.showingResponsibilities(driver);
      //  System.out.println(driver.getResponsibilities());

        Job electrician = new Electrician();
        duties.showingResponsibilities(electrician);
    //    System.out.println(electrician.getResponsibilities());
    }

}
