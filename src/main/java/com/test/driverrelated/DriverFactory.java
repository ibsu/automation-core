package com.test.driverrelated;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static final ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static WebDriver getWebDriver(BrowserType browserType) {
        WebDriver driver = threadLocalDriver.get();

        if (driver == null) {
            DriverManager driverManager = createDriverManager(browserType);
            driver = driverManager.createDriver();
            threadLocalDriver.set(driver);
        }
        return driver;
    }

    private static DriverManager createDriverManager(BrowserType browserType) {

        switch (browserType) {
            case CHROME -> {
                return new ChromeDriverManager();
            }

            case FIREFOX -> {
                return new FirefoxDriverManager();
            }
            default -> throw new IllegalArgumentException("Unknown browser: " + browserType);
        }
    }

    public static void quitDriver() {
        WebDriver driver = threadLocalDriver.get();
        if (driver != null) {
            driver.quit();
            threadLocalDriver.remove();
        }
    }
}
