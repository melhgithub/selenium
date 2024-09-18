package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class register_Page extends Abstract{
	private WebDriver driver;
	
	public register_Page() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a.login")
	private WebElement signinbutton;
	
	@FindBy(name="email_create")
	private WebElement emailTextBox;
	
	@FindBy(id="SubmitCreate")
	private WebElement submitButton;
	
	@FindBy(id="id_gender1")
	private WebElement gender;
	
	@FindBy(id="customer_firstname")
	private WebElement firstname;
	
	@FindBy(id="customer_lastname")
	private WebElement lastname;
	
	@FindBy(name="passwd")
	private WebElement password;
	
	public void clickOnSigninButton() {
		clickFunction(signinbutton);
	}
	
	public void typeEmail(String email) {
		sendKeysFunction(emailTextBox,email);
	}
	
	public void clickOnSubmitButton() {
		clickFunction(submitButton);
	}
	
	public void clickOnGenderButton() {
		clickFunction(gender);
	}
	
	public void typeFirstnameAndLastName(String arg1, String arg2) {
		sendKeysFunction(firstname,arg1);
		sendKeysFunction(lastname,arg2);
	}
	
	public void typePassword(String arg1) {
		sendKeysFunction(password,arg1);
	}
	
	
}
