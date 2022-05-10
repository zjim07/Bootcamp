package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NFLTeamPage extends SystemBar {

    @FindBy(xpath = "//span[@class='flex flex-wrap']")
    public WebElement nflTeamName;

    public NFLTeamPage(){
        PageFactory.initElements(driver, this);
    }
}
