package one_a_site.steps;

import io.cucumber.java.en.Given;
import one_a_site.pages.ProductPagePom;


public class ProductPageStep {

    ProductPagePom productPagePom = new ProductPagePom();

    @Given("^Set ProductName in Search Field to (.*) and click Search Button$")
    public void setProductName(String name) {
        productPagePom.inputProductName(name);

    }
}
