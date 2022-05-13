package testBankOfAmerica;

import app.HomePage;
import base.BasePage;
import io.netty.resolver.HostsFileEntries;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @Test
    public void testCheckingFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickChecking();
        String ExpectedText = "checking";
        Assert.assertEquals(ExpectedText, "Checking");
    }

    @Test
    public void testSavingsFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickSavings();
        homePage.clickOnlineBanking();
        String ExpectedText = "onlineBanking";
        Assert.assertEquals(ExpectedText, "onlineBanking");
    }

    @Test
    public void testCreditCards() {
        HomePage homepage = new HomePage();
        homepage.clickCreditCards();
        homepage.clickShopAllCreditCards();
        String ExpectedText = "shopAllCreditCards";
        Assert.assertEquals(ExpectedText, "shopAllCreditCards");
    }

    @Test
    public void testHomeLoans() {
        HomePage homePage = new HomePage();
        homePage.clickHomeLoans();
        homePage.clickMortgages();
        String ExpectedText = "HomeLoans";
        Assert.assertEquals(ExpectedText, "mortgages");
    }

    @Test
    public void testAutoLoans() {
        HomePage homePage = new HomePage();
        homePage.clickAutoLoans();
        homePage.clickCheckApplicationStatus();
        String ExpectedText = "AutoLoans";
        Assert.assertEquals(ExpectedText, "checkApplicationStatus");
    }

    @Test
    public void testInvesting() {

        HomePage homePage = new HomePage();
        homePage.clickInvestingButton();
        homePage.clickGetStartedButton();
        String ExpectedText = "Investing";
        Assert.assertEquals(ExpectedText, "Investing");
    }
    @Test
public void testOpenAccount(){
        HomePage homePage=new HomePage();
        homePage.clickOpenAccount();
        String ExpectedText= "OpenAccount";
        Assert.assertEquals(ExpectedText,"openAccount");

    }
    @Test
    public void testExploreOurApp(){
        HomePage homePage=new HomePage();
        homePage.clickExploreOurApp();
        String ExpectedText= "ExploreOurApp";
        Assert.assertEquals(ExpectedText, "exploreOurApp");

    }
    @Test
    public void testContactUs(){
        HomePage homePage=new HomePage();
        homePage.clickContactUs();
        String ExpectedText= "ContactUs";
        Assert.assertEquals(ExpectedText, "contactUs");
    }
    @Test
    public void testScheduleAnAppointment(){
        HomePage homePage=new HomePage();
        homePage.clickScheduleAnAppointment();
        String ExpectedText= "ScheduleAnAppointment";
        Assert.assertEquals(ExpectedText,"scheduleAnAppointment");
    }
    @Test
    public void testSmallBusiness(){
        HomePage homePage=new HomePage();
        HomePage.clickSmallBusiness();
        String ExpectedText= "SmallBusiness";
        Assert.assertEquals(ExpectedText,"SmallBusiness");
    }
}

