package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.remote.codec.w3c.W3CHttpCommandCodec;
import pageObject.PurchaseProductPage;

public class PurchaseProductStepDiff extends WebConnector {

    PurchaseProductPage productPage=new PurchaseProductPage();


    @And("the user add flecee jacket,red Tshirt and black Tshirt in the cart")
    public void theUserAddFleceeJacketRedTshirtAndBlackTshirtInTheCart() {
        productPage.setFleceeJacketXpath();
        productPage.setRedTShirtXpath();
        productPage.setBlackTShirtXpath();
    }

    @Then("the user remove the black Tshirt from cart")
    public void theUserRemoveTheBlackTshirtFromCart() {
        productPage.setRemoveblackTshirtXpath();

    }

    @And("the user can see {string} ,{string} & {string} text in the cart page")
    public void theUserCanSeeTextInTheCartPage(String expectedtext, String expectedtext1, String expectedtext2) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
        Assert.assertTrue(driver.getPageSource().contains(expectedtext1));
        Assert.assertTrue(driver.getPageSource().contains(expectedtext2));
    }

    @And("the user click on continue shopping to go back to home page")
    public void theUserClickOnContinueShoppingToGoBackToHomePage() {
        productPage.setContinueshoppingXpath();
    }

    @Then("the user click on cancel button")
    public void theUserClickOnCancelButton() {
        productPage.setCanelbuttonXpath();
    }

    @Then("the user enter {string} in the first name field then the user enter {string} in the last name field and the user enter {string} in postal field")
    public void theUserEnterInTheFirstNameFieldThenTheUserEnterInTheLastNameFieldAndTheUserEnterInPostalField(String firstnmae, String lastnmae, String postalcode) {
        productPage.setFirstnameXpath(firstnmae);
        productPage.setLastNameXpath(lastnmae);
        productPage.setPostalfieldXpath(postalcode);
    }

    @And("the user click on continue")
    public void theUserClickOnContinue() {
        productPage.setContinueXpath();
    }

    @Then("the user click on finish")
    public void theUserClickOnFinish() {
        productPage.setFinishbuttonXpath();
    }
}
