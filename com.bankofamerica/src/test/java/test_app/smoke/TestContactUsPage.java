package test_app.smoke;

import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestContactUsPage extends BaseTest {

    @Test
    public void testMakingClientsOurPriorityVideo() throws InterruptedException {
        Homepage homepage = new Homepage();
        pom.ContactUs contactUs = homepage.clickContactUs();
        contactUs.clickShareFeedback();
        contactUs.clickPlayPauseForClientCareVideo();
        contactUs.enableFullScreen();
        contactUs.playVideoForAmountOfSeconds("10");
        contactUs.enableDisableSubtitles();
        contactUs.playVideoForAmountOfSeconds("30");
        contactUs.progressSlider(10);
        contactUs.disableFullScreen();

        Assert.assertTrue(isElementVisible(contactUs.makingClientsPriorityConfirmation));
        Assert.assertEquals(getElementText(contactUs.makingClientsPriorityConfirmation),
                excel.readStringList("ContactUs").get(0));
    }
}
