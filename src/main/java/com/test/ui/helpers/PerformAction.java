package com.test.ui.helpers;

import org.openqa.selenium.WebElement;

public class PerformAction {

    public static void inputValue(WebElement webElement, String inputValue){
        webElement.sendKeys(inputValue);
    }

    public static void clickElement(WebElement webElement){
        webElement.click();
    }
}
