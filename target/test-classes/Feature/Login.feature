Feature: User Login

  Scenario: User logs in with valid credentials
    Given the user navigates to the login page
    When the user enters "<username>" and "<Email>" and "<password>" and "<Confirm Password>"
    And clicks the login button
    And clicks the ok button
    Then the user should verify "Registration Successful"

