package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class Google {
    public static WebDriver driver;

    public Google(WebDriver driver){
        PageFactory.initElements(driver, this);
        Google.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/oauthLogin']")
    private WebElement oauth;

    @FindBy(id = "btn-chooseaccount")
    private WebElement choose;

    @FindBy(xpath = "//input[@id='identifierId']")
    private WebElement email;

    @FindBy(xpath = "//span[.='Berikutnya']")
    private WebElement next1;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement pass;

    @FindBy(xpath = "//span[.='Berikutnya']")
    private WebElement next2;

    @FindBy(id = "btn-logingoogle")
    private WebElement proceed;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement error;

    public void setOauth(){
        oauth.click();
    }

    public void setChoose() throws InterruptedException {
        choose.click();
        Thread.sleep(3000);
    }

    public void logGoogle(String mail, String password) throws InterruptedException {
        String googleLoginWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!Objects.equals(windowHandle, googleLoginWindow)) {
                driver.switchTo().window(windowHandle);
            }
        }
        Thread.sleep(3000);
        email.sendKeys(mail);
        Thread.sleep(3000);
        next1.click();
        Thread.sleep(3000);
        pass.sendKeys(password);
        Thread.sleep(3000);
        next2.click();
        Thread.sleep(10000);
        driver.switchTo().window(googleLoginWindow);
    }

    public void setProceed(){
        proceed.click();
    }

    public boolean setError(){
        error.isDisplayed();
        return true;
    }

    public void setError2(){
        error.click();
    }
}
