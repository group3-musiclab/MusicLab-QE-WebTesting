package step_definitions.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Google;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class GoogleSteps {

    private final WebDriver webDriver;

    public GoogleSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("Click login google")
    public void clickLoginGoogle() {
        Google google = new Google(webDriver);
        google.setOauth();
    }

    @When("Click choose account")
    public void clickChooseAccount() throws InterruptedException {
        Google google = new Google(webDriver);
        google.setChoose();
    }

    @Then("Process to login with google with {string} as email {string} as password")
    public void processToLoginWithGoogleWithAsEmailAsPassword(String email, String pass) throws InterruptedException {
        Google google = new Google(webDriver);
        google.logGoogle(email, pass);
    }

    @And("Click proceed to login button")
    public void clickProceedToLoginButton() throws InterruptedException {
        Google google = new Google(webDriver);
        google.setProceed();
        Thread.sleep(3000);
    }

//    Invalid
    @Then("Pop up about error login should show up")
    public void popUpAboutErrorLoginShouldShowUp() {
        Google google = new Google(webDriver);
        Assert.assertTrue(google.setError());
        google.setError2();
    }
}
