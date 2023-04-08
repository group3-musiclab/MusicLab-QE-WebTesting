package step_definitions.MenuPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.Menu;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class NextPrevSteps {

    private final WebDriver webDriver;

    public NextPrevSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("Click button next")
    public void clickButtonNext() throws InterruptedException {
        Menu menu = new Menu(webDriver);
        menu.setNext();
        Thread.sleep(3000);
    }

    @And("Click button prev")
    public void clickButtonPrev() {
        Menu menu = new Menu(webDriver);
        menu.setPrev();
    }
}
