package step_definitions.Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class UploadjadwalSteps {
    private final WebDriver webDriver;

    public UploadjadwalSteps(WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }


    @Given("Mentor click hari")
    public void mentorClickHari() throws InterruptedException {
        UploadjadwalSteps uploadjadwalSteps = new UploadjadwalSteps(webDriver ) ;
        uploadjadwalSteps.mentorClickHari() ;
        Thread.sleep(1500) ;

    }

    @When("Mentor input jam mulai jam selesai")
    public void mentorInputJamMulaiJamSelesai() throws InterruptedException {
        UploadjadwalSteps uploadjadwalSteps = new UploadjadwalSteps(webDriver ) ;
        uploadjadwalSteps.mentorInputJamMulaiJamSelesai() ;
        Thread.sleep(1500) ;
    }

    @Then("click save button")
    public void clickSaveButton() throws InterruptedException {
        UploadjadwalSteps uploadjadwalSteps = new UploadjadwalSteps(webDriver ) ;
        uploadjadwalSteps.clickSaveButton() ;
        Thread.sleep(1500) ;
    }
}
