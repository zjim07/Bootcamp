package test_app.smoke;

import app.pom.Homepage;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestBookings extends BaseTest {

    @Test
    public void testCheckIn() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickCheckIn();
        Thread.sleep(3000);
    }

}
