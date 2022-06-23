package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        Double avg = UsersRepository.getUsersList()
                .stream()
                .mapToInt(n -> n.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
