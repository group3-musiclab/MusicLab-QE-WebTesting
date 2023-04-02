package locator.Transaction;

import locator.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

    public static WebDriver driver;

    public Payment(WebDriver driver){
        PageFactory.initElements(driver, this);
        Register.driver = driver;
    }

    @FindBy(xpath = "//div[@class='merchant-name']")
    private WebElement validateMerchantName;

    @FindBy(xpath = "//img[@alt='GoPay']")
    private WebElement gopayMethod;

    @FindBy(xpath = "//img[@alt='BCA']")
    private WebElement bankTransferMethod;

    @FindBy(xpath = "//a[@href='#/bank-transfer/bca-va']/div[@class='payment-page-text']")
    private WebElement bcaTransferMethod;

    @FindBy(xpath = "//div[@id='vaField']")
    private WebElement validateNoRek;

    @FindBy(xpath = "//img[@alt='VISA']")
    private WebElement debitCreditMethod;

    @FindBy(xpath = "//img[@alt='ShopeePay']")
    private WebElement shopeeMethod;

    @FindBy(xpath = "//img[@alt='Alfamart']")
    private WebElement alphamartMethod;

    @FindBy(xpath = "//img[@alt='Indomaret']")
    private WebElement indomartMethod;

    @FindBy(xpath = "//img[@alt='Akulaku']")
    private WebElement akulakuMethod;

    @FindBy(xpath = "//img[@alt='BcaKlikPay']")
    private WebElement bcaklikMethod;

    @FindBy(xpath = "//div[@class='header-order-id']")
    private WebElement vldtOrderId;

    @FindBy(xpath = "//img[@alt='OCTO Clicks']")
    private WebElement octoMethod;

    @FindBy(xpath = "//img[@alt='BRImo']")
    private WebElement brimoMethod;

    @FindBy(xpath = "//a[@href='#/danamon-online']//div[@class='logo-border-payment-list']")
    private WebElement danamonMethod;

    @FindBy(xpath = "//button[@class='btn full primary']")
    private WebElement btnBackToMerchant;

    @FindBy(xpath = "//p[.='303832']")
    private WebElement validateNoTransaction;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement btnBayar;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement validateTransactionSuccess;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement btnTransactionSuccess;

    @FindBy(xpath = "//tr[15]/td[.='pending']")
    private WebElement validateNewSchedule;

    public boolean setValidateMerchantName(){
        validateMerchantName.isEnabled();
        return true;
    }

    public void setGopayMethod(){
        gopayMethod.click();
    }

    public void setBankTransferMethod(){
        bankTransferMethod.click();
    }

    public void setBcaTransferMethod(){
        bcaTransferMethod.click();
    }

    public boolean setValidateNoRek(){
        validateNoRek.isEnabled();
        return true;
    }

    public void setDebitCreditMethod(){
        debitCreditMethod.click();
    }

    public void setShopeeMethod(){
        shopeeMethod.click();
    }

    public void setAkulakuMethod(){
        akulakuMethod.click();
    }

    public void setAlphamartMethod(){
        alphamartMethod.click();
    }

    public void setIndomartMethod(){
        indomartMethod.click();
    }

    public void setBcaklikMethod(){
        bcaklikMethod.click();
    }

    public boolean setValidateOrderId(){
        vldtOrderId.isEnabled();
        return true;
    }

    public void setOctoMethod(){
        octoMethod.click();
    }

    public void setBrimoMethod(){
        brimoMethod.click();
    }

    public void setDanamonMethod(){
        danamonMethod.click();
    }

    public void setBtnBackToMerchant(){
        btnBackToMerchant.click();
    }

    public boolean setValidateNoTransaction(){
        validateNoTransaction.isEnabled();
        return true;
    }

    public void setBtnBayar(){
        btnBayar.click();
    }

    public boolean setValidateTransactionSuccess(){
        validateTransactionSuccess.isEnabled();
        return true;
    }

    public void setBtnTransactionSuccess(){
        btnTransactionSuccess.click();
    }

    public boolean setValidateNewSchedule(){
        validateNewSchedule.isEnabled();
        return true;
    }

}
