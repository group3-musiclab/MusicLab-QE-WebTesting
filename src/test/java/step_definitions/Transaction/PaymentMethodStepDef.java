package step_definitions.Transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.Transaction.Payment;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PaymentMethodStepDef {

    private final WebDriver webDriver;


    public PaymentMethodStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("Student click button Continue Payment")
    public void clickBtnContinuePayment() throws InterruptedException {
        Set<String> handles = webDriver.getWindowHandles();
        Payment payment = new Payment(webDriver);
        payment.setBtnContiPayment();
        Thread.sleep(3000);
        for(String handle : handles){
            webDriver.switchTo().window(handle);
        }
    }

    @And("Validate Payment Page")
    public void validatePaymentPage() throws InterruptedException{
        Payment payment = new Payment(webDriver);
        Assert.assertTrue(payment.setValidateMerchantName());
        Thread.sleep(3000);
    }

    // GOPAY METHOD
    @Then("Choose Gopay/QRIS Method")
    public void chooseGopay() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setGopayMethod();
        Thread.sleep(3000);
    }

    // BANK TRANSFER METHOD
    @Then("Choose Bank Transfer Method")
    public void chooseBankTransfer() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setBankTransferMethod();
        Thread.sleep(3000);
    }

    @And("Selected Bank Tujuan")
    public void pilihBankTujuan() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setBcaTransferMethod();
        Thread.sleep(3000);
    }

    @And("Validate Rekening Number")
    public void validateRekeningNo() throws InterruptedException{
        Payment payment = new Payment(webDriver);
        Assert.assertTrue(payment.setValidateNoRek());
        Thread.sleep(3000);
    }

    // DEBIT/CREDIT CARD METHOD
    @Then("Choose Debit/Credit Card Method")
    public void chooseDebitCreditCard() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setDebitCreditMethod();
        Thread.sleep(3000);
    }

    // SHOPEEPAY METHOD
    @Then("Choose ShopeePay Method")
    public void chooseShopeepay() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setShopeeMethod();
        Thread.sleep(3000);
    }

    // AKULAKU METHOD
    @Then("Choose Akulaku Paylater Method")
    public void chooseAkulaku() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setAkulakuMethod();
        Thread.sleep(3000);
    }

    // ALFAMART METHOD
    @Then("Choose Alfamart Group Method")
    public void chooseAlfamart() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setAlphamartMethod();
        Thread.sleep(3000);
    }


    // INDOMARET METHOD
    @Then("Choose Indomaret Method")
    public void chooseIndomaret() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setIndomartMethod();
        Thread.sleep(3000);
    }

    // BCA KLIK PAY METHOD
    @Then("Choose BCA Klik Pay Method")
    public void chooseBcaKlik() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setBcaklikMethod();
        Thread.sleep(3000);
    }

    @And("Validate Order ID")
    public void validateOrderId() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        Assert.assertTrue(payment.setValidateOrderId());
        Thread.sleep(3000);
    }

    @And("Click Button Pay Now")
    public void btnPayNow()throws InterruptedException{
        Payment payment = new Payment(webDriver);
        payment.setBtnPayNow();
        Thread.sleep(5000);
    }

    @And("Validate Transaction Number")
    public void vldtTrsctionNumber() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setValidateNoTransaction();
        Thread.sleep(3000);
    }

    @And("Click button Bayar")
    public void clickBtnBayar() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setBtnBayar();
        Thread.sleep(3000);
    }

    @And("Validate Transaksi Sukses")
    public void validateTransactionBcaKlikSuccess() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        Assert.assertTrue(payment.setValidateTransactionSuccess());
        Thread.sleep(3000);
        webDriver.close();
    }

    // OCTO CLICKS METHOD
    @Then("Choose OCTO Clicks Method")
    public void chooseOctoClicks() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setOctoMethod();
        Thread.sleep(3000);
    }


    // BRIMO METHOD
    @Then("Choose BRImo Method")
    public void chooseBriMo() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setBrimoMethod();
        Thread.sleep(3000);
    }


    // DANAMON METHOD
    @Then("Choose Danamon Online Banking Method")
    public void chooseDanamon() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setDanamonMethod();
        Thread.sleep(3000);
    }

    @And("Click button Back To Merchant")
    public void clickBtnBackMerchant() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setBtnBackToMerchant();
        Thread.sleep(3000);
        webDriver.close();
    }

    @And("Click button Transaction Success")
    public void clickBtnTransactionSuccess() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        payment.setBtnTransactionSuccess();
        Thread.sleep(3000);
    }

    @And("Validate New Schedule Student")
    public void validateNewScheduleStudent() throws InterruptedException {
        Payment payment = new Payment(webDriver);
        Assert.assertTrue(payment.setValidateNewSchedule());
        Thread.sleep(3000);
    }

}

//        webDriver.switchTo().window(String.valueOf(WindowType.TAB));
