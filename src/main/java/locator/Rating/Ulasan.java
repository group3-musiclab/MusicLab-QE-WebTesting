package locator.Rating;

import locator.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ulasan {

    public static WebDriver driver;

    public Ulasan(WebDriver driver){
        PageFactory.initElements(driver, this);
        Login.driver = driver;
    }

    @FindBy(xpath = "//a[.='Profile']")
    private WebElement btnProfile;

    @FindBy(xpath = "//button[@class='btn border-none rounded-xl w-5/6 lg:w-3/6 bg-[#3A2BE8] text-white font-semibold mt-5']")
    private WebElement btnJadwal;

    @FindBy(xpath = "//h1[@class='text-button font-bold text-2xl']")
    private WebElement validateHistoryBelajar;

    @FindBy(xpath = "//button[.='Next']")
    private WebElement btnNext;

    @FindBy(xpath = "//tbody[1]/tr[1]//button[@id='btn-linkulasan']")
    private WebElement btnBeriUlasan;

    @FindBy(xpath = "//h1[@class='text-black font-poppins font-semibold text-2xl']")
    private WebElement vldtPageUlasan;

    @FindBy(xpath = "//textarea[@id='input-deskripsi']")
    private WebElement commentField;

    @FindBy(xpath = "//textarea[@maxlength='300']")
    private WebElement commentFieldMaxLength;

    @FindBy(xpath = "//button[1]/span[@class='star text-6xl']")
    private WebElement starSatu;

    @FindBy(xpath = "//button[2]/span[@class='star text-6xl']")
    private WebElement starDua;

    @FindBy(xpath = "//button[3]/span[@class='star text-6xl']")
    private WebElement starTiga;

    @FindBy(xpath = "//button[4]/span[@class='star text-6xl']")
    private WebElement starEmpat;

    @FindBy(xpath = "//button[5]/span[@class='star text-6xl']")
    private WebElement starLima;

    @FindBy(xpath = "//button[@id='btn-submitulasan']")
    private WebElement buttonSubmitUlasan;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement vldtPopupSuccessUlasan;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement vldtPopupFailedUlasan;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement buttonPopupUlasanOk;


    public void setBtnProfile(){
        btnProfile.click();
    }

    public void setBtnJadwal() throws InterruptedException{
        btnJadwal.click();
        Thread.sleep(3000);
    }

    public boolean setValidateHistoryBelajar(){
        validateHistoryBelajar.isEnabled();
        return true;
    }

    public void setBtnNext(){
        btnNext.click();
    }

    public void setBeriUlasan(){
        btnBeriUlasan.click();
    }

    public boolean validateUlasanPage(){
        vldtPageUlasan.isEnabled();
        return true;
    }

    public void setCommentField(String comment){
        commentField.sendKeys(comment);
    }

    public boolean validateMaxLengthComments(){
        commentFieldMaxLength.isEnabled();
        return true;
    }

    public void setStarSatu(){
        starSatu.click();
    }

    public void setStarDua(){
        starDua.click();
    }

    public void setStarTiga(){
        starTiga.click();
    }

    public void setStarEmpat(){
        starEmpat.click();
    }

    public void setStarLima(){
        starLima.click();
    }

    public void setButtonSubmitUlasan(){
        buttonSubmitUlasan.click();
    }

    public boolean validatePopUpSuccessUlasan(){
        vldtPopupSuccessUlasan.isEnabled();
        return true;
    }

    public boolean validatePopUpFailedUlasan(){
        vldtPopupFailedUlasan.isEnabled();
        return true;
    }

    public void setButtonPopupUlasanOk(){
        buttonPopupUlasanOk.click();
    }
}
