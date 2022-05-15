package test_app.smoke;

import app.pom.Homepage;
import app.pom.NewsroomPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestNewsroomPage extends BaseTest {

    @Test
    public void testObtainingInfoOnMultimedia(){
        Homepage homepage = new Homepage();
        NewsroomPage newsroomPage = homepage.clickNewsroomPageButton();
        switchToTab();
        newsroomPage.clickMultimediaOption();

        Assert.assertTrue(isElementVisible(newsroomPage.selectionConfirmation));
        Assert.assertEquals(getElementText(newsroomPage.selectionConfirmation), excel.readStringList("NewsroomPage").get(0));
    }
    @Test
    public void testObtainingInfoOnAwards(){
        Homepage homepage = new Homepage();
        NewsroomPage newsroomPage = homepage.clickNewsroomPageButton();
        switchToTab();
        newsroomPage.clickAwardsPage();

        Assert.assertTrue(isElementVisible(newsroomPage.selectionConfirmation));
        Assert.assertEquals(getElementText(newsroomPage.selectionConfirmation), excel.readStringList("NewsroomPage").get(1));
    }
    @Test
    public void testObtainingInfoOnExpediaInternational(){
        Homepage homepage = new Homepage();
        NewsroomPage newsroomPage = homepage.clickNewsroomPageButton();
        switchToTab();
        newsroomPage.clickExpediaInternationalPage();

        Assert.assertTrue(isElementVisible(newsroomPage.selectionConfirmation));
        Assert.assertEquals(getElementText(newsroomPage.selectionConfirmation), excel.readStringList("NewsroomPage").get(2));
    }
    @Test
    public void testObtainingInfoOnOutTravelTheSystem(){
        Homepage homepage = new Homepage();
        NewsroomPage newsroomPage = homepage.clickNewsroomPageButton();
        switchToTab();
        newsroomPage.clickOutTravelTheSystemPage();

        Assert.assertTrue(isElementVisible(newsroomPage.selectionConfirmation));
        Assert.assertEquals(getElementText(newsroomPage.selectionConfirmation), excel.readStringList("NewsroomPage").get(3));
    }

}
