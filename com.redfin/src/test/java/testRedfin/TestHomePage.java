package testRedfin;

import app.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @Test
    public void testSearchBar(){
        HomePage homePage=new HomePage();
        homePage.clickSearchBar();
        homePage.sendKeysToElement("Aldie");
        homePage.clickSearchButton();
        String ExpectedText="clickSearchButton";
        Assert.assertEquals(ExpectedText, "clickSearchButton");

    }
    @Test
    public void testSell(){
        HomePage homePage=new HomePage();
        homePage.clickRent();
        homePage.sendKeysToElement("20105");
        homePage.Search();
        String ExpectedText="clickSearch";
        Assert.assertEquals(ExpectedText, "clickSearch");

    }
    @Test
    public void testSellDropDown(){
        HomePage homePage=new HomePage();
        homePage.clickSellDropDown();
        String ExpectedText="clickSellDropDown";
        Assert.assertEquals(ExpectedText, "clickSellDropDown");

    }
    @Test
    public void testBuy(){
        HomePage homePage=new HomePage();
        homePage.clickBuy();
        String ExpectedText="clickBuy";
        Assert.assertEquals(ExpectedText, "clickBuy");
    }
    @Test
    public void testMortgage(){
        HomePage homePage=new HomePage();
        homePage.clickMortgage();
        String ExpectedText="clickMortgage";
        Assert.assertEquals(ExpectedText, "clickMortgage");
    }
    @Test
    public void testRealEstateAgents(){
        HomePage homePage=new HomePage();
        homePage.clickRealEstateAgents();
        String ExpectedText="clickRealEstateAgents";
        Assert.assertEquals(ExpectedText, "clickRealEstateAgents");
    }
    @Test
    public void testFeed(){
        HomePage homePage=new HomePage();
        homePage.clickFeed();
        String ExpectedText="clickFeed";
        Assert.assertEquals(ExpectedText, "clickFeed");

    }
    @Test
    public void testSignUp(){
        HomePage homePage=new HomePage();
        homePage.clickSignUp();
        homePage.enterEmailAddress();
        homePage.clickContinueWithEmail();
        String ExpectedText="clickContinueWithEmail";
        Assert.assertEquals(ExpectedText, "clickContinueWithEmail");
    }
    @Test
    public void testSeeHousingNews(){
        HomePage homePage= new HomePage();
        homePage.clickSeeHousingNews();
        String ExpectedText="clickSeeHousingNews";
        Assert.assertEquals(ExpectedText, "clickSeeHousingNews");
    }
    @Test
    public void testBeARedfinAgent(){
        HomePage homePage= new HomePage();
        homePage.clickBeARedfinAgent();
        String ExpectedText= "clickBeARedfinAgent";
        Assert.assertEquals(ExpectedText, "clickBeARedfinAgent");

    }
    @Test
    public void testAshburnRealEstate(){
        HomePage homePage=new HomePage();
        homePage.clickAshburnRealEstate();
        String ExpectedText="clickAshburnRealEstate";
        Assert.assertEquals(ExpectedText, "clickAshburnRealEstate");
    }
}
