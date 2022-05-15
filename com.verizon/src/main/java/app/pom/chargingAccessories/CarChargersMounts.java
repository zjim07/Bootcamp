package app.pom.chargingAccessories;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarChargersMounts extends SystemBar {

    @FindBy(xpath = "//span[@class='TabWrapper-sc-xumbrb-1 dWtESe']")
    public List<WebElement> allFilters;

    @FindBy(xpath = "(//span[@class='TabWrapper-sc-xumbrb-1 dWtESe'])[2]")
    public WebElement the0to25FilterButton;

    @FindBy(xpath = "//div[@class='Tile__Pricing-sc-71g958-10 fClbGb blur']/p")
    public List<WebElement> prices;

    @FindBy(xpath = "//span[@class='StyledTypography-sc-5k55co-0 jXNKUS StyledBody-sc-1s1yqd8-0 ZEszq']")
    public WebElement section;

    public boolean verifyAllFilters() {
        boolean arePricesCorrect = true;

        for(int i = 1; i < allFilters.size(); i++){
            clickOnElement(allFilters.get(i));
            webDriverWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(allFilters.get(i))));
            String[] firstArray = allFilters.get(i).getText().split("-");
            String stringMin = firstArray[0].replaceAll("[^0-9]", "");
            String stringMax = firstArray[1].replaceAll("[^0-9]", "");
            double min = Double.parseDouble(stringMin);
            double max = Double.parseDouble(stringMax);
            System.out.println("MIN: " + min + " MAX: " + max);
            arePricesCorrect = makeSurePriceIsWithinRange(min, max);

            if(!arePricesCorrect){
                break;
            }

        } return arePricesCorrect;
    }

    public String getSectionText(){
        return section.getText();
    }

    public void click0to25Button(){
        clickOnElement(the0to25FilterButton);
    }

    public boolean makeSurePriceIsWithinRange(double min, double max){
        for(WebElement element : prices){

            StringBuilder sb = new StringBuilder(element.getText());
            sb.deleteCharAt(0);
            String price = sb.toString();
            double doublePrice = Double.parseDouble(price);
            if(doublePrice <= min || doublePrice >= max){
                clickOnElement(element);
                return false;
            }
        } return true;
    }

    public double findCheapestPrice(){
        double min = Double.MAX_VALUE;
        WebElement cheapestElement = null;

        for(WebElement element : prices){

            StringBuilder sb = new StringBuilder(element.getText());
            sb.deleteCharAt(0);
            String price = sb.toString();
            System.out.println(price);
            double doublePrice = Double.parseDouble(price);
            if(doublePrice < min){
                min = doublePrice;
                cheapestElement = element;
            }
        }

        cheapestElement.click();
        return min;
    }

    public double findMostExpensiveItem()  {
        double max = Double.MIN_VALUE;
        WebElement priciestElement = null;

        for(WebElement element : prices){

            StringBuilder sb = new StringBuilder(element.getText());
            sb.deleteCharAt(0);
            String price = sb.toString();
            System.out.println(price);
            double doublePrice = Double.parseDouble(price);
            if(doublePrice > max){
                max = doublePrice;
                priciestElement = element;
            }
        }
        priciestElement.click();
        return max;
    }

    public CarChargersMounts(){
        PageFactory.initElements(driver, this);
    }
}
