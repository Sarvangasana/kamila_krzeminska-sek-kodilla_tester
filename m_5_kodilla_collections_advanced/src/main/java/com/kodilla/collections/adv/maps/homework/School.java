package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String schoolName;
    private List<Integer> listOfClassSizes;


    public School(String schoolName, List<Integer> listOfClassSizes) {
        this.schoolName = schoolName;
        this.listOfClassSizes = listOfClassSizes;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getListOfClassSizes() {
        return listOfClassSizes;
    }

    public int sumNumberOfPupilsInSchool() {
        int sum = 0;
        for (Integer listOfClassSize : listOfClassSizes) sum += listOfClassSize;
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(listOfClassSizes, school.listOfClassSizes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfClassSizes);
    }

    @Override
    public String toString() {
        return "School{" +
                "listOfClassSizes=" + listOfClassSizes +
                '}';
    }
}
