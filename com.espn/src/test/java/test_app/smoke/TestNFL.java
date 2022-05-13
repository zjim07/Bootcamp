package test_app.smoke;

import app.pom.Homepage;
import app.pom.NFLTeamPage;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;
import java.util.List;

public class TestNFL extends BaseTest {

    @Test
    public void testBuffaloBillsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Buffalo Bills")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(0).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testMiamiDolphinsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Miami Dolphins")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(1).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testNewEnglandPatriotsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("New England Patriots")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(2).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testNewYorkJetsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("New York Jets")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(3).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testBaltimoreRavensLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Baltimore Ravens")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(4).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testCincinnatiBengalsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Cincinnati Bengals")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(5).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testClevelandBrownsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Cleveland Browns")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(6).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testPittsburghSteelersLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Pittsburgh Steelers")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(7).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testHoustonTexansLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Houston Texans")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(8).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testIndianapolisColtsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Indianapolis Colts")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(9).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testJacksonvilleJaguarsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Jacksonville Jaguars")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(10).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testTennesseeTitansLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Tennessee Titans")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(11).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testDenverBroncosLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Denver Broncos")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(12).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testKansasCityChiefsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Kansas City Chiefs")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(13).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testLasVegasRaidersLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Las Vegas Raiders")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(14).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testLosAngelesChargersLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Los Angeles Chargers")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(15).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testDallasCowboysLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Dallas Cowboys")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(16).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testNewYorkGiantsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("New York Giants")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(17).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testPhiladelphiaEaglesLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Philadelphia Eagles")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(18).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testWashingtonCommandersLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Washington Commanders")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(19).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testChicagoBearsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Chicago Bears")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(20).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testDetroitLionsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Detroit Lions")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(21).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testGreenBayPackersLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Green Bay Packers")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(22).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testMinnesotaVikingsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Minnesota Vikings")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(23).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testAtlantaFalconsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Atlanta Falcons")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(24).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testCarolinaPanthersLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Carolina Panthers")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(25).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testNewOrleansSaintsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("New Orleans Saints")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(26).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testTampaBayBuccaneersLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Tampa Bay Buccaneers")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(27).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testArizonaCardinalsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Arizona Cardinals")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(28).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testLosAngelesRamsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Los Angeles Rams")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(29).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testSanFrancisco49ersLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("San Francisco 49ers")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(30).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }

    @Test
    public void testSeattleSeahawksLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();
        NFLTeamPage nflTeamPage = new NFLTeamPage();

        try {
            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Seattle Seahawks")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        String actualResults = nflTeamPage.nflTeamName.getText().replace("\n", " ").toLowerCase();
        System.out.println("ACTUAL: " + actualResults);
        String expectedResults = excel.readStringList("NFLTeams").get(31).toLowerCase();
        System.out.println("EXPECTED: " + expectedResults);

        Assert.assertEquals(actualResults, expectedResults);

    }





}
