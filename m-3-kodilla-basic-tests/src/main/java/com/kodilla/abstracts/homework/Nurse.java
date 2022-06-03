package com.kodilla.abstracts.homework;

public class Nurse extends Job {
    public Nurse() {
        super();
        this.responsibilities = "taking care of patients";
        this.salary = 5000;
    }

    @Override
    public void displayJobResponsibilities() {
        System.out.println(responsibilities);
    }
}
