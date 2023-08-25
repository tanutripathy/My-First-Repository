package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends WebConnector {

    /**************LOCATORS********************/

  //  private String dropdownoptionselectedXpath ="//select[@class='product_sort_container']";

    private String dropdownXpath ="//select[@class='product_sort_container']";

    /****************Getter&Setter******************/


    public void setDropdownoptionselectedXpath(String option){
        WebElement dropdown= BasePage.findElementByXpath(10,dropdownXpath);
        Select select=new Select(dropdown);
        select.selectByVisibleText(option);
    }

}
