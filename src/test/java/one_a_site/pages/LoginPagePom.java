package one_a_site.pages;

import one_a_site.model.UserStatic;
import org.openqa.selenium.By;

public class LoginPagePom extends BasePagePom {

    UserStatic userStatic = new UserStatic();
    private final By loginName = By.xpath("//input[@name='user[email]']");
    private final By loginPassword = By.xpath("//input[@name='user[password]']");
    private final By submitButton = By.xpath("//input[@class='users-session-form__submit']");

    public void enterLoginName(String name) {
        if ("IMEmail".equals(name)) {
            name = userStatic.getLoginName();
        } else name = "gmail@gmail.com";
        driver.findElement(loginName).sendKeys(name);
    }

    public void enterPassword(String password) {
        if ("IMPSW".equals(password)) {
            password = userStatic.getPassword();
        } else password = "None";
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void loginSubmit() {
        driver.findElement(submitButton).click();
    }

}


