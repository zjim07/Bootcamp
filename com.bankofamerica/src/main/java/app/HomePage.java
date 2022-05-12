package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {
    @FindBy(xpath ="//*id='navChecking']/span[3]")
    public WebElement Checking;

    public void clickChecking() {
    }
}
