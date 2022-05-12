import app.Homepage;
import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class testHomepage extends BasePage {
    @Test
    public void testWomenPageFunctionality (){
        Homepage homepage=new Homepage();
        homepage.clickWomenButton();
        String ExpectedTest= "clickWomenButton";
        Assert.assertEquals(ExpectedTest, "clickWomenButton");
    }
    @Test
    public void testDressesButtonFunctionality (){
        Homepage homepage=new Homepage();
        homepage.clickDressesButton();
        String ExpectedTest= "clickDressesButton";
        Assert.assertEquals(ExpectedTest, "clickDressesButton");
    }
    @Test
    public void testSignInButtonFunctionality (){
        Homepage homepage= new Homepage();
        homepage.signInButton();
        String ExpectedTest="clickSignInButton";
        Assert.assertEquals(ExpectedTest, "clickSignInButton");
    }
  @Test
    public void testShopNowButtonFunctionality (){
        Homepage homepage= new Homepage();
        homepage.clickShopNowButton();
        String ExpectedTest="clickShopNowButton";
        Assert.assertEquals(ExpectedTest, "clickShopNowButton");

  }
  @Test
    public void testDaysSaleFunctionality (){
        Homepage homepage=new Homepage();
        homepage.clickDaysSale();
        String ExpectedTest="clickDaysSale";
        Assert.assertEquals(ExpectedTest, "clickDaysSale");
  }
  @Test
    public void summerCollectionFunctionality(){
        Homepage homepage=new Homepage();
        homepage.clickSummerCollection();
        String ExpectedTest="clickSummerCollection";
        Assert.assertEquals(ExpectedTest, "clickSummerCollection");
  }
  @Test
    public void addToCartFunctionality(){
        Homepage homepage=new Homepage();
        homepage.clickAddToCart();
        String ExpectedTest="clickAddToCart";
        Assert.assertEquals(ExpectedTest, "clickAddToCart");
  }
  @Test
    public void enterEmailAddress(){
        Homepage homepage=new Homepage();
        homepage.clickEmailAddress();
        homepage.sendKeysToElement("manahil@gmail.com");
        homepage.clickCreateAnAccount();
      //Assert.assertEquals(ActualText.containsExpectedTest);
  }
  @Test
    public void clickGetSavingsNow(){
        Homepage homepage=new Homepage();
        homepage.clickGetSavingsNow();
        String ExpectedTest="clickGetSavingsNow";
        Assert.assertEquals(ExpectedTest, "clickGetSavingsNow");

  }
  @Test
    public void clickYourLogo(){
        Homepage homepage=new Homepage();
        homepage.clickYourLogo();
        String ExpectedTest="clickYourLogo";
        Assert.assertEquals(ExpectedTest, "clickYourLogo");
  }
  @Test
    public void clickTopTrends(){
        Homepage homepage=new Homepage();
        homepage.clickTopTrends();
        String ExpectedTest="clickTopTrends";
        Assert.assertEquals(ExpectedTest, "clickTopTrends");
  }
}

