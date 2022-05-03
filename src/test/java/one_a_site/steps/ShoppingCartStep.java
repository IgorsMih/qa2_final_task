package one_a_site.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import one_a_site.pages.ProductPagePom;
import one_a_site.pages.ShoppingCartPagePom;

public class ShoppingCartStep {

    ProductPagePom productPagePom = new ProductPagePom();
    ShoppingCartPagePom shoppingCartPagePom = new ShoppingCartPagePom();

    @When("Validate that Shopping Cart is Open")
    public void validateThatShoppingCartIsOpen() {
        shoppingCartPagePom.validateThatShoppingCartIsOpen();
    }

    @And("^Validate Name (.*) Price (.*) and Sum (.*)$")
    public void getNameOfTheProduct(String productName, String productPrice, String productSum) {
        shoppingCartPagePom.validateNamePriceAndSum(productName, productPrice, productSum);

    }

    @And("Turpinat")
    public void turpinat() {
        shoppingCartPagePom.turpinatShopping();
    }

    @Then("^Fill All Fields in Final Page and Validate Final Price (.*)$")
    public void fillAllFieldsInFinalPageAndValidateFinalPrice(String finalPrice) {
        shoppingCartPagePom.addressFieldsInCarts();
    }

    @And("Validate Final Price")
    public void validateFinalPrice() {
        shoppingCartPagePom.validateFinalPrice();
    }
}
