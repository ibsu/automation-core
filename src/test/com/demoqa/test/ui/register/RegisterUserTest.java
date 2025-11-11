package com.demoqa.test.ui.register;

import com.demoqa.test.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class RegisterUserTest extends PageManager {

    @Autowired
    private WebDriver driver;


    @Test
    public void registerUser() {
        registerPage.registerUser("Sudarsanan", "Balan", "ibsufdsfsdf", "password123");
    }

}
