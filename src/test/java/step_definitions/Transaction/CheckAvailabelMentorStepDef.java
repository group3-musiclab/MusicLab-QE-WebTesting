package step_definitions.Transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.Transaction.CheckScheduleMentors;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class CheckAvailabelMentorStepDef {

    private final WebDriver webDriver;

    public CheckAvailabelMentorStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("Student click button Find Mentor")
    public void studentClickButtonFindMentor() throws InterruptedException {
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        checkScheduleMentors.setBtnFindMentor();
        Thread.sleep(3000);
    }

    @And("Student choose mentors")
    public void studentChooseMentors() throws InterruptedException {
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        checkScheduleMentors.setChooseMentor();
        Thread.sleep(3000);
        webDriver.navigate().refresh();
    }

    @And("Validate Mentor Profile page")
    public void validateMentorProfilePage() throws InterruptedException {
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        Assert.assertTrue(checkScheduleMentors.setValidateMentorsProfilePage());
        Thread.sleep(3000);
    }

    @Then("Student choose course")
    public void studentChooseCourse() throws InterruptedException {
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        checkScheduleMentors.setChooseCourse();
        Thread.sleep(3000);
    }

    @And("Validate Name Course page")
    public void validateNameCoursePage() throws InterruptedException {
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        Assert.assertTrue(checkScheduleMentors.setValidateNameCourse());
        Thread.sleep(3000);
    }

    @Then("Click button beli kursus")
    public void studentClickBeliKursus() throws InterruptedException {
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        checkScheduleMentors.setBtnBeliKursus();
        Thread.sleep(3000);
    }

    @And("Validate Total Biaya course")
    public void validateTotalBiayaCourse() throws InterruptedException {
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        Assert.assertTrue(checkScheduleMentors.setValidateTotalHarga());
        Thread.sleep(3000);
    }

    @Then("Student set date course {int}")
    public void studentSetDate(int ddmmyyyy) throws InterruptedException{
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        checkScheduleMentors.setInputDate(ddmmyyyy);
        Thread.sleep(2000);
    }

    @And("Student set pilih hari {string}")
    public void studentPilihHariCourse(String text) throws InterruptedException{
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        checkScheduleMentors.setPilihHari(text);
        Thread.sleep(2000);
    }

    @And("Student click button check available")
    public void clickButtonCheckAvail() throws InterruptedException{
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        checkScheduleMentors.setBtnCheckAvail();
        Thread.sleep(3000);
    }

    @And("Validate Pop-up message Schedule Mentor")
    public void validatePopupMentorIsAvail() throws InterruptedException{
        CheckScheduleMentors checkScheduleMentors = new CheckScheduleMentors(webDriver);
        Assert.assertTrue(checkScheduleMentors.setValidateMentorAvail());
        Thread.sleep(2000);
        checkScheduleMentors.setBtnPopUpCheckAvailOk();
    }
}
