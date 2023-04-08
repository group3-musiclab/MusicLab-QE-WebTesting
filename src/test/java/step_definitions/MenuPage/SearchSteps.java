package step_definitions.MenuPage;

import io.cucumber.java.en.Then;
import locator.Menu;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class SearchSteps {

    private final WebDriver webDriver;

    public SearchSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("Input mentor name in search field {string}")
    public void inputMentorNameInSearchField(String name) {
        Menu menu = new Menu(webDriver);
        menu.setCari(name);
    }
}
