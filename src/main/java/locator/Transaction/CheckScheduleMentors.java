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

    @FindBy(xpath = "//div[11]//img[@src='https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png']")
    private WebElement chooseMentor;

    @FindBy(xpath = "//p[@class='font-semibold text-xl']")
    private WebElement validateCoursePage;

    @FindBy(xpath = "//div[@class='m-2 mt-7 grid grid-cols-2 space-x-5 gap-14']/div[5]//h2[@class='card-title']")
    private WebElement chooseCourse;

    @FindBy(xpath = "//h1[@class='text-black font-bold w-9/12 flex justify-start text-2xl font-poppins lg:mt-0 -mt-8']")
    private WebElement validateNameCourse;

    @FindBy(xpath = "//button[@id='btn-belikursus']")
    private WebElement btnBeliKursus;

    @FindBy(xpath = "//div[@class='flex flex-col w-10/12 min-h-screen p-7 mt-8 space-y-2']/div[3]/p[.='Rp. 325000']")
    private WebElement validateTotalHarga;

    @FindBy(xpath = "//input[@id='input-start_date']")
    private WebElement inputDate;

    @FindBy(xpath = "//select[@id='select-role']")
    private WebElement selectHari;

    @FindBy(xpath = "//button[@class='btn bg-[#3A2BE8] mt-4']")
    private WebElement btnCheckAvail;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement vldtCheckAvail;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnPopUpCheckAvailOk;

    //div[.='Continue Payment']
    //button[@class='btn bg-[#3A2BE8] mt-4 disabled:border-slate-200 disabled:cursor-not-alloweds']
    @FindBy(xpath = "//button[@class='btn bg-[#3A2BE8] mt-4 disabled:border-slate-200 disabled:cursor-not-alloweds']")
    private WebElement btnContiPayment;

    public void setChooseMentor(){
        chooseMentor.click();
    }

    public boolean setValidateCoursePage(){
        validateCoursePage.isEnabled();
        return false;
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

    public void setBtnContiPayment(){
        btnContiPayment.click();
    }

}
