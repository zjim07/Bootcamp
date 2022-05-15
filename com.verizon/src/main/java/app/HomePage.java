package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//*[@id='gnav20-Shop-L1']")
    public WebElement ShopVerizon;

    @FindBy(xpath = "//*[@id='gnav20-sign-id']/span/span")
    public WebElement SignIn;

    @FindBy(xpath = "//*[@id='gnav20-sign-id-list-item-3']")
    public WebElement Register;

    @FindBy(xpath = "//*[@id='gnav20-search-icon']")
    public WebElement SearchIcon;

    @FindBy(xpath = "//*[@id='search_box_gnav_input']")
    public WebElement SearchBar;

    @FindBy(xpath="//*[@id='gnav20_Why_Verizon-L1']")
    public WebElement WhyVerizon;

    @FindBy (xpath = "//*[@id='gnav20-Support-L1']")
    public WebElement Support;

    @FindBy (xpath="//*[@id='vz-gh20']/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/div/a")
    public WebElement Stores;

    @FindBy (xpath = "/html/body/div[2]/main/div/div[2]/div/section/div/div")
    public WebElement ShopNow;

    @FindBy (xpath = "/html/body/div[2]/main/div/div[3]/div/section/div/div/div[2]/div/div/div/div[1]/div/a/div")
    public WebElement Iphone13;

    @FindBy (xpath = "/html/body/div[2]/main/div/div[5]/div/section/div/div/div/div/div/div/div[1]/div/a/div")
    public WebElement ShopPhones;

    @FindBy (xpath = "/html/body/div[2]/main/div/div[5]/div/section/div/div/div/div/div/div/div[2]/div/a/div")
    public WebElement ShopWatches;

    @FindBy (xpath ="/html/body/div[2]/main/div/div[5]/div/section/div/div/div/div/div/div/div[3]/div/a/div")
    public WebElement ShopTablets;

    public void clickShopVerizon(){
        clickOnElement(ShopVerizon);
    }
    public void clickSignIn(){
        clickOnElement(SignIn);
    }
    public void clickRegister(){
        clickOnElement(Register);
    }
    public void clickSearchIcon(){
        clickOnElement(SearchIcon);
    }
    public void clickSearchBar(){
        clickOnElement(SearchBar);
    }
    public void clickWhyVerizon(){
        clickOnElement(WhyVerizon);
    }
    public void clickSupport(){
        clickOnElement(Support);
    }
    public void clickStores(){
        clickOnElement(Stores);
    }
    public void clickShopNow(){
        clickOnElement(ShopNow);
    }
    public void clickIphone13(){
        clickOnElement(Iphone13);
    }
    public void clickShopPhones(){
        clickOnElement(ShopPhones);
    }
    public void clickShopWatches(){
        clickOnElement(ShopWatches);
    }
    public void clickShopTablets(){
        clickOnElement(ShopTablets);
    }
}
