package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends SystemBar {

    @FindBy(id = "search-box-input")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@title='Search'])[1]")
    public WebElement searchButton;

    public void clickSearchButton(){
        clickOnElement(searchButton);
    }

    public void sendKeysToSearchBox(String searchQuery){
        sendKeysToElement(searchBox, searchQuery);
    }

    public Homepage(){
        PageFactory.initElements(driver, this);
    }

}
