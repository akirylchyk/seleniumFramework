package com.exadel.pages;


import org.frontendtest.components.ImageComparison;
import org.junit.*;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ImageEqualityPageTest extends TestBase {

    public static ImageEqualityPage imageEqualityPage;

    @BeforeClass
    public static void initElements() {
        imageEqualityPage = PageFactory.initElements(webDriver, ImageEqualityPage.class);
    }

    @Before
    public void loadPage() {
        webDriver.navigate().to("http://marceljuenemann.github.io/angular-drag-and-drop-lists/demo/#/simple");
    }

    @Test
    public void testImageEquality() throws IOException {

        String imgOriginal = "C:/dev/screenshots/test1.png";
        String imgToCompareWithOriginal = "C:/dev/screenshots/test2.png";
        String imgOutputDifferences = "C:/dev/screenshots/test3.png";

        ImageComparison imageComparison = new ImageComparison(10, 10, 0.3);

        if (imageComparison.fuzzyEqual(imgOriginal, imgToCompareWithOriginal, imgOutputDifferences))
            System.out.println("Images are fuzzy-equal.");
        else
            System.out.println("Images are not fuzzy-equal.");
    }

}

