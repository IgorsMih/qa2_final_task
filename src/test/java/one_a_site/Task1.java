package one_a_site;

import one_a_site.pages.HomePagePom;
import org.junit.Test;
import one_a_site.pages.BasePage;

public class Task1 {

    BasePage basePage = new BasePage();
    HomePagePom homePagePom = new HomePagePom();
//    DogsPagePom dogsPagePom = new DogsPagePom();
//    CarsPagePom carsPagePom = new CarsPagePom();

    @Test
    public void oneALvTest1() {
        basePage.openChromeByUrl("https://www.1a.lv/");
//        homePagePom.openPageByCategory("dogs");
//        dogsPagePom.validatePageUrl();
//        dogsPagePom.setPrice("1000", "");
//        dogsPagePom.setAge("1", "12");
//        dogsPagePom.validateAge("1", "12");
//        dogsPagePom.selectRegion("Riga");
//        dogsPagePom.pressMekletButton();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basePage.closeChrome();
    }

}
