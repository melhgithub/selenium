package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Driver;

public class contactUs_Steps {
	
	private WebDriver driver;
	PageObjectModel.contactUs_Page contactUs_Page = new PageObjectModel.contactUs_Page();
	
	
	@Given("click on contact us button")
	public void click_on_contact_us_button() {
		contactUs_Page.clickContactUsButton();
	}
	
	@Given("select Subject Heading")
	public void select_subject_heading() {
		contactUs_Page.selectFromDropdown();
	}
	
	@Given("type Email")
	public void type_Email() {
		contactUs_Page.typeEmail();
	}
	
	@Given("type Order reference")
	public void type_order_reference() {
		contactUs_Page.typeOrder();
	}
	
	@Given("type a message")
	public void type_a_message() {
		contactUs_Page.typeMessage();
	}
	
	@When("click on submit button")
	public void click_on_submit_button() {
		contactUs_Page.clickOnSendButton();
	}
	
	@Then("Verify the success")
	public void verify_the_success() {
		contactUs_Page.assertMessage();
	}
}
