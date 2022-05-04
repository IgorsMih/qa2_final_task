package one_a_site.pages;

import one_a_site.models.UserStatic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartPagePom extends BasePagePom {

    UserStatic userStatic = new UserStatic();

    private final By getProductName = By.xpath("//a[@class='detailed-cart-item__name-link']");
    private final By getProductPrice = By.xpath("//p[@class='detailed-cart-item__price']");
    private final By turpinat = By.xpath("//input[@class='main-button cart-main-button']");
    private final By pickUpPoint = By.xpath("//input[@value='3210']");

/*  not for registered client only
    private final By addressFirstName = By.xpath("//input[@name='address[first_name]']");
    private final By addressSecondName = By.xpath("//input[@name='address[last_name]']");
    private final By phoneNumber = By.xpath("//input[@name='address[phone_number]']");
*/
    private final By fullName = By.xpath("//div[@class='name']");
    private final By phoneNumberVal = By.xpath("//div[@class='address']");
    private final By getFinalPrice = By.xpath("//td[@class='checkout-order-summary-total-products__price']");
    private final By clickOnDelete = By.xpath("//div[@class='detailed-cart-item__delete-wrap']");
    private final By selectProfilePicture = By.xpath("//div[@class='user-block__title']");
    private final By selectLogOff = By.id("logout_link");

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

/*      not for registered clients only
        driver.findElement(addressFirstName).sendKeys(userStatic.getFirstName());
        driver.findElement(addressSecondName).sendKeys(userStatic.getSecondName());
        driver.findElement(phoneNumber).sendKeys(userStatic.getMobile());
*/
    }

    public void validateFieldsAndFinalPrice() {
        assertThat(driver.findElement(fullName).getText()).isEqualTo(userStatic.getFirstName() + " " + userStatic.getSecondName());
        assertThat(driver.findElement(phoneNumberVal).getText()).isEqualTo("+371" + userStatic.getMobile() + " Mainīt");
        assertThat(driver.findElement(getFinalPrice).getText() + " / gab.").isEqualTo(ProductPagePom.product.getProductPrice());
    }

    public void clearShoppingCart() {
        driver.navigate().back();
        driver.findElement(clickOnDelete).click();

        Alert alert = driver.switchTo().alert(); // switch to alert
        System.out.println(driver.switchTo().alert().getText()); // Print Captured Alert Message
        alert.accept();
    }

    public void logOff() {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(selectProfilePicture)).perform();
        action.moveToElement(driver.findElement(selectLogOff)).click().perform();
    }

}
