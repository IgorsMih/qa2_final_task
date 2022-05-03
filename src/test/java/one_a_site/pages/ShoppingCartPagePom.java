package one_a_site.pages;

import one_a_site.models.UserStatic;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartPagePom extends BasePagePom {

    UserStatic userStatic = new UserStatic();

    private final By getProductName = By.xpath("//a[@class='detailed-cart-item__name-link']");
    private final By getProductPrice = By.xpath("//p[@class='detailed-cart-item__price']");
    private final By turpinat = By.xpath("//input[@class='main-button cart-main-button']");
    private final By pickUpPoint = By.xpath("//input[@value='3210']");
    private final By addressFirstName = By.xpath("//input[@name='address[first_name]']");
    private final By addressSecondName = By.xpath("//input[@name='address[last_name]']");
    private final By phoneNumber = By.xpath("//input[@name='address[phone_number]']");
    private final By getFinalPrice = By.xpath("//td[@class='checkout-order-summary-total-products__price']");
    private final By clickOnDelete = By.xpath("//div[@class='detailed-cart-item__delete-wrap']");

    public void validateThatShoppingCartIsOpen() {
        String shoppingCartUrl = "https://www.1a.lv/cart";
        assertThat(driver.getCurrentUrl()).isEqualTo(shoppingCartUrl);
    }

    public void validateNameAndPrice() {
        assertThat(driver.findElement(getProductName).getText()).isEqualTo(ProductPagePom.product.getProductName());
        assertThat(driver.findElement(getProductPrice).getText() + " / gab.").isEqualTo(ProductPagePom.product.getProductPrice());
    }

    public void turpinatShopping() {
        driver.findElement(turpinat).click();
    }

    public void addressFieldsInCarts() {
        driver.findElement(pickUpPoint).click();
        driver.findElement(addressFirstName).sendKeys(userStatic.getFirstName());
        driver.findElement(addressSecondName).sendKeys(userStatic.getSecondName());
        driver.findElement(phoneNumber).sendKeys(userStatic.getMobile());
    }

    public void validateFinalPrice() {
        assertThat(driver.findElement(getFinalPrice).getText() + " / gab.").isEqualTo(ProductPagePom.product.getProductPrice());
    }

    public void clearShoppingCart() {
        driver.navigate().back();
        driver.findElement(clickOnDelete).click();

    }

}
