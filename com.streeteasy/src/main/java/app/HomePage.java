package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//*[@id='aria-hidden-when-modal-open']/div[2]/div[1]/div/div[2]/div/button")
    public WebElement Location;

    @FindBy(xpath = "//*[@id='aria-hidden-when-modal-open']/div[2]/div[1]/div/button/i")
    public WebElement SearchButton;

    @FindBy(xpath = "//*[@id='site-menu']/div[1]/div/nav/ul/li[1]/a")
    public WebElement Rent;

    @FindBy(xpath ="//*[@id='site-menu']/div[1]/div/nav/ul/li[2]/a" )
    public WebElement Buy;

    @FindBy(xpath ="//*[@id='site-menu']/div[1]/div/nav/ul/li[3]/a")
    public WebElement Sell;

    @FindBy(xpath = "//*[@id='site-menu']/div[1]/div/nav/ul/li[4]/a")
    public WebElement Buildings;

    @FindBy(xpath = "//*[@id='site-menu']/div[1]/div/nav/ul/li[4]/div/div/div[1]/ul/li[1]/a")
    public WebElement Manhattan;

    @FindBy(xpath = "//*[@id='site-menu']/div[1]/div/nav/ul/li[5]/button")
    public WebElement Resources;

    @FindBy(xpath = "//*[@id='site-menu']/div[1]/div/nav/ul/li[5]/div/div/div[1]/ul[2]/li[1]/a")
    public WebElement MortgageRates;

    @FindBy(xpath = "//*[@id='site-menu']/div[1]/div/nav/ul/li[6]/a")
    public WebElement Blog;

    @FindBy(xpath = "//*[@id='content']/main/div[2]/div[3]/div/section/div/div[1]/div/button")
    public  WebElement ContactUs;

    @FindBy(xpath = "//*[@id='aria-hidden-when-modal-open']/div[2]/section[2]/div[1]/div[1]/div[2]/a")
    public WebElement SearchRentals;

    @FindBy(xpath ="//*[@id='aria-hidden-when-modal-open']/div[2]/section[2]/div[1]/div[2]/div[2]/a")
    public WebElement SearchSales;

    @FindBy(xpath ="//*[@id='aria-hidden-when-modal-open']/div[2]/section[2]/div[1]/div[3]/div[2]/a" )
    public WebElement SeeSellerTools;

    public void clickLocation(){
    clickOnElement(Location);
    }
    public void clickSearchButton(){
        clickOnElement(SearchButton);
    }
    public void clickRent (){
        clickOnElement(Rent);
    }
    public void clickBuy(){
        clickOnElement(Buy);
    }
    public void clickSell(){
        clickOnElement(Sell);
    }
    public void clickBuildings(){
        clickOnElement(Buildings);
    }
    public void clickManhattan(){
        clickOnElement(Manhattan);
    }
    public void clickResources(){
        clickOnElement(Resources);
    }
    public void clickMortgageRates(){
        clickOnElement(MortgageRates);
    }
    public void clickBlog(){
        clickOnElement(Blog);
    }
    public void clickContactUs(){
        clickOnElement(ContactUs);
    }
    public void clickSearchRentals(){
        clickOnElement(SearchRentals);
    }
    public void clickSearchSales(){
        clickOnElement(SearchSales);
    }
    public void clickSeeSellerTools(){
        clickOnElement(SeeSellerTools);
    }
}
