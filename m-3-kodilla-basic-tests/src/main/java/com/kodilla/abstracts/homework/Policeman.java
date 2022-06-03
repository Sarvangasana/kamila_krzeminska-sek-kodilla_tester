package com.kodilla.abstracts.homework;

public class Policeman extends Job {
    public Policeman() {
        super();
        this.responsibilities = "chasing criminals";
        this.salary = 7000;
    }

    @Override
    public void displayJobResponsibilities() {
        System.out.println(responsibilities);
    }
}
