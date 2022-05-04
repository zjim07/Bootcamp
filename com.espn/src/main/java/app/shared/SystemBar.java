package app.shared;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//nav[@id='global-nav']//li[@class='sports menu-nfl']")
    public WebElement NFLDropdownMenu;

    @FindBy(xpath = "//li[@class='teams nfl']//ul/li[@class='team']//span//span[1]")
    public List<WebElement> NFLTeams;

    @FindBy(xpath = "//nav[@id='global-nav']//li[@class='sports menu-nba']")
    public WebElement NBADropdownMenu;

    @FindBy(xpath = "//li[@class='teams nba']//li[@class='team']//span//span[2]")
    public List<WebElement> NBATeams;

    public void clickNBATeam(String teamName){
        hoverOverElement(NBADropdownMenu);

        try {
            List<WebElement> teams = NBATeams;
            for (WebElement team : teams) {

                if (team.getAttribute("innerHTML").contains(teamName)) {
                    System.out.println("THIS IS THE TEAM NAME: " + team.getAttribute("innerHTML"));
                    team.click();
                }

            }
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

    }


    public void hoverNFLDropdownMenu(){
       hoverOverElement(NFLDropdownMenu);
    }

    public SystemBar(){
        PageFactory.initElements(driver, this);
    }
}
