package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {

    @FindBy(xpath = "//*[@id='primary-navigation']/div/button/svg")
    public WebElement MoreTravel;

    @FindBy(xpath = "//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[2]/ul/li[1]/div/a")
    public WebElement About;

    @FindBy(xpath = "//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[3]/ul/li[1]/div/a")
    public WebElement USATravelGuide;

    @FindBy(xpath="//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[3]/ul/li[2]/div/a")
    public WebElement HotelsInUSA;

    @FindBy (xpath = "//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[3]/ul/li[5]/div/a")
    public WebElement DomesticFlights;

    @FindBy(xpath = "//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[3]/ul/li[3]/div/a")
    public WebElement VacationRentals;

    @FindBy(xpath = "//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[3]/ul/li[6]/div/a")
    public WebElement CarRentals;

    @FindBy(xpath="//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[5]/ul/li[1]/div/a")
    public WebElement Support;

    @FindBy(xpath="//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[5]/ul/li[3]/div/a")
    public WebElement CancelYourFlight;

    @FindBy(xpath="//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[5]/ul/li[5]/div/a")
    public WebElement ExpediaCoupon;

    @FindBy(xpath="//*[@id='app-layer-base']/div[1]/div[2]/div[2]/footer/div/div/ul[1]/li[3]/ul/li[4]/div/a")
    public WebElement VacationPackages;


    public void clickMoreTravel(){
        clickOnElement(MoreTravel);
    }
    public void clickAbout(){
        clickOnElement(About);
    }
    public void clickUSATravelGuide(){
        clickOnElement(USATravelGuide);
    }
    public void clickHotelsInUSA(){
        clickOnElement(HotelsInUSA);
    }
    public void clickDomesticFlights(){
        clickOnElement(DomesticFlights);
    }
    public void clickVacationRentals(){
        clickOnElement(VacationRentals);
    }
    public void clickCarRentals(){
        clickOnElement(CarRentals);
    }
    public void clickSupport (){
        clickOnElement(Support);
    }
    public void clickCancelYourFlight(){
        clickOnElement(CancelYourFlight);
    }
    public void clickExpediaCoupon(){
        clickOnElement(ExpediaCoupon);
    }
    public void clickVacationPackages(){
        clickOnElement(VacationPackages);
    }
}
