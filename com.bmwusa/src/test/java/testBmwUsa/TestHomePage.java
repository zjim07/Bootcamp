package testBmwUsa;

import app.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage {
    @Test
    public void testPreOrder() {
        Homepage homepage = new Homepage();
        homepage.clickPreOrder();
        String ExpectedText = "clickPreOrder";
        Assert.assertEquals(ExpectedText, "clickPreOrder");
    }
    @Test
    public void testSearchButton(){
        Homepage homepage=new Homepage();
        homepage.clickSearchButton();
        homepage.sendKeysToElement("bmw2020");
        homepage.clickSearchButton();
        String ExpectedText= "clickSearchButton";
        Assert.assertEquals(ExpectedText,"searchButton");

    }
    @Test
    public void testModels(){
        Homepage homepage=new Homepage();
        homepage.clickModels();
        String ExpectedText="clickModels";
        Assert.assertEquals(ExpectedText,"clickModels");
    }
    @Test
    public void testBuildYourOwn(){
        Homepage homepage=new Homepage();
        homepage.clickBuildYourOwn();
        String ExpectedText= "clickBuildYourOwn";
        Assert.assertEquals(ExpectedText,"clickBuildYourOwn");
    }
    @Test
    public void testShopping(){
        Homepage homepage=new Homepage();
        homepage.hoverShopping();
        homepage.sendKeysToElement("20105");
        String ExpectedText= "hoverShopping";
        Assert.assertEquals(ExpectedText,"hoverShopping");
    }
    @Test
    public void testBMWCertified(){
        Homepage homepage=new Homepage();
        homepage.clickBMWCertified();
        String ExpectedText="clickBMWCertified";
        Assert.assertEquals(ExpectedText, "clickBMWCertified");
    }
    @Test
    public void testMyBMW(){
        Homepage homepage=new Homepage();
        homepage.clickMyBMW();
        homepage.clickRegisterNow();
        String ExpectedText="clickRegisterNow";
        Assert.assertEquals(ExpectedText, "clickMyBMW");

    }
    @Test
    public void testContactDealer(){
        Homepage homepage=new Homepage();
        homepage.clickContactDealer();
        String ExpectedText="clickContactDealer";
        Assert.assertEquals(ExpectedText, "clickContactDealer");
    }
    @Test
    public void testStartDesigning(){
        Homepage homepage=new Homepage();
        homepage.clickStartDesigning();
        String ExpectedText="clickStartDesigning";
        Assert.assertEquals(ExpectedText, "clickStartDesigning");
    }
    @Test
    public void testLearnMore(){
        Homepage homepage=new Homepage();
        homepage.clickLearnMore();
        String ExpectedText="clickLearnMore";
        Assert.assertEquals(ExpectedText, "clickLearnMore");
    }
    @Test
    public void testMyBMWApp(){
        Homepage homepage=new Homepage();
        homepage.clickMyBMWApp();
        String ExpectedText="clickMyBMWApp";
        Assert.assertEquals(ExpectedText,"clickMyBMWApp");
    }
}

