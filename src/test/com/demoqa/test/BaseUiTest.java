package com.demoqa.test;

import com.demoqa.test.pages.DriverFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

public abstract class BaseUiTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected DriverFactory driverFactory;
}
