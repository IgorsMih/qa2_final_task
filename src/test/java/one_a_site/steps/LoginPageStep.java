package one_a_site.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import one_a_site.pages.LoginPagePom;

public class LoginPageStep {

    LoginPagePom loginPagePom = new LoginPagePom();

    @When("^Set Login Name to (.*) and Password to (.*) and press Submit Button$")
    public void setLoginNameAndPasswordAndSubmit(String loginName, String password) {
        loginPagePom.enterLoginNameAndPasswordAndSubmit(loginName, password);
    }

    @And("Validate that Login Page is open")
    public void validateThatLoginPageIsOpen() {
        loginPagePom.validateThatLoginPageIsOpen();
    }
}
