package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadJadwal {
    public static WebDriver webDriver;
    public UploadJadwal (WebDriver webDriver ){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy (xpath = "//summary[.='Tambah Jadwal']")
    private WebElement Uploadjadwal;
    public void clickUploadjadwal(){Uploadjadwal.click() ;}

    public boolean Verifyjadwal(){
        Uploadjadwal.isDisplayed() ;
        return true ;
    }

    @FindBy (xpath = "//select[@id='select-role']")
    private WebElement SelectRole;
    public void clickSelectRole(){SelectRole.click() ;}

    @FindBy (xpath = "//input[@id='input-startTime']")
    private WebElement starttime;
    public void setStarttime (String inputstarttime){starttime.sendKeys(inputstarttime ) ;}

    @FindBy (xpath = "//input[@id='input-endTime']")
    private WebElement endtime;
    public void setEndtime (String inputendtime){endtime.sendKeys(inputendtime ) ;}

    @FindBy (xpath = "//button[@id='btn-jadwal']")
    private WebElement buttonjadwal;
    public void clickbuttonjadwal (){buttonjadwal.click();}

    public boolean jadwal(){
        buttonjadwal.isDisplayed() ;
        return true;
    }

}
