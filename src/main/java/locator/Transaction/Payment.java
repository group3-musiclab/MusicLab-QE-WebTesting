package locator.Transaction;

import locator.Login;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

    public static WebDriver driver;

    public Payment(WebDriver driver){
        PageFactory.initElements(driver, this);
        Login.driver = driver;
    }

    //div[.='Continue Payment']
    //button[@class='btn bg-[#3A2BE8] mt-4 disabled:border-slate-200 disabled:cursor-not-alloweds']
    @FindBy(xpath = "//button[@class='btn bg-[#3A2BE8] mt-4 disabled:border-slate-200 disabled:cursor-not-alloweds']")
    private WebElement btnContiPayment;

    @FindBy(xpath = "//div[@class='header-amount']")
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

    //a[.='BCA KlikPay']
    //img[@alt='BcaKlikpay']
    //a[@href='#/bca-klikpay']//div[@class='list-title text-actionable-bold']
    @FindBy(xpath = "//a[.='BCA KlikPay']")
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

    @FindBy(xpath = "//label[.='Transaction No']")
    private WebElement validateNoTransaction;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement btnBayar;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement validateTransactionSuccess;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement btnTransactionSuccess;

    @FindBy(xpath = "//button[@id='btn-kembali']")
    private WebElement validateNewSchedule;


    public void setBtnContiPayment(){
        btnContiPayment.click();
    }

    public boolean setValidateMerchantName(){
        validateMerchantName.isDisplayed();
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

    public void setBtnPayNow(){
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
