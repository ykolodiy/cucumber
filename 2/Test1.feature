Feature: Test Facebook

  Scenario Outline: Title of your FB
    Given Firefox Driver
    When I go to FB
    Then I see "<title>"
    Then Close Browser

    Examples: 
      | title                          |
      | Facebook - Log In or Sign Up   |