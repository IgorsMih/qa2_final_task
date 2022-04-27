package one_a_site.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import one_a_site.pages.LoginPagePom;

public class LoginPageStep {

    LoginPagePom loginPagePom = new LoginPagePom();

    @When("^Set Login Name to (.*)$")
    public void setLoginName(String loginName) {
        loginPagePom.enterLoginName(loginName);
    }

    @And("^Set Password to (.*)$")
    public void setPassword(String password) {
        loginPagePom.enterPassword(password);
    }

    @Then("Press Submit Button")
    public void pressSubmitButton() {
        loginPagePom.loginSubmit();
    }

    @And("Validate that Login Page is open")
    public void validateThatLoginPageIsOpen() {
        loginPagePom.validateThatLoginPageIsOpen();
    }
}
