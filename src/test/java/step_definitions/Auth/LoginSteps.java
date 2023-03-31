package step_definitions.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Login;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class LoginSteps {
    private final WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("User click button login on home page")
    public void userClickButtonLoginOnHomePage() throws InterruptedException {
        Login login = new Login(webDriver);
        login.setPageLogin();
        Thread.sleep(3000);
    }

    @When("User input {string} as email {string} as password and {string} as role")
    public void userInputAsEmailAsPasswordAndAsRole(String email, String pass, String role) {
        Login login = new Login(webDriver);
        login.setEmail(email);
        login.setPass(pass);
        login.setRole(role);
    }

    @And("Click login button")
    public void clickLoginButton() throws InterruptedException {
        Login login = new Login(webDriver);
        login.setBtnlogin();
        Thread.sleep(3000);
    }

    @Then("User already on home page again")
    public void userAlreadyOnHomePageAgain() {
        Login login = new Login(webDriver);
        Assert.assertTrue(login.setSuccess());
        login.setSuccess2();
    }

//    Invalid
    @Then("Pop up about error message login should show up")
    public void popUpAboutErrorMessageShouldShowUp() {
        Login login = new Login(webDriver);
        Assert.assertTrue(login.setError());
        login.setError2();
    }

//    Blank
    @Then("Button login should disabled")
    public void buttonLoginShouldDisabled() {
        Login login = new Login(webDriver);
        Assert.assertFalse(login.setBtnlogin2());
    }
}
