package com.assignments;


import com.browserActions.BrowserSession;
import com.driverManager.SeleniumInstanceManager;
import com.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {
    /**Assignment for Implicit and Explicit wait practice Directly with  **/
    private final String testUrl = "https://www.amazon.in/";


    @Test
    public void testWaits(){
        BrowserSession browserSession = BrowserSession.of("CHROME");
        browserSession.gotoUrl(testUrl);
        HomePage homePage = new HomePage(browserSession);
        homePage.search("New Toys");
        Assertions.assertTrue(browserSession.waitForPageToLoad(), "Page load is not loaded)");
    }

}
