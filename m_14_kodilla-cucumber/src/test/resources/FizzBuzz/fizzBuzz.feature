Feature: FizzBuzz

  Scenario Outline: The number is divisible by 3 or by 5 or both
    Given I give <number>
    When  I ask if it is divisible by 3 or 5
    Then  I should be told: <answer>
    Examples:
    |number | answer |
    |3      | "Fizz" |
    |5      | "Buzz" |
    |15     |"FizzBuzz" |
    |14     | "None"    |





