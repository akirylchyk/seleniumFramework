package com.exadel.pages;

import com.exadel.enumeration.PageLocation;
import com.exadel.pages.HomePage;
import com.exadel.pages.Page;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HomePageTest extends TestBase {

    public static Page page;

    public static HomePage homePage;

    public static PageLocation pageLocation;

    @BeforeClass
    public static void initElements() throws MalformedURLException {
        page = PageFactory.initElements(webDriver, Page.class);
        homePage = PageFactory.initElements(webDriver, HomePage.class);
    }

    @Before
    public void loadPage() {
        loadPage(getPageLocation());
    }

    @Test
    public void testVisibilityElementAfterHover() {
        mouseOverElement(homePage.getPracticeAreaLink());
        waitForElementDisplayed("//*[@id='menu-item-1816']");
        homePage.getApplicationDevelopmentLink().click();
        Assert.assertEquals(websiteUrl + PageLocation.APPLICATION_DEVELOPMENT.getUrl(), webDriver.getCurrentUrl());
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        Actions builder = new Actions(webDriver);
        builder.moveToElement(webDriver.findElement(By.id("drag1")), 1, 1)
                .clickAndHold()
                .moveByOffset(500, 100)
                .build()
                .perform();
        synchronized (webDriver) {
            System.out.println("Waiting...");
            webDriver.wait(300);
            builder.release().build().perform();
        }
    }


    /**
     * @return the page location
     * @desc Gets the page location.
     */
    public static PageLocation getPageLocation() {
        pageLocation = null;
        return pageLocation;
    }
}