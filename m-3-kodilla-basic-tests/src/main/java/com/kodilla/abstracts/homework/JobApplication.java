package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        Person person1 = new Person("Kamila", 34, nurse);
        person1.getJob().displayJobResponsibilities();
        System.out.println();

        JavaDeveloper javaDeveloper = new JavaDeveloper();
        Person person2 = new Person("Oskar", 28, javaDeveloper);
        person2.getJob().displayJobResponsibilities();
        System.out.println();

        Mechanic mechanic = new Mechanic();
        Person person3 = new Person("Tomasz", 36, mechanic);
        person3.getJob().displayJobResponsibilities();
        System.out.println();

        Policeman policeman = new Policeman();
        Person person4 = new Person("Andrzej", 34, policeman);
        person4.getJob().displayJobResponsibilities();
    }
}
