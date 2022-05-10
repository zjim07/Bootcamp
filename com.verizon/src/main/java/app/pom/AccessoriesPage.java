package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccessoriesPage extends SystemBar {

    @FindBy(xpath = "//div[@id='accordionOnePanel']//ul//li")
    public List<WebElement> phoneAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionTwoPanel']//ul//li")
    public List<WebElement> tabletAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionFourPanel']//ul//li")
    public List<WebElement> chargingAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionFivePanel']//ul//li")
    public List<WebElement> audioAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionNinePanel']//ul//li")
    public List<WebElement> gamingAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionThreePanel']//ul//li")
    public List<WebElement> watchAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionSevenPanel']//ul//li")
    public List<WebElement> homeAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionEigPanel']//ul//li")
    public List<WebElement> healthAccessoriesColumn;

    @FindBy(xpath = "//div[@id='accordionSixPanel']//ul//li")
    public List<WebElement> entertainmentAccessoriesColumn;

    public void clickPhoneAccessoriesColumnCategory(String categoryName){

        for(WebElement element : phoneAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickTabletAccessoriesColumnCategory(String categoryName){

        for(WebElement element : tabletAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickChargingAccessoriesColumnCategory(String categoryName){

        for(WebElement element : chargingAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickAudioAccessoriesColumnCategory(String categoryName){

        for(WebElement element : audioAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickGamingAccessoriesColumnCategory(String categoryName){

        for(WebElement element : gamingAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickWatchAccessoriesColumnCategory(String categoryName){

        for(WebElement element : watchAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickHomeAccessoriesColumnCategory(String categoryName){

        for(WebElement element : homeAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickHealthAccessoriesColumnCategory(String categoryName){

        for(WebElement element : healthAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }

    public void clickEntertainmentAccessoriesColumnCategory(String categoryName){

        for(WebElement element : entertainmentAccessoriesColumn){
            if(element.getText().equalsIgnoreCase(categoryName)){
                element.click();
                break;
            }
        }
    }


    public AccessoriesPage(){
        PageFactory.initElements(driver, this);
    }
}
