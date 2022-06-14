package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
      Calculator calculator = new Calculator();
        int a = 2;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(10, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double subtractResult = calculator.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(-6, subtractResult);
        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double squaredMultiplicationResult = calculator.squaredMultiplication(a);
        boolean correct2 = ResultChecker.assertEquals(4, squaredMultiplicationResult);
        if (correct2) {
            System.out.println("Metoda squaredMultiplication działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squaredMultiplication nie działa poprawnie dla liczby " + a);
        }

        System.out.println();
        double power = Math.pow(2, 4);
        System.out.println(power);

        // Potęgowanie liczb  bez metody Math.pow(d,d):
        double a1 = -2;
        int n = 4;
        double powerResult = calculator.power(a1, n);
        boolean correct3 = ResultChecker.assertEquals(16,powerResult);
        if (correct3) {
            System.out.println("Metoda power działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
