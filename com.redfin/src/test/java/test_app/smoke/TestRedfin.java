package test_app.smoke;

import app.pom.Homepage;
import app.pom.PropertyPage;
import app.pom.ResultsPage;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestRedfin extends BaseTest {

    @Test
    public void test3DWalkthrough() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.sendKeysToSearchBox("Mclean");
        homepage.clickSearchButton();
        ResultsPage resultsPage = new ResultsPage();
        resultsPage.closeOutOfExpandedMode();
        Thread.sleep(5000);
        resultsPage.clickFilterButton();
        Thread.sleep(5000);
        resultsPage.clickTourSection();
        Thread.sleep(3000);
        resultsPage.click3DFilter();
        resultsPage.clickCloseOutOfFilters();
        Thread.sleep(3000);
        resultsPage.selectRandomHomeFromList();
        Thread.sleep(3000);
        switchToTab();
        PropertyPage propertyPage = new PropertyPage();
        propertyPage.clickWalkthroughStartButton();
        Thread.sleep(5000);
        switchToFrameByElement(propertyPage.iFrameElementVirtualTour);
        propertyPage.clickCanvas();
        Thread.sleep(2000);
        propertyPage.clickPlayButton();
        Thread.sleep(15000);



    }

}
