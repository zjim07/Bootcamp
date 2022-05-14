package testEspn;

import app.HomePage;
import base.BasePage;
import org.apache.commons.math3.analysis.function.Exp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @Test
    public void testWatch(){
        HomePage homePage=new HomePage();
        homePage.clickWatch();
        String ExpectedText="clickWatch";
        Assert.assertEquals(ExpectedText, "clickWatch");
    }
    @Test
    public void testListen(){
        HomePage homePage=new HomePage();
        homePage.clickListen();
        String ExpectedText="clickListen";
        Assert.assertEquals(ExpectedText, "clickListen");
    }
    @Test
    public void testFantasy(){
        HomePage homePage=new HomePage();
        homePage.clickFantasy();
        String ExpectedText="clickFantasy";
        Assert.assertEquals(ExpectedText, "clickFantasy");
    }

    @Test
    public void testNHLGame(){
        HomePage homePage=new HomePage();
        homePage.clickNHLGame();
        String ExpectedText="clickNHLGame";
        Assert.assertEquals(ExpectedText, "clickNHLGame");
    }
    @Test
    public void testDropDown(){
        HomePage homePage=new HomePage();
        homePage.clickDropDown();
        homePage.clickAndscape();
        String ExpectedText="clickAndscape";
        Assert.assertEquals(ExpectedText, "clickAndscape");
    }
    @Test
    public void testSearchBar(){
        HomePage homePage=new HomePage();
        homePage.clickSearchBar();
        homePage.sendKeysToElement("game");
        String ExpectedText="clickSearchBar";
        Assert.assertEquals(ExpectedText, "clickSearchBar");
    }
    @Test
    public void testNFL(){
        HomePage homePage=new HomePage();
        homePage.clickNFL();
        String ExpectedText="clickNFL";
        Assert.assertEquals(ExpectedText, "clickNFL");
    }
    @Test
    public void testNBA(){
        HomePage homePage=new HomePage();
        homePage.clickNBA();
        String ExpectedText="clickNBA";
        Assert.assertEquals(ExpectedText, "clickNBA");
    }
    @Test
    public void testNHL(){
        HomePage homePage=new HomePage();
        homePage.clickNHL();
        String ExpectedText="clickNHL";
        Assert.assertEquals(ExpectedText, "clickNHL");
    }
    @Test
    public void testPatriots(){
        HomePage homePage=new HomePage();
        homePage.clickPatriots();
        String ExpectedText="clickPatriots";
        Assert.assertEquals(ExpectedText, "clickPatriots");
    }
    @Test
    public void testListenLive(){
        HomePage homePage=new HomePage();
        homePage.clickListenLive();
        String ExpectedText="clickListenLive";
        Assert.assertEquals(ExpectedText,"clickListenLive");
    }
}
