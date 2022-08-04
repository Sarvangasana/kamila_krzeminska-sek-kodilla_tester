package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    private static Calculator calculatorBean;

    @BeforeAll
    public static void initiateContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.kodilla.spring.basic.spring_dependency_injection.homework");
        calculatorBean = context.getBean(Calculator.class);
    }

    //method tested: add()
    @Test
    public void shouldAddTwoPositiveValues() {
        double returnSum = calculatorBean.add(3, 4);
        Assertions.assertEquals(7, returnSum);
    }

    @Test
    public void shouldAddTwoNegativeValues() {
        double returnSum = calculatorBean.add(-7, -7);
        Assertions.assertEquals(-14, returnSum);
    }

    @Test
    public void shouldReturnZeroAsSumOfMinusOneAndOne() {
        double returnSum = calculatorBean.add(-1, 1);
        Assertions.assertEquals(0, returnSum);
    }

    @Test
    public void shouldReturnSumOfMinusOneAndPlusFive() {
        double returnSum = calculatorBean.add(-1, 5);
        Assertions.assertEquals(4, returnSum);
    }

    //method tested: subtract()
    @Test
    public void shouldReturnSubtractionOfFiveMinusTwo() {
        double returnSubtraction = calculatorBean.subtract(5, 2);
        Assertions.assertEquals(3, returnSubtraction);
    }

    @Test
    public void shouldReturnSubtractionOfFiveMinusFive() {
        double returnSubtraction = calculatorBean.subtract(5, 5);
        Assertions.assertEquals(0, returnSubtraction);
    }

    @Test
    public void shouldReturnSubtractionOfFiveMinusNine() {
        double returnSubtraction = calculatorBean.subtract(5, 9);
        Assertions.assertEquals(-4, returnSubtraction);
    }

    @Test
    public void shouldReturnSubtractionOfZeroMinusZero() {
        double returnSubtraction = calculatorBean.subtract(0, 0);
        Assertions.assertEquals(0, returnSubtraction);
    }

    @Test
    public void shouldReturnSubtractionOfMinusThreeAndMinusTen() {
        double returnSubtraction = calculatorBean.subtract(-3, -10);
        Assertions.assertEquals(7, returnSubtraction);
    }

    //method tested: multiply()
    @Test
    public void shouldReturnMultiplicationOfThreeAndFour() {
        double returnMultiplication = calculatorBean.multiply(3, 4);
        Assertions.assertEquals(12, returnMultiplication);
    }

    @Test
    public void shouldReturnMultiplicationOfMinusThreeAndTwo() {
        double returnMultiplication = calculatorBean.multiply(-3, 2);
        Assertions.assertEquals(-6, returnMultiplication);
    }

    @Test
    public void shouldReturnMultiplicationOfMinusFourAndMinusFive() {
        double returnMultiplication = calculatorBean.multiply(-4, -5);
        Assertions.assertEquals(20, returnMultiplication);
    }

    @Test
    public void shouldReturnMultiplicationOfOneAndZero() {
        double returnMultiplication = calculatorBean.multiply(1, 0);
        Assertions.assertEquals(0, returnMultiplication);
    }

    @Test
    public void shouldReturnMultiplicationOfMinusTwoAndZero() {
        double returnMultiplication = calculatorBean.multiply(-2, 0);
        Assertions.assertEquals(0, returnMultiplication);
    }

    //method tested: divide()
    @Test
    public void shouldReturnDivisionOfTwentyAndTen() {
        double returnDivision = calculatorBean.divide(20, 10);
        Assertions.assertEquals(2, returnDivision);
    }

    @Test
    public void shouldReturnDivisionOfMinusTenAndTwo() {
        double returnDivision = calculatorBean.divide(-10, 2);
        Assertions.assertEquals(-5, returnDivision);
    }

    @Test
    public void shouldReturnDivisionOfTwentyOneAndMinusThree() {
        double returnDivision = calculatorBean.divide(21, -3);
        Assertions.assertEquals(-7, returnDivision);
    }

    @Test
    public void shouldReturnDivisionOfMinusFiveAndMinusFive() {
        double returnDivision = calculatorBean.divide(-5, -5);
        Assertions.assertEquals(1, returnDivision);
    }

    @Test
    public void shouldReturnDivisionOfZeroAndMinusFive() {
        double returnDivision = calculatorBean.divide(0, -5);
        Assertions.assertEquals(0, returnDivision);
    }

    @Test
    public void shouldNoAllowToDivideByZero_positiveInfinity() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double returnDivision = bean.divide(6, 0);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, returnDivision);
    }

    @Test
    public void shouldNotAllowToDivideByZero_negativeInfinity() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double returnDivision = bean.divide(-6, 0);
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, returnDivision);
    }
}
