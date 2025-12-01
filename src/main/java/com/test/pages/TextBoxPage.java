package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends PageManager {
    @FindBy(id = "userName")
    private WebElement fullNameInput;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(id = "currentAddress")
    private WebElement addressTextArea;

    @FindBy(id = "submit")
    private WebElement submitBtn;

    public TextBoxPage addFullName(String fullName){
        fullNameInput.sendKeys(fullName);
        return this;
    }

    public TextBoxPage addEmail(String email){
        emailInput.sendKeys(email);
        return this;
    }

    public TextBoxPage addCurrentAddress(String currentAddress){
        addressTextArea.sendKeys(currentAddress);
        return this;
    }

    public TextBoxPage clickOnSubmitBtn(){
        submitBtn.click();
        return this;
    }
}
