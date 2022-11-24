package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_014_StepDef_TD {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();


    Actions actions = new Actions(Driver.getDriver());





    @Given("user is on home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtilities.waitFor(3);
    }

    @When("user hovers over sign up button")
    public void user_hovers_over_sign_up_button() {
        actions.moveToElement(homePage.signUpButton).perform();
    }


    @When("user selects client from opened menu")
    public void user_selects_client_from_opened_menu() {
       homePage.clientButton.click();
        BrowserUtilities.waitFor(3);
    }



    @Then("user on client register page")
    public void user_on_client_register_page() {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://hypnotes.net/register/client";
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Then("assert Name field is displayed")
    public void assert_name_field_is_displayed() {

    }

    @Then("assert Surname field is displayed")
    public void assert_surname_field_is_displayed() {

    }

    @Then("assert Email field is displayed")
    public void assert_email_field_is_displayed() {

    }

    @Then("assert Password field is displayed")
    public void assert_password_field_is_displayed() {


    }
}
