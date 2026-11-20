package com.browserActions;

import com.driverManager.Browser;
import com.driverManager.SeleniumInstanceManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserSession {
    private final WebDriver webdriver;

    BrowserSession(Browser browser){
        this.webdriver = SeleniumInstanceManager.getInstance(browser);
    }

    public static BrowserSession of(String browserName){
        Browser browser = Browser.valueOf(browserName.toUpperCase());
        return new BrowserSession(browser);
    }

    public WebDriver gotoUrl(String url){
        webdriver.get(url);
        return webdriver;
    }

    public WebElement getWebElement(By element){
        return webdriver.findElement(element);
    }

    public WebDriver type(By element, String value){
        WebElement webElement = webdriver.findElement(element);
        return type(webElement, value);
    }

    public WebDriver type(WebElement webElement, String value){
        webElement.sendKeys(value);
        return webdriver;
    }


    public WebDriver pressEnter(WebElement webElement){
        webElement.sendKeys(Keys.ENTER);
        return webdriver;
    }

    public WebDriver click(WebElement webElement){
        webElement.click();
        return webdriver;
    }

    public WebDriver clickCheckbox(WebElement webElement){
        if(!webElement.isSelected()) click(webElement);
        return webdriver;
    }

    public WebDriver handleDropDown(WebElement dropDownElement, String value){
        Select select = new Select(dropDownElement);
        select.selectByValue(value);
        return webdriver;
    }

    public boolean waitForPageToLoad(){
        return SeleniumInstanceManager.waitUntilPageLoads();
    }

    public void closeSession(){
        SeleniumInstanceManager.quit();
    }
}
