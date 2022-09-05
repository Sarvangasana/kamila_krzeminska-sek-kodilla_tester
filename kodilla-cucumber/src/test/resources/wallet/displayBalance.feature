Feature: Display balance
  Scenario: User checks the balance of their wallet
    Given I have $100 in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is $100