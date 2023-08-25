package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObject.AddToCartPage;

public class AddToCartStepDiff extends WebConnector {

    AddToCartPage cartPage=new AddToCartPage();

    @Then("the user add sauce labs backpack to cart")
    public void theUserAddSauceLabsBackpackToCart() {
        cartPage.setAddCartXpath();
    }

    @And("the user click on cart")
    public void theUserClickOnCart(){
        cartPage.setCartLinkXpath();
    }


    @Then("the user can see the {string}in the cart page")
    public void theUserCanSeeTheInTheCartPage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }
}
