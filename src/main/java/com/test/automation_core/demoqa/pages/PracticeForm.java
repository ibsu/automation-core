package com.test.automation_core.demoqa.pages;

import com.test.automation_core.BaseUiPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class PracticeForm extends BaseUiPage {

    @FindBy(how = How.ID, using = "firstName")
    private WebElement firstNameInput;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement lastNameInput;

    @FindBy(how = How.ID, using = "userEmail")
    private WebElement emailInput;


    public PracticeForm setFirstName(String strFirstName){
        firstNameInput.sendKeys(strFirstName);
        return this;
    }
}
