package Tests;

import Actions.HomePage;
import Settings.Settings;
import io.cucumber.java.*;
import io.cucumber.java.en.*;


public class HomePageSteps {
    private Settings settings = new Settings();
    private HomePage methods = new HomePage(settings.driver);

    @Given("I go to home page")
    public void GoToHomePage() {
        settings.open("/");
        settings.maximize();
    }

    @When("I click on the Elements")
    public void ClickOnTheElements() {
        methods.scroll();
        methods.clickElements();
    }

    @And("i click on the Web Tables")
    public void ClickOnTheWebTables() {
        methods.clickWebTables();
    }

    @Then("I should see the web tables")
    public void ShouldSeeTheWebTables() {
        methods.visibleWebTables();

    }

    @After
    public void close() {
        settings.close();
    }
}

