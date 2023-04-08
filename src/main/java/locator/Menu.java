package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Menu {
    public static WebDriver driver;

    public Menu(WebDriver driver){
        PageFactory.initElements(driver, this);
        Menu.driver = driver;
    }

    @FindBy(id = "btn-findmentor")
    private WebElement find;

    @FindBy(id = "search")
    private WebElement cari;

    @FindBy(xpath = "//select[1]")
    private WebElement select1;

    @FindBy(xpath = "//select[2]")
    private WebElement select2;

    @FindBy(xpath = "//button[.='»']")
    private WebElement next;

    @FindBy(xpath = "//button[.='«']")
    private WebElement prev;

    public void setFind(){
        find.click();
    }

    public void setCari(String search){
        cari.sendKeys(search);
    }

    public void setSelect1(String text){
        Select drop1 = new Select(select1);
        drop1.selectByVisibleText(text);
    }

    public void setSelect2(String text){
        Select drop2 = new Select(select2);
        drop2.selectByValue(text);
    }

    public void setNext(){
        next.click();
    }

    public void setPrev(){
        prev.click();
    }
}
