package StepDefinitions;

import PageObjects.GreenCartPage;
import PageObjects.PageObjectManager;
import Utilities.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.chrome.ChromeDriver;


public class GreenCartStepDefinition {

    TestContextSetup testContextSetup;
    PageObjectManager pageObjectManager;
    public GreenCartStepDefinition(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;

    }

    @Given("User is on green cart landing page")
    public void user_is_on_green_cart_landing_page() {
        // throw new io.cucumber.java.PendingException();
        System.out.println("Print Given Statement");
    }
    @When("^user search with shortname (.+) and extracted actual name and product$")
    public void user_search_with_shortname_and_extracted_actual_name_and_product(String shortname) {
        GreenCartPage greenCartPage = testContextSetup.pageObjectManager.getGreenCartPage();
        greenCartPage.searchItem(shortname);
    }
    @Then("user search for same shortname in offer page to check if product exist")
    public void user_search_for_same_shortname_in_offer_page_to_check_if_product_exist() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Print Then Statement");
    }
}
