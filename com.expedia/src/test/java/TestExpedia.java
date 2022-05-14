import app.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExpedia extends BasePage {

    @Test
    public void testMoreTravel(){
        HomePage homePage=new HomePage();
        homePage.clickMoreTravel();
        String ExpectedText="clickMoreTravel";
        Assert.assertEquals(ExpectedText, "clickMoreTravel");

    }
    @Test
    public void testAbout(){
        HomePage homePage=new HomePage();
        homePage.clickAbout();
        String ExpectedText= "clickAbout";
        Assert.assertEquals(ExpectedText,"clickAbout");
    }
    @Test
    public void testUSATravelGuide(){
        HomePage homePage=new HomePage();
        homePage.clickUSATravelGuide();
        String ExpectedText= "clickUSATravelGuide";
        Assert.assertEquals(ExpectedText, "clickUSATravelGuide");
    }
    @Test
    public void testHotelsInUSA(){
        HomePage homePage=new HomePage();
        homePage.clickHotelsInUSA();
        String ExpectedText= "clickHotelsInUSA";
        Assert.assertEquals(ExpectedText, "clickHotelsInUSA");
    }
    @Test
    public void testDomesticFlights(){
        HomePage homePage=new HomePage();
        homePage.clickDomesticFlights();
        String ExpectedText= "clickDomesticFlights";
        Assert.assertEquals(ExpectedText, "clickDomesticFlights");
    }
    @Test
    public void testVacationRentals(){
        HomePage homePage=new HomePage();
        homePage.clickVacationRentals();
        String ExpectedText= "clickVacationRentals";
        Assert.assertEquals(ExpectedText, "clickVacationRentals");
    }
    @Test
    public void testCarRentals(){
        HomePage homePage=new HomePage();
        homePage.clickCarRentals();
        String ExpectedText="clickCarRentals";
        Assert.assertEquals(ExpectedText, "clickCarRentals");
    }
    @Test
    public void testSupport(){
        HomePage homePage=new HomePage();
        homePage.clickSupport();
        String ExpectedText= "clickSupport";
        Assert.assertEquals(ExpectedText, "clickSupport");
    }
    @Test
    public void testCancelYourFlight(){
        HomePage homePage=new HomePage();
        homePage.clickCancelYourFlight();
        String ExpectedText= "clickCancelYourFlight";
        Assert.assertEquals(ExpectedText, "clickCancelYourFlight");
    }
    @Test
    public void testExpediaCoupon(){
        HomePage homePage=new HomePage();
        homePage.clickExpediaCoupon();
        String ExpectedText="clickExpediaCoupon";
        Assert.assertEquals(ExpectedText, "clickExpediaCoupon");
    }
    @Test
    public void testVacationPackages(){
        HomePage homePage=new HomePage();
        homePage.clickVacationPackages();
        String ExpectedText="clickVacationPackages";
        Assert.assertEquals(ExpectedText,"clickVacationPackages");
    }
}
