package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadKursus {
    public static WebDriver webDriver;
    public UploadKursus (WebDriver webDriver ){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//*[@id=\"btn-kursussaya\"]")
    private WebElement Kursussaya;
    public void clickKursussaya(){Kursussaya.click() ;
    }
    public boolean VerifyKursussaya(){
        Kursussaya .isDisplayed();
        return true;
    }
    @FindBy(xpath = "//*[@id=\"btn-uploadnewcourse\"]")
    private WebElement uploadnewcourse;
    public void clickuploadnewcourse(){uploadnewcourse.click() ;}

    @FindBy (xpath = "//input[@id='input-header-kursus']")
    private WebElement uploadfoto;
    public void clickuploadfoto(){uploadfoto.click() ;}

    @FindBy (xpath = "//input[@id='input-harga-kursus']")
    private WebElement inputhargakursus;
    public void setInputhargakursus(String setharga){inputhargakursus.sendKeys(setharga) ;}

    @FindBy (xpath = "//input[@id='input-duratopn']")
    private WebElement duration;
    public void setDuration (String inputduration){duration.sendKeys(inputduration);}

    @FindBy (xpath = "//input[@id='input-judulkursus']")
    private WebElement judulkursus;
    public void setJudulkursus (String inputjudul){judulkursus.sendKeys(inputjudul ); }

    @FindBy (xpath = "//select[@id='select-role']")
    private WebElement selectrole;
    public void clickselectrole (){selectrole.click() ;}

    @FindBy (xpath = "//textarea[@id='input-deskripsikursus']")
    private WebElement deskripsi;
    public void setDeskripsi (String inputdeskripsi){deskripsi.sendKeys(inputdeskripsi ); }

    @FindBy (xpath = "//textarea[@id='input-apayangdipelajari']")
    private WebElement apayangdipelajari;
    public void setApayangdipelajari (String inputapayangdipelajari){
        apayangdipelajari.sendKeys(inputapayangdipelajari ) ;}

    @FindBy (xpath = "//textarea[@id='input-prasayrat-khusus']")
    private WebElement prasyarat;
    public void setPrasyarat (String inputprasyarat){prasyarat.sendKeys(inputprasyarat); }

    @FindBy (xpath = "//textarea[@id='input-untuk-siapa-kursus-ini']")
    private WebElement untuksiapakursusini;
    public void setUntuksiapakursusini (String inputuntuksiapakursusini ){
        untuksiapakursusini.sendKeys(inputuntuksiapakursusini ) ;}

    @FindBy (xpath = "//button[@id='btn-uploadkursus']")
    private WebElement uploadkursus;
    public void clickuploadkursus(){uploadkursus.click() ;}

    public boolean uploadkursus(){
        uploadkursus.isDisplayed();
        return true ;
    }

}
