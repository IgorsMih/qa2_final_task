package one_a_site.pages;

import one_a_site.models.UserStatic;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartPagePom extends BasePagePom {

    UserStatic userStatic = new UserStatic();

    private final String shoppingCartUrl = "https://www.1a.lv/cart";
    private final By getNameAsusX515 = By.xpath("//a[@class='detailed-cart-item__name-link']");
    private final By getPriceAsusX515 = By.xpath("//p[@class='detailed-cart-item__price']");
    private final By turpinat = By.xpath("//input[@class='main-button cart-main-button']");
    private final By pickUpPoint = By.xpath("//input[@value='3210']");
    private final By addressFirstName = By.xpath("//input[@name='address[first_name]']");
    private final By addressSecondName = By.xpath("//input[@name='address[last_name]']");
    private final By phoneNamber = By.xpath("//input[@name='address[phone_number]']");
    private final By getFinalPrice = By.xpath("//td[@class='checkout-order-summary-total-products__price']");

    public void validateThatShoppingCartIsOpen() {
        assertThat(driver.getCurrentUrl()).isEqualTo(shoppingCartUrl);
    }

    public void validateNamePriceAndSum(String name, String price) {
        if ("AsusX515".equals(name)) {
            name = ProductPagePom.product.getProductName();
        } else name = "None";
        assertThat(driver.findElement(getNameAsusX515).getText()).isEqualTo(name);

        if ("558.10".equals(price)) {
            price = ProductPagePom.product.getProductPrice();
        } else price = "0.00";
        String price1 = driver.findElement(getPriceAsusX515).getText();
        String price2 = price1 + " / gab.";
        assertThat(price2).isEqualTo(price);
    }

    public void turpinatShopping() {
        driver.findElement(turpinat).click();
    }

    public void addressFieldsInCarts() {
        driver.findElement(pickUpPoint).click();
        driver.findElement(addressFirstName).sendKeys(userStatic.getFirstName());
        driver.findElement(addressSecondName).sendKeys(userStatic.getSecondName());
        driver.findElement(phoneNamber).sendKeys(userStatic.getMobile());
    }

    public void validateFinalPrice() {
        String price = ProductPagePom.product.getProductPrice();
        String finalPrice = driver.findElement(getFinalPrice).getText() + " / gab.";
        assertThat(finalPrice).isEqualTo(price);
    }

}
