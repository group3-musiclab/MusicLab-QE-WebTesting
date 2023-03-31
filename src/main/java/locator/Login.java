package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login {
    public static WebDriver driver;

    public Login(WebDriver driver){
        PageFactory.initElements(driver, this);
        Login.driver = driver;
    }

    @FindBy(xpath = "//a[.='Login']")
    private WebElement pageLogin;

    @FindBy(id = "input-username")
    private WebElement email;

    @FindBy(id = "input-password")
    private WebElement pass;

    @FindBy(id = "select-role")
    private WebElement role;

    @FindBy(xpath = "//button[.='Login']")
    private WebElement btnlogin;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement error;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement success;

    public void setPageLogin(){
        pageLogin.click();
    }

    public void setEmail(String mail){
        email.sendKeys(mail);
    }

    public void setPass(String password){
        pass.sendKeys(password);
    }

    public void setRole(String text){
        Select status = new Select(role);
        status.selectByVisibleText(text);
    }

    public void setBtnlogin(){
        btnlogin.click();
    }

    public boolean setBtnlogin2(){
        btnlogin.isEnabled();
        return false;
    }

    public boolean setSuccess(){
        success.isDisplayed();
        return true;
    }

    public void setSuccess2(){
        success.click();
    }

    public boolean setError(){
        error.isDisplayed();
        return true;
    }

    public void setError2(){
        error.click();
    }
}
