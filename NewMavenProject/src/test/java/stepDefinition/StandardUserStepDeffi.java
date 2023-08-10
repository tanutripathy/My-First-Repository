package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.StandardUserPage;
import utilities.ConstantUtils;

public class StandardUserStepDeffi extends WebConnector {

    StandardUserPage userPage=new StandardUserPage();


    @Given("the user should navigate to home page")
    public void the_user_should_navigate_to_home_page() {
        driver.get(ConstantUtils.BASE_URL);
    }

    @When("the user enter {string} in the username field")
    public void theUserEnterInTheUsernameField(String username) {
        userPage.setUsername(username);
    }

    @And("the user enter {string} in the password field")
    public void theUserEnterInThePasswordField(String password) {
        userPage.setPassword(password);

    }

    @And("the user click on login button")
    public void theUserClickOnLoginButton() {
        userPage.clickLogin();

    }

    @Then("the user can see {string} text on the page")
    public void theUserCanSeeTextOnThePage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }


    @When("the user can see {string} in username  And the user enter {string} in the password field")
    public void theUserCanSeeInUsernameAndTheUserEnterInThePasswordField(String  username, String password) {
        userPage.setUsername(username);
        userPage.setPassword(password);
    }
}
