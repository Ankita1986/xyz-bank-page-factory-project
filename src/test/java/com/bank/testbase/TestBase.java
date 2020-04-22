package com.bank.testbase;

import com.bank.basepage.BasePage;
import com.bank.browserselector.BrowserSelector;
import com.bank.loadproperty.LoadProperty;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ankita
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    // String baseUrl = "https://www.way2automation.com/angularjs-protractor/banking/#/login//";
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");


    @BeforeClass(groups = {"smoke", "sanity", "regression"})
    public void openBrowser() {

        browserSelector.selectorBrowser(browser);
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterClass(groups = {"smoke", "sanity", "regression"})
    public void tearDown() {
        driver.quit();
    }
}

