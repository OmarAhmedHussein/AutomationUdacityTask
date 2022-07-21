Feature: user could search for any product using name

  Scenario: user could search for any product using name
    Given  user navigate to home page
    And user write  item on search filed
    And user click on search button
    Then user can access the item page


  Scenario: user could search for any product using code

    When user search by using suk
    And user click on search button
    Then user can access the suk page