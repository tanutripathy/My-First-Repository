package pageObject;

import browserControl.WebConnector;

public class PurchaseProductPage extends WebConnector {

    /*********************Locators*******************/
    private String fleceeJacketXpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']";
    private String redTShirtXpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']";
    private String continueshoppingXpath="//button[@id='continue-shopping']";
    private String canelbuttonXpath="//button[@id='cancel']";
    private String blackTShirtXpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']";
    private String removeblackTshirtXpath="//button[@id='remove-sauce-labs-bolt-t-shirt']";
    private String firstnameXpath="//input[@id='first-name']";
    private String lastNameXpath="//input[@id='last-name']";
    private String postalfieldXpath="//input[@id='postal-code']";
    private String continueXpath="//input[@id='continue']";
    private String finishbuttonXpath="//button[@id='finish']";


    /*******************Getter&Setters***************/

    public void setFleceeJacketXpath(){
        BasePage.findElementByXpath(10,fleceeJacketXpath).click();
    }
    public void setRedTShirtXpath(){
        BasePage.findElementByXpath(10,redTShirtXpath).click();
    }
    public void setBlackTShirtXpath(){
        BasePage.findElementByXpath(10,blackTShirtXpath).click();
    }
    public void setRemoveblackTshirtXpath(){
        BasePage.findElementByXpath(10,removeblackTshirtXpath).click();
    }
public void setContinueshoppingXpath(){
        BasePage.findElementByXpath(10,continueshoppingXpath).click();
}

public void setCanelbuttonXpath(){
        BasePage.findElementByXpath(10,canelbuttonXpath).click();
}
public void setFirstnameXpath(String firstname){
        BasePage.findElementByXpath(10,firstnameXpath).sendKeys(firstname);
}
public void setLastNameXpath(String lastname){
        BasePage.findElementByXpath(10,lastNameXpath).sendKeys(lastname);
}
public void setPostalfieldXpath(String postalcode){
        BasePage.findElementByXpath(10,postalfieldXpath).sendKeys(postalcode);
}
public void setContinueXpath(){
        BasePage.findElementByXpath(10,continueXpath).click();
}
public void setFinishbuttonXpath(){
        BasePage.findElementByXpath(10,finishbuttonXpath).click();
}

}
