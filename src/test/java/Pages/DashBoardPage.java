package Pages;

import com.weborders.common.Driver;
import com.weborders.pages.PageBase;
import org.openqa.selenium.By;

public class DashBoardPage extends PageBase {
    private By userNameLocator= By.cssSelector(".login_info");
    private By logOutLinkLocator=By.linkText("Logout");
    private By firstCheckBoxLocator=By.cssSelector("#ctl00_MainContent_orderGrid_ctl03_OrderSelector");
    private By deletedButtonLocator=By.id("ctl00_MainContent_btnDelete");
    private By tableRowLocater=By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td/..");

    public String getUsersNameFromDashBoard(){

        String text= Driver.getDriver().findElement(userNameLocator).getText();
        return text;
    }

    public void logOut(){

        Driver.getDriver().findElement(logOutLinkLocator).click();
    }
    public void checkFirstCheckBox(){

        seleniumUtil.click(firstCheckBoxLocator);


    }
    public void clickDeleteButton(){
        seleniumUtil.click(deletedButtonLocator);
    }

    @Override
    public void waitForPageToLoad() {
        seleniumUtil.waitForVisibility(logOutLinkLocator);

    }
    public int getNumberOfRowOnTable(){

return seleniumUtil.findElements(tableRowLocater).size();

    }
    public void deleteFistRow(){

        checkFirstCheckBox();
        clickDeleteButton();
    }
}
