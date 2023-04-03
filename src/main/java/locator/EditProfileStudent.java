package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfileStudent {
    public static WebDriver driver;

    public EditProfileStudent(WebDriver driver){
        PageFactory.initElements(driver, this);
        Login.driver = driver;
    }

    @FindBy(xpath="//a[.='Profile']")
    private WebElement clickProfileStudentPage;
    public void setClickProfilePage(){
        clickProfileStudentPage.click();
    }
    @FindBy(xpath = "//p[@class='text-md text-black font-poppins cursor-pointer']")
    private WebElement btnEditProfileStudent;
    public void vrfyClickEditStudent(){
        btnEditProfileStudent.click();
    }
    @FindBy(id = "input-file")
    private WebElement photo;
    public void setPhoto(String ft){
        photo.sendKeys(ft);
    }
    @FindBy(id = "input-namalengkap")
    private WebElement name;
    public void setName(String nm){
        name.clear();
        name.sendKeys(nm);
    }
    @FindBy(id = "select-role")
    private WebElement jenisKelamin;
    public void setJenisKelamin(String sex){
        jenisKelamin.sendKeys(sex);
    }
    @FindBy(xpath = "//input[@id='input-telepon']")
    private WebElement noHp;
    public void setNoHp(String nhp){
        noHp.clear();
        noHp.sendKeys(nhp);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;
    public void setEmail(String eml){
        email.clear();
        email.sendKeys(eml);
    }
    @FindBy(xpath = "//textarea[@id='input-address']")
    private WebElement address;
    public void setAddress(String adr){
        address.clear();
        address.sendKeys(adr);
    }
    @FindBy(xpath = "//button[@id='btn-Update']")
    private WebElement btnSubmitProfileStudent;
    public void vrfyClickSubmitEditStudent(){
        btnSubmitProfileStudent.click();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnOKSubmitProfileStudent;
    public void vrfyClickOKSubmitEditStudent(){
        btnOKSubmitProfileStudent.click();
    }

    @FindBy(xpath = "//input[@id='input-oldpassword']")
    private WebElement oldPass;
    public void setOldPass(String op){
        oldPass.clear();
        oldPass.sendKeys(op);
    }

    @FindBy(xpath = "//input[@id='input-newpasword']")
    private WebElement newPass;
    public void setNewPass(String np){
        oldPass.clear();
        newPass.sendKeys(np);
    }

    @FindBy(xpath = "//input[@id='input-confirmpassword']")
    private WebElement confirmPass;
    public void setConfirmPass(String cp){
        confirmPass.sendKeys(cp);
    }

    @FindBy(id = "btn-updatepassword")
    private WebElement btnSubmitProfileStudentPassword;
    public void vrfyClickSubmitEditPasswordStudent(){
        btnSubmitProfileStudentPassword.click();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement validateSuccessPass;
    public boolean setValidateSuccessPass(){
        validateSuccessPass.isDisplayed();
        return true;
    }
    public void setValidateSuccessPass2(){
        validateSuccessPass.click();
    }
    @FindBy(xpath="//p[@class='text-md text-red-500 font-poppins cursor-pointer']")
    private WebElement clickDeleteStudent;
    public void setClickDeleteStudentProfile(){
        clickDeleteStudent.click();
    }
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnSureDeleteStudent;
    public void vrfyClickSureDeleteStudent(){
        btnSureDeleteStudent.click();
    }


    //click delete
    // //p[@class='text-md text-red-500 font-poppins cursor-pointer']

    //click sure delete
    // //button[@class='swal2-confirm swal2-styled swal2-default-outline']

    //click profile xpath
    // //a[.='Profile']

    //edit profile xpath
    // //p[@class='text-md text-black font-poppins cursor-pointer']

    // foto id
    // input-file

    //nama lengkap id
    //input-namalengkap
    //xpath //input[@id='input-namalengkap']

    //jenis kelamin id
    //select-role

    //input no hp
    // //input[@id='input-telepon']

    //email xpath
    // //input[@id='input-email']

    //alamat xpath
    // //textarea[@id='input-address']

    //klik update
    // //button[@id='btn-Update']


    //password
    //old password
    // //input[@id='input-oldpassword']

    //new password
    // //input[@id='input-newpassword']

    //confirm
    // //input[@id='input-confirmpassword']

    //klik update password
    // id btn-updatepassword

}
