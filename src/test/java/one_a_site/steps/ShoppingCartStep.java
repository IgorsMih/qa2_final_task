package one_a_site.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import one_a_site.pages.ShoppingCartPagePom;

public class ShoppingCartStep {

    ShoppingCartPagePom shoppingCartPagePom = new ShoppingCartPagePom();

    @When("Validate that Shopping Cart is Open")
    public void validateThatShoppingCartIsOpen() {
        shoppingCartPagePom.validateThatShoppingCartIsOpen();
    }

    @And("Validate Name and Price")
    public void getNameOfTheProduct() {
        shoppingCartPagePom.validateNameAndPrice();
    }

    @And("Click on Turpinat")
    public void turpinat() {
        shoppingCartPagePom.turpinatShopping();
    }

    @Then("Fill All Fields in Final Page")
    public void fillAllFieldsInFinalPageAndValidateFinalPrice() {
        shoppingCartPagePom.addressFieldsInCarts();
    }

    @And("Validate Filled Fields and Final Price")
    public void validateFilledFieldsAndFinalPrice() {
        shoppingCartPagePom.validateFieldsAndFinalPrice();
    }

    @And("Clear Shopping Cart")
    public void clearShoppingCart() {
        shoppingCartPagePom.clearShoppingCart();
    }

    @And("Logoff from Site")
    public void logoffFromSite() {
        shoppingCartPagePom.logOff();
    }

}
