package test_app.smoke;

import app.pom.AccessoriesPage;
import app.pom.Homepage;
import app.pom.audioAccessories.Headphones;
import app.pom.audioAccessories.Headsets;
import app.pom.audioAccessories.Soundbars;
import app.pom.audioAccessories.Speakers;
import app.pom.chargingAccessories.AdaptersCables;
import app.pom.chargingAccessories.Batteries;
import app.pom.chargingAccessories.CarChargersMounts;
import app.pom.chargingAccessories.Chargers;
import app.pom.entertainmentAccessories.Cameras;
import app.pom.entertainmentAccessories.Microphones;
import app.pom.gamingAccessories.*;
import app.pom.healthAccessories.FaceMasks;
import app.pom.healthAccessories.FitnessTrackers;
import app.pom.healthAccessories.UVSanitizers;
import app.pom.homeAccessories.Computer;
import app.pom.homeAccessories.SignalBoosters;
import app.pom.homeAccessories.SmartDevices;
import app.pom.homeAccessories.StreamingTVs;
import app.pom.phoneAccessories.CaseBundles;
import app.pom.phoneAccessories.PhoneCases;
import app.pom.phoneAccessories.ScreenProtectors;
import app.pom.tabletAccessories.TabletMagSafe;
import app.pom.tabletAccessories.TabletScreenProtectors;
import app.pom.watchAccessories.Bands;
import app.pom.watchAccessories.SmartWatches;
import app.pom.watchAccessories.WatchChargers;
import app.pom.watchAccessories.WatchScreenProtectors;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class TestAccessories extends BaseTest {

    @Test
    public void testAllFilteredItems() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ChargingAccessories").get(1);
        ap.clickChargingAccessoriesColumnCategory(categoryName);
        CarChargersMounts chargers = new CarChargersMounts();
        boolean arePricesCorrect = chargers.verifyAllFilters();
        Assert.assertTrue(arePricesCorrect);
    }

    @Test
    public void test0to25PriceFilter() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ChargingAccessories").get(1);
        ap.clickChargingAccessoriesColumnCategory(categoryName);
        CarChargersMounts chargers = new CarChargersMounts();
        chargers.click0to25Button();
        Thread.sleep(3000);
        boolean isPriceWithinRange = chargers.makeSurePriceIsWithinRange(0, 15);
        Assert.assertTrue(isPriceWithinRange);
    }

    @Test
    public void testPhoneCasesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("PhoneAccessories").get(0);
        ap.clickPhoneAccessoriesColumnCategory(categoryName);
        PhoneCases pc = new PhoneCases();
        String actualResult = pc.getSectionText().toLowerCase();
        String expectedResult = "phone-cases";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPhoneCaseBundleLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("PhoneAccessories").get(1);
        ap.clickPhoneAccessoriesColumnCategory(categoryName);
        CaseBundles cb = new CaseBundles();
        String actualResult = cb.getSectionText().toLowerCase();
        String expectedResult = "phone-case-bundles";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testScreenProtectorsLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("PhoneAccessories").get(2);
        ap.clickPhoneAccessoriesColumnCategory(categoryName);
        ScreenProtectors sp = new ScreenProtectors();
        String actualResult = sp.getSectionText().toLowerCase();
        String expectedResult = "phone-screen-protectors";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMagSafeLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("PhoneAccessories").get(3);
        ap.clickPhoneAccessoriesColumnCategory(categoryName);
        ScreenProtectors sp = new ScreenProtectors();
        String actualResult = sp.getSectionText().toLowerCase();
        String expectedResult = "magsafe";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTabletCasesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("TabletAccessories").get(0);
        ap.clickTabletAccessoriesColumnCategory(categoryName);
        ScreenProtectors sp = new ScreenProtectors();
        String actualResult = sp.getSectionText().toLowerCase();
        String expectedResult = "tablet-cases";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTabletScreenProtectorsCasesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("TabletAccessories").get(1);
        ap.clickTabletAccessoriesColumnCategory(categoryName);
        TabletScreenProtectors tsp = new TabletScreenProtectors();
        String actualResult = tsp.getSectionText().toLowerCase();
        String expectedResult = "tablet-screen-protectors";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTabletMagSafeLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("TabletAccessories").get(2);
        ap.clickTabletAccessoriesColumnCategory(categoryName);
        TabletMagSafe tms = new TabletMagSafe();
        String actualResult = tms.getSectionText().toLowerCase();
        String expectedResult = "magsafe";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTabletKeyboardsLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("TabletAccessories").get(3);
        ap.clickTabletAccessoriesColumnCategory(categoryName);
        TabletMagSafe tms = new TabletMagSafe();
        String actualResult = tms.getSectionText().toLowerCase();
        String expectedResult = "tablet-keyboards";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testChargersLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ChargingAccessories").get(0);
        ap.clickChargingAccessoriesColumnCategory(categoryName);
        Chargers chargers = new Chargers();
        String actualResult = chargers.getSectionText().toLowerCase();
        String expectedResult = "chargers";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCarChargersLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ChargingAccessories").get(1);
        ap.clickChargingAccessoriesColumnCategory(categoryName);
        CarChargersMounts chargers = new CarChargersMounts();
        String actualResult = chargers.getSectionText().toLowerCase();
        String expectedResult = "car-chargers";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBatteriesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ChargingAccessories").get(2);
        ap.clickChargingAccessoriesColumnCategory(categoryName);
        Batteries batteries = new Batteries();
        String actualResult = batteries.getSectionText().toLowerCase();
        String expectedResult = "batteries";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAdaptersCablesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ChargingAccessories").get(3);
        ap.clickChargingAccessoriesColumnCategory(categoryName);
        AdaptersCables ac = new AdaptersCables();
        String actualResult = ac.getSectionText().toLowerCase();
        String expectedResult = "adapters-and-cables";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testHeadphonesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("AudioAccessories").get(0);
        ap.clickAudioAccessoriesColumnCategory(categoryName);
        Headphones h = new Headphones();
        String actualResult = h.getSectionText().toLowerCase();
        String expectedResult = "headphones";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testHeadsetsLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("AudioAccessories").get(1);
        ap.clickAudioAccessoriesColumnCategory(categoryName);
        Headsets h = new Headsets();
        String actualResult = h.getSectionText().toLowerCase();
        String expectedResult = "headsets";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSpeakersLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("AudioAccessories").get(2);
        ap.clickAudioAccessoriesColumnCategory(categoryName);
        Speakers s = new Speakers();
        String actualResult = s.getSectionText().toLowerCase();
        String expectedResult = "speakers";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSoundbarsLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("AudioAccessories").get(3);
        ap.clickAudioAccessoriesColumnCategory(categoryName);
        Soundbars s = new Soundbars();
        String actualResult = s.getSectionText().toLowerCase();
        String expectedResult = "soundbars";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testConsolesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ConsoleAccessories").get(0);
        ap.clickGamingAccessoriesColumnCategory(categoryName);
        ConsoleAccessories c = new ConsoleAccessories();
        String actualResult = c.getSectionText().toLowerCase();
        String expectedResult = "console-gaming";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPCGamingLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ConsoleAccessories").get(1);
        ap.clickGamingAccessoriesColumnCategory(categoryName);
        PCAccessories p = new PCAccessories();
        String actualResult = p.getSectionText().toLowerCase();
        String expectedResult = "pc-gaming";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMobileGamingLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ConsoleAccessories").get(2);
        ap.clickGamingAccessoriesColumnCategory(categoryName);
        MobileGaming m = new MobileGaming();
        String actualResult = m.getSectionText().toLowerCase();
        String expectedResult = "mobile-gaming";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testVRGamingLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ConsoleAccessories").get(3);
        ap.clickGamingAccessoriesColumnCategory(categoryName);
        VRGaming v = new VRGaming();
        String actualResult = v.getSectionText().toLowerCase();
        String expectedResult = "vr-gaming";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGamingHeadsetsLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("ConsoleAccessories").get(4);
        ap.clickGamingAccessoriesColumnCategory(categoryName);
        GamingHeadsets g = new GamingHeadsets();
        String actualResult = g.getSectionText().toLowerCase();
        String expectedResult = "headsets";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSmartWatchesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("WatchAccessories").get(0);
        ap.clickWatchAccessoriesColumnCategory(categoryName);
        SmartWatches s = new SmartWatches();
        String actualResult = s.getSectionText().toLowerCase();
        String expectedResult = "connected-smartwatches";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBandsLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("WatchAccessories").get(1);
        ap.clickWatchAccessoriesColumnCategory(categoryName);
        Bands b = new Bands();
        String actualResult = b.getSectionText().toLowerCase();
        String expectedResult = "watch-bands";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testWatchScreenProtectorsLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("WatchAccessories").get(2);
        ap.clickWatchAccessoriesColumnCategory(categoryName);
        WatchScreenProtectors w = new WatchScreenProtectors();
        String actualResult = w.getSectionText().toLowerCase();
        String expectedResult = "watch-screen-protectors";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testWatchChargersLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("WatchAccessories").get(3);
        ap.clickWatchAccessoriesColumnCategory(categoryName);
        WatchChargers w = new WatchChargers();
        String actualResult = w.getSectionText().toLowerCase();
        String expectedResult = "watch-chargers";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSmartDevicesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("HomeAccessories").get(0);
        ap.clickHomeAccessoriesColumnCategory(categoryName);
        SmartDevices s = new SmartDevices();
        String actualResult = s.getSectionText().toLowerCase();
        String expectedResult = "smart-devices";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSignalBoostersLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("HomeAccessories").get(1);
        ap.clickHomeAccessoriesColumnCategory(categoryName);
        SignalBoosters s = new SignalBoosters();
        String actualResult = s.getSectionText().toLowerCase();
        String expectedResult = "signal-boosters";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStreamersTVsLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("HomeAccessories").get(2);
        ap.clickHomeAccessoriesColumnCategory(categoryName);
        StreamingTVs s = new StreamingTVs();
        String actualResult = s.getSectionText().toLowerCase();
        String expectedResult = "streaming-devices";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testComputerAccessoriesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("HomeAccessories").get(3);
        ap.clickHomeAccessoriesColumnCategory(categoryName);
        Computer c = new Computer();
        String actualResult = c.getSectionText().toLowerCase();
        String expectedResult = "computer-accessories";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFitnessTrackersLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("HealthAccessories").get(0);
        ap.clickHealthAccessoriesColumnCategory(categoryName);
        FitnessTrackers f = new FitnessTrackers();
        String actualResult = f.getSectionText().toLowerCase();
        String expectedResult = "fitness-trackers";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFaceMasksLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("HealthAccessories").get(1);
        ap.clickHealthAccessoriesColumnCategory(categoryName);
        FaceMasks f = new FaceMasks();
        String actualResult = f.getSectionText().toLowerCase();
        String expectedResult = "masks";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testUVSanitizersLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("HealthAccessories").get(2);
        ap.clickHealthAccessoriesColumnCategory(categoryName);
        UVSanitizers u = new UVSanitizers();
        String actualResult = u.getSectionText().toLowerCase();
        String expectedResult = "uv-sanitizers";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCamerasLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("EntertainmentAccessories").get(0);
        ap.clickEntertainmentAccessoriesColumnCategory(categoryName);
        Cameras c = new Cameras();
        String actualResult = c.getSectionText().toLowerCase();
        String expectedResult = "cameras";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMicrophonesLink() {
        Homepage homepage = new Homepage();
        homepage.clickAccessoriesLink();
        AccessoriesPage ap = new AccessoriesPage();
        String categoryName = excel.readStringList("EntertainmentAccessories").get(1);
        ap.clickEntertainmentAccessoriesColumnCategory(categoryName);
        Microphones m = new Microphones();
        String actualResult = m.getSectionText().toLowerCase();
        String expectedResult = "microphones";
        Assert.assertEquals(actualResult, expectedResult);
    }




















