package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.bank.utility.Utility.getRandomString;

/**
 * Created by Ankita
 */
public class BankTest extends TestBase {


    HomePage homePage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    AccountPage accountPage;


    @BeforeMethod
    public void setUp(){


        homePage = new HomePage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        accountPage = new AccountPage();

    }



    @Test(priority = 0, groups = {"regression"})
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Hermoine");
        addCustomerPage.enterLastName("Granger");
        addCustomerPage.enterPostCode("E859AC");
        addCustomerPage.clickOnAddCustomerBt();
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Customer added successfully "));
        alert.accept();
        bankManagerLoginPage.clickOnHomeBt();

    }
    @Test(priority = 1, groups = {"regression"})
    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomerName("Hermoine"+ " "+"Granger");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Account created successfully"));
        alert.accept();
        accountPage.clickOnHomeBt();



    }
    @Test(priority = 2, groups =  {"regression"})
    public void customerShouldLoginAndLogoutSuccessfully(){
        homePage.clickOnCustomerLogin();
        customerLoginPage.selectCustomerNameFromDropDown("Hermoine"+ " "+"Granger");
        customerLoginPage.clickOnLoginBt();
        Assert.assertTrue(accountPage.isLogoutButtonDisplayed());
        accountPage.clickOnLogoutButton();
       Assert.assertTrue(customerLoginPage.isYourNameLabelDisplayed());
       bankManagerLoginPage.clickOnHomeBt();


    }
    @Test(priority = 3, groups = {"regression"})
    public void verifyCustomerShouldDepositMoneySuccessfully() {

        homePage.clickOnCustomerLogin();
        customerLoginPage.selectCustomerNameFromDropDown("Hermoine"+ " "+"Granger");
        customerLoginPage.clickOnLoginBt();
        accountPage.clickOnDepositButton();
        accountPage.enterAmountToDeposit(100);
        accountPage.clickDepositFeature();
        Assert.assertEquals(accountPage.getErrorMessage(),"Deposit Successful");
        accountPage.clickOnHomeBt();


    }
    @Test(priority = 4, groups = {"regression"})
    public void verifyCustomerShouldWithdrawMoneySuccessfully() {

        homePage.clickOnCustomerLogin();
        customerLoginPage.selectCustomerNameFromDropDown("Hermoine"+ " "+"Granger");
        customerLoginPage.clickOnLoginBt();
        accountPage.clickOnWithdrawalTab();
        accountPage.enterAmountToWithdrawl("50");
        accountPage.clickOnWithdrawFeature();
        Assert.assertEquals(accountPage.getErrorMessage(),"Transaction successful");
        accountPage.clickOnHomeBt();
    }

    @Test(priority = 5, groups = {"regression"})
    public void bankManagerShouldDeleteCustomerSuccessfully(){
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnCustomerTab();
        customersPage.searchCustomerByName("Hermoine");
        customersPage.deleteCustomer();
    }



}





