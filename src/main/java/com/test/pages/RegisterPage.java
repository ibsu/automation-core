package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static com.test.ui.helpers.PerformAction.clickElement;
import static com.test.ui.helpers.PerformAction.inputValue;

@Component
public class RegisterPage {

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "useName")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = ".recaptcha-checkbox-border")
    private WebElement notARobotCheckBox;

    @FindBy(id = "register")
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
