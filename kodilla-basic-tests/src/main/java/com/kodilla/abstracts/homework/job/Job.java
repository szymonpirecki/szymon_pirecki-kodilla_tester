package com.kodilla.abstracts.homework.job;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(int salary, String responsibilities){
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public String getResponsibilities(){
        return responsibilities;
    }








}
