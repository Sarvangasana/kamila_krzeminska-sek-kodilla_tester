package FizzBuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzSteps() {
        Given("I give {int}", (Integer int1) -> {
            this.number = 3;
        });

        Given("I give {int}", (Integer int1) -> {
            this.number = 5;
        });

        Given("I give {int}", (Integer int1) -> {
            this.number = 15;
        });

        Given("I give {int}", (Integer int1) -> {
            this.number = 14;
        });

        When("I ask if it is divisible by 3 or 5", () -> {
            FizzBuzz fizzBuzz = new FizzBuzz();
            this.answer = fizzBuzz.checkIfDivisibleBy_3_orBy_5_orBoth(this.number);
        });

        Then("I should be told: {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
