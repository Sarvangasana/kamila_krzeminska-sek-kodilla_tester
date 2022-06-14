package com.kodilla.collections.adv.maps.homework;

import java.util.*;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();
        Principal mary = new Principal("Mary", "Higgins");
        Principal henry = new Principal("Henry", "Clark");
        Principal matt = new Principal("Matt", "Damon");

        School coloradoTechnicalSchool = new School("Colorado Technical School",
                Arrays.asList(35, 40, 21, 28, 30, 37, 34, 25, 26));
        School massachusettsInstituteOfTechnology = new School("Massachusetts Institute of Technology",
                Arrays.asList(34, 18, 22, 24, 30, 32));
        School stanfordSchool = new School("Stanford School",
                Arrays.asList(20, 26, 28, 20, 30, 29));

        schoolDirectory.put(mary, stanfordSchool);
        schoolDirectory.put(henry, massachusettsInstituteOfTechnology);
        schoolDirectory.put(matt, coloradoTechnicalSchool);

        for ( Map.Entry<Principal, School> note : schoolDirectory.entrySet())
            System.out.println("Principal: " + note.getKey().getName() + note.getKey().getSurname()
                    + ", School Name: " + note.getValue().getSchoolName()
                    + ", Total number of pupils: " + note.getValue().sumNumberOfPupilsInSchool());
    }
}
