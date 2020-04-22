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
public class CustomersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());



    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement searchCustomerBt;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement deleteBt;





    public void searchCustomerByName(String name){
        Reporter.log("Searching customer name: " +name+ "to search customer field :" +searchCustomerBt.toString() + "<br>");
        sendTextToElement(searchCustomerBt, name);
        log.info("Searching customer name: " +name+ "to search customer field :" +searchCustomerBt.toString());
    }

    public void deleteCustomer(){
        Reporter.log("Deleting Customer Name :" +deleteBt.toString() + "<br>");
        clickOnElement(deleteBt);
        log.info("Deleting Customer Name :" +deleteBt.toString());
    }


}
