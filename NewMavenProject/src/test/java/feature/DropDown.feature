Feature: Verify the DropDown option

  Background:
    Given the user should navigate to home page
    When the user can see "standard_user" in username  And the user enter "secret_sauce" in the password field
    And the user click on login button

  @tanu
  Scenario Outline: Verify the user can select an option from dropdown list
    When the user select "<option>" option from the dropdown list
    Then the user can see "<option>" text on the page
    Examples:
      | option              |
      | Name (A to Z)       |
      | Name (Z to A)       |
      | Price (low to high) |
      | Price (high to low) |

