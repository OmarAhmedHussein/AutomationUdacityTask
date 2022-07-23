Feature: user could add products to wishlist

  Scenario: user add products to wishlist successfully
    When user click on wishlist for a specific product
    Then wishlist notification success is visible


  Scenario: number of wishlist items in home page increased
    When user click on wishlist for a specific product
    Then wishlist notification success is visible
    And user get the number of wishlist items after adding product
    Then number of wishlist items increased