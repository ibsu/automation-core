package com.demoqa.test.driverrelated;

import com.test.config.DemoqaConfig;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUiTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected DemoqaConfig demoqaConfig;

    @BeforeMethod
    public void setUp(){
        WebDriver driver = DriverFactory.getWebDriver(BrowserType.FIREFOX);
        driver.get("");
    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
