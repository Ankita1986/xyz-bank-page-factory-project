package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());



    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeBtLink;

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginLink;

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginLink;

    public void clickOnCustomerLogin() {
        Reporter.log("Clicking On Customer Login :" + customerLoginLink.toString() + "<br>");
        clickOnElement(customerLoginLink);
        log.info("Clicking On Customer Login :"+ customerLoginLink.toString());

    }

    public void clickOnBankManagerLogin() {
        Reporter.log("Clicking On BankManager Login :" +bankManagerLoginLink.toString() + "<br>");
        clickOnElement(bankManagerLoginLink);
        log.info("Clicking On BankManager Login :" +bankManagerLoginLink.toString());
    }


}
