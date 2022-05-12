package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class Homepage extends SystemBar {
    @FindBy(xpath="(//a href[Women= 'sf--with-ul']")
            public WebElement womenButton;

    @FindBy(xpath="//*id='block_top_menu']/ul/li[2]/a")
    public WebElement dressesButton;

    @FindBy (xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    public WebElement signInButton;

    @FindBy(xpath= "//*[@id='homeslider']/li[3]/div/p[2]/button")
    public WebElement shopNowButton;

    @FindBy(xpath="//*[@id='htmlcontent_top']/ul/li[1]/a/img")
    public WebElement daysSale;

    @FindBy(xpath = "//*[@id='htmlcontent_top']/ul/li[2]/a/img")
    public WebElement summerCollection;

    @FindBy (xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    public WebElement signIn;

    @FindBy(xpath="//*[@id='email_create']")
    public WebElement emailAddress;

    @FindBy(xpath="//*[@id='SubmitCreate']/span")
    public WebElement createAnAccount;

    @FindBy(xpath ="//*[@id='header']/div[1]/div/div/a/img")
    public WebElement getSavingsNow;

    @FindBy(xpath="//*[@id='header_logo']/a/img")
    public WebElement yourLogo;

    @FindBy(xpath = "//*[@id='htmlcontent_home']/ul/li[1]/a/img")
    public WebElement topTrends;

    public  void clickWomenButton() {
        clickOnElement(womenButton);
    }
    public void clickDressesButton (){
        clickOnElement(dressesButton);

    }
    public void signInButton (){
        clickOnElement(signInButton);

    }
    public void clickShopNowButton(){
        clickOnElement(shopNowButton);

    }
    public void clickDaysSale(){
        clickOnElement(daysSale);
    }
    public void clickSummerCollection(){
        clickOnElement(summerCollection);
    }
    public void clickAddToCart(){
        clickOnElement(addToCart);
    }
    public void clickEmailAddress(){
        clickOnElement(emailAddress);
    }
    public void clickCreateAnAccount(){
        clickOnElement(createAnAccount);
    }
    public void clickGetSavingsNow(){
        clickOnElement(getSavingsNow);
    }
    public void clickYourLogo(){
        clickOnElement(yourLogo);
    }
    public void clickTopTrends(){
        clickOnElement(topTrends);
    }
}
