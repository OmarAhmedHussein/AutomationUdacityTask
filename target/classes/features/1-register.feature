Feature: Registration Page

  Scenario: registration with valid data

    Given open the registration page
    When enter valid data
    And click registration button
    Then the message will be displayed
    And then click on log out