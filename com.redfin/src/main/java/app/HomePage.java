package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy (xpath = "//*[@id='search-box-input']")
    public WebElement SearchBar;

    @FindBy(xpath = "//*[@id='tabContentId0']/div/div/form/div[1]/button/svg")
    public WebElement SearchButton;

    @FindBy(xpath="//*[@id='homepageTabContainer']/div/div/div[1]/div[2]/a")
    public WebElement Sell;

    @FindBy(xpath = "//*[@id='homepageTabContainer']/div/div/div[1]/div[3]/a")
    public WebElement Rent;

    @FindBy(xpath = "//*[@id='tabContentId2']/div/div/form/div[1]/button/svg/svg/g/path")
    public WebElement Search;

    @FindBy(xpath = "//*[@id='header-content']/header[2]/div[2]/div[3]/a")
    public WebElement SellDropDown;

    @FindBy(xpath = "//*[@id='header-content']/header[2]/div[2]/div[2]/a")
    public WebElement Buy;

    @FindBy(xpath = "//*[@id='header-content']/header[2]/div[2]/div[4]/a")
    public WebElement Mortgage;

    @FindBy(xpath = "//*[@id='topMenuRealEstateAgentsLink']/a")
    public WebElement RealEstateAgents;

    @FindBy(xpath = "//*[@id='header-content']/header[2]/div[2]/a[2]")
    public WebElement Feed;

    @FindBy(xpath = "//*[@id='header-content']/header[2]/div[2]/div[7]/button/span")
    public WebElement SignUp;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/form/div/div[1]/div/span/span/div/input")
    public WebElement EmailAddress;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/form/div/div[1]/button/span")
    public WebElement ContinueWithEmail;

    @FindBy(xpath = "//*[@id='content']/div[8]/div[7]/section/div/div[2]/div/div[3]/a/span")
    public WebElement SeeHousingNews;

    @FindBy(xpath = "//*[@id='content']/div[19]/div/div/div[1]/a[1]/span")
    public WebElement BeARedfinAgent;

    @FindBy(xpath = "//*[@id='content']/div[8]/div[9]/section/div/div[1]/ul/li[5]/a")
    public WebElement AshburnRealEstate;

    public void clickSearchBar(){
        clickOnElement(SearchBar);
    }
    public void clickSearchButton(){
        clickOnElement(SearchButton);
    }
    public void clickSell (){
        clickOnElement(Sell);
    }
    public void clickRent(){
        clickOnElement(Rent);
    }
    public void pressSearch(){
        clickOnElement(Search);
    }
    public void Search() {
    }
    public void clickSellDropDown(){
        clickOnElement(SellDropDown);
    }
    public void clickBuy(){
        clickOnElement(Buy);
    }
    public void clickMortgage(){
        clickOnElement(Mortgage);
    }

    public void clickRealEstateAgents(){
        clickOnElement(RealEstateAgents);
    }
    public void clickFeed(){
        clickOnElement(Feed);
    }
    public void clickSignUp(){
        clickOnElement(SignUp);
    }
    public void enterEmailAddress(){
        clickOnElement(EmailAddress);
    }
    public void clickContinueWithEmail(){
        clickOnElement(ContinueWithEmail);
    }
    public void clickSeeHousingNews(){
        clickOnElement(SeeHousingNews);
    }
    public void clickBeARedfinAgent(){
        clickOnElement(BeARedfinAgent);
    }
    public void clickAshburnRealEstate(){
        clickOnElement(AshburnRealEstate);
    }
}


