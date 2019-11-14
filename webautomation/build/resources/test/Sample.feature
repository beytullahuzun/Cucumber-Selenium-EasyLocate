Feature: Sample feature

  @Tag
  Scenario: Sample Scenario: New user onboarding
    Given user navigates to blog page
    When user clicks "New"


  Scenario: Sample Scenario: New user onboarding
    Given user navigates to blog page
    When user clicks "New"
    Then user should proceed "Onboarding" screen
    Then user enters "SampleMail" to "Mail" area
    And user clicks "Submit"


  Scenario Outline: Sample Scenario: New user onboarding
    Given user navigates to blog page
    When user clicks "New"
    Then user should proceed "Onboarding" screen
    Then user enters "<SampleInValidMail>" to "Mail" area
    And user clicks "Submit"
    Examples:
      | SampleInValidMail              |
      | @example.com                   |
      | #@%^%#$@#$@#.com               |
      | \Joe Smith <email@example.com> |
      | email.example.com              |
      | email.example@com.             |
      | email@example@example.com      |
      | .email@example.com             |
      | email.@example.com             |
      | email..email@example.com       |
      | email@example.com (Joe Smith)  |
      | email@example                  |
      | email@-example.com             |