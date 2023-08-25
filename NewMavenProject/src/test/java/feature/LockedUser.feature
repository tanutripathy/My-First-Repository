Feature: Verify login page with locked out user

  Background:
    Given the user should navigate to home page

  @ComponentTest
  Scenario Outline:
    When the user can see "<username>" in username  And the user enter "<password>" in the password field
    And the user click on login button
    Then the user can see "<expectedtext>" text on the page
    Examples:
      | username         | password     | expectedtext                                                              |
      | locked_out_user  | secret_sauce | Epic sadface: Sorry, this user has been locked out                        |
      | locked_out_user  | Secret_Seuce | Epic sadface: Username and password do not match any user in this service |
      | lacked_out_user! | secret_sauce | Epic sadface: Username and password do not match any user in this service |
