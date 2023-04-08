package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Event {
    public static WebDriver driver;

    public Event(WebDriver driver){
        PageFactory.initElements(driver, this);
        Event.driver = driver;
    }

    @FindBy(xpath = "//a[.='Profile']")
    private WebElement profile;

    @FindBy(id = "btn-jadwalsaya")
    private WebElement jadwal;

    @FindBy(xpath = "//tbody[1]/tr[1]//button[@id='btn-createEvents']")
    private WebElement create;

    @FindBy(id = "btn-submitbutton")
    private WebElement submit;

    @FindBy(id = "btn-proceedgooglecalendar")
    private WebElement calender;

    @FindBy(xpath = "//div[@class='gb_rd gb_ad gb_bd']//span[@class='gb_Cc']")
    private WebElement google;

    public void setProfile(){
        profile.click();
    }

    public void setJadwal(){
        jadwal.click();
    }

    public void setCreate() throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(3000);
        create.click();
    }

    public void setSubmit(){
        submit.click();
    }

    public void setCalender(){
        calender.click();
    }

    public boolean setCalender2(){
        calender.isDisplayed();
        return false;
    }

    public boolean setGoogle(){
        google.isDisplayed();
        return true;
    }
}
