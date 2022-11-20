package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_001_StepDef {
    @Given("user navigates to homepage")
    public void user_navigates_to_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
