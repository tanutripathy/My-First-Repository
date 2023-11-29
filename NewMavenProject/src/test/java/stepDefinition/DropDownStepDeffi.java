package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pageObject.DropDownPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class DropDownStepDeffi extends WebConnector {

DropDownPage page =new DropDownPage();


    @When("the user select {string} option from the dropdown list")
    public void the_user_select_option_from_the_dropdown_list(String selectoption) {
        page.setDropdownoptionselectedXpath(selectoption);
    }



}
