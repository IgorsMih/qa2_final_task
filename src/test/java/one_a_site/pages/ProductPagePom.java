package one_a_site.pages;

import one_a_site.models.Product;
import one_a_site.modules.CreateFile;
import one_a_site.modules.WriteToFile;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ProductPagePom extends BasePagePom{

    public static Product product = new Product();
    CreateFile createFile = new CreateFile();
    WriteToFile writeToFile = new WriteToFile();

    private final By acceptCookies = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By selectMenu = By.xpath("//span[@class='main-menu__handle-text']");
    private final By openDatortehnikaSubmenu = By.xpath("//a[@class='submenu-lvl1__link']");
    private final By openPortativieDatori = By.xpath("//img[@src='https://sb.ksd-images.lt/onea_lv/images/rich_texts/Articles/limonade5/2/3_PORTATIVIE_DATORI_2.jpg']");
    private final By openPortativieDatoriBiznesam = By.xpath("//div[@class='catalog-taxons-visual-filter-glide-slider__slide glide__slide']");
    private final By openProduct = By.xpath("//div[@class='catalog-taxons-product catalog-taxons-product--grid-view'][1]");
    private final By getProductName = By.xpath("//div[@class='product-righter google-rich-snippet']/h1");
    private final By getProductPrice = By.xpath("//span[@class='price'][1]");
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
        action.moveToElement(driver.findElement(openProduct)).click().perform();
    }

    public void getNamePriceAndLink() {
        product.setProductName(driver.findElement(getProductName).getText());
        product.setProductPrice(driver.findElement(getProductPrice).getText());
        product.setProductLink(driver.getCurrentUrl());
        System.out.println("Name  = " + product.getProductName() + "\nPrice = " + product.getProductPrice() + "\nLink  = " + product.getProductLink());
//      Creating file and writing information to it
//        createFile.create();
//        writeToFile.write(product.getProductName(), product.getProductPrice(), product.getProductLink());
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
