package test_app.smoke;

import app.pom.Homepage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestBooking extends BaseTest {

    @Test
    public void testNewYorkStay() {

        Homepage homepage = new Homepage();
        String destination = "New York";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }
        String actualResult = homepage.destinationConfirmation.getText();
        System.out.println("ACTUAL: " + actualResult);
        String expectedResult = excel.readStringList("Locations").get(0);
        System.out.println("EXPECTED: " + expectedResult);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testCaliforniaStay() {

        Homepage homepage = new Homepage();
        String destination = "California";
        homepage.typeInSearchBar(destination);
        homepage.selectRandomAutoSuggestion();
        homepage.selectTodaysDate();
        homepage.selectRandomDayWithin30Days();
        homepage.selectGuestsBar();
        homepage.addAnAdult();
        homepage.addARoom();
        homepage.clickSubmit();
        if(homepage.popUp.isDisplayed()){
            homepage.closePopUp();
        }
        String actualResult = homepage.destinationConfirmation.getText();
        System.out.println("ACTUAL: " + actualResult);
        String expectedResult = excel.readStringList("Locations").get(1);
        System.out.println("EXPECTED: " + expectedResult);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
