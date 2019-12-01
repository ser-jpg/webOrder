package com.weborders.utils;

import com.weborders.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumUtil {

    private final long Short_Explicit_Wait_Time=5;

    public WebElement findElement(By locater){

        return Driver.getDriver().findElement(locater);
    }

    public void sendKeys(By locater,String text){
       click(locater);
        findElement(locater).sendKeys(text);
    }
    public void clear(By locater){
        findElement(locater).clear();
    }
    public void click(By locater){

        findElement(locater).click();
    }
    public String errorText(By locater){

        findElement(locater).getText();
        return null;
    }
    public void waitFor(long milis){

    }
    public boolean isDisplayed(By locator){

        return findElement(locator).isDisplayed();
    }
    public List<WebElement> findElements(By locator){

        return  Driver.getDriver().findElements(locator);
    }
    public void waitForVisibility(By locator){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Short_Explicit_Wait_Time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }
}
