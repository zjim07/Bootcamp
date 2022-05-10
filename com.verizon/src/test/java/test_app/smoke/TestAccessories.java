package test_app.smoke;

import app.pom.AccessoriesPage;
import app.pom.Homepage;
import app.pom.PhoneCases;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test_base.BaseTest;

import java.util.List;

public class TestAccessories extends BaseTest {

    @Test
    public void testFindCheapestPhoneCaseLink()  {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("Cases");
        PhoneCases phoneCases = new PhoneCases();
        phoneCases.findCheapestPrice();
    }

    @Test
    public void testFindPriciestPhoneCaseLink(){
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        ap.clickPhoneAccessoriesColumnCategory("Cases");
        PhoneCases phoneCases = new PhoneCases();
        phoneCases.findMostExpensiveItem();
    }
}
