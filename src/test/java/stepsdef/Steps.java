package stepsdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AuthorizationPage;
import pages.HomeRiaPage;
import static webdriver.DriverManager.*;

public class Steps {

    private HomeRiaPage homeRiaPage;
    private AuthorizationPage authorizationPage;

    @Given("^The user on AutoRia page$")
    public void theUserOnAutoRiaPage(){
     String value ="";
    }

    @When("^The user click on Login in link$")
    public void theUserClickOnLoginInLink(){
     homeRiaPage = new HomeRiaPage(getDriver());
     homeRiaPage.clickOnLoginInLinck();
    }

    @When("^The user enter in invalid telephone number$")
    public void theUserEnterInInvalidTelephoneNumber(){
        authorizationPage = new AuthorizationPage(getDriver());
        authorizationPage.switchToFrameAndClickOnRegisterLink();
        authorizationPage.inputTelephone("0.26ikh56");
    }

    @Then("^The error message is displayed on the authorization page$")
    public void theErrorMessageIsDisplayedOnTheAuthorizationPage(){
        authorizationPage = new AuthorizationPage(getDriver());
        String expectedErrorMessage = "неверный  мобильный номер телефона";
        Assert.assertTrue(authorizationPage.getErrorMessageRegistration().contains(expectedErrorMessage));
    }
}
