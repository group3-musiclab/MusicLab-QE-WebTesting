package step_definitions.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.EditProfileMentor;
import locator.EditProfileStudent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class EditProfileMentorSteps {
    private final WebDriver webDriver;

    public EditProfileMentorSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("Click mentor profile button")
    public void studentClickButtonProfile() throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.vrfyClickMentorProfilePage();
        Thread.sleep(3000);
    }

    @And("Click edit mentor profile")
    public void clickEditMentorProfile() throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.vrfyClickEditMentor();
        Thread.sleep(3000);
        webDriver.navigate().refresh();
    }

//    @When("Mentor input nama lengkap {string} deskripsi {string} jenis kelamin {string} no. HP {string} email {string} instagram account link {string} and alamat {string}")
//    public void mentorInputNamaLengkapDeskripsiJenisKelaminNoHPNoHPEmailInstagramAccountLinkAndAlamat(String nmm, String desc, String sexm, String nhpm, String emlm, String ig, String adrm) throws InterruptedException {
//        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
//        editProfileMentor.setNameMentor(nmm);
//        Thread.sleep(3000);
//        editProfileMentor.setDeskripsiMentor(desc);
//        Thread.sleep(3000);
//        editProfileMentor.setJenisKelaminMentor(sexm);
//        Thread.sleep(3000);
//        editProfileMentor.setNoHpMentor(nhpm);
//        Thread.sleep(3000);
//        editProfileMentor.setEmailMentor(emlm);
//        Thread.sleep(3000);
//        editProfileMentor.setInstagramMentor(ig);
//        editProfileMentor.setAddressMentor(adrm);
//    }
    @When("Mentor input nama lengkap {string} deskripsi {string} jenis kelamin {string} no. HP {string} email {string} instagram account link {string}and alamat {string}")
    public void mentorInputNamaLengkapDeskripsiJenisKelaminNoHPEmailInstagramAccountLinkAndAlamat(String nmm, String desc, String sexm, String nhpm, String emlm, String ig, String adrm) throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setNameMentor(nmm);
        Thread.sleep(3000);
        editProfileMentor.setDeskripsiMentor(desc);
        Thread.sleep(3000);
        editProfileMentor.setJenisKelaminMentor(sexm);
        Thread.sleep(3000);
        editProfileMentor.setNoHpMentor(nhpm);
        Thread.sleep(3000);
        editProfileMentor.setEmailMentor(emlm);
        Thread.sleep(3000);
        editProfileMentor.setInstagramMentor(ig);
        editProfileMentor.setAddressMentor(adrm);
//        editProfileMentor.vrfyClickMentorProfilePage();
    }

    @And("Mentor input image profile mentor")
    public void mentorInputImageProfileMentor() {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setPhotoMentor();
    }

    @Then("click Update Mentor button")
    public void clickUpdateMentorButton() {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setUpdateMentor();

    }

    @And("validate Success Mentor notification")
    public void validateSuccessNotification() {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        Assert.assertTrue(editProfileMentor.setVrfySuccesMentorNotif());
        editProfileMentor.vrfyClickOKSubmitEditMentor();
    }

    @When("Mentor input old password {string} new password {string} and confirmation password {string}")
    public void mentorInputOldPasswordNewPasswordAndConfirmationPassword(String opm, String npm, String cpm) throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setOldPassMentor(opm);
        Thread.sleep(3000);
        editProfileMentor.setNewPassMentor(npm);
        Thread.sleep(3000);
        editProfileMentor.setConfirmPassMentor(cpm);
        Thread.sleep(3000);
    }

    @Then("click Update Password mentor button")
    public void clickUpdatePasswordMentorButton() {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.vrfyClickMentorProfilePage();
    }

    @When("Mentor input type certificate {string} and certificate name {string}")
    public void mentorInputTypeCertificateCertificateNameAndCertificatePhoto(String tctm, String nctm) throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setTypeCertificateMentor(tctm);
        Thread.sleep(4000);
        editProfileMentor.setNameCertificateMentor(nctm);
        Thread.sleep(4000);
    }
    @And("Mentor input photo in certificate photo")
    public void mentorInputPhotoCertificate() throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setFotoCertificateMentor();
        Thread.sleep(4000);
    }

    @Then("Click Update Certificate Mentor button")
    public void clickUpdateCertificateMentorButton() throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.VrfyClickUpdateCertificateMentor();
        Thread.sleep(3000);
    }

    @When("Mentor input instrument they want to teach {string}")
    public void mentorInputInstrumentTheyWantToTeach(String istm) throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        Thread.sleep(2000);
        editProfileMentor.setInstrumentMentor(istm);
        Thread.sleep(5000);
    }

    @Then("Click Update Instrument Mentor button")
    public void clickUpdateInstrumentMentorButton() throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.VrfyClickUpdateInstrumentMentor();
        Thread.sleep(3000);
    }

    @When("Mentor input genre {string}")
    public void mentorInputGenre(String gm) throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setGenreMentor(gm);
        Thread.sleep(3000);
    }

    @Then("Click Update Genre Mentor button")
    public void clickUpdateGenreMentorButton() {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.VrfyClickUpdateGenreMentor();
    }

    @And("validate Success Update Instrument notification")
    public void validateSuccessUpdatePasswordNotification() throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        Assert.assertTrue(editProfileMentor.setValidateSuccessInstrumentPass());
        Thread.sleep(4000);
        editProfileMentor.setValidateSuccessInstrumentPass2();
        Thread.sleep(4000);
    }
    @And("validate Pop Up notification text {string}")
    public void validatePopUpNotification(String popUpMessage) throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        Assert.assertEquals(popUpMessage, editProfileMentor.setValidatePopUpMessage());
        Thread.sleep(4000);
        editProfileMentor.setClickOKPopUpMessage();
        Thread.sleep(4000);
    }
    @And("validate Pop Up notification")
    public void validatePopUpNotificationError() throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setClickOKPopUpMessage();
        Thread.sleep(4000);
    }
    @And("Click delete mentor profile")
    public void clickDeleteMentorProfile() throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setClickDeleteMentorProfile();
        Thread.sleep(3000);
        editProfileMentor.vrfyClickSureDeleteMentor();
        Thread.sleep(3000);
    }



}
