package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import page.CheckerPage;

public class CheckerToolSteps {

    CheckerPage checkerPage = new CheckerPage(DriverFactory.getDriver());

    @Given("User is on NHS Checker tool Website")
    public void user_is_on_nhs_checker_tool_website() throws Exception {
        DriverFactory.getDriver().get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        Thread.sleep(3000);
        checkerPage.setCookies();

    }

    @When("User select start now button")
    public void user_click_on_start_now_button() {
        checkerPage.setStartNow();
    }

    @When("User select Wales and click on next button")
    public void user_select_wales_and_click_on_next_button() {
        checkerPage.setWalesRadio();
        checkerPage.setNextButton();

    }

    @When("User select yes for GP practice in Wales")
    public void user_select_yes_for_GP_practice_in_Wales() {
        checkerPage.setYesRadio();
        checkerPage.setNextButton();
    }

    @When("User select yes for Dental practice in Wales")
    public void user_select_yes_for_Dental_practice_in_Wales() {
        checkerPage.setGpRadio();
        checkerPage.setNextButton();
    }

    @When("User enter DOB as day {string} month {string} year {string}")
    public void userEnterDOBAsDayMonthYear(String day, String month, String year) {
        checkerPage.setDOB(day, month, year);
        checkerPage.setNextButton();
    }

    @When("User select no for living partner and tax benefits")
    public void user_select_no_for_living_partner_and_tax_benefits() {
        checkerPage.setNoRadio();
        checkerPage.setNextButton();
    }

    @When("User select no radio button for pregnant and injury or illness")
    public void user_select_no_radio_button_for_pregnant_and_injury_or_illness() {
        checkerPage.setNoRadio();
        checkerPage.setNextButton();
        checkerPage.setNoRadio();
        checkerPage.setNextButton();
    }

    @When("User select no radio button Diabetic and glaucoma")
    public void user_select_no_radio_button_diabetic_and_glaucoma() {
        checkerPage.setNoRadio();
        checkerPage.setNextButton();
        checkerPage.setNoRadio();
        checkerPage.setNextButton();
    }

    @When("User select no radio button for care home and savings")
    public void user_select_no_radio_button_for_care_home_and_savings() {
        checkerPage.setNoRadio();
        checkerPage.setNextButton();
        checkerPage.setYesRadio();
        checkerPage.setNextButton();

    }

    @And("User select yes radio button for any help to pay for home or care home")
    public void user_Select_yes_Radio_Button_For_Any_Help_To_Pay_For_Home_Or_Care_Home() {
        checkerPage.setYesRadio();
        checkerPage.setNextButton();
    }

    @Then("User must get the result for NHS can give help or not and verify it")
    public void user_must_get_the_result_for_nhs_can_give_help_or_not_and_verify_it() {
        String actual = checkerPage.verifyCheckerToolResult();
        Assert.assertThat(actual, Matchers.endsWith("You can apply for help with NHS costs"));
    }

}





