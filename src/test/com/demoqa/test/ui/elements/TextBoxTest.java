package com.demoqa.test.ui.elements;

import com.demoqa.test.pages.PageManager;
import org.testng.annotations.Test;

public class TextBoxTest extends PageManager {

    @Test
    public void TestBoxTest() {
        textBoxPage.addFullName("Sudarsanan Balan")
                .addEmail("sudarsananib@gmail.com")
                .addCurrentAddress("Test Address 123")
                .clickOnSubmitBtn();
    }
}
