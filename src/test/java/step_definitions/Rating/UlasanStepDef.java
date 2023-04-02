package step_definitions.Rating;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.Rating.Ulasan;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class UlasanStepDef {

    private final WebDriver webDriver;

    public UlasanStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("Student click button profile")
    public void studentClickButtonProfile() throws InterruptedException {
        Ulasan ulasan = new Ulasan(webDriver);
        ulasan.setBtnProfile();
        Thread.sleep(1000);
    }

    @And("Student click button jadwal")
    public void studentClickButtonJadwal() throws InterruptedException {
        Ulasan ulasan = new Ulasan(webDriver);
        ulasan.setBtnJadwal();
        Thread.sleep(1000);
    }

    @And("Validate history belajar page")
    public void validatePageHistoryBelajar() throws InterruptedException {
        Ulasan ulasan = new Ulasan(webDriver);
        Assert.assertTrue(ulasan.setValidateHistoryBelajar());
        webDriver.navigate().refresh();
        Thread.sleep(3000);
    }

    @Then("Student click button beri ulasan")
    public void studentClickButtonBeriUlasan() throws InterruptedException {
        Ulasan ulasan = new Ulasan(webDriver);
        ulasan.setBeriUlasan();
        Thread.sleep(3000);
    }

    @And("Student input comments {string}")
    public void userInputComments(String comments) {
        Ulasan ulasan = new Ulasan(webDriver);
        ulasan.setCommentField(comments);
    }

    @And("Student give ratings 5 stars")
    public void giveStartRatingLima() throws InterruptedException {
        Ulasan ulasan = new Ulasan(webDriver);
        ulasan.setStarLima();
        Thread.sleep(3000);
    }

    @Then("Click submit ulasan")
    public void clickSubmitUlasan() throws InterruptedException {
        Ulasan ulasan = new Ulasan(webDriver);
        ulasan.setButtonSubmitUlasan();
        Thread.sleep(3000);
    }

    @And("Validate Pop-up message success give ratings")
    public void validateSuccessGiveRatings() throws InterruptedException{
        Ulasan ulasan = new Ulasan(webDriver);
        Assert.assertTrue(ulasan.validatePopUpSuccessUlasan());
        Thread.sleep(2000);
        ulasan.setButtonPopupUlasanOk();
    }

    //    Over Character
    @Then("Validate comments field with 300 character")
    public void validateCommentMaxLength() throws InterruptedException{
        Ulasan ulasan = new Ulasan(webDriver);
        Assert.assertTrue(ulasan.validateMaxLengthComments());
        Thread.sleep(3000);
    }

    @And("Validate Pop-up message failed give ratings")
    public void validateFailedGiveRatings() throws InterruptedException{
        Ulasan ulasan = new Ulasan(webDriver);
        Assert.assertTrue(ulasan.validatePopUpFailedUlasan());
        Thread.sleep(2000);
        ulasan.setButtonPopupUlasanOk();
    }
}
