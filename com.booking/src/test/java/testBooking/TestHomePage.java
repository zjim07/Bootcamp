package testBooking;

import app.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage {
    @Test
    public void clickFlights(){

        HomePage homePage=new HomePage();
        homePage.clickFlights();
        homePage.clickWhereTo();
        homePage.sendKeysToElement("LAX");
        homePage.clickSearchButton();
        String ExpectedText= "clickSearchButton";
        Assert.assertEquals(ExpectedText, "clickSearchButton");
    }
    @Test
    public void clickCarRentals(){
        HomePage homePage=new HomePage();
        HomePage.clickCarRentals();
        String ExpectedText="clickCarRentals";
        Assert.assertEquals(ExpectedText,"clickCarRentals");
    }
  @Test
    public void clickRegister(){
        HomePage homePage=new HomePage();
      HomePage.clickRegister();
      homePage.enterEmailAddress();
      homePage.sendKeysToElement("manahil@gmail.com");
      String ExpectedText="enterEmailAddress";
      Assert.assertEquals(ExpectedText, "manahil@gmail.com");
  }
  @Test
    public void clickAttractions(){
        HomePage homePage=new HomePage();
        HomePage.clickAttractions();
        String ExpectedText="clickAttractions";
        Assert.assertEquals(ExpectedText,"clickAttractions");
  }
@Test
    public void clickAirportTaxis(){
        HomePage homePage=new HomePage();
        HomePage.clickAirportTaxis();
        String ExpectedText="clickAirportTaxis";
        Assert.assertEquals(ExpectedText,"clickAirportTaxis");
}
@Test
    public void clickUSDCurrency(){
        HomePage homePage=new HomePage();
        HomePage.clickUSDCurrency();
        String ExpectedText="clickUSDCurrency";
        Assert.assertEquals(ExpectedText, "clickUSDCurrency");
}
@Test
    public void clickExploreDeals(){
        HomePage homePage=new HomePage();
        HomePage.clickExploreDeals();
        String ExpectedText="clickExploreDeals";
        Assert.assertEquals(ExpectedText,"clickExploreDeals");
}
@Test
    public void clickHotels(){
        HomePage homePage=new HomePage();
        HomePage.clickHotels();
        String ExpectedText="clickHotels";
        Assert.assertEquals(ExpectedText,"clickHotels");
}
@Test
    public void clickLasVegas(){
        HomePage homePage=new HomePage();
        homePage.clickLasVegas();
        String ExpectedText="clickLasVegas";
        Assert.assertEquals(ExpectedText,"clickLasVegas");
}
@Test
    public void clickRegions(){
        HomePage homePage=new HomePage();
        homePage.clickRegions();
        String ExpectedText="clickRegions";
        Assert.assertEquals(ExpectedText, "clickRegions");
}

@Test
    public void clickListYourProperty(){
        HomePage homePage=new HomePage();
        homePage.clickListYourProperty();
        String ExpectedText="clickListYourProperty";
        Assert.assertEquals(ExpectedText, "clickListYourProperty");
}
}
