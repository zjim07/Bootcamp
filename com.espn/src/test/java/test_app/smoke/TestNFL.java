package test_app.smoke;

import app.pom.Homepage;
import app.shared.SystemBar;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;
import java.util.List;

public class TestNFL extends BaseTest {

    @Test
    public void testBuffaloBillsLink(){

        Homepage homepage = new Homepage();
        homepage.hoverNFLDropdownMenu();

        try {

            List<WebElement> nflTeams = homepage.NFLTeams;
            nflTeams.stream().filter(s -> s.getText().contains("Seattle Seahawks")).forEach(s -> s.click());
        } catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

        //System.out.println(nflTeam);

    }

    @Test
    public void testNBATeams()  {
        Homepage homepage = new Homepage();
        homepage.clickNBATeam("Lakers");
    }
}
