package app.pom.healthAccessories;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FaceMasks extends SystemBar {


    @FindBy(xpath = "//div[@class='Tile__Pricing-sc-71g958-10 fClbGb blur']/p")
    public List<WebElement> prices;

    @FindBy(xpath = "//span[@class='StyledTypography-sc-5k55co-0 jXNKUS StyledBody-sc-1s1yqd8-0 ZEszq']")
    public WebElement section;

    public String getSectionText(){
        return section.getText();
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

    public FaceMasks(){
        PageFactory.initElements(driver, this);
    }
}
