package com.demoqa.test.pages;

import com.demoqa.test.driverrelated.BaseUiTest;
import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.test.pageobjects")
public abstract class PageManager extends BaseUiTest {

    @Autowired
    protected RegisterPage registerPage;

    @Autowired
    protected LoginPage loginPage;

    @Autowired
    protected TextBoxPage textBoxPage;

    @Autowired
    protected WebDriver driver;

    @PostConstruct
    public void initPage(){
        PageFactory.initElements(driver, this);
    }
}
