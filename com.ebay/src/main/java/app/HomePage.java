package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {
    
    @FindBy(xpath = "//*[@id='gh-ac']")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@id=gh-p-1']/a")
    public WebElement dailyDeals;

    @FindBy (xpath = "//*[@id='s0-0-32-4-0-0[0]-2-match-media-0-ebay-carousel-list']/li[2]/div/a/div[2]/div/div/div[2]/div[2]")
    public WebElement LetsRide;

    @FindBy (xpath="//*[@id='gh-eb-My']/div/a[1]")
    public WebElement MyEbay;

    @FindBy(xpath = "//*[@id='gh-p-2']/a")
    public WebElement Sell;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[2]/a")
    public WebElement Saved;

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[3]/a")
    public WebElement Motors;

    @FindBy(xpath="//*[@id='rtm_list2']/div[2]/div/a/div[2]")
    public WebElement HowToDonate;

    @FindBy(xpath = "//*[@id='personalized_events1']/div[1]/div[2]/a/div[2]")
    public WebElement ShopNow;

    @FindBy(xpath = "//*[@id='ads_combo3']/a/div[2]/div[2]/div[3]/div[1]")
    public WebElement GetYourThing;

    @FindBy (xpath="//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[1]/a")
    public WebElement Registration;

    public void searchBar(){
        clickOnElement(searchBar);
    }

    public void clickSearchBar() {
    }
    public void clickDailyDeals(){

    }
    public void clickLetsRide(){

    }
    public void clickMyEbay(){

    }
    public void clickSell(){
        WebElement clickSell;
    }
    public void clickSaved(){
        clickOnElement(Saved);
    }
    public void clickMotors(){
        clickOnElement(Motors);
    }
    public void clickHowToDonate(){
        clickOnElement(HowToDonate);
    }
    public void clickShopNow(){
        clickOnElement(ShopNow);
    }
    public void clickGetYourThing(){
        clickOnElement(GetYourThing);
    }
    public void clickRegistration(){
        clickOnElement(Registration);
    }
}