//
//    @Test
//    public void testFindCheapestPhoneCaseLink()  {
//        Homepage homepage = new Homepage();
//        homepage.clickAccessoriesLink();
//        AccessoriesPage ap = new AccessoriesPage();
//        ap.clickPhoneAccessoriesColumnCategory("Cases");
//        PhoneCases phoneCases = new PhoneCases();
//        double actualResult = phoneCases.findCheapestPrice();
//        double expectedResult = Double.parseDouble(excel.readStringList("PhoneAccessories").get(0));
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void testFindPriciestPhoneCaseLink(){
//        Homepage homepage = new Homepage();
//        homepage.clickAccessoriesLink();
//        AccessoriesPage ap = new AccessoriesPage();
//        ap.clickPhoneAccessoriesColumnCategory("Cases");
//        PhoneCases phoneCases = new PhoneCases();
//        double actualResult = phoneCases.findMostExpensiveItem();
//        double expectedResult = Double.parseDouble(excel.readStringList("PhoneAccessories").get(1));
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void testFindCheapestPhoneCaseBundlesLink()  {
//        Homepage homepage = new Homepage();
//        homepage.clickAccessoriesLink();
//        AccessoriesPage ap = new AccessoriesPage();
//        ap.clickPhoneAccessoriesColumnCategory("Case bundles");
//        CaseBundles caseBundles = new CaseBundles();
//        double actualResult = caseBundles.findCheapestPrice();
//        double expectedResult = Double.parseDouble(excel.readStringList("PhoneAccessories").get(2));
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void testFindPriciestPhoneCaseBundlesLink() throws InterruptedException {
//        Homepage homepage = new Homepage();
//        homepage.clickAccessoriesLink();
//        AccessoriesPage ap = new AccessoriesPage();
//        ap.clickPhoneAccessoriesColumnCategory("Case bundles");
//        CaseBundles caseBundles = new CaseBundles();
//        double actualResult = caseBundles.findMostExpensiveItem();
//        double expectedResult = Double.parseDouble(excel.readStringList("PhoneAccessories").get(3));
//        Assert.assertEquals(actualResult, expectedResult);
//    }






}
