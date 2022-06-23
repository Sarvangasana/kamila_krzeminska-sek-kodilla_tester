package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna Nowak", new Teacher("Oskar Sęk")));
        students.add(new Student("Paweł Probierz", new Teacher("Maria Puls")));
        students.add(new Student("Monika Hanusiak", null));

        for (Student student : students) {
            Optional<Teacher> optionalName = Optional.ofNullable(student.getTeacher());
            String name = optionalName.orElse(new Teacher("<undefined>")).getName();
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + name);
        }
    }
}
