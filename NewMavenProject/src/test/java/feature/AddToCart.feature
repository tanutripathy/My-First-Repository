Feature:Verify add to cart feature
  Background:
    Given the user should navigate to home page
    When the user can see "standard_user" in username  And the user enter "secret_sauce" in the password field
    And the user click on login button
  @lucky
  Scenario:
    Then the user add sauce labs backpack to cart
    And the user click on cart
    Then the user can see the "Sauce Labs Backpack"in the cart page
