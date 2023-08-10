package pageObject;

import browserControl.WebConnector;

public class StandardUserPage extends WebConnector {

    /****************Locators***************/
    private String usernameFieldXpath="//input[@id='user-name']";
    private String passwordFieldXpath="//input[@id='password']";
    private String loginButtonxpath="//input[@id='login-button']";


    /****************Getter and Setters*****************/

    /**
     * set username
     * @param username
     */

    public void setUsername(String username){
        BasePage.findElementByXpath(10,usernameFieldXpath).sendKeys(username);
    }

    /**
     * set password field
     * @param password
     */
    public void setPassword(String password) {
        BasePage.findElementByXpath(10, passwordFieldXpath).sendKeys(password);
    }
    /**
     * click on login button
     */

    public void clickLogin(){
        BasePage.findElementByXpath(10,loginButtonxpath).click();
    }

}

