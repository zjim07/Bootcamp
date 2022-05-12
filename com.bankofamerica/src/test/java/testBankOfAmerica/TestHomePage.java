package testBankOfAmerica;

import app.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

@Test
public class TestHomePage extends BasePage {
    public void testCheckingFunctionality(){
        HomePage homePage= new HomePage();
        homePage.clickChecking();

    }
}
