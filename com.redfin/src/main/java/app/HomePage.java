package app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class HomePage extends SystemBar {
    @FindBy (xpath= "//*[@id=\'search-box-input\']")
    public WebElement SearchBar;

}


