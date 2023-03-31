package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register {
    public static WebDriver driver;

    public Register(WebDriver driver){
        PageFactory.initElements(driver, this);
        Register.driver = driver;
    }

    @FindBy(xpath = "//a[.='Register']")
    private WebElement register;

    @FindBy(id = "input-namalengkap")
    private WebElement name;

    @FindBy(id = "select-role")
    private WebElement role;

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-password")
    private WebElement pass;

    @FindBy(id = "btn-register")
    private WebElement regis;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement error;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement login;

    public void setRegister(){
        register.click();
    }

    public void setName(String nama){
        name.sendKeys(nama);
    }

    public void setRole(String text){
        Select status = new Select(role);
        status.selectByVisibleText(text);
    }

    public void setEmail(String mail){
        email.sendKeys(mail);
    }

    public void setPass(String password){
        pass.sendKeys(password);
    }

    public void setRegis(){
        regis.click();
    }

    public boolean setRegis2(){
        regis.isEnabled();
        return false;
    }

    public void setError(){
        error.click();
    }

    public boolean setError2(){
        error.isEnabled();
        return true;
    }

    public boolean setLogin(){
        login.isDisplayed();
        return true;
    }

    public void setLogin2(){
        login.click();
    }
}
