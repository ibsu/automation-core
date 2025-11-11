package com.demoqa.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager implements BrowserDriver{
    @Override
    public WebDriver createDriver(){
        return new FirefoxDriver();
    }
}
