package com.driverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class SeleniumInstanceManager {

    private static final Integer MAX_WAIT_TIME =10;
    private static WebDriver driver;

    public static WebDriver getInstance(Browser browser){
        if(Objects.isNull(driver)){
            driver = browser.getInstance();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(MAX_WAIT_TIME));
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quit(){
        if (!Objects.isNull(driver)) {
            driver.quit();
            driver = null;
        }
    }

    public static boolean waitUntilPageLoads(){
        try{
            new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT_TIME)).until(d ->
                    "complete".equals(((JavascriptExecutor) d).executeScript("return document.readyState")));
            return true;
        } catch(Exception ex){
            return false;
        }
    }
}
