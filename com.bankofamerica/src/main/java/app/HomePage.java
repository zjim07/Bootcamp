package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {
    @FindBy(xpath ="//*id='navChecking']/span[3]")
    public WebElement Checking;

    @FindBy(xpath = "//*[@id='navSavings']/span[3]")
    public WebElement Savings;

    @FindBy(xpath="//*[@id='navSavingsOnlineBanking")
            public WebElement onlineBanking;

  @FindBy(xpath = "//*[@id='navCreditCards']/span[3]")
  public WebElement creditCards;

  @FindBy(xpath = "//*[@id='btnCompareCreditCards']")
  public WebElement shopAllCreditCards;

  @FindBy(xpath="//*[@id='navHomeLoans']/span[3]")
  public WebElement homeLoans;

  @FindBy(xpath="//*id='mortgages")
  public WebElement mortgages;

  @FindBy(xpath = "//*[@id='navAutoLoans']/span[3]")
  public WebElement autoLoans;

  @FindBy(xpath ="//*[@id='EWT1L6VN']")
  public WebElement checkApplicationStatus;

  @FindBy(xpath="//*[@id='navInvesting']/span[3]")
  public WebElement investing;

  @FindBy(xpath="//*[@id='btnInvesting']")
  public WebElement getStarted;

  @FindBy(xpath="//*[@id='navBetterMoneyHabits']/span[3]")
          public WebElement betterMoneyHabits;

  @FindBy(xpath = "//*[@id='bmhCredit']/span")
  public WebElement credit;

  @FindBy(xpath = "//*[@id='DCTASZ6M']/div[2]/div[4]")
  public WebElement openAccount;

  @FindBy(xpath="//*[@id='exploreMobileAppCta']")
  public WebElement exploreOurApp;

  @FindBy(xpath = "//*[@id='footer_bofa_contactus']")
  public WebElement contactUs;

  @FindBy(xpath = "//*[@id='scheduleApptInvesting']")
  public WebElement scheduleAnAppointment;

  @FindBy(xpath= "//*[@id='NAV_BUSINESS-ADVANTAGE']")
  public WebElement SmallBusiness;

    public void clickChecking() {
        clickOnElement(Checking);
    }
    public void clickSavings (){
        clickOnElement(Savings);
    }
    public void clickOnlineBanking(){
        clickOnElement(onlineBanking);
    }
    public void clickCreditCards(){
        clickOnElement(creditCards);
    }
    public void clickShopAllCreditCards(){
        clickOnElement(shopAllCreditCards);
    }
    public void clickHomeLoans(){
        clickOnElement(homeLoans);
    }
    public void clickMortgages(){
        clickOnElement(mortgages);
    }
    public void clickAutoLoans(){
        clickOnElement(autoLoans);
    }
    public void clickCheckApplicationStatus(){
        clickOnElement(checkApplicationStatus);
    }
    public void clickInvestingButton(){
        clickOnElement(investing);
    }
    public void clickGetStartedButton(){
        clickOnElement(getStarted);
    }
    public void setBetterMoneyHabits(){
        clickOnElement(betterMoneyHabits);
    }
    public void credit(){
        clickOnElement(credit);
    }
    public void openAccount(){
        clickOnElement(openAccount);
    }

    public void clickOpenAccount() {
    }
    public void exploreOurApp(){
        clickOnElement(exploreOurApp);
    }

    public void clickExploreOurApp() {
    }
    public void clickContactUs(){
        clickOnElement(contactUs);
    }
    public void clickScheduleAnAppointment(){
        clickOnElement(scheduleAnAppointment);
    }
    public static void clickSmallBusiness(){
        WebElement smallBusiness;
    }

}
