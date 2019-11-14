package stepdefinitions;

import static stepdefinitions.Helpers.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

  //Background Steps
  @Given("user navigates to blog page")
  public void userNavigatesToBlogPage() {
  }

  @When("user clicks {string}")
  public void userClicks(String arg0) {
    userClicksHelper(arg0);
  }

  @Then("user should proceed {string} screen")
  public void userShouldProceedScreen(String arg0) {
    userShouldProceedScreenHelper(arg0);
  }

  @When("^user enters \"([^\"]*)\" to \"([^\"]*)\" area$")
  public static void userEntersToArea(String value, String area) {
    userEntersToAreaHelper(value, area);
  }


}