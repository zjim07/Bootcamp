package app.pom;

import app.shared.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class EuropeMarket extends Homepage {

    public EuropeMarket(){
        PageFactory.initElements(driver, this);
    }
    public void selectEuropeMarket(){
        clickOnElement(europeMarket);
    }
    public void navigateEuropeMarket(String market){
        driver.findElement(By.xpath(String.format("//div[@class='markets__table']//a[contains(text(),'%s')]",market))).click();

    }
}
