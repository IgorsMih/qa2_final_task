package one_a_site.pages;

import org.openqa.selenium.By;

public class HomePagePom extends BasePagePom {

    private final By toLoginPage = By.xpath("//div[@class='user-block__title']");
    private final By toLoginPageClick = By.xpath("//a[@class='main-button user-block-dropdown__main-button']");

    public void openLoginPage() {
        driver.findElement(toLoginPage).click();
        driver.findElement(toLoginPageClick).click();
    }

}
