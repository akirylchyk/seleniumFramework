package com.exadel.pages;


import org.testng.annotations.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestNgTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(TestNgTest.class.getName());

    @BeforeGroups("shopping")
    public void beforeGroups() {
        LOGGER.log(Level.ALL, "@BeforeGroups");
    }

    @AfterGroups("shopping")
    public void afterGroups() {
        LOGGER.log(Level.ALL, "@AfterGroups");
    }

    @BeforeClass
    public void beforeClass() {
        LOGGER.log(Level.ALL, "@BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        LOGGER.log(Level.ALL, "@AfterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        LOGGER.log(Level.ALL, "@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        LOGGER.log(Level.ALL, "@AfterMethod");
    }

    @Test(groups = "shopping")
    public void runTest1() {
        LOGGER.log(Level.ALL, "@Test - runTest1");
    }

    @Test
    public void runTest2() {
        LOGGER.log(Level.ALL, "@Test - runTest2");
    }

}
