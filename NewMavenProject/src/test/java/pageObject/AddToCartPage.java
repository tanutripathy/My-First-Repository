package pageObject;

import browserControl.WebConnector;

public class AddToCartPage extends WebConnector {

    /**********************Locators**********************/

    private String addCartXpath="//button[@id='add-to-cart-sauce-labs-backpack']";
    private String backPackimgXpath="//div[@class='inventory_item_img']";

    private String checkOutXpath="//button[@id='checkout']";


private String cartLinkXpath="//div[@id='shopping_cart_container']";

private String bikeLightXpath="//button[@id='add-to-cart-sauce-labs-bike-light']";
private String oneSieXpath=" //button[@id='add-to-cart-sauce-labs-onesie']";


    /************************Getter&Setters********************/

    public void setAddCartXpath(){
        BasePage.findElementByXpath(10,addCartXpath).click();
    }

    public void setCartLinkXpath(){
        BasePage.findElementByXpath(10,cartLinkXpath).click();
    }
    public void setBikeLightXpath(){
        BasePage.findElementByXpath(10,bikeLightXpath).click();
    }
    public void setOneSieXpath(){
        BasePage.findElementByXpath(10,oneSieXpath).click();
    }

    public void setBackPackimgXpath(){
        BasePage.findElementByXpath(10,backPackimgXpath).click();
    }

    public void setCheckOutXpath(){
        BasePage.findElementByXpath(10,checkOutXpath).click();
    }

}
