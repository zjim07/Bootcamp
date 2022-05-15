package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

import javax.security.auth.login.LoginContext;

public class HomePage extends SystemBar {

    @FindBy (xpath = "//*[@id='global-top-nav']/header/nav/ul[1]/li[3]/a")
    public WebElement Products;

    @FindBy(xpath = "//*[@id='global-top-nav']/header/nav/ul[1]/li[4]/a")
    public WebElement MemberBenefits;

    @FindBy (xpath = "//*[@id='polymer-page-content']/section/div/header/p/sp-rc-cta//a")
    public WebElement BecomeAMember;

    @FindBy(xpath = "//*[@id='login-cta-container']/a")
    public WebElement Login;

    @FindBy(xpath = "//*[@id='mainContent']/div/div/form/div[3]/a[2]")
    public WebElement CreateAnAccount;

    @FindBy(xpath = "//*[@id='global-top-nav']/header/nav/ul[1]/li[5]/a")
    public WebElement Resources;

    @FindBy(xpath = "//*[@id='global-top-nav']/header/nav/ul[1]/li[6]/a")
    public WebElement About;

    @FindBy(xpath = "//*[@id='main-nav-cta']")
    public WebElement GetStarted;

    @FindBy(xpath = "//*[@id='hp-product-tiles']/li[1]/div")
    public WebElement Invest;

    @FindBy(xpath = "//*[@id='hero-tile-pl']")
    public WebElement PersonalLoans;

    @FindBy(xpath = "//*[@id='hero-tile-ps']")
    public WebElement PrivateStudentLoans;

    @FindBy(xpath="//*[@id='hero-tile-insurance']")
    public WebElement Insurance;


    public void clickProducts(){
        clickOnElement(Products);
    }
    public void clickMemberBenefits(){
        clickOnElement(MemberBenefits);
    }
    public void clickBecomeAMember(){
        clickOnElement(BecomeAMember);
    }
    public void clickLogin(){
        clickOnElement(Login);
    }
    public void clickCreateAnAccount(){
        clickOnElement(CreateAnAccount);
    }
    public void clickResources(){
        clickOnElement(Resources);
    }
    public void clickAbout(){
        clickOnElement(About);
    }
    public void clickGetStarted(){
        clickOnElement(GetStarted);
    }
    public void clickInvest(){
        clickOnElement(Invest);
    }
    public void clickPersonalLoans(){
        clickOnElement(PersonalLoans);
    }
    public void clickPrivateStudentLoans(){
        clickOnElement(PrivateStudentLoans);
    }
    public void clickInsurance(){
        clickOnElement(Insurance);
    }
}
