package test_app.smoke;

import app.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchBar {
    @Test
    public void testSearchBarFunctionality(){
        HomePage homePage = new HomePage();
        homePage.SearchBar.sendKeys ("Ashburn");
//     String ExpectedText= "Ashburn";
//     Assert.assertEquals(ExpectedText,"Ashburn");
    }
}
