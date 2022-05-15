package app.pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ListingPage extends SystemBar {

    @FindBy(xpath = "//div[@class='Tag__text']")
    public WebElement locationTagText;

    @FindBy(xpath = "//div[@id='MapHomeCard_0']")
    public WebElement firstHomeCardContainer;

    public ListingPage() {
        PageFactory.initElements(driver, this);
    }


    public void waitForFirstHomeCard() {
        webDriverWait.until(ExpectedConditions.visibilityOf(firstHomeCardContainer));

    }
}
