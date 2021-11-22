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

    public void showDuties(){
        System.out.println("His responsibilities is to " + job.getResponsibilities());
    }



    public static void main(String[] args) {
        Job actor = new Actor();
        Person tomaszKarolak = new Person("Tomasz", 50, actor); //dlaczego nie podswietla mi sie tutaj argument z konstruktora, job: actor?
        tomaszKarolak.showDuties();

        Job barber = new Barber();
        Person janStrzyg = new Person("Jan", 30, barber);
        janStrzyg.showDuties();

        Job clown = new Clown();
        Person olafPajacyk = new Person("Olaf", 21, clown);
        olafPajacyk.showDuties();

        Job driver = new Driver();
        Person igorKiero = new Person("Igor", 59, driver);
        igorKiero.showDuties();

        Job electrician = new Electrician();
        Person kamilWolt = new Person("Kamil", 27, electrician);
        kamilWolt.showDuties();

    }

}
