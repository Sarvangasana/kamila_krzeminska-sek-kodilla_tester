package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/intUserNumbers.csv")
    public void shouldCountHowManyWins(int element1, int element2, int element3, int element4, int element5,
                                       int element6) throws InvalidNumbersException {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(element1);
        integerSet.add(element2);
        integerSet.add(element3);
        integerSet.add(element4);
        integerSet.add(element5);
        integerSet.add(element6);

        gamblingMachine.howManyWins(integerSet);
    }

   // @ParameterizedTest
   // @CsvFileSource(resources = "/setIntegerInvalidUserNumbers.csv")
   //     public void shouldThrowException(int element1, int element2, int element3, int element4, int element5,
//                                         int element6) throws InvalidNumbersException {
//            Set<Integer> integerSet = new HashSet<>();
//            integerSet.add(element1);
//            integerSet.add(element2);
//            integerSet.add(element3);
//            integerSet.add(element4);
//            integerSet.add(element5);
//            integerSet.add(element6);
//
//            gamblingMachine.howManyWins(integerSet);
//   }

}