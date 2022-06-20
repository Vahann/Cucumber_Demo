package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Given("Go to home page")
    public void goToHomePage() {
        System.out.println("Go to home page");
    }

    @When("Write valid username")
    public void writeValidUsername() {
        System.out.println("Write valid username");
    }

    @And("Write valid password")
    public void writeValidPassword() {
        System.out.println();
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        System.out.println("Write valid password");
    }

    @Then("I should see my profile")
    public void iShouldSeeMyProfile() {
        System.out.println("I should see my profile");
    }
}
