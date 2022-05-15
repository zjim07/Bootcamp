package test_app.smoke;

import app.pom.UnitedStatesMarket;
import app.shared.Homepage;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUnitedStatesMarketPage extends BasePage {

    @Test
    public void testDOWRates(){
        Homepage homepage = new Homepage();
        UnitedStatesMarket unitedStatesMarket = homepage.closePopUpToViewUSMarket();
        unitedStatesMarket.selectUSMarket();
        unitedStatesMarket.hoverDOW();
        unitedStatesMarket.clickDOW();
        unitedStatesMarket.hoverMarketGraph();
        WebElement marketGraphs = driver.findElement(By.xpath("(//*[local-name()='svg' and @version='1.1'])[3]"));

        int getTopLeftY = ((marketGraphs.getSize().getHeight())/2) - marketGraphs.getSize().getHeight();
        int getTopLeftX = ((marketGraphs.getSize().getWidth())/2) - marketGraphs.getSize().getWidth();

        Actions navigateDowGraph = new Actions(driver);


        for (int i = 0; i < 4; i++) {
            navigateDowGraph.moveToElement(marketGraphs, getTopLeftY, getTopLeftX).perform();
            String data = driver.findElement(By.xpath("//*[@id=\"highcharts-0\"]/div")).getText();
            System.out.println(data);
        }


        Assert.assertTrue(isElementVisible(unitedStatesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(unitedStatesMarket.dataSelectionConfirmation),
                excel.readStringList("USMarket").get(0));
    }
    @Test
    public void testSP500Rates(){
        Homepage homepage = new Homepage();
        UnitedStatesMarket unitedStatesMarket = homepage.closePopUpToViewUSMarket();
        unitedStatesMarket.selectUSMarket();
        unitedStatesMarket.hoverSP500();
        unitedStatesMarket.clickSP500();
        unitedStatesMarket.hoverMarketGraph();
        WebElement marketGraphs = driver.findElement(By.xpath("(//*[local-name()='svg' and @version='1.1'])[3]"));

        int getTopLeftY = ((marketGraphs.getSize().getHeight())/2) - marketGraphs.getSize().getHeight();
        int getTopLeftX = ((marketGraphs.getSize().getWidth())/2) - marketGraphs.getSize().getWidth();

        Actions navigateSP500Graph = new Actions(driver);

        for (int i = 0; i < 10; i++) {
            navigateSP500Graph.moveToElement(marketGraphs, getTopLeftY, getTopLeftX).perform();
            String data = driver.findElement(By.xpath("//*[@id=\"highcharts-0\"]/div")).getText();
            System.out.println(data);


        }
        Assert.assertTrue(isElementVisible(unitedStatesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(unitedStatesMarket.dataSelectionConfirmation),
                excel.readStringList("USMarket").get(1));
    }
    @Test
    public void testNasdaqRates(){
        Homepage homepage = new Homepage();
        UnitedStatesMarket unitedStatesMarket = homepage.closePopUpToViewUSMarket();
        unitedStatesMarket.selectUSMarket();
        unitedStatesMarket.hoverNasdaq();
        unitedStatesMarket.clickNasdaq();
        unitedStatesMarket.hoverMarketGraph();
        WebElement marketGraphs = driver.findElement(By.xpath("(//*[local-name()='svg' and @version='1.1'])[3]"));

        int getTopLeftY = ((marketGraphs.getSize().getHeight())/2) - marketGraphs.getSize().getHeight();
        int getTopLeftX = ((marketGraphs.getSize().getWidth())/2) - marketGraphs.getSize().getWidth();

        Actions navigateNasdaqGraph = new Actions(driver);


        for (int i = 0; i < 10; i++) {
            navigateNasdaqGraph.moveToElement(marketGraphs, getTopLeftY, getTopLeftX).perform();
            String data = driver.findElement(By.xpath("//*[@id=\"highcharts-0\"]/div")).getText();
            System.out.println(data);
        }


        Assert.assertTrue(isElementVisible(unitedStatesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(unitedStatesMarket.dataSelectionConfirmation),
                excel.readStringList("USMarket").get(2));
    }
    @Test
    public void testGlobalDowRates(){
        Homepage homepage = new Homepage();
        UnitedStatesMarket unitedStatesMarket = homepage.closePopUpToViewUSMarket();
        unitedStatesMarket.selectUSMarket();
        unitedStatesMarket.hoverGlobalDow();
        unitedStatesMarket.clickGlobalDow();
        unitedStatesMarket.hoverMarketGraph();
        WebElement marketGraphs = driver.findElement(By.xpath("(//*[local-name()='svg' and @version='1.1'])[3]"));

        int getTopLeftY = ((marketGraphs.getSize().getHeight())/2) - marketGraphs.getSize().getHeight();
        int getTopLeftX = ((marketGraphs.getSize().getWidth())/2) - marketGraphs.getSize().getWidth();

        Actions navigateGlobalDowGraph = new Actions(driver);


        for (int i = 0; i < 10; i++) {
            navigateGlobalDowGraph.moveToElement(marketGraphs, getTopLeftY, getTopLeftX).perform();
            String data = driver.findElement(By.xpath("//*[@id=\"highcharts-0\"]/div")).getText();
            System.out.println(data);
        }


        Assert.assertTrue(isElementVisible(unitedStatesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(unitedStatesMarket.dataSelectionConfirmation),
                excel.readStringList("USMarket").get(3));
    }
    @Test
    public void testGoldRates(){
        Homepage homepage = new Homepage();
        UnitedStatesMarket unitedStatesMarket = homepage.closePopUpToViewUSMarket();
        unitedStatesMarket.selectUSMarket();
        unitedStatesMarket.hoverGoldPrices();
        unitedStatesMarket.clickGoldPrices();
        unitedStatesMarket.hoverMarketGraph();
        WebElement marketGraphs = driver.findElement(By.xpath("(//*[local-name()='svg' and @version='1.1'])[3]"));

        int getTopLeftY = ((marketGraphs.getSize().getHeight())/2) - marketGraphs.getSize().getHeight();
        int getTopLeftX = ((marketGraphs.getSize().getWidth())/2) - marketGraphs.getSize().getWidth();

        Actions navigateGoldGraph = new Actions(driver);


        for (int i = 0; i < 10; i++) {
            navigateGoldGraph.moveToElement(marketGraphs, getTopLeftY, getTopLeftX).perform();
            String data = driver.findElement(By.xpath("//*[@id=\"highcharts-0\"]/div")).getText();
            System.out.println(data);


        }
        Assert.assertTrue(isElementVisible(unitedStatesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(unitedStatesMarket.dataSelectionConfirmation),
                excel.readStringList("USMarket").get(4));
    }
    @Test
    public void testOilRates(){
        Homepage homepage = new Homepage();
        UnitedStatesMarket unitedStatesMarket = homepage.closePopUpToViewUSMarket();
        unitedStatesMarket.selectUSMarket();
        unitedStatesMarket.hoverOilPrices();
        unitedStatesMarket.clickOilPrices();
        unitedStatesMarket.hoverMarketGraph();
        WebElement marketGraphs = driver.findElement(By.xpath("(//*[local-name()='svg' and @version='1.1'])[3]"));

        int getTopLeftY = ((marketGraphs.getSize().getHeight())/2) - marketGraphs.getSize().getHeight();
        int getTopLeftX = ((marketGraphs.getSize().getWidth())/2) - marketGraphs.getSize().getWidth();

        Actions navigateOilGraph = new Actions(driver);


        for (int i = 0; i < 10; i++) {
            navigateOilGraph.moveToElement(marketGraphs, getTopLeftY, getTopLeftX).perform();
            String data = driver.findElement(By.xpath("//*[@id=\"highcharts-0\"]/div")).getText();
            System.out.println(data);
        }


        Assert.assertTrue(isElementVisible(unitedStatesMarket.dataSelectionConfirmation));
        Assert.assertEquals(getElementText(unitedStatesMarket.dataSelectionConfirmation),
                excel.readStringList("USMarket").get(5));
    }
}
