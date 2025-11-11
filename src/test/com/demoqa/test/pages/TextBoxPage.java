package com.demoqa.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends PageManager {
    @FindBy(how = How.ID, using = "userName")
    private WebElement fullNameInput;

    @FindBy(how = How.ID, using = "userEmail")
    private WebElement emailInput;

    @FindBy(how = How.ID, using = "currentAddress")
    private WebElement addressTextArea;

    @FindBy(how = How.ID, using = "submit")
    private WebElement submitBtn;

    public TextBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
