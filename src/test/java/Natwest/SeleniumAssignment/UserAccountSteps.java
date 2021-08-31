package Natwest.SeleniumAssignment;

import PageObjects.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class UserAccountSteps {
	private UserAccountPage userAccountPage = new UserAccountPage();
    private PersonalInfoPage personInfoPage;


    @And("^User is on the the personal information page$")
    public void user_on_personalInfo_page() throws Throwable {
        personInfoPage = userAccountPage.ViewPersonalInfoPage();
    }

    @When("^User updates the first name to \"([^\"]*)\"$")
    public void user_updates_firstName(String firstName) throws Throwable {
    	personInfoPage = personInfoPage.setFirstName(firstName)
                .setPassword(TestBase.Password)
                .clickSave();
    }

    @Then("^the personal information should be updated successfully$")
    public void personalInfo_should_update() throws Throwable {
        Assert.assertTrue(personInfoPage.isSuccessMessageDisplayed());
    }
}
