package one_a_site.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import one_a_site.models.Product;
import one_a_site.pages.ProductPagePom;

public class ProductPageStep {

    Product product = new Product();
    ProductPagePom productPagePom = new ProductPagePom();

    @Given("Through Main Menu Find Business Notebook")
    public void findAsusX515() {
        productPagePom.findAsus();
    }

    @When("Get Name Price and Url")
    public void getNameAndPrice() {
        productPagePom.getNamePriceAndLink();
    }

    @And("Add Product to Shopping Cart and Go To Shopping Cart")
    public void addProductToShoppingCart() {
        productPagePom.addToCart();
    }
}
