package one_a_site.pages;

import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartPagePom extends BasePagePom {

    private final String shoppingCartUrl = "https://www.1a.lv/cart";
    private final By getNameAsusX515 = By.xpath("//a[@class='detailed-cart-item__name-link']");
    private final By getPriceAsusX515 = By.xpath("//p[@class='detailed-cart-item__price']");
    private final By getSumOfShoppingCart = By.xpath("//p[@class='detailed-cart-item__total']");

    public void validateThatShoppingCartIsOpen() {
        assertThat(driver.getCurrentUrl()).isEqualTo(shoppingCartUrl);
    }

    public void validateNamePriceAndSum(String name, String price, String sum) {
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

        assertThat(driver.findElement(getSumOfShoppingCart).getText()).isEqualTo(sum);
    }

}
