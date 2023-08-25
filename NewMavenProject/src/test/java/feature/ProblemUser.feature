Feature: Verify the login page with problem user

  Background:
    Given the user should navigate to home page
@IntegrationTest
    Scenario:
      When the user can see "problem_user" in username  And the user enter "secret_sauce" in the password field
      And the user click on login button
      Then the user can see "Products" text on the page

