package one_a_site.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import one_a_site.pages.ProductPagePom;

public class ProductPageStep {

    ProductPagePom productPagePom = new ProductPagePom();

    @Given("Through Main Menu Find Business Notebook")
    public void findAsusX515() {
        productPagePom.findAsus();
    }

    @When("Get Name Price Url, Create File and Add Them to File")
    public void getNamePriceAndUrlCreateFileAndAddThemToFile() {
        productPagePom.getNamePriceAndLink();
    }

    @And("Add Product to Shopping Cart and Go To Shopping Cart")
    public void addProductToShoppingCart() {
        productPagePom.addToCart();
    }

}
