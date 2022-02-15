Feature: Is number divisible by_?
  Scenario Outline: Number is divisible by divider
    Given the number to be checked is <number>
    When I ask if this number is divisible by divider
    Then I should be told <respond>
    Examples:
    | number | respond |
    | 3      |"Fizz"   |
    |10      |"Buzz"   |
    |15      |"FizzBuzz"|
    |6       |"Fizz"    |
    |30      |"FizzBuzz"|
    |2       |"none"    |
    |0       |"none"    |