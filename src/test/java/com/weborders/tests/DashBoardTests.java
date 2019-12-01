package com.weborders.tests;

import Pages.DashBoardPage;
import Pages.LoginPace;
import com.weborders.pages.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DashBoardTests extends TestBase {

    public void verifyUsersNameOnDashBoardMatches(){

        LoginPace loginPace=new LoginPace();
        loginPace.login("Tester","test");

        DashBoardPage dashBoardPage=new DashBoardPage();
        String userNameOnDashBoard= dashBoardPage.getUsersNameFromDashBoard();
        Assert.assertTrue(userNameOnDashBoard.contains("Tester"));
    }
    @Test
    public void verifyUsersLogOut(){

        LoginPace loginPace=new LoginPace();
        loginPace.login("Tester","test");
        DashBoardPage dashBoardPage=new DashBoardPage();
        dashBoardPage.logOut();
       boolean isLoginButtonDisplayed= loginPace.isLoginButtonDisplayed();
       Assert.assertTrue(isLoginButtonDisplayed);
    }
    @Test
    private void verifyDeleteRowFunctionality() throws InterruptedException {

        LoginPace loginPace=new LoginPace();
        loginPace.login("Tester","test");
        DashBoardPage dashBoardPage=new DashBoardPage();
        Thread.sleep(2000);
        int initialNumberOfRow=dashBoardPage.getNumberOfRowOnTable();
        dashBoardPage.deleteFistRow();
        Thread.sleep(2000);
        int finalNumberOfRows=dashBoardPage.getNumberOfRowOnTable();
        System.out.println(initialNumberOfRow);
        System.out.println(finalNumberOfRows);
        Assert.assertEquals(finalNumberOfRows,initialNumberOfRow-1);

    }
}
