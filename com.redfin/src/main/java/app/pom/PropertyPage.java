package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage extends SystemBar {

    @FindBy(xpath = "//div[contains(text(), '3D Walkthrough')]")
    public WebElement walkthroughStartButton;

    @FindBy(xpath = "//iframe[@title='virtual-walkthrough']")
    public WebElement iFrameElementVirtualTour;

    @FindBy(xpath = "//canvas[@class='webgl-canvas']")
    public WebElement canvasElement;

    @FindBy(xpath = "//span[@class='icon icon-play']")
    public WebElement playButton;

    @FindBy(xpath = "icon icon-floorplan")
    public WebElement floorPlanButton;

    public void clickFloorPlanButton(){
        clickOnElement(floorPlanButton);
    }

    public void clickPlayButton(){

        try {
            if(playButton.isDisplayed()) {
                Actions a = new Actions(driver);
                a.moveToElement(playButton).click().build().perform();
            } else {
                Actions a = new Actions(driver);
                a.moveToElement(floorPlanButton).click().build().perform();
            }
        } catch(Exception e){

        }
    }

    public void clickCanvas(){
        Actions a = new Actions(driver);
        a.moveToElement(canvasElement).click().build().perform();
    }

    public void clickWalkthroughStartButton(){
        clickOnElement(walkthroughStartButton);
    }

    public PropertyPage(){
        PageFactory.initElements(driver, this);
    }

}
