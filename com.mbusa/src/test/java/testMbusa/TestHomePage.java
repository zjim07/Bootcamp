package testMbusa;

import app.HomePage;
import base.BasePage;
import io.netty.resolver.HostsFileEntries;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @Test
    public void testVehicles(){
        HomePage homePage=new HomePage();
        homePage.clickVehicles();
        String ExpectedText="clickVehicles";
        Assert.assertEquals(ExpectedText, "clickVehicles");
    }
    @Test
    public void testShopping(){
        HomePage homePage=new HomePage();
        homePage.clickShopping();
        String ExpectedText="clickShopping";
        Assert.assertEquals(ExpectedText, "clickShopping");
    }
    @Test
    public void testInventory(){
        HomePage homePage=new HomePage();
        homePage.clickInventory();
        String ExpectedText="clickInventory";
        Assert.assertEquals(ExpectedText, "clickInventory");
    }
    @Test
    public void testFindADealer(){
        HomePage homePage=new HomePage();
        homePage.clickFindADealer();
        homePage.enterZipcode();
        homePage.clickSearchButton();
        String ExpectedText="clickSearchButton";
        Assert.assertEquals(ExpectedText, "clickSearchButton");
    }
    @Test
    public void testMyAccount(){
        HomePage homePage=new HomePage();
        homePage.clickMyAccount();
        homePage.clickRegister();
        String ExpectedText="clickRegisterButton";
        Assert.assertEquals(ExpectedText, "RegisterButton");
    }
    @Test
    public void testExploreTheEQS(){
        HomePage homePage=new HomePage();
        homePage.clickExploreTheEQS();
        String ExpectedText="clickExploreTheEQS";
        Assert.assertEquals(ExpectedText, "ExploreTheEQS");
    }
    @Test
    public void testExploreTheCClass(){
        HomePage homePage=new HomePage();
        homePage.clickExploreTheCClass();
        String ExpectedText= "clickExploreTheCClass";
        Assert.assertEquals(ExpectedText, "clickExploreTheCClass");
    }
    @Test
    public void testAllVehicles(){
        HomePage homePage=new HomePage();
        homePage.clickAllVehicles();
        String ExpectedText="clickAllVehicles";
        Assert.assertEquals(ExpectedText, "clickAllVehicles");
    }
    @Test
    public void testBuildYourOwn(){
        HomePage homePage=new HomePage();
        homePage.clickBuildYourOwn();
        String ExpectedText= "clickBuildYourOwn";
        Assert.assertEquals(ExpectedText, "clickBuildYourOwn");
    }
    @Test
    public void testSpecialOffers(){
        HomePage homePage=new HomePage();
        homePage.clickSpecialOffers();
        String ExpectedText="clickSpecialOffers";
        Assert.assertEquals(ExpectedText, "clickSpecialOffers");
    }
    @Test
    public void testMaintenanceSupport(){
        HomePage homePage=new HomePage();
        homePage.clickMaintenanceSupport();
        String ExpectedText="clickMaintenanceSupport";
        Assert.assertEquals(ExpectedText, "clickMaintenanceSupport");
    }
    }

