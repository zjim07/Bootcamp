package testSofi;

import app.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @Test
    public void testProducts(){
        HomePage homePage=new HomePage();
        homePage.clickProducts();
        String ExpectedText="clickProducts";
        Assert.assertEquals(ExpectedText, "clickProducts");
    }
    @Test
    public void testMemberBenefits(){
        HomePage homePage=new HomePage();
        homePage.clickMemberBenefits();
        String ExpectedText= "clickMemberBenefits";
        Assert.assertEquals(ExpectedText, "clickMemberBenefits");
    }
    @Test
    public void testBecomeAMember(){
        HomePage homePage=new HomePage();
        homePage.clickBecomeAMember();
        String ExpectedText="clickBecomeAMember";
        Assert.assertEquals(ExpectedText, "clickBecomeAMember");
    }
    @Test
    public void testLogIn(){
        HomePage homePage=new HomePage();
        homePage.clickLogin();
        homePage.clickCreateAnAccount();
        homePage.sendKeysToElement("Manahil Malik");
        String ExpectedText="clickLogin";
        Assert.assertEquals(ExpectedText, "clickLogIn");
    }
    @Test
    public void testResources(){
        HomePage homePage=new HomePage();
        homePage.clickResources();
        String ExpectedText="clickResources";
        Assert.assertEquals(ExpectedText, "clickResources");
    }
    @Test
    public void testAbout(){
        HomePage homePage=new HomePage();
        homePage.clickAbout();
        String ExpectedText="clickAbout";
        Assert.assertEquals(ExpectedText, "clickAbout");
    }
    @Test
    public void testGetStarted(){
        HomePage homePage=new HomePage();
        homePage.clickGetStarted();
        String ExpectedText="clickGetStarted";
        Assert.assertEquals(ExpectedText, "clickGetStarted");
    }
    @Test
    public void testInvest(){
        HomePage homePage=new HomePage();
        homePage.clickInvest();
        String ExpectedText="clickInvest";
        Assert.assertEquals(ExpectedText, "clickInvest");
    }
    @Test
    public void testPersonalLoans(){
        HomePage homePage= new HomePage();
        homePage.clickPersonalLoans();
        String ExpectedText="clickPersonalLoans";
        Assert.assertEquals(ExpectedText, "clickPersonalLoans");
    }
    @Test
    public void testPrivateStudentLoans(){
        HomePage homePage=new HomePage();
        homePage.clickPrivateStudentLoans();
        String ExpectedText="clickPrivateStudentLoans";
        Assert.assertEquals(ExpectedText, "clickPrivateStudentLoans");
    }
    @Test
    public void testInsurance(){
        HomePage homePage=new HomePage();
        homePage.clickInsurance();
        String ExpectedText= "clickInsurance";
        Assert.assertEquals(ExpectedText, "clickInsurance");
    }
    }

