package com.kodilla.abstracts.homework;

public class Mechanic extends Job {
    public Mechanic() {
        super();
        this.responsibilities = "change of a light bulb";
        this.salary = 3000;
    }

    @Override
    public void displayJobResponsibilities() {
        System.out.println(responsibilities);
    }
}
