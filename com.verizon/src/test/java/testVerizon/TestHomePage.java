package testVerizon;

import app.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @Test
    public void testShopVerizon(){
        HomePage homePage=new HomePage();
        homePage.clickShopVerizon();
        String ExpectedText="clickShopVerizon";
        Assert.assertEquals(ExpectedText, "clickShopVerizon");
    }
    @Test
    public void testSignIn(){
        HomePage homePage=new HomePage();
        homePage.clickSignIn();
        homePage.clickRegister();
        String ExpectedText="clickRegister";
        Assert.assertEquals(ExpectedText, "clickRegister");
    }
    @Test
    public void testSearchIcon(){
        HomePage homePage=new HomePage();
        homePage.clickSearchIcon();
        homePage.clickSearchBar();
        homePage.sendKeysToElement("Iphone");
        String ExpectedText="clickSearchIcon";
        Assert.assertEquals(ExpectedText, "clickSearchIcon");
    }
    @Test
    public void testWhyVerizon(){
        HomePage homePage=new HomePage();
        homePage.clickWhyVerizon();
        String ExpectedText="clickWhyVerizon";
        Assert.assertEquals(ExpectedText, "clickWhyVerizon");
    }
    @Test
    public void testSupport(){
        HomePage homePage=new HomePage();
        homePage.clickSupport();
        String ExpectedText="clickSupport";
        Assert.assertEquals(ExpectedText, "clickSupport");
    }
    @Test
    public void testStores(){
        HomePage homePage=new HomePage();
        homePage.clickStores();
        String ExpectedText="clickStores";
        Assert.assertEquals(ExpectedText, "clickStores");
    }
    @Test
    public void testShopNow(){
        HomePage homePage=new HomePage();
        homePage.clickShopNow();
        String ExpectedText="clickShopNow";
        Assert.assertEquals(ExpectedText, "clickShopNow");
    }
    @Test
    public void testIphone13(){
        HomePage homePage=new HomePage();
        homePage.clickIphone13();
        String ExpectedText="clickIphone13";
        Assert.assertEquals(ExpectedText, "clickIphone13");
    }
    @Test
    public void testShopPhones(){
        HomePage homePage=new HomePage();
        homePage.clickShopPhones();
        String ExpectedText="clickShopPhones";
        Assert.assertEquals(ExpectedText, "clickShopPhones");
    }
    @Test
    public void testShopWatches(){
        HomePage homePage=new HomePage();
        homePage.clickShopWatches();
        String ExpectedText="clickShopWatches";
        Assert.assertEquals(ExpectedText, "clickShopWatches");
    }
    @Test
    public void testShopTablets(){
        HomePage homePage=new HomePage();
        homePage.clickShopTablets();
        String ExpectedText="clickShopTablets";
        Assert.assertEquals(ExpectedText, "clickShopTablets");
    }
}
