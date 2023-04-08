package step_definitions.Chat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Chat;
import locator.Login;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import step_definitions.Hooks;
import org.openqa.selenium.WebDriver;
public class ChatToTeacherStepDef {
    private final WebDriver webDriver;


    public ChatToTeacherStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @And("User click Find Mentor button")
    public void userClickButton()throws InterruptedException {
        Chat chat = new Chat(webDriver);
        chat.setFindMentorButton();
        Thread.sleep(3000);
    }

    @And("Student choose and click one of registered teacher")
    public void studentChooseAndClickOneOfRegisteredTeacher() {
        Chat chat = new Chat(webDriver);
        chat.setFikriMentor();
    }

    @And("Student click LIHAT CHAT button")
    public void studentClickButton() {
        Chat chat = new Chat(webDriver);
        chat.setLihatChatButton();
    }

    @And("Student input text {string}")
    public void studentInputText(String textAlphabet) throws InterruptedException {
        Chat chat = new Chat(webDriver);
        chat.setInputTextAlphabet(textAlphabet);
        Thread.sleep(2000);

    }

    @Then("Student click Send button")
    public void studentClickSendButton() {
        Chat chat = new Chat(webDriver);
        chat.setSendButton();
    }

    @Then("Student press Enter button on keyboard")
    public void studentPressButtonOnKeyboard() {
        Chat chat = new Chat(webDriver);
        chat.setSendEnter();
    }

    @And("Validate sent messages")
    public void validateSentMessages() throws InterruptedException{
        Chat chat = new Chat(webDriver);
        Assert.assertTrue(chat.setValidateSentMessage());
        Thread.sleep(2000);
    }





}
