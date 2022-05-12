package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class Homepage extends SystemBar {
    @FindBy(xpath="//svg[@xmlns='viewBox')[2]")
    public WebElement dealsLink;

    @FindBy(xpath ="//*[@id='z1-searchfield']")
    public WebElement searchButton;

    @FindBy(xpath= "//*[@id='HEADBAND01']/span/a/div/svg")
    public WebElement phonesAndDevices;

    @FindBy(xpath="(//*[@id='HEADBAND02']/span/a")
            public WebElement wireless;

    @FindBy(xpath="//*[@id='MOSAIC-GROUP-2-CTAS-container']/a/span")
    public WebElement shopNow;

    @FindBy(xpath="//*[@id='HERO_PANEL24']/div/div[2]/div/div/span/a")
    public WebElement learnMore;

    @FindBy(xpath="//*[@id='PRODUCT_PANEL6valueProps']/div[1]/div/span/a")
            public WebElement findAStore;

    @FindBy(xpath="//*id='DYNAMIC_COMPONENT23-container']/div[4]/div[1]/input")
    public WebElement signMeUp;

    @FindBy(xpath="//*[@id='z1-support']/a/span")
    public WebElement wirelessButton;

    @FindBy(xpath ="//*[@id=z1-profile-text")
    public WebElement accountDropDown;

    @FindBy(xpath = "//*[@id='z1-support']/a/span")
    public WebElement supportButton;

    public Homepage(){
        PageFactory.initElements(driver, this);

    }

    public void clickDeals() {
        clickOnElement(dealsLink);

        }
    public void clickSearchButton() {
        clickOnElement(searchButton);

    }
    public void clickPhonesAndDevices(){
        clickOnElement(phonesAndDevices);
    }

    public void clickWireless() {
        clickOnElement(wireless);

    }
    public void clickShopNow(){
        clickOnElement(shopNow);

    }
    public void clickLearnMore(){
        clickOnElement(learnMore);

    }
    public void clickFindAStore(){
        clickOnElement(findAStore);

    }
    public void clickSignMeUp(){
        clickOnElement(signMeUp);

    }
    public void clickWirelessButton(){
        clickOnElement(wirelessButton);

    }
    public void clickAccountDropDown(){
        clickOnElement(accountDropDown);

    }
    public void clickSupportButton(){
        clickOnElement(supportButton);

    }
}

