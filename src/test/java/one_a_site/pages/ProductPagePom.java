package one_a_site.pages;

import one_a_site.models.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ProductPagePom extends BasePagePom{

    public static Product product = new Product();

    private final By acceptCookies = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By selectMenu = By.xpath("//span[@class='main-menu__handle-text']");
    private final By openDatortehnikaSubmenu = By.xpath("//a[@class='submenu-lvl1__link']");
    private final By openPortativieDatori = By.xpath("//img[@src='https://sb.ksd-images.lt/onea_lv/images/rich_texts/Articles/limonade5/2/3_PORTATIVIE_DATORI_2.jpg']");
    private final By openPortativieDatoriBiznesam = By.xpath("//div[@class='catalog-taxons-visual-filter-glide-slider__slide glide__slide']");
    private final By openAsusX515 = By.xpath("//div[@class='catalog-taxons-product catalog-taxons-product--grid-view'][3]");
    private final By getNameAsusX515 = By.xpath("//div[@class='product-righter google-rich-snippet']/h1");
    private final By getPriceAsusX515 = By.xpath("//span[@class='price'][1]");
    private final By addProductToShoppingCart = By.id("add_to_cart_btn");
    private final By goToShoppingCart = By.xpath("//a[@class='main-button']");

    public void findAsus() {
        Actions action = new Actions(driver);

        sleepMode(7000);
        driver.findElement(acceptCookies).click();
        action.moveToElement(driver.findElement(selectMenu)).perform();
        action.moveToElement(driver.findElement(openDatortehnikaSubmenu)).click().perform();
        driver.findElement(openPortativieDatori).click();
        action.moveToElement(driver.findElement(openPortativieDatoriBiznesam)).click().perform();
        sleepMode(3000);
        action.moveToElement(driver.findElement(openAsusX515)).click().perform();
    }

    public void getNamePriceAndLink() {
        product.setProductName(driver.findElement(getNameAsusX515).getText());
        product.setProductPrice(driver.findElement(getPriceAsusX515).getText());
        product.setProductLink(driver.getCurrentUrl());
        System.out.println("Name  = " + product.getProductName() + "\nPrice = " + product.getProductPrice() + "\nLink  = " + product.getProductLink());
    }

    public void addToCart() {
        driver.findElement(addProductToShoppingCart).click();
        sleepMode(3000);
        driver.findElement(goToShoppingCart).click();
    }

    public void sleepMode(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
