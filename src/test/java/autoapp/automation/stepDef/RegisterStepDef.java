package autoapp.automation.stepDef;

import autoapp.automation.pages.PersonalInfoPage;
import autoapp.automation.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
        // I suggest we add implicit wait in page rather than Thread.sleep() in step def. Please see the implemented code in page which is commented for now.
    }


    @Then("^I should be able to register with my below details$")
    public void i_should_be_able_to_register_with_my_below_details(DataTable dataTable) throws Throwable {
        PersonalInfoPage.enterPersonalInformation(dataTable);
        Thread.sleep(5000);
        // I suggest we add implicit wait in page rather than than Thread.sleep() in step def. Please see the implemented code in page which is commented for now.
    }

    @Then("^I should get invalid email error message$")
    public void iShouldGetInvalidEmailErrorMessage() {
        RegisterPage.invalidEmailErrorMsg();

    }

    @Then("^I should be able to see error message displayed$")
    public void iShouldBeAbleToSeeErrorMessageDisplayed(DataTable dataTable) throws Throwable {
        List<List<String>> actualList = new ArrayList<List<String>>();
        actualList.add(Arrays.asList("errorMessage"));
        actualList.add(Arrays.asList("Invalid email address."));

        DataTable actual = DataTable.create(actualList);
        dataTable.diff(actual);

        // The other way to verify error message is by
        // 1) Creating a static method & calling WebDriver wait inside that method with wait.until(expectedConditions.visibilityOfElement).
        //But it will only verify if the error message is displayed or not but it doesn't validate the content of the actual error message.
        //I have written in such a way, that error message returned will be captured by selenium & verify against data table value.

    }

}
