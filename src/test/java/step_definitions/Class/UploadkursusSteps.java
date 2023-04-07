package step_definitions.Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class UploadkursusSteps {
    private final WebDriver webDriver;

    public UploadkursusSteps (WebDriver webDriver ) {
        super();
        this.webDriver = webDriver;

    }

    @Given("click profile button")
    public void clickProfileButton() {
        UploadkursusSteps uploadkursusSteps = new UploadkursusSteps(webDriver);
        uploadkursusSteps.clickProfileButton() ;
    }

    @And("click kursus saya")
    public void clickKursusSaya() {
        UploadkursusSteps uploadkursusSteps = new UploadkursusSteps(webDriver );
        uploadkursusSteps.clickKursusSaya() ;
    }

    @And("click upload new course")
    public void clickUploadNewCourse() {
        UploadkursusSteps uploadkursusSteps = new UploadkursusSteps(webDriver );
        uploadkursusSteps.clickUploadNewCourse() ;
    }

    @When("user input {string} as judul kursus")
    public void userInputAsJudulKursus(String judulkursus) {
        UploadkursusSteps uploadkursusSteps = new UploadkursusSteps(webDriver );
        uploadkursusSteps.userInputAsJudulKursus(judulkursus );
    }

    @And("click tingkatan kursus\\/ Level")
    public void clickTingkatanKursusLevel() {
        UploadkursusSteps uploadkursusSteps = new UploadkursusSteps(webDriver );
        uploadkursusSteps.clickTingkatanKursusLevel() ;
    }

    @When("user input {string} as deskripsi {string} as apa yang dipelajari {string} as prasyarat khusus {string} as untuk siapa kursus ini {string} as harga khusus {string} as duration")
    public void userInputAsDeskripsiAsApaYangDipelajariAsPrasyaratKhususAsUntukSiapaKursusIniAsHargaKhususAsDuration(String deskripsikhusus, String apayangdipelajari, String prasyaratkhusus, String untuksiapakursusini, String hargakhusus, String duration) {
        UploadkursusSteps uploadkursusSteps = new UploadkursusSteps(webDriver );

    }




    @And("click upload kursus button")
    public void clickUploadKursusButton() {
        UploadkursusSteps uploadkursusSteps = new UploadkursusSteps(webDriver );
        uploadkursusSteps.clickUploadKursusButton() ;
    }

    @Then("success make a class")
    public void successMakeAClass() {
        UploadkursusSteps uploadkursusSteps = new UploadkursusSteps(webDriver );
        uploadkursusSteps.successMakeAClass() ;
    }


    @Then("warning Failed Upload Course")
    public void warningFailedUploadCourse() {
    }

}
