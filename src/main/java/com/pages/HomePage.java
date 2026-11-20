package com.pages;

import com.browserActions.BrowserSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final BrowserSession browserSession;
    public HomePage(BrowserSession browserSession){
        this.browserSession = browserSession;
    }

    private final By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");


    public void search(String value){
        WebElement webElement = browserSession.getWebElement(searchBox);
       browserSession.type(webElement, value);
       browserSession.pressEnter(webElement);
    }
}
