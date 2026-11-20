package com.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public enum Browser {
    CHROME, EDGE;

    public WebDriver getInstance(){
        switch (this) {
            case EDGE:
                return new EdgeDriver();
            case CHROME:
            default:
                return new ChromeDriver();
        }
    }
}
