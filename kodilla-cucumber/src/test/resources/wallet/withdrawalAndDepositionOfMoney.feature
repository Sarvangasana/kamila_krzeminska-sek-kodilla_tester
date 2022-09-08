Feature: Successful withdrawal and deposition of money in a wallet

  Scenario: Successful withdrawal and deposition of money in a wallet

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

    When I request $120
    Then the balance of my wallet should be $0

    When I deposit $100
    Then the balance of my wallet should be $100

    When I request $99
    Then the balance of my wallet should be $1

    When I request $2
    Then the balance of my wallet should be still $1

