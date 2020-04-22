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
public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());



    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement addCustomerTab;
    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement openAccountTab;
    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    WebElement customersTab;
    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeBtLink;

    public void clickOnAddCustomerTab(){
        Reporter.log("Clicking On Add Customer Tab :" +addCustomerTab.toString() + "<br>");
        //waitUntilElementToBeClickable((By) addCustomerTab, 30);
        clickOnElement(addCustomerTab);
        log.info("Clicking On Add Customer Tab :" +addCustomerTab.toString());

    }
    public void clickOnOpenAccountTab(){
        Reporter.log("Clicking On Open Account Tab :" +openAccountTab.toString() + "<br>");
        clickOnElement(openAccountTab);
        log.info("Clicking On Open Account Tab :" +openAccountTab.toString());
    }
    public void clickOnCustomerTab(){
        Reporter.log("Clicking On Customer Tab :" +customersTab.toString() + "<br>");
        clickOnElement(customersTab);
        log.info("Clicking On Customer Tab :" +customersTab.toString());
    }
    public void clickOnHomeBt(){
        Reporter.log("Clicking On Home Button :" +homeBtLink.toString() + "<br>");
        clickOnElement(homeBtLink);
        log.info("Clicking On Home Button :" +homeBtLink.toString());
    }

}
