package one_a_site.pages;

import one_a_site.models.UserStatic;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPagePom extends BasePagePom {

    UserStatic userStatic = new UserStatic();
    private final By loginName = By.xpath("//input[@name='user[email]']");
    private final By loginPassword = By.xpath("//input[@name='user[password]']");
    private final By submitButton = By.xpath("//input[@class='users-session-form__submit']");
    private final String baseUrl = "https://www.1a.lv/users/sign_in";

    public void validateThatLoginPageIsOpen() {
        assertThat(driver.getCurrentUrl()).isEqualTo(baseUrl);
    }

    public void enterLoginNameAndPasswordAndSubmit(String name, String password) {
        if ("IMEmail".equals(name)) {
            name = userStatic.getLoginName();
        } else name = "gmail@gmail.com";
        driver.findElement(loginName).sendKeys(name);

        if ("IMPSW".equals(password)) {
            password = userStatic.getPassword();
        } else password = "None";
        driver.findElement(loginPassword).sendKeys(password);
        driver.findElement(submitButton).click();
    }

}


