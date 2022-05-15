package app.pom;

import app.shared.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class RatesMarket extends Homepage {

    public RatesMarket(){
        PageFactory.initElements(driver, this);
    }
    public void selectRatesMarket(){
        clickOnElement(ratesMarket);
    }
    public void navigateRatesMarket(String market){
        driver.findElement(By.xpath(String.format("//div[@class='markets__table']//a[contains(text(),'%s')]",market))).click();

    }
}
