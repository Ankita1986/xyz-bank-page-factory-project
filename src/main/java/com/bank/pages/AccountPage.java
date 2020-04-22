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
public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());



    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement depositLink;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement depositButton;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement getTextDepositSuccessful;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountToBeWithdrawn;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement withdrawBt;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement getTransactionText;
    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement withdrawalLink;
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logOutBtn;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement errorMessage;
    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeBtLink;

    public void clickOnHomeBt(){
        Reporter.log("Clicking On Home Button :" +homeBtLink.toString() + "<br>");
        clickOnElement(homeBtLink);
        log.info("Clicking On Home Button :" +homeBtLink.toString());
    }

    public void clickOnDepositButton() {
        Reporter.log("Clicking On Deposit Button :" +depositLink.toString() + "<br>");
        clickOnElement(depositLink);
        log.info("Clicking On Deposit Button :" +depositLink.toString());
    }

    public void enterAmountToDeposit(int amount) {
        Reporter.log("Entering Amount To Deposit : " +amount +"in deposit field : " + amountToBeWithdrawn.toString() + "<br>" );
        sendTextToElement(this.amountToBeWithdrawn, String.valueOf(amount));
        log.info("Entering Amount To Deposit : " +amount +"in deposit field : " + amountToBeWithdrawn.toString());

    }

    public void clickDepositFeature() {
        Reporter.log("Clicking on Deposit Button :" +depositButton.toString() + "<br>");
        clickOnElement(depositButton);
        log.info("Clicking on Deposit Button :" +depositButton.toString());
    }

    public String getTextDepositSuccessfulMessage() {
        Reporter.log("Getting Deposit Successful Message :" + getTextDepositSuccessful.toString() + "<br>");
        log.info("Getting Deposit Successful Message :" + getTextDepositSuccessful.toString());
        return getTextFromElement(getTextDepositSuccessful);
    }

    public void clickOnWithdrawalTab() {
        Reporter.log("Clicking On Withdrawl Tab :" + withdrawalLink.toString() + "<br>");
        clickOnElement(withdrawalLink);
        log.info("Clicking On Withdrawl Tab :" + withdrawalLink.toString());
    }

    public void enterAmountToWithdrawl( String amount) {
        Reporter.log("Entering Amount To Withdrawl :" +amount + "in withdrawl field :" + amountToBeWithdrawn.toString() + "<br>" );
        sendTextToElement(amountToBeWithdrawn, amount);
        log.info("Entering Amount To Withdrawl :" +amount + "in withdrawl field :" + amountToBeWithdrawn.toString());
    }

    public void clickOnWithdrawFeature() {
        Reporter.log("Clicking On Withdraw feature :" + withdrawBt.toString() + "<br>");
        clickOnElement(withdrawBt);
        log.info("Clicking On Withdraw feature :" + withdrawBt.toString());
    }

    public String getTextTransaction() {
        Reporter.log("Getting transaction text :" +getTransactionText.toString() + "<br>");
        log.info("Getting transaction text :" +getTransactionText.toString());
        return getTextFromElement(getTransactionText);
    }
    public void clickOnLogoutButton(){
        Reporter.log("Clicking On LogOut Button :" +logOutBtn.toString() + "<br>");
        clickOnElement(logOutBtn);
        log.info("Clicking On LogOut Button :" +logOutBtn.toString());
    }

    public boolean isLogoutButtonDisplayed(){
        if ((logOutBtn).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }
    public String getErrorMessage(){
        Reporter.log("Getting Error Message :" + errorMessage.toString() + "<br>");
        log.info("Getting Error Message :" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

}
