package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Driver;

public class register_Steps {
	private WebDriver driver;
	

	PageObjectModel.register_Page registerPage = new PageObjectModel.register_Page();

	
	@Given("click Sign in button")
	public void click_sign_in_button() {
		registerPage.clickOnSigninButton();
	}

	@Given("type email {string}")
	public void type_email(String email) {
		registerPage.typeEmail(email);
	}

	@Given("click on Create an Account button")
	public void click_on_create_an_account_button() {
		registerPage.clickOnSubmitButton();
	}

	@Given("choose gender")
	public void choose_gender() {
		registerPage.clickOnGenderButton();
	}

	@Given("type firstname {string} and lastname {string}")
	public void type_firstname_and_lastname(String firstname, String lastname) {
		registerPage.typeFirstnameAndLastName(firstname, lastname);
	}

	@Given("type password {string}")
	public void type_password(String password) {
		registerPage.typePassword(password);
	}

	
	@After
    public void quitDriver() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(Duration.ofSeconds(5));
            Driver.closeDriver();
        }
    }
}
