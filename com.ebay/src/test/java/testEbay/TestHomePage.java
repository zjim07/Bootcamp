package testEbay;

import app.HomePage;
import base.BasePage;
import io.netty.resolver.HostsFileEntries;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

public class TestHomePage extends BasePage {

    @Test
    public void testSearchBar(){
        HomePage homePage=new HomePage();
        homePage. clickSearchBar();
        homePage.sendKeysToElement("tablet");
        String ExpectedText="clickSearchBar";
        Assert.assertEquals(ExpectedText, "clickSearchBar");
    }
    @Test
    public void testDailyDeals(){
        HomePage homePage=new HomePage();
        homePage. clickDailyDeals();
        String ExpectedText="clickDailyDeals";
        Assert.assertEquals(ExpectedText, "clickDailyDeals");
    }
    @Test
    public void testLetsRide(){
        HomePage homePage=new HomePage();
        homePage.clickLetsRide();
        String ExpectedText="clickLetsRide";
        Assert.assertEquals(ExpectedText, "clickLetsRide");
    }
    @Test
    public void testMyEbay(){
        HomePage homePage=new HomePage();
        homePage.clickMyEbay();
        String ExpectedText= "clickMyEbay";
        Assert.assertEquals(ExpectedText,"clickMyEbay");
    }
    @Test
    public void testSell(){
        HomePage homePage=new HomePage();
        homePage.clickSell();
        String ExpectedText="clickSell";
        Assert.assertEquals(ExpectedText, "clickSell");
    }
    @Test
    public void testSaved(){
        HomePage homePage=new HomePage();
        homePage.clickSaved();
        String ExpectedText="clickSaved";
        Assert.assertEquals(ExpectedText, "clickSaved");
    }
    @Test
    public void testMotors(){
        HomePage homePage=new HomePage();
        homePage.clickMotors();
        String ExpectedText="clickMotors";
        Assert.assertEquals(ExpectedText, "clickMotors");

    }
    @Test
    public void testHowToDonate(){
        HomePage homePage=new HomePage();
        homePage.clickHowToDonate();
        String ExpectedText="clickHowToDonate";
        Assert.assertEquals(ExpectedText,"clickHowToDonate");
    }
    @Test
    public void testShopNow(){
        HomePage homePage=new HomePage();
        homePage.clickShopNow();
        String ExpectedText="clickShopNow";
        Assert.assertEquals(ExpectedText, "clickShopNow");
    }
    @Test
    public void testGetYourThing(){
        HomePage homePage=new HomePage();
        homePage.clickGetYourThing();
        String ExpectedText="clickGetYourThing";
        Assert.assertEquals(ExpectedText, "clickGetYourThing");
    }
    @Test
    public void testRegistration(){
        HomePage homePage=new HomePage();
        homePage.clickRegistration();
        String ExpectedText="clickRegistration";
        Assert.assertEquals(ExpectedText, "clickRegistration");
    }
}
