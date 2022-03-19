package autoapp.automation.stepDef;

import autoapp.automation.pages.PersonalInfoPage;
import autoapp.automation.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegisterStepDef {

    @Given("^Automation practice application is opened$")
    public void automation_practice_application_is_opened() throws Throwable {
        RegisterPage.openApplicaiton();
    }

    @When("^I click sign in$")
    public void i_click_sign_in() throws Throwable {
        RegisterPage.clickSignIn();

    }

    @And("^I create account with emailid \"([^\"]*)\"$")
    public void i_create_account_with_emailid(String emailId) throws Throwable {
        RegisterPage.createAccount(emailId);
        Thread.sleep(5000);
    }


    @Then("^I should be able to register with my below details$")
    public void i_should_be_able_to_register_with_my_below_details(DataTable dataTable) throws Throwable {
        PersonalInfoPage.enterPersonalInformation(dataTable);
        Thread.sleep(5000);
    }

    @Then("^I should be able to see error message displayed$")
    public void iShouldBeAbleToSeeErrorMessageDisplayed(DataTable dataTable) throws Throwable {
        List<List<String>> actualList = new ArrayList<List<String>>();
        actualList.add(Arrays.asList("errorMessage"));
        actualList.add(Arrays.asList("Invalid email address."));

        DataTable actual = DataTable.create(actualList);
        dataTable.diff(actual);

    }

    @Then("^I should get invalid email error message$")
    public void iShouldGetInvalidEmailErrorMessage() {
        RegisterPage.invalidEmailErrorMsg();

    }
}
