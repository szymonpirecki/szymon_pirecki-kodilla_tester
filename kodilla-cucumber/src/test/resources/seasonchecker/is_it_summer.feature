Feature: Is it Summer?
  Everybody likes Summer

#  Scenario: Winter isn't Summer
#    Given today is the last day of December
#    When I ask whether it's Summer
#    Then I should be told "Nope"
#
#    Scenario: Summer is Summer
#      Given today is first day of August
#      When I ask whether it's Summer
#      Then I should be told "Yes! Summer!"

      Scenario Outline: Today is or isn't Summer
        Given today is <today>
        When I ask whether it's Summer
        Then I should be told <answer>
        Examples:
        | today | answer |
        | the last day of December | "Nope"         |
        | first day of August      | "Yes! Summer!"|
        | 3rd day of march         |"Nope"          |
        | my birthday              |"Nope"          |
