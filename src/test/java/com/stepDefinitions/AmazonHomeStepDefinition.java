package com.stepDefinitions;

import com.browserActions.BrowserSession;
import com.driverManager.SeleniumInstanceManager;
import com.pages.HomePage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AmazonHomeStepDefinition {
    private final BrowserSession browserSession = BrowserSession.of("CHROME");
    private final HomePage homePage = new HomePage(browserSession);

    @Given("User go to page {string}")
    public void gotoPage(String url){
        browserSession.gotoUrl(url);
    }

    @When("Searches for {string}")
    public void searchItem(String item){
        homePage.search(item);
    }

    @Then("Verifies page displays results and loads completely")
    public void verifyPageLoads(){
        boolean result = browserSession.waitForPageToLoad();
        Assertions.assertTrue(result, "Browser is not loaded");
    }

    @AfterAll
    public static void closeBrowser(){
        SeleniumInstanceManager.quit();
    }
}
