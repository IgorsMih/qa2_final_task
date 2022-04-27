package one_a_site.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import one_a_site.pages.BasePagePom;
import one_a_site.pages.HomePagePom;


public class HomePageStep {

    BasePagePom basePagePom = new BasePagePom();
    HomePagePom homePagePom = new HomePagePom();

    @Given("Open Home Page")
    public void openHomePage() {
        basePagePom.openChromeByUrl("https://www.1a.lv/");
    }

    @And("Open Login Page")
    public void openLoginPage() {
        homePagePom.openLoginPage();
    }

//    @Given("Open Profile Page")
//    public void openProfilePage() {
//        forumHomePage.openProfilePage();
//    }

    @And("Close All Pages")
    public void closeAllPages() {
        basePagePom.closeChrome();
    }
}
