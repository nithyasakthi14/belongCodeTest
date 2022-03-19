package autoapp.automation.stepDef;

import autoapp.automation.pages.MegaMenuPage;
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

public class MegaMenuStepDef {

    @Then("^user checks megamenu is displayed and clickable$")
    public void userChecksMegamenuIsDisplayedAndClickable() {
        MegaMenuPage.megaMenudisplayed();
    }

    @When("^user select dresses$")
    public void user_select_dresses() throws Throwable {
        MegaMenuPage.selectDresses();
    }
    @Then("^user navigates to summerDresses menu$")
    public void user_navigates_to_summerDresses_menu() throws Throwable{
        MegaMenuPage.selectSummerDresses();
    }
    @Then("^verify the page title$")
    public void verify_the_page_title(DataTable dataTable) throws Throwable{
        List<List<String>> actualList = new ArrayList<List<String>>();
        actualList.add(Arrays.asList("pageTitle"));
        actualList.add(Arrays.asList("Summer Dresses"));

        DataTable actual = DataTable.create(actualList);
        dataTable.diff(actual);
    }

    @And("^user should be in summerDresses page$")
    public void userShouldBeInSummerDressesPage() {
        MegaMenuPage.summerDressPageTitle();
    }
}
