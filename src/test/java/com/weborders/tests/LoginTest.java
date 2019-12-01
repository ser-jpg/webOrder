package com.weborders.tests;

import Pages.DashBoardPage;
import Pages.LoginPace;
import com.weborders.common.Driver;
import com.weborders.pages.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void verifyUserCanLoginWithCorrectCredentials() throws InterruptedException {

        LoginPace loginPace=new LoginPace();
        loginPace.login("Tester","test");
        new DashBoardPage().waitForPageToLoad();
       Assert.assertEquals(Driver.getDriver().getCurrentUrl()
                , "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
    }

    @Test
    public void verifyUserWithIncorrectPasswordIsShownErrorMessage() {
        LoginPace loginPace=new LoginPace();
        loginPace.login("Tester","tesrtgyhj");
        String errorMessageText=loginPace.getErrorMessageTest();
        Assert.assertEquals(errorMessageText, "Invalid Login or Password.");


    }
}
