package testMarketWatch;

import app.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @Test
    public void testMarkets(){
        HomePage homePage=new HomePage();
        homePage.clickMarkets();
        String ExpectedText="clickMarkets";
        Assert.assertEquals(ExpectedText, "clickMarkets");

    }
    @Test
    public void testCrypto(){
        HomePage homePage=new HomePage();
        homePage.clickCrypto();
        String ExpectedText="clickCrypto";
        Assert.assertEquals(ExpectedText, "clickCrypto");
    }
    @Test
    public void testDow(){
        HomePage homePage=new HomePage();
        homePage.clickDow();
        String ExpectedText="clickDow";
        Assert.assertEquals(ExpectedText, "clickDow");

    }
    @Test
    public void testAccountSettings(){
        HomePage homePage=new HomePage();
        homePage.clickAccountSettings();
        homePage.clickSignUp();
        String ExpectedText="clickSignUp";
        Assert.assertEquals(ExpectedText, "clickSignUp");
    }
    @Test
    public void testInvesting(){
        HomePage homePage=new HomePage();
        homePage.clickInvesting();
        String ExpectedText="clickInvesting";
        Assert.assertEquals(ExpectedText, "clickInvesting");
    }
    @Test
    public void testElonMuskTwitter(){
        HomePage homePage=new HomePage();
        homePage.clickElonMuskTwitter();
        String ExpectedText="clickElonMuskTwitter";
        Assert.assertEquals(ExpectedText, "clickElonMuskTwitter");
    }
    @Test
    public void testStockMarketCorrection(){
        HomePage homePage=new HomePage();
        homePage.clickStockMarketCorrection();
        String ExpectedText="clickStockMarketCorrection";
        Assert.assertEquals(ExpectedText, "clickStockMarketCorrection");
    }
    @Test
    public void testPersonalFinance(){
        HomePage homePage=new HomePage();
        homePage.clickPersonalFinance();
        String ExpectedText="clickPersonalFinance";
        Assert.assertEquals(ExpectedText, "clickPersonalFinance");
    }
    @Test
    public void testEconomy(){
        HomePage homePage=new HomePage();
        homePage.clickEconomy();
        String ExpectedText="clickEconomy";
        Assert.assertEquals(ExpectedText, "clickEconomy");
    }
    @Test
    public void testNasdaq(){
        HomePage homePage=new HomePage();
        homePage.clickNasdaq();
        String ExpectedText="clickNasdaq";
        Assert.assertEquals(ExpectedText, "clickNasdaq");
    }
    @Test
    public void testRetirement(){
        HomePage homePage=new HomePage();
        String ExpectedText="clickRetirement";
        Assert.assertEquals(ExpectedText, "clickRetirement");
    }
}
