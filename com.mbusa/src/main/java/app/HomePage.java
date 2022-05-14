package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy (xpath = "/html/body/div[1]/header/nav/div[2]/ul[1]/li[1]/button")
    public WebElement Vehicles;

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul[1]/li[2]/button")
    public WebElement Shopping;

    @FindBy(xpath="/html/body/div[1]/header/nav/div[2]/ul[1]/li[3]/button")
    public WebElement Inventory;

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul[2]/li[1]/button")
    public WebElement FindADealer;

    @FindBy(xpath="//*[@id='I358iqnfg96nw']")
    public WebElement ZipCode;

    @FindBy(xpath="/html/body/div[1]/header/nav/ul/li[4]/div/div/ul/li/div/section/div/div/div[2]/button")
    public WebElement SearchButton;

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul[2]/li[2]/button/span")
    public WebElement MyAccount;

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[5]/div/div/ul/li[2]/section/div/div/div[2]/button")
    public WebElement Register;

    @FindBy(xpath = "//*[@id='_8da56ae2-f3e2-4968-91c3-fefa112245ad']/div/div/section/div/div[3]/a[1]")
    public WebElement ExploreTheEQS;

    @FindBy(xpath = "//*[@id='_c5427514-9b60-4b68-b8e9-efa73b1bfdc']/div/div/section/div/div[3]/a[1]")
    public WebElement ExploreTheCClass;

    @FindBy(xpath = "//*[@id='content']/div[5]/section/div[2]/div/div/div[1]/div/a/div/div/p")
    public WebElement AllVehicles;

    @FindBy(xpath="//*[@id='content']/div[5]/section/div[2]/div/div/div[2]/div/a/div")
    public WebElement BuildYourOwn;

    @FindBy(xpath = "//*[@id='content']/div[5]/section/div[2]/div/div/div[3]/div/a/div")
    public WebElement SpecialOffers;

    @FindBy(xpath = "//*[@id='footer-accordionItem_I359ntxkc39ng']/ul/li[4]/a")
    public WebElement MaintenanceSupport;

    public void clickVehicles(){
        clickOnElement(Vehicles);
    }
    public void clickShopping(){
        clickOnElement(Shopping);
    }
    public void clickInventory(){
        clickOnElement(Inventory);
    }
    public void clickFindADealer(){
        clickOnElement(FindADealer);
    }
    public void enterZipcode(){
        clickOnElement(ZipCode);
    }
    public void clickSearchButton(){
        clickOnElement(SearchButton);
    }
    public void clickMyAccount(){
        clickOnElement(MyAccount);
    }
    public void clickRegister(){
        clickOnElement(Register);
    }
    public void clickExploreTheEQS(){
        clickOnElement(ExploreTheEQS);
    }
    public void clickExploreTheCClass(){
        clickOnElement(ExploreTheCClass);
    }
    public void clickAllVehicles (){
        clickOnElement(AllVehicles);
    }
    public void clickBuildYourOwn(){
        clickOnElement(BuildYourOwn);
    }
    public void clickSpecialOffers(){
        clickOnElement(SpecialOffers);
    }
    public void clickMaintenanceSupport(){
        clickOnElement(MaintenanceSupport);
    }
}
