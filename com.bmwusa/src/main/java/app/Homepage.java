package app;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class Homepage extends SystemBar {
    @FindBy(xpath="//*[@id='background-bf35dd3e-a970-4dc8-b1c6-9032752ebb96']/div/div/div")
    public WebElement clickPreOrder;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[4]/div/div/div[1]/form/div/input")
    public WebElement clickSearchButton;

    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[4]/div/nav/ul/li[1]/button/span")
    public WebElement clickModels;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[4]/div/nav/ul/li[2]/a")
    public WebElement clickBuildYourOwn;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[4]/div/nav/ul/li[3]/button/span")
    public WebElement hoverShopping;

    @FindBy(xpath="//*[@id='zip_code']")
    public WebElement enterZipcode;

    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[4]/div/nav/ul/li[4]/a")
    public WebElement clickBMWCertified;

    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[4]/div/nav/ul/li[5]/button/span")
    public WebElement hoverOwners;

    @FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[5]/div/div[1]/div/div[2]/div[1]/a")
    public WebElement clickMyBMW;

    @FindBy(xpath = "//*[@id='wrapper']/div[1]/div/div/div/main/button")
    public WebElement clickRegisterNow;

    @FindBy(xpath = "//*[@id='background-c8e12893-cb3c-49e5-bb52-7a72435d5fff']/div/div[2]/div/div/div/div/div/div/div/div/div[6]/div/section/a")
    public WebElement clickContactDealer;

    @FindBy(xpath = "//*[@id='animation-container-29057f1c-012a-4624-903e-91dc1580ee09']/div/div/div/div/div/div/section/a")
    public WebElement clickStartDesigning;

    @FindBy(xpath = "//*[@id='animation-container-48a68a09-85f7-4363-aad3-46f379ef33e2']/div/div/div/div/div/div/section/a")
    public WebElement clickLearnMore;

    @FindBy(xpath="/html/body/div[2]/div[2]/footer/div[2]/div[1]/div[1]/ul/li[1]/div/a")
    public WebElement clickMyBMWApp;

    public void clickPreOrder() {
    }

    public void clickSearchButton() {
        WebElement clickSearchButton;
    }
    public void clickModels(){
        clickOnElement(clickModels);
    }
    public void clickBuildYourOwn(){
        clickOnElement(clickBuildYourOwn);
    }
    public void hoverShopping(){
        clickOnElement(hoverShopping);
    }
    public void clickBMWCertified(){
        clickOnElement(clickBMWCertified);
    }
    public void clickMyBMW(){
        clickOnElement(clickMyBMW);
    }
    public void ClickRegisterNow(){
        clickOnElement(clickRegisterNow);
    }

    public void clickRegisterNow() {
    }
    public void clickContactDealer(){
        clickOnElement(clickContactDealer);
    }
    public void clickStartDesigning(){
        clickOnElement(clickStartDesigning);
    }
    public void clickLearnMore(){
        clickOnElement(clickLearnMore);
    }
    public void clickMyBMWApp(){
        clickOnElement(clickMyBMWApp);
    }
}
