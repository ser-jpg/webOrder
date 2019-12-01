package com.weborders.pages;

import com.weborders.common.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase extends Base {

    @BeforeSuite
    public void beforeSuit(){
        Driver.setUpDriver();

    }
    @BeforeMethod
    public void beforeMethod(){
    Driver.getDriver();
    }
    @AfterMethod
    public void afterMethod(){

     Driver.closeDriver();
    }
    @AfterSuite
    public void afterSuite(){

    }
}
