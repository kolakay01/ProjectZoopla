package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BasePage {

    // Create instantiate of homepage because extends had already been created
    HomePage homePage = new HomePage(driver);


    @Given("I navigate to zoopla home page")
    public void i_navigate_to_zoopla_home_page() {
        navigateToHomepage();
        homePage.acceptcookiePolicy();



    }

    @When("I enter location as {string}")
    public void i_enter_location_as(String Location) {
        homePage.enterlocation(Location);
        homePage.clickFirstOption();
        homePage.BedDropDown();

    }

    @When("I select minimum bed as {string}")
    public void i_select_minimum_bed_as(String mini)
    {
        homePage.selectMinBed(mini);

    }

    @When("I select maximun bed as {string}")
    public void i_select_maximun_bed_as(String max)
    {
        homePage.selectMaxBed(max);

    }

    @When("I select minimum price as {string}")
    public void i_select_minimum_price_as(String string) {

    }

    @When("I select maximun price as {string}")
    public void i_select_maximun_price_as(String string) {

    }

    @When("I choose {string} as property type")
    public void i_choose_as_property_type(String string) {

    }

    @When("I click on search button")
    public void i_click_on_search_button() {

    }

    @Then("Search result page is displayed")
    public void search_result_page_is_displayed() {

    }


}
