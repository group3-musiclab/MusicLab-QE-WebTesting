package step_definitions.Google_event;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.Event;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class EventSteps {
    private final WebDriver webDriver;

    public EventSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("Click profile button")
    public void clickProfileButton() {
        Event event = new Event(webDriver);
        event.setProfile();
    }

    @And("Mentor already on profile page and click jadwal saya button")
    public void mentorAlreadyOnProfilePageAndClickJadwalSayaButton() {
        Event event = new Event(webDriver);
        event.setJadwal();
    }

    @Then("Already on history mengajar page")
    public void alreadyOnHistoryMengajarPage() throws InterruptedException {
        Event event = new Event(webDriver);
        event.setCreate();
    }

    @And("CLick create event button on create your event page")
    public void clickCreateEventButton() throws InterruptedException {
        Event event = new Event(webDriver);
        event.setSubmit();
        Thread.sleep(2000);
    }

    @And("Click see event")
    public void clickSeeEvent() throws InterruptedException {
        Event event = new Event(webDriver);
        event.setCalender();
        Thread.sleep(3000);
    }

    @Then("Mentor already success create event on google calender")
    public void mentorAlreadySuccesCreateEventOnGoogleCalender() {
        Event event = new Event(webDriver);
        Assert.assertTrue(event.setGoogle());
    }

//    Invalid
    @And("See event button should disabled")
    public void seeEventButtonShouldDisabled() {
        Event event = new Event(webDriver);
        Assert.assertFalse(event.setCalender2());
    }
}
