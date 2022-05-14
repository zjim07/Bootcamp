package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//*[@id='nav__menu']/li[3]/a")
    public WebElement Markets;

    @FindBy(xpath = "/html/body/section[1]/div[2]/div/div[2]/ul/li[7]/a")
    public WebElement Crypto;

    @FindBy(xpath="/html/body/section[1]/div[2]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/a")
    public WebElement Dow;

    @FindBy(xpath="/html/body/section[1]/nav/header/div[3]/label")
    public WebElement AccountSettings;

    @FindBy(xpath = "/html/body/section[1]/nav/header/div[3]/ul/li[3]/a")
    public WebElement SignUp;

    @FindBy(xpath="//*[@id='nav__menu']/li[4]/a")
    public WebElement Investing;

    @FindBy(xpath="//*[@id='maincontent']/div[1]/div[1]/div/div[2]/div[1]/div/h3/a")
    public WebElement ElonMuskTwitter;

    @FindBy(xpath = "//*[@id='maincontent']/div[1]/div[1]/div/div[1]/div[1]/div/h3/a")
    public WebElement StockMarketCorrection;

    @FindBy(xpath="//*[@id='nav__menu']/li[5]/a")
    public WebElement PersonalFinance;

    @FindBy(xpath="//*[@id='nav__menu']/li[6]/a")
    public WebElement Economy;

    @FindBy(xpath="/html/body/section[1]/div[2]/div/div[2]/div/div[1]/table/tbody/tr[3]/td[2]/a")
    public WebElement Nasdaq;

    @FindBy(xpath="//*[@id='nav__menu']/li[7]/a")
    public WebElement Retirement;


    public void clickMarkets(){
        clickOnElement(Markets);
    }
    public void clickCrypto(){
        clickOnElement(Crypto);
    }
    public void clickDow(){
        clickOnElement(Dow);
    }
    public void clickAccountSettings(){
        clickOnElement(AccountSettings);
    }
    public void clickSignUp(){
        clickOnElement(SignUp);
    }
    public void clickInvesting(){
        clickOnElement(Investing);
    }
    public void clickElonMuskTwitter(){
        clickOnElement(ElonMuskTwitter);
    }
    public void clickStockMarketCorrection(){
        clickOnElement(StockMarketCorrection);
    }
    public void clickPersonalFinance(){
        clickOnElement(PersonalFinance);
    }
    public void clickEconomy(){
        clickOnElement(Economy);
    }
    public void clickNasdaq(){
        clickOnElement(Nasdaq);
    }
    public void clickRetirement(){
        clickOnElement(Retirement);
    }
}
