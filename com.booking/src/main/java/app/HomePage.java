package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//*[@id='app-header']/header/nav[2]/div/ul/li[2]/a")
    public WebElement clickFlights;

    @FindBy(xpath="//*[@id='root']/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/span/div/div/input")
    public WebElement clickWhereTo;

    @FindBy(xpath="//*[@id='b2carsPage']/header/nav[2]/ul/li[4]/a/span[2]")
    public WebElement clickCarRentals;

    @FindBy(xpath="//*[@id='b2carsPage']/header/nav[1]/div[2]/div[5]/a")
    public WebElement clickRegister;

    @FindBy(xpath="//*[@id='username']")
    public WebElement enterEmailAddress;

    @FindBy(xpath = "//*[@id='b2carsPage']/header/nav[2]/ul/li[5]/a/span[2]")
    public WebElement clickAttractions;
    
    @FindBy(xpath = "//*[@id='b2carsPage']/header/nav[2]/ul/li[6]/a/span[2]")
    public static WebElement clickAirportTaxis;
    
    @FindBy(xpath="//*[@id='b2indexPage']/header/nav[1]/div[2]/div[1]/button/span/span[1]")
    public static WebElement clickUSDCurrency;
    
    @FindBy(xpath ="//*[@id='getaway_cta']")
    public WebElement clickExploreDeals;

    @FindBy(xpath = "//*[@id='basiclayout']/div[6]/div/ul/li[1]/div/div[1]/img")
    public static WebElement clickHotels;

    @FindBy(xpath="//*[@id='basiclayout']/div[7]/div[2]/ul/li[1]/a/div[1]/img")
    public WebElement clickLasVegas;
    
    @FindBy(xpath="//*[@id='b2indexPage']/div[3]/div[2]/nav/ul/li[1]/button/span")
    public WebElement clickRegions;
    
    @FindBy(xpath = "//*[@id='b2indexPage']/header/nav[1]/div[2]/div[4]/a/span")
    public WebElement clickListYourProperty;
    
    
    public static void clickAirportTaxis() {
    }

    public static void clickExploreDeals() {
    }

    public void clickFlights(){
        clickOnElement(clickFlights);
    }

    public void clickWhereTo() {
        clickOnElement(clickWhereTo);
    }

    public void clickSearchButton() {
        WebElement clickSearchButton;

    }
    public static void clickCarRentals(){
        WebElement clickCarRentals;
    }
    public static void clickRegister(){
        WebElement clickRegister;
    }
    public static void enterEmailAddress(){
        WebElement enterEmailAddress;
    }
    public static void clickAttractions(){
     WebElement clickAttractions;
    }
    public void setClickAirportTaxis(){
        clickOnElement(clickAirportTaxis);
    }
    public static void clickUSDCurrency(){
        clickOnElement(clickUSDCurrency);
    }
    public void ClickExploreDeals(){
        clickOnElement(clickExploreDeals);
    }
    public static void clickHotels(){
        clickOnElement(clickHotels);
    }

    public void clickLasVegas() {
    }
    public void clickRegions(){
        clickOnElement(clickRegions);
    }

    public void clickListYourProperty() {
    }
}
