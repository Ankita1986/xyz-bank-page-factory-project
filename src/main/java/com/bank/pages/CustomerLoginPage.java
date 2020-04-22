package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Ankita
 */
public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());



    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourName;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement loginBt;
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameLabel;





    public void clickOnLoginBt() {
        Reporter.log("Clicking On Login Button :" +loginBt.toString() + "<br>");
        clickOnElement(loginBt);
        log.info("Clicking On Login Button :" +loginBt.toString());
    }

    public void selectCustomerNameFromDropDown(String Name) {
        Reporter.log("Selecting Customer Name From DropDown :" +Name+ "in dropdown field" + yourName.toString() + "<br>");
        clickOnElement(yourName);
        log.info("Selecting Customer Name From DropDown :" +Name+ "in dropdown field" + yourName.toString());
        selectByVisibleTextFromDropDown(yourName, Name);


    }
    public boolean isYourNameLabelDisplayed(){
        Reporter.log("Checking Name Label Displayed :" + yourNameLabel.toString() + "<br>");
        if ((yourNameLabel).isDisplayed()){
            log.info("Checking Name Label Displayed :" + yourNameLabel.toString());
            return true;
        }else {
            return false;
        }
    }




}
