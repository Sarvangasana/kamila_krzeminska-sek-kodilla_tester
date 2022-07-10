package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSources {

    static Stream<Arguments> provideDoublesForTestingGetBMI() {
        return Stream.of(
                Arguments.of(new Person(1.65, 35), "Very severely underweight"),
                Arguments.of(new Person(1.65, 43), "Severely underweight"),
                Arguments.of(new Person(1.65, 50.36), "Underweight"),
                Arguments.of(new Person(1.65, 68), "Normal (healthy weight)"),
                Arguments.of(new Person(1.65, 81.60), "Overweight"),
                Arguments.of(new Person(1.65, 95), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.65, 95.5), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.65, 109), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.65, 134), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.65, 150), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.65, 170), "Obese Class VI (Hyper Obese)")
                );
    }
}
