package test_app.smoke;

import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestBooking extends BaseTest {

    @Test
    public void testNewYorkStay() {

        Homepage homepage = new Homepage();
        String destination = "New York";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(0);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testCaliforniaStay() {

        Homepage homepage = new Homepage();
        String destination = "California";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(1);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testAlabamaStay() {

        Homepage homepage = new Homepage();
        String destination = "Alabama";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(2);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testAlaskaStay() {

        Homepage homepage = new Homepage();
        String destination = "Alaska";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(3);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testArizonaStay() {

        Homepage homepage = new Homepage();
        String destination = "Arizona";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(4);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testArkansasStay() {

        Homepage homepage = new Homepage();
        String destination = "Arkansas";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(5);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testColoradoStay() {

        Homepage homepage = new Homepage();
        String destination = "Colorado";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(6);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testConnecticutStay() {

        Homepage homepage = new Homepage();
        String destination = "Connecticut";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(7);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testDelawareStay() {

        Homepage homepage = new Homepage();
        String destination = "Delaware";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(8);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testFloridaStay() {

        Homepage homepage = new Homepage();
        String destination = "Florida";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(9);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testGeorgiaStay() {

        Homepage homepage = new Homepage();
        String destination = "Georgia";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(10);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testHawaiiStay() {

        Homepage homepage = new Homepage();
        String destination = "Hawaii";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(11);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testIdahoStay() {

        Homepage homepage = new Homepage();
        String destination = "Idaho";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(12);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testIllinoisStay() {

        Homepage homepage = new Homepage();
        String destination = "Illinois";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(13);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testIndianaStay() {

        Homepage homepage = new Homepage();
        String destination = "Indiana";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(14);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testIowaStay() {

        Homepage homepage = new Homepage();
        String destination = "Iowa";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(15);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testKansasStay() {

        Homepage homepage = new Homepage();
        String destination = "Kansas";
        homepage.typeInSearchBar(destination);
        homepage.selectSecondSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(16);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testKentuckyStay() {

        Homepage homepage = new Homepage();
        String destination = "Kentucky";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(17);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testLouisianaStay() {

        Homepage homepage = new Homepage();
        String destination = "Louisiana";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(18);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testMaineStay() {

        Homepage homepage = new Homepage();
        String destination = "Maine";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(19);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testMassachusettsStay() {

        Homepage homepage = new Homepage();
        String destination = "Massachusetts";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(20);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testMichiganStay() {

        Homepage homepage = new Homepage();
        String destination = "Michigan";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(21);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testMinnesotaStay() {

        Homepage homepage = new Homepage();
        String destination = "Minnesota";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(22);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testMississippiStay() {

        Homepage homepage = new Homepage();
        String destination = "Mississippi";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(23);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testMissouriStay() {

        Homepage homepage = new Homepage();
        String destination = "Missouri";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(24);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testMontanaStay() {

        Homepage homepage = new Homepage();
        String destination = "Montana";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(25);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testNebraskaStay() {

        Homepage homepage = new Homepage();
        String destination = "Nebraska";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(26);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testNevadaStay() {

        Homepage homepage = new Homepage();
        String destination = "Nevada";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(27);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testNewHampshireStay() {

        Homepage homepage = new Homepage();
        String destination = "New Hampshire";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(28);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testNewJerseyStay() {

        Homepage homepage = new Homepage();
        String destination = "New Jersey";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(29);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testNewMexicoStay() {

        Homepage homepage = new Homepage();
        String destination = "New Mexico";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(30);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testNorthCarolinaStay() {

        Homepage homepage = new Homepage();
        String destination = "North Carolina";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(31);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testNorthDakotaStay() {

        Homepage homepage = new Homepage();
        String destination = "North Dakota";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(32);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testOhioStay() {

        Homepage homepage = new Homepage();
        String destination = "Ohio";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(33);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testOklahomaStay() {

        Homepage homepage = new Homepage();
        String destination = "Oklahoma";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(34);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testOregonStay() {

        Homepage homepage = new Homepage();
        String destination = "Oregon";
        homepage.typeInSearchBar(destination);
        homepage.selectSecondSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(35);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testPennsylvaniaStay() {

        Homepage homepage = new Homepage();
        String destination = "Pennsylvania";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(36);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testRhodeIslandStay() {

        Homepage homepage = new Homepage();
        String destination = "Rhode Island";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(37);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testSouthCarolinaStay() {

        Homepage homepage = new Homepage();
        String destination = "South Carolina";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(38);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testSouthDakotaStay() {

        Homepage homepage = new Homepage();
        String destination = "South Dakota";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(39);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testTennesseeStay() {

        Homepage homepage = new Homepage();
        String destination = "Tennessee";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(40);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testTexasStay() {

        Homepage homepage = new Homepage();
        String destination = "Texas";
        homepage.typeInSearchBar(destination);
        homepage.selectSecondSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(41);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testUtahStay() {

        Homepage homepage = new Homepage();
        String destination = "Utah";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(42);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testVermontStay() {

        Homepage homepage = new Homepage();
        String destination = "Vermont";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(43);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testVirginiaStay() {

        Homepage homepage = new Homepage();
        String destination = "Virginia";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(44);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testWashingtonStay() {

        Homepage homepage = new Homepage();
        String destination = "Washington";
        homepage.typeInSearchBar(destination);
        homepage.selectFourthSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(45);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testWestVirginiaStay() {

        Homepage homepage = new Homepage();
        String destination = "West Virginia";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(46);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testWisconsinStay() {

        Homepage homepage = new Homepage();
        String destination = "Wisconsin";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(47);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testWyomingStay() {

        Homepage homepage = new Homepage();
        String destination = "Wyoming";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(48);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void testMarylandStay() {

        Homepage homepage = new Homepage();
        String destination = "Maryland";
        homepage.typeInSearchBar(destination);
        homepage.selectSuggestion();
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
        String expectedResult = excel.readStringList("Locations").get(49);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
