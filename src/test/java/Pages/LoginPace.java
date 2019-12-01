package Pages;

import com.weborders.common.Driver;
import com.weborders.pages.Base;
import com.weborders.pages.PageBase;
import com.weborders.utils.SeleniumUtil;
import org.openqa.selenium.By;

public class LoginPace extends PageBase {
    @Override
    public void waitForPageToLoad() {

    }

    private String pageURL="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";
    private By usernameLocator=By.id("ctl00_MainContent_username");
    private By passwordLocator=By.id("ctl00_MainContent_password");
    private By loginButtonLocator=By.id("ctl00_MainContent_login_button");
    private By getErrorMessageTestLocator=By.id("ctl00_MainContent_status");

    public void goToPage(){
        Driver.getDriver().get(pageURL);
    }

    public void enterUsername(String userName){
        seleniumUtil.sendKeys(usernameLocator,userName);
    }

    public void enterPassword(String password){
        seleniumUtil.sendKeys(passwordLocator,password);
    }

    public void clickLoginButton(){
        seleniumUtil.click(loginButtonLocator);

    }
    public String getErrorMessageTest(){
        return seleniumUtil.errorText(getErrorMessageTestLocator);

    }
    public void login(String username,String password){
        goToPage();
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
    public boolean isLoginButtonDisplayed(){

        return seleniumUtil.isDisplayed(loginButtonLocator);

    }


}
