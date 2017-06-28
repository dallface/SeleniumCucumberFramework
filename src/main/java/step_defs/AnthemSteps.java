package step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AnthemHomePage.Anthem;
import pages.AnthemLoginPage.Login;

/**
 * Created by Dall on 22/6/2017.
 */
public class AnthemSteps {


    @Given("^when on the Anthem home page$")
    public void whenOnTheAnthemHomePage() throws Throwable {
        Anthem.get().GoTo();
    }

    @When("^click the menu toggle$")
    public void clickTheMenuToggle() throws Throwable {
        Anthem.get().toggleMenu();
    }

    @Then("^the webpage doesn't crash after (\\d+) seconds$")
    public void theWebpageDoesnTCrashAfterSeconds(int arg0) throws Throwable {
        Anthem.get().wait(arg0);
    }

    @And("^click the login link$")
    public void clickTheLoginLink() throws Throwable {
        Anthem.get().MenuPane.login();
    }

    @And("^I enter (.*) into the userfield$")
    public void iEnterAStringIntoTheUserfield(String arg0) throws Throwable {
        Login.get().EnterUserName(arg0);
    }

}
