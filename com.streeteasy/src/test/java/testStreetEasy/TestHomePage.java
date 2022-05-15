package testStreetEasy;

import app.HomePage;
import base.BasePage;
import io.netty.resolver.HostsFileEntries;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @Test
    public void testLocation(){
        HomePage homePage=new HomePage();
        homePage.clickLocation();
        homePage.sendKeysToElement("Brooklyn");
        homePage.clickSearchButton();
        String ExpectedText="clickLocation";
        Assert.assertEquals(ExpectedText, "clickSearchButton");
    }
    @Test
    public void testRent(){
        HomePage homePage=new HomePage();
        homePage.clickRent();
        String ExpectedText= "clickRent";
        Assert.assertEquals(ExpectedText, "clickRent");
    }
    @Test
    public void testBuy(){
        HomePage homePage=new HomePage();
        homePage.clickBuy();
        String ExpectedText="clickBuy";
        Assert.assertEquals(ExpectedText, "clickBuy");
    }
    @Test
    public void testSell(){
        HomePage homePage=new HomePage();
        homePage.clickSell();
        String ExpectedText="clickSell";
        Assert.assertEquals(ExpectedText, "clickSell");
    }
    @Test
    public void testBuildings(){
        HomePage homePage=new HomePage();
        homePage.clickBuildings();
        homePage.clickManhattan();
        String ExpectedText="clickManhattan";
        Assert.assertEquals(ExpectedText, "Manhattan");
    }
    @Test
    public void testResources(){
        HomePage homePage=new HomePage();
        homePage.clickResources();
        homePage.clickMortgageRates();
        String ExpectedText="clickMortgageRates";
        Assert.assertEquals(ExpectedText, "clickMortgageRates");
    }
    @Test
    public void testBlog(){
        HomePage homePage=new HomePage();
        homePage.clickBlog();
        String ExpectedText="clickBlog";
        Assert.assertEquals(ExpectedText, "clickBlog");
    }
    @Test
    public void testContactUs(){
        HomePage homePage=new HomePage();
        homePage.clickContactUs();
        String ExpectedText="clickContactUs";
        Assert.assertEquals(ExpectedText, "clickContactUs");
    }
    @Test
    public void testSearchRentals(){
        HomePage homePage=new HomePage();
        homePage.clickSearchRentals();
        String ExpectedText= "clickSearchRentals";
        Assert.assertEquals(ExpectedText, "clickSearchRentals");
    }
    @Test
    public void testSearchSales(){
        HomePage homePage=new HomePage();
        homePage.clickSearchSales();
        String ExpectedText="clickSearchSales";
        Assert.assertEquals(ExpectedText, "clickSearchSales");
    }
    @Test
    public void testSeeSellerTools(){
        HomePage homePage=new HomePage();
        homePage.clickSeeSellerTools();
        String ExpectedText="clickSeeSellerTools";
        Assert.assertEquals(ExpectedText, "clickSeeSellerTools");
    }
}

