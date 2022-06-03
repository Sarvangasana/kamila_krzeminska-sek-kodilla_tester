package com.kodilla.abstracts.homework;

public class JavaDeveloper extends Job {
    public JavaDeveloper(){
        super();
        this.responsibilities = "coding";
        this.salary = 10000;
    }

    @Override
    public void displayJobResponsibilities() {
        System.out.println(responsibilities);
    }
}
