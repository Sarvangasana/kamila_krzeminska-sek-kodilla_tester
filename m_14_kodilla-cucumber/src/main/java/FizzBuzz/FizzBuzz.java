package FizzBuzz;

public class FizzBuzz {

    public String checkIfDivisibleBy_3_orBy_5_orBoth(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
            return "None";
    }
}