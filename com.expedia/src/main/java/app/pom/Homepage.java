package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Homepage extends SystemBar {

    @FindBy(xpath = "//button[@id='d1-btn']")
    public WebElement checkInButton;

    public void clickCheckIn(){
        clickOnElement(checkInButton);
    }


    public Homepage(){
        PageFactory.initElements(driver, this);
    }
}
