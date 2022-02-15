Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request <withdraw>
    Then <cash> should be dispensed
    Examples:
    | deposit | withdraw | cash |
    |200      | 199      | 199  |
    |200      |200       | 200  |
    |10       |9         | 9    |
    |0        |0         | 0    |

    Scenario Outline: Failed withdrawal attempt
      Given I have deposited <deposit> in my wallet
      When I request <withdraw>
      Then <cash> should be dispensed
      Examples:
      | deposit | withdraw | cash |
      | 200     | 201      | 0    |
      | 0       | 1        | 0    |
      |101      |102       | 0    |