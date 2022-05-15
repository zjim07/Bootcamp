package testATT;

import app.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestATT extends BasePage {
    @Test
    public void testVerifyDealsPageLinkFunctionality() {
        Homepage homePage = new Homepage();
        homePage.clickDeals();
        String ExpectedTest = "clickDeals";
        Assert.assertEquals(ExpectedTest, "clickDeals");
    }

    @Test
    public void testSearchButton() {
        Homepage homepage = new Homepage();
        homepage.searchButton.sendKeys("Phone");
        String ExpectedText = "Phone";
        Assert.assertEquals(ExpectedText, "Phone");

    }

    @Test
    public void testPhonesAndDevices() {
        Homepage homePage = new Homepage();
        homePage.clickPhonesAndDevices();
        String ExpectedTest = "clickPhonesAndDevices";
        Assert.assertEquals(ExpectedTest, "clickPhonesAndDevices");
    }

    @Test
    public void testWireless() {
        Homepage homePage = new Homepage();
        homePage.clickWireless();
        String ExpectedTest = "clickWireless";
        Assert.assertEquals(ExpectedTest, "clickWireless");
    }

    @Test
    public void testShopNow() {
        Homepage homePage = new Homepage();
        homePage.clickShopNow();
        String ExpectedTest = "clickShopNow";
        Assert.assertEquals(ExpectedTest, "clickShopNow");
    }

    @Test
    public void testLearnmore() {
        Homepage homePage = new Homepage();
        homePage.clickLearnMore();
        String ExpectedTest = "clickLearnMore";
        Assert.assertEquals(ExpectedTest, "clickLeanMore");
    }

    @Test
    public void testFindAStore() {
        Homepage homepage = new Homepage();
        homepage.clickFindAStore();
        String ExpectedTest = "clickFindAStore";
        Assert.assertEquals(ExpectedTest, "clickFindAStore");
    }

    @Test
    public void testSignMeUp() {
        Homepage homepage = new Homepage();
        homepage.clickSignMeUp();
        homepage.searchButton.sendKeys("manahil@yahoo.com");
        String ExpectedTest = "sendKeys manahil@yahoo.com";
        Assert.assertEquals(ExpectedTest, "manahil@yahoo.com");
    }
    @Test
    public void testWirelessButton(){
        Homepage homePage=new Homepage();
        homePage.clickWirelessButton();
        String ExpectedTest= "clickWirelessButton";
        Assert.assertEquals(ExpectedTest, "clickWirelessButton");
    }
    @Test
    public void testAccountDropDown(){
        Homepage homepage=new Homepage();
        homepage.clickAccountDropDown();
        String ExpectedTest= "clickAccountDropDown";
        Assert.assertEquals(ExpectedTest, "clickAccountDropDown");
    }
    @Test
    public void testSupportButton(){
        Homepage homePage=new Homepage();
        homePage.clickSupportButton();
        String ExpectedTest= "clickSupportButton";
        Assert.assertEquals(ExpectedTest, "clickSupportButton");
    }
}




