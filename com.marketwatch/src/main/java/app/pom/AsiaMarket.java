package app.pom;

import app.shared.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class AsiaMarket extends Homepage {


    public AsiaMarket(){
        PageFactory.initElements(driver, this);
    }
    public void selectAsiaMarket(){
        clickOnElement(asiaMarket);
    }
    public void navigateAsiaMarket(String market){
        driver.findElement(By.xpath(String.format("//div[@class='markets__table']//a[contains(text(),'%s')]",market))).click();

    }
}
