package step_definitions.Student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.EditProfileMentor;
import locator.EditProfileStudent;
import locator.Login;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

import static locator.EditProfileStudent.driver;

public class EditProfileStudentSteps {
    private final WebDriver webDriver;

    public EditProfileStudentSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("Click student profile button")
    public void studentClickButtonProfile() throws InterruptedException {
        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
        editProfileStudent.setClickProfilePage();
        Thread.sleep(3000);
    }

    @And("Click edit student profile")
    public void clickEditStudentProfile() throws InterruptedException {
        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
        editProfileStudent.vrfyClickEditStudent();
        Thread.sleep(3000);
        webDriver.navigate().refresh();
    }

    @When("Student input nama lengkap {string} jenis kelamin {string} no. HP {string} email {string} and alamat {string}")
    public void studentInputNamaLengkapJenisKelaminNoHPEmailAndAlamat(String nm, String sex, String nhp, String eml, String adr) throws InterruptedException {
        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
        editProfileStudent.setName(nm);
        Thread.sleep(3000);
        editProfileStudent.setJenisKelamin(sex);
        Thread.sleep(3000);
        editProfileStudent.setNoHp(nhp);
        Thread.sleep(3000);
        editProfileStudent.setEmail(eml);
        Thread.sleep(3000);
        editProfileStudent.setAddress(adr);
        Thread.sleep(3000);
    }

    @Then("click Update Student button")
    public void clickUpdateStudentButton() throws InterruptedException {
        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
        editProfileStudent.vrfyClickSubmitEditStudent();
        Thread.sleep(3000);
    }

//    @And("validate Success notification {string}")
//    public void validateSuccessNotification(String success) throws InterruptedException {
//        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
////        Assert.assertTrue(editProfileStudent.setVrfyCartList());
//        WebElement a = webDriver.findElement(By.xpath("//div[@class='"+success+"']"));
//        a.isDisplayed();
//        Assert.assertTrue(true);
//        Thread.sleep(3000);
//        editProfileStudent.vrfyClickOKSubmitEditStudent();
//    }

    @And("validate Warning notification \"([^\"]*)\"")
    public void validateWarningNotification(String error) throws InterruptedException {
        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
        WebElement a = webDriver.findElement(By.xpath("//div[@class='"+error+"']"));
        a.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(3000);
        editProfileStudent.vrfyClickOKSubmitEditStudent();
    }

    @When("Student input old password {string} new password {string} and confirmation password {string}")
    public void studentInputOldPasswordNewPasswordAndConfirmationPassword(String op, String np, String cp) throws InterruptedException {
        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
        editProfileStudent.setOldPass(op);
        Thread.sleep(3000);
        editProfileStudent.setNewPass(np);
        Thread.sleep(5000);
        editProfileStudent.setConfirmPass(cp);
        Thread.sleep(5000);
    }
    @And("Student input photo in profile photo")
    public void mentorInputPhotoCertificate() throws InterruptedException {
        EditProfileMentor editProfileMentor = new EditProfileMentor(webDriver);
        editProfileMentor.setFotoCertificateMentor();
        Thread.sleep(4000);
    }

    @Then("click Update Password student button")
    public void clickUpdatePasswordStudentButton() throws InterruptedException {
        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
        editProfileStudent.vrfyClickSubmitEditPasswordStudent();
        Thread.sleep(4000);
    }

    @And("validate Success Update notification")
    public void validateSuccessUpdatePasswordNotification() throws InterruptedException {
        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
        Assert.assertTrue(editProfileStudent.setValidateSuccessPass());
        Thread.sleep(3000);
        editProfileStudent.setValidateSuccessPass2();
        Thread.sleep(3000);
    }

    @And("Click delete student profile")
    public void clickDeleteStudentProfile() throws InterruptedException {
        EditProfileStudent editProfileStudent = new EditProfileStudent(webDriver);
        editProfileStudent.setClickDeleteStudentProfile();
        Thread.sleep(3000);
        editProfileStudent.vrfyClickSureDeleteStudent();
        Thread.sleep(3000);
    }
}
