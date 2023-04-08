package step_definitions.MenuPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.Menu;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class InsSteps {

    private final WebDriver webDriver;

    public InsSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("Click find mentor")
    public void clickFindMentor() throws InterruptedException {
        Menu menu =new Menu(webDriver);
        menu.setFind();
        Thread.sleep(3000);
    }

    @Then("Click {string} as filter instrument")
    public void clickAsFilterInsrument(String ins) {
        Menu menu =new Menu(webDriver);
        menu.setSelect1(ins);
    }

    @Then("Click {string} as filter rating")
    public void clickAsFilterRating(String rating) {
        Menu menu =new Menu(webDriver);
        menu.setSelect2(rating);
    }
}
