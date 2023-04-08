package locator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Chat {
    public static WebDriver driver;

    public Chat(WebDriver driver){
        PageFactory.initElements(driver, this);
        Chat.driver = driver;
    }

    @FindBy(xpath = "//a[.='Login']")
    private WebElement loginPage;

    @FindBy(id = "input-username")
    private WebElement email;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "select-role")
    private WebElement role;

    @FindBy(xpath = "//button[.='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement successNotif;

    @FindBy(id = "btn-findmentor")
    private WebElement findMentorButton;

    @FindBy(xpath = "//button[.='»']")
    private WebElement nextPageButton;

    @FindBy(xpath = "//div[11]//img[@src='https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png']")
    private WebElement fikriMentor;

    @FindBy(xpath = "//label[@class='btn bg-[#3A2BE8] text-white mt-2 px-16 border-none']")
    private WebElement lihatChatButton;

    @FindBy(xpath = "//input[@id='send']")
    private WebElement inputTextStudent;

    @FindBy(xpath = "//button[@class='btn w-28 rounded-xl text-white']")
    private WebElement sendButton;

    @FindBy(xpath = "//div[@class='rounded-lg bg-white p-10']")
    private WebElement validateSentMessage;

    @FindBy(xpath = "//label[@class='btn']")
    private WebElement closeChatButton;

    @FindBy(xpath = "//a[.='Chat']")
    private WebElement chatTeacherButton;

    @FindBy(xpath = "//div[@class='card w-96 shadow-lg border-black border mt-4 ml-20']/div[@class='card-body']/div[1]//label[@class='btn font-semibold']")
    private WebElement seeMsgRow1;

    @FindBy(xpath = "//div[@class='card w-96 shadow-lg border-black border mt-4 ml-20']/div[@class='card-body']/div[1]//input[@id='send']")
    private WebElement inputTextTeacherRow1;



    public void setFindMentorButton(){
        findMentorButton.click();
    }
    public void setNextPageButton(){
        nextPageButton.click();
    }
    public void setFikriMentor(){
        fikriMentor.click();
    }
    public void setLihatChatButton (){
        lihatChatButton.click();
    }
    public void setInputTextAlphabet (String alphabet){
        inputTextStudent.sendKeys(alphabet);
    }

//    public void setInputTextNumber (int number){
//        inputTextStudent.sendKeys(number);
//    }

//    tidak bisa menggunakan jenis teks int harus String, jika tetap mau menggunakan jenis teks int maka harus fungsinya harus ditambahkan seperti ini :
//    public void setInputTextNumber(int number){
//        String dateString = Integer.toString(number);
//        inputTextStudent.sendKeys(dateString);
//    }
    public void setInputTextNumber (String number){
        inputTextStudent.sendKeys(number);
    }

    public void setInputTextSpecial (String specialChar){
        inputTextStudent.sendKeys(specialChar);
    }
    public void setInputTextStudent (String combination){
        inputTextStudent.sendKeys(combination);
    }
    public void setSendButton (){
        sendButton.click();
    }
    public void setSendEnter (){sendButton.sendKeys(Keys.ENTER);}
    public boolean setValidateSentMessage(){
        validateSentMessage.isEnabled();
        return true;
    }
    public void setChatTeacherButton(){
        chatTeacherButton.click();
    }
    public void setSeeMsgRow1(){
        seeMsgRow1.click();
    }
    public void setInputTextTeacherRow1Alp(String alphabet2){
        inputTextTeacherRow1.sendKeys(alphabet2);
    }
//    public void setInputTextTeacherRow1Num(int number2){
//        inputTextTeacherRow1.sendKeys(number2);
//    }
    public void setInputTextTeacherRow1Num(String number2){
        inputTextTeacherRow1.sendKeys(number2);
    }
    public void setInputTextTeacherRow1Special(String special2){
        inputTextTeacherRow1.sendKeys(special2);
    }
    public void setInputTextTeacherRow1(String combination2){
        inputTextTeacherRow1.sendKeys(combination2);
    }

    public void setCloseChatButton(){
        closeChatButton.click();
    }


}

