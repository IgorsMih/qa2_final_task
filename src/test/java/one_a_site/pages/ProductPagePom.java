package one_a_site.pages;

import one_a_site.models.Product;
import one_a_site.models.ProductToSearch;
import org.openqa.selenium.By;

import static one_a_site.pages.BasePagePom.driver;

public class ProductPagePom {

    ProductToSearch productToSearch = new ProductToSearch();
    Product product = new Product();

    private final By productName = By.xpath("//input[@id='q']");
    private final By searchButton = By.xpath("//i[@class='main-search-submit__icon icon-svg']");

    public void inputProductName(String name) {
        driver.findElement(productName).clear();
        if ("Lenovo".equals(name)) {
            name = productToSearch.getDatorsLenovo();
        } else name = "Dators";
        driver.findElement(productName).sendKeys(name);
        driver.findElement(searchButton).click();
    }

}
