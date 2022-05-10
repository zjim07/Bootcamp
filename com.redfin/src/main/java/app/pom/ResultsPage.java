package app.pom;

import app.shared.SystemBar;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class ResultsPage extends SystemBar {

    @FindBy(xpath = "//span[@data-content='All filters']")
    public WebElement filterButton;

    @FindBy(xpath = "//span[contains(text(), 'Open House & Tour')]")
    public WebElement tourSection;

    @FindBy(xpath = "(//*[name()=\"svg\" and @class=\"SvgIcon show-more SearchFormSection__svg flex-shrink-0 margin-left-auto\"])[2]")
    public WebElement openTourSection;

    @FindBy(xpath = "(//label[@class='label'])[29]")
    public WebElement button3DFilter;

    @FindBy(xpath = "//*[name()=\"svg\" and @class=\"SvgIcon breadcrumb\"]")
    public WebElement closeExpandedModeButton;

    @FindBy(xpath = "//*[name()=\"svg\" and @class=\"SvgIcon close\"]")
    public WebElement closeOutOfFilters;

//    @FindBy(xpath = "//div[@class='link-and-anchor']")
//    public List<WebElement> homeResults;

    @FindBy(xpath = "//div[@class='HomeCardContainer defaultSplitMapListView']")
    public List<WebElement> homeResults;

//    @FindBy(xpath = "//div[contains(text(), '3D WALKTHROUGH')]")
//    public List<WebElement> home3DResults;

    @FindBy(xpath = "//div[contains(text(), '3D WALKTHROUGH')]//ancestor::div[@class='HomeCardContainer defaultSplitMapListView']")
    public List<WebElement> home3DResults;

    public void closeOutOfExpandedMode(){

        try {
                closeExpandedModeButton.click();

        } catch (Exception e){

        }

    }

    public void selectRandomHomeFromList() throws InterruptedException {
        int maxResults = home3DResults.size();
        System.out.println("MAX RESULTS ARE " + maxResults);
        Thread.sleep(10000);
       // homeResults.get(0);
        Random random = new Random();
        int randomResult = random.nextInt(maxResults);
        home3DResults.get(randomResult).click();

    }

    public void clickCloseOutOfFilters(){
        clickOnElement(closeOutOfFilters);
    }

    public void click3DFilter(){
        webDriverWait.until(ExpectedConditions.visibilityOf(button3DFilter));
        button3DFilter.click();
    }

    public void clickTourSection(){
        jsScrollUntilElementVisible(openTourSection);
        Actions a = new Actions(driver);
        a.moveToElement(openTourSection).click().build().perform();
    }


    public void clickFilterButton(){
        clickOnElement(filterButton);
    }

    public ResultsPage(){
        PageFactory.initElements(driver, this);
    }
}
