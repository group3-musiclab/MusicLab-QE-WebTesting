package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfileMentor {
    public static WebDriver driver;

    public EditProfileMentor(WebDriver driver){
        PageFactory.initElements(driver, this);
        Login.driver = driver;
    }
    @FindBy(xpath="//a[.='Profile']")
    private WebElement clickProfileMentorPage;
    public void vrfyClickMentorProfilePage(){
        clickProfileMentorPage.click();
    }
    @FindBy(id = "btn-editTeacher")
    private WebElement btnEditProfileMentor;
    public void vrfyClickEditMentor(){
        btnEditProfileMentor.click();
    }
    @FindBy(id = "input-file")
    private WebElement photoMentor;
    public void setPhotoMentor(){
        driver.get("https://images.app.goo.gl/YzaGdcBAykupcFWA6");
        driver.findElement(By.id("file-upload")).sendKeys("input-file.jpg");
    }
    @FindBy(xpath = "//input[@class='input input-bordered w-10/12 lg:w-9/12 bg-bg-input border-slate-300 text-black font-semibold font-poppins bg-white']")
    private WebElement nameMentor;
    public void setNameMentor(String nmm){
        nameMentor.clear();
        nameMentor.sendKeys(nmm);
    }
    @FindBy(id = "input-deskripsi")
    private WebElement deskripsiMentor;
    public void setDeskripsiMentor(String desc){
        deskripsiMentor.clear();
        deskripsiMentor.sendKeys(desc);
    }
    @FindBy(id = "select-jeniskelamin")
    private WebElement jenisKelaminMentor;
    public void setJenisKelaminMentor(String sexm){
        jenisKelaminMentor.sendKeys(sexm);
    }
    @FindBy(xpath = "//input[@id='input-telepon']")
    private WebElement noHpM;
    public void setNoHpMentor(String nhpm){
        noHpM.clear();
        noHpM.sendKeys(nhpm);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailMentor;
    public void setEmailMentor(String emlm){
        emailMentor.clear();
        emailMentor.sendKeys(emlm);
    }
    @FindBy(xpath = "//input[@id='input-socialmedia-instagram']")
    private WebElement instagramMentor;
    public void setInstagramMentor(String ig){
        instagramMentor.clear();
        instagramMentor.sendKeys(ig);
    }
    @FindBy(xpath = "//textarea[@id='input-address']")
    private WebElement addressMentor;
    public void setAddressMentor(String adrm){
        addressMentor.clear();
        addressMentor.sendKeys(adrm);
    }
    @FindBy(xpath = "//button[@id='btn-Update']")
    private WebElement updateMentor;
    public void setUpdateMentor(){
        updateMentor.click();
    }
    @FindBy(xpath = "//button[@id='btn-Update']")
    private WebElement btnSubmitProfileMentor;
    public void VrfyClickSubmitEditMentor(){
        btnSubmitProfileMentor.click();
    }

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement vrfyUpdateProfileMentor;
    public boolean setVrfySuccesMentorNotif() {
        return vrfyUpdateProfileMentor.isDisplayed();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnOKSubmitProfileMentor;
    public void vrfyClickOKSubmitEditMentor(){
        btnOKSubmitProfileMentor.click();
    }
    @FindBy(id = "input-oldpassword")
    private WebElement oldPassMentor;
    public void setOldPassMentor(String opm){
        oldPassMentor.sendKeys(opm);
    }

    @FindBy(id = "input-newpassword")
    private WebElement newPassMentor;
    public void setNewPassMentor(String npm){
        newPassMentor.sendKeys(npm);
    }

    @FindBy(id = "input-confirmpassword")
    private WebElement confirmPassMentor;
    public void setConfirmPassMentor(String cpm){
        confirmPassMentor.sendKeys(cpm);
    }

    @FindBy(id = "//button[.='Update Password']")
    private WebElement btnSubmitProfileMentorPassword;
    public void VrfyClickSubmitEditPasswordMentor(){
        btnSubmitProfileMentorPassword.click();
    }

    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement tipeCertificateMentor;
    public void setTypeCertificateMentor(String tctm){
        tipeCertificateMentor.sendKeys(tctm);
    }

    @FindBy(xpath = "//input[@class='input input-bordered   border-slate-300  w-10/12 lg:w-full lg:max-w-xs flex justify-center bg-white mx-auto  text-black font-semibold font-poppins']")
    private WebElement nameCertificateMentor;
    public void setNameCertificateMentor(String nctm){
        nameCertificateMentor.sendKeys(nctm);
    }

    @FindBy(xpath = "//input[@class='file-input h-10 w-10/12 lg:w-full lg:max-w-xs flex justify-center bg-white mx-auto mt-10 border-none']")
    private WebElement fotoCertificateMentor;
    public void setFotoCertificateMentor(){
        driver.get("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmV0vVZrV9eaczVDxsTuVwhf3dyM0Va29nnQ&usqp=CAU");
        driver.findElement(By.id("file-upload")).sendKeys("//input[@class='file-input h-10 w-10/12 lg:w-full lg:max-w-xs flex justify-center bg-white mx-auto mt-10 border-none'].jpg");
    }

    @FindBy(xpath = "//button[@id='btn-uploadsertifikat']")
    private WebElement btnSubmitCertificateMentor;
    public void VrfyClickUpdateCertificateMentor(){
        btnSubmitCertificateMentor.click();
    }

    @FindBy(xpath = "//select[2]")
    private WebElement instrumentMentor;
    public void setInstrumentMentor(String istm){
        instrumentMentor.sendKeys(istm);
    }

    @FindBy(id = "btn-submitinstrument")
    private WebElement btnSubmitInstrumentMentor;
    public void VrfyClickUpdateInstrumentMentor(){
        btnSubmitInstrumentMentor.click();
    }

    @FindBy(xpath = "//select[3]")
    private WebElement genreMentor;
    public void setGenreMentor(String gm){
        genreMentor.sendKeys(gm);
    }

    @FindBy(xpath = "//button[.='Update Genres']")
    private WebElement btnSubmitGenreMentor;
    public void VrfyClickUpdateGenreMentor(){
        btnSubmitGenreMentor.click();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement validateSuccessInstrumentPass;
    public boolean setValidateSuccessInstrumentPass(){
        validateSuccessInstrumentPass.isDisplayed();
        return true;
    }
    public void setValidateSuccessInstrumentPass2(){
        validateSuccessInstrumentPass.click();
    }
    @FindBy(xpath="//button[@id='btn-deactivateaccount']")
    private WebElement clickDeleteMentor;
    public void setClickDeleteMentorProfile(){
        clickDeleteMentor.click();
    }
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnSureDeleteMentor;
    public void vrfyClickSureDeleteMentor(){
        btnSureDeleteMentor.click();
    }

}
