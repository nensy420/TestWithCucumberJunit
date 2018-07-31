package stepsdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AuthorizationPage;
import pages.HomeRiaPage;
import pages.SearchForm;
import pages.SearchResultsPage;
import static webdriver.DriverManager.*;

public class Steps {
    private HomeRiaPage homeRiaPage;
    private AuthorizationPage authorizationPage;
    private SearchForm searchForm;
    private SearchResultsPage searchResultsPage;

    @Given("^The user on AutoRia page$")
    public void theUserOnAutoRiaPage()
    {
        getDriver().get("https://auto.ria.com/");
    }

    @When("^The user click on Login in link$")
    public void theUserClickOnLoginInLink(){
     homeRiaPage = new HomeRiaPage(getDriver());
     homeRiaPage.clickOnLoginInLinck();
    }

    @When ("^The user enter in invalid telephone = \"([^\"]*)\" number$")
    public void theUserEnterInInvalidTelephoneNumber(String telephone)  {
        authorizationPage = new AuthorizationPage(getDriver());
        authorizationPage.switchToFrameAndClickOnRegisterLink();
        authorizationPage.inputTelephone(telephone);
    }

    @Then("^The error message is displayed on the authorization page$")
    public void theErrorMessageIsDisplayedOnTheAuthorizationPage(){
        authorizationPage = new AuthorizationPage(getDriver());
        String expectedErrorMessage = "неверный  мобильный номер телефона";
        Assert.assertTrue(authorizationPage.getErrorMessageRegistration().contains(expectedErrorMessage));
    }

    @When("^The user enters the \"([^\"]*)\",\"([^\"]*)\" in the search form$")
    public void theUserEntersTheCarBrandRegionInTheSearchForm(String carBrand,String region)  {
        searchForm = new SearchForm(getDriver());
        searchForm.searchBrandCarBu(carBrand);
        searchForm.searchRegionBu(region);
    }

    @When("^The user clicks on search button$")
    public void theUserClicksOnSearchButton() {
        searchForm = new SearchForm(getDriver());
        searchForm.clickOnSubmitButton();
    }

    @Then("^The user sees that results of search match the specified search parameters \"([^\"]*)\"$")
    public void theUserSeesThatResultsOfSearchMatchTheSpecifiedSearchParameters(String regionName)  {
        searchResultsPage=new SearchResultsPage(getDriver());
        System.out.println(searchResultsPage.resultsOfSearchCity(regionName));

    }
}
