Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit

    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

    When I deposit $50
    Then the balance of my wallet should be $220

    When I request $100
    Then the balance of my wallet should be $120

    When I request $150
    Then the balance of my wallet should be still $120

    When I request $0
    Then the balance of my wallet should be still $120

