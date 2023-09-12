Feature:
  Background:
    Given the user should navigate to home page
    When the user can see "standard_user" in username  And the user enter "secret_sauce" in the password field
    And the user click on login button
  @lucky
Scenario:1 Verify the user can add product in the cart and remove it from cart
  Then the user add sauce labs backpack to cart
  And the user add flecee jacket,red Tshirt and black Tshirt in the cart
  Then the user click on cart
  And the user can see "Test.allTheThings() T-Shirt (Red)" ,"Sauce Labs Bolt T-Shirt" & "Sauce Labs Fleece Jacket" text in the cart page
  Then the user remove the black Tshirt from cart
  @lucky
  Scenario:2Verify the user can navigate from one page to another
    Then the user add sauce labs backpack to cart
    And the user add flecee jacket,red Tshirt and black Tshirt in the cart
    Then the user click on cart
    And the user click on continue shopping to go back to home page
    Then the user click on cart
    And the user click on checkout
    Then the user click on cancel button
  @lucky
 Scenario:3 Verify the checkout process with user details
   When the user add flecee jacket,red Tshirt and black Tshirt in the cart
   Then the user click on cart
   And the user click on checkout
   Then the user enter "Tanu" in the first name field then the user enter "Tripathy" in the last name field and the user enter "abcrw76800" in postal field
   And the user click on continue
    Then the user can see "Checkout: Overview" text on the page
  @lucky
  Scenario:4 Verify the checkout process without postal code
    When the user add flecee jacket,red Tshirt and black Tshirt in the cart
    Then the user click on cart
    And the user click on checkout
    Then the user enter "Tanu" in the first name field then the user enter "Tripathy" in the last name field and the user enter "" in postal field
    And the user click on continue
    And the user can see "Error: Postal Code is required" text on the page
    @lucky
  Scenario:4 Verify the checkout process without last name
    When the user add flecee jacket,red Tshirt and black Tshirt in the cart
    Then the user click on cart
    And the user click on checkout
    Then the user enter "Tanu" in the first name field then the user enter "" in the last name field and the user enter "7682256h" in postal field
    And the user click on continue
    And the user can see "Error: Last Name is required" text on the page
    @lucky
Scenario: Verify the product price in checkout overview
    When the user add flecee jacket,red Tshirt and black Tshirt in the cart
    Then the user click on cart
    And the user click on checkout
    Then the user enter "Tanu" in the first name field then the user enter "Tripathy" in the last name field and the user enter "abcrw76800" in postal field
    And the user click on continue
  Then the user can see "Total: $88.53" text on the page
  @lucky
Scenario:
  When the user add flecee jacket,red Tshirt and black Tshirt in the cart
  Then the user click on cart
  And the user click on checkout
  Then the user enter "Tanu" in the first name field then the user enter "Tripathy" in the last name field and the user enter "abcrw76800" in postal field
  And the user click on continue
    Then the user can see "Checkout: Overview" text on the page
  Then the user click on finish 
  And the user can see "Thank you for your order!" text on the page
  @lucky
 Scenario:
    Then the user click on sauce labs backpack imqage
    And the user click on add to cart
    And the user click on cart
    Then the user can see the "Sauce Labs Backpack"in the cart page
   And the user click on checkout
   Then the user enter "Tanu" in the first name field then the user enter "Tripathy" in the last name field and the user enter "abcrw76800" in postal field
   And the user click on continue
   Then the user click on finish
   And the user can see "Thank you for your order!" text on the page
