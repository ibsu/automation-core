package com.test.driverrelated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager implements DriverManager {
    @Override
    public WebDriver createDriver(){
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-notifications");
        return new ChromeDriver(options);
    }
}
