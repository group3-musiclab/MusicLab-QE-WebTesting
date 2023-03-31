package step_definitions.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Register;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class RegisterSteps {
    private final WebDriver webDriver;

    public RegisterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("Click register on login page")
    public void clickRegisterOnLoginPage() {
        Register register = new Register(webDriver);
        register.setRegister();
    }

    @When("User input {string} as nama lengkap {string} as role {string} as email and {string} as password")
    public void userInputAsNamaLengkapAsRoleAsEmailAndAsPassword(String name, String role, String mail, String pass) {
        Register register = new Register(webDriver);
        register.setName(name);
        register.setRole(role);
        register.setEmail(mail);
        register.setPass(pass);
    }

    @And("Click register button")
    public void clickRegisterButton() throws InterruptedException {
        Register register = new Register(webDriver);
        register.setRegis();
        Thread.sleep(3000);
    }

    @Then("User already on login page")
    public void userAlreadyOnLoginPage() {
        Register register = new Register(webDriver);
        Assert.assertTrue(register.setLogin());
        register.setLogin2();
    }

//    Existing
    @Then("Pop up about error message registration should show up")
    public void popUpAboutErrorMessageRegistrationShouldShowUp() {
        Register register = new Register(webDriver);
        Assert.assertTrue(register.setError2());
        register.setError();
    }

//    Blank
    @Then("Button registration should disabled")
    public void buttonRegistrationShouldDisabled() {
        Register register = new Register(webDriver);
        Assert.assertFalse(register.setRegis2());
    }

    @When("User input {string} as nama lengkap {string} as email and {string} as password")
    public void userInputAsNamaLengkapAsEmailAndAsPassword(String name, String email, String pass) {
        Register register = new Register(webDriver);
        register.setName(name);
        register.setEmail(email);
        register.setPass(pass);
    }
}
