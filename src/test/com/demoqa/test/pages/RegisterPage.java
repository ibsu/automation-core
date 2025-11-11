package com.demoqa.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static com.test.ui.helpers.PerformAction.*;

@Component
public class RegisterPage {

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstNameInput;

    @FindBy(how = How.ID,using = "lastname")
    private WebElement lastNameInput;

    @FindBy(how = How.ID,using = "useName")
    private WebElement userNameInput;

    @FindBy(how = How.ID,using = "password")
    private WebElement passwordInput;

    @FindBy(how = How.CSS,using = ".recaptcha-checkbox-border")
    private WebElement notARobotCheckBox;

    @FindBy(how = How.ID,using = "register")
    private WebElement registerBtn;

    public RegisterPage registerUser(String firstName, String lastName, String userName, String password){
        inputValue(firstNameInput, firstName);
        inputValue(lastNameInput, lastName);
        inputValue(userNameInput, userName);
        inputValue(passwordInput, password);
        clickElement(notARobotCheckBox);
        clickElement(registerBtn);

        return this;
    }
}
