Feature:

  Background:
    Given the user should navigate to home page

  Scenario: Verify the login page with valid credential
    When the user enter "standard_user" in the username field
    And the user enter "secret_sauce" in the password field
    And the user click on login button
    Then the user can see "Products" text on the page

  Scenario: 2.Verify the login page with no password
    When the user enter "standard_user" in the username field
    And the user click on login button
    Then the user can see "Epic sadface: Password is required" text on the page
@SmokeTest
  Scenario Outline: Verify the login page with  invalid credential
    When the user can see "<username>" in username  And the user enter "<password>" in the password field
    And the user click on login button
    Then the user can see "<expectedtext>" text on the page
    Examples:
      | username      | password     | expectedtext                                                              |
      | standerd_Use! | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | standard_user | Secret_Sauca | Epic sadface: Username and password do not match any user in this service |
