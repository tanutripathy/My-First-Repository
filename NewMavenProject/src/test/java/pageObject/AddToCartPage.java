package pageObject;

import browserControl.WebConnector;

public class AddToCartPage extends WebConnector {

    /**********************Locators**********************/

    private String addCartXpath="//button[@id='add-to-cart-sauce-labs-backpack']";

private String cartLinkXpath="//div[@id='shopping_cart_container']";


    /************************Getter&Setters********************/

    public void setAddCartXpath(){
        BasePage.findElementByXpath(10,addCartXpath).click();
    }

    public void setCartLinkXpath(){
        BasePage.findElementByXpath(10,cartLinkXpath).click();
    }

}
