package locator.Transaction;

import locator.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckScheduleMentors {

    public static WebDriver driver;

    public CheckScheduleMentors(WebDriver driver){
        PageFactory.initElements(driver, this);
        Register.driver = driver;
    }

    @FindBy(xpath = "//button[@id='btn-findmentor']")
    private WebElement btnFindMentor;

    //img[@src='https://alif-s3.s3.ap-southeast-1.amazonaws.com/BMs6vGfD3512hC4XBApnz.jpg']
    //img[@src='https://alif-s3.s3.ap-southeast-1.amazonaws.com/2G1np3CzXfBAsM56Dv4hB.jpg']
    @FindBy(xpath = "//img[@src='https://alif-s3.s3.ap-southeast-1.amazonaws.com/DspBM2fnGA5hvBX61zC34.png']")
    private WebElement chooseMentor;

    @FindBy(xpath = "//p[@class='text-5xl font-bold']")
    private WebElement vldateMentorsProfilePage;

    @FindBy(xpath = "//p[@class='font-semibold text-xl']")
    private WebElement validateCoursePage;

    //img[@src='https://alif-s3.s3.ap-southeast-1.amazonaws.com/Mshz243XD1vnGpf5A6BCB.png']
    @FindBy(xpath = "//img[@alt='Album']")
    private WebElement chooseCourse;

    @FindBy(xpath = "//h1[@class='text-black font-bold w-9/12 flex justify-start text-2xl font-poppins lg:mt-0 -mt-8']")
    private WebElement validateNameCourse;

    @FindBy(xpath = "//button[@id='btn-belikursus']")
    private WebElement btnBeliKursus;

    @FindBy(xpath = "//div[@class='flex flex-col w-10/12 min-h-screen p-7 mt-8 space-y-2']/div[3]/p[.='Rp. 799000']")
    private WebElement validateTotalHarga;

    @FindBy(xpath = "//input[@id='input-start_date']")
    private WebElement inputDate;

    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement selectHari;

    @FindBy(xpath = "//button[@class='btn bg-[#3A2BE8] mt-4']")
    private WebElement btnCheckAvail;

    @FindBy(xpath = "//div[@class='swal2-popup swal2-modal animate__animated animate__fadeIn animate__faster']")
    private WebElement vldtCheckAvail;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnPopUpCheckAvailOk;

    public void setBtnFindMentor(){
        btnFindMentor.click();
    }

    public void setChooseMentor(){
        chooseMentor.click();
    }

    public boolean setValidateMentorsProfilePage(){
        vldateMentorsProfilePage.isEnabled();
        return true;
    }

    public boolean setValidateCoursePage(){
        validateCoursePage.isEnabled();
        return true;
    }

    public void setChooseCourse(){
        chooseCourse.click();
    }

    public boolean setValidateNameCourse(){
        validateNameCourse.isEnabled();
        return true;
    }

    public void setBtnBeliKursus(){
        btnBeliKursus.click();
    }

    public boolean setValidateTotalHarga(){
        validateTotalHarga.isEnabled();
        return true;
    }

    public void setInputDate(int ddmmyyyy){
        String dateString = Integer.toString(ddmmyyyy);
        inputDate.sendKeys(dateString);
    }

    public void setPilihHari(String text){
        Select status = new Select(selectHari);
        status.selectByVisibleText(text);
    }

    public void setBtnCheckAvail(){
        btnCheckAvail.click();
    }

    public boolean setValidateMentorAvail(){
        vldtCheckAvail.isEnabled();
        return true;
    }

    public void setBtnPopUpCheckAvailOk(){
        btnPopUpCheckAvailOk.click();
    }

}
