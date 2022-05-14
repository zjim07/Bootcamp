package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath ="//*[@id='global-nav']/ul/li[11]/a/span/span[1]")
    public WebElement Watch;

    @FindBy(xpath = "//*[@id='global-nav']/ul/li[10]/a/span/span[1]")
    public WebElement Listen;

    @FindBy(xpath = "//*[@id='global-nav']/ul/li[9]/a/span/span[1]")
    public WebElement Fantasy;

    @FindBy (xpath = "//*[@id=/news-feed']/section[1]/section/a/figure/picture/img")
    public WebElement NHLGame;

    @FindBy(xpath = "//*[@id='global-nav']/ul/li[8]/a")
    public WebElement DropDown;

    @FindBy(xpath = "//*[@id='global-nav']/ul/li[8]/div/div/ul[2]/li/div/ul/li[1]/a/span/span[1]")
    public WebElement Andscape;

    @FindBy(xpath = "//*[@id='global-search-input']")
    public WebElement SearchBar;

    @FindBy(xpath="//*[@id='global-nav']/ul/li[1]/a/span/span[1]")
    public WebElement NFL;

    @FindBy(xpath="//*[@id='global-nav']/ul/li[2]/a/span/span[1]")
    public WebElement NBA;

    @FindBy(xpath = "//*[@id='global-nav']/ul/li[3]/a/span/span[1]")
    public WebElement NHL;

    @FindBy(xpath = "//*[@id='global-nav-secondary']/div/ul/li[3]")
    public WebElement Patriots;

    @FindBy (xpath = "//*[@id='main-container']/div/section[3]/article[1]/ul/li[1]/figure/div/a/picture/img")
    public WebElement ListenLive;

    public void clickWatch(){
        clickOnElement(Watch);
    }
    public void clickListen(){
        clickOnElement(Listen);
    }
    public void clickFantasy(){
        clickOnElement(Fantasy);
    }
    public void clickNHLGame(){
        clickOnElement(NHLGame);
    }
    public void clickDropDown(){
        clickOnElement(DropDown);
    }
    public void clickAndscape(){
        clickOnElement(Andscape);
    }
    public void clickSearchBar(){
        clickOnElement(SearchBar);
    }
    public void clickNFL(){
        clickOnElement(NFL);
    }
    public void clickNBA(){
        clickOnElement(NBA);
    }
    public void clickNHL(){
        clickOnElement(NHL);
    }
    public void clickPatriots(){
        clickOnElement(Patriots);
    }
    public void clickListenLive(){
        clickOnElement(ListenLive);
    }
}
