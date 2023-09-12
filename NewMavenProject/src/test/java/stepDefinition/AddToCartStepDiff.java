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

    @Then("the user add sauce labs bike light to cart")
    public void theUserAddSauceLabsBikeLightToCart() {
        cartPage.setBikeLightXpath();
    }

    @And("the user add sauce labs onesie to cart")
    public void theUserAddSauceLabsOnesieToCart() {
        cartPage.setOneSieXpath();
    }

    @Then("the user can see the {string}& {string}in the cart page")
    public void theUserCanSeeTheInTheCartPage(String expected, String expected2) {
        Assert.assertTrue(driver.getPageSource().contains(expected));
        Assert.assertTrue(driver.getPageSource().contains(expected2));
    }

    @Then("the user click on sauce labs backpack imqage")
    public void theUserClickOnSauceLabsBackpackImqage() {
        cartPage.setBackPackimgXpath();
    }

    @And("the user click on add to cart")
    public void theUserClickOnAddToCart() {
        cartPage.setAddCartXpath();
    }

    @Then("the user click on checkout")
    public void theUserClickOnCheckout() {
        cartPage.setCheckOutXpath();
    }


}
