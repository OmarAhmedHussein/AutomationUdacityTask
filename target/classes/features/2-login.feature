Feature: Login Page

  Scenario: user could login with valid email and password

    Given user navigates to login page
    When user can login with valid email and valid password
    Then user can login successfully
    And user is now in homepage