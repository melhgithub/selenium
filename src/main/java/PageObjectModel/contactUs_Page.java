package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class contactUs_Page extends Abstract{
	WebDriver driver;
	
	public contactUs_Page() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Contact us']")
	private WebElement contactUsButton;
	
	public void clickContactUsButton() {
		clickFunction(contactUsButton);
	}
	
	@FindBy(name="id_contact")
	private WebElement subjectHeadingDropdown;
	
	public void selectFromDropdown() {
		selectElementFromDropdown(subjectHeadingDropdown,"Webmaster");
	}
	
	@FindBy(id="email")
	private WebElement emailArea;
	
	public void typeEmail() {
		sendKeysFunction(emailArea, "melih@gmail.com");
	}
	
	@FindBy(name="id_order")
	private WebElement order;
	
	public void typeOrder() {
		sendKeysFunction(order, "orderexample");
	}
	
	@FindBy(id="message")
	private WebElement messageArea;
	
	public void typeMessage() {
		sendKeysFunction(messageArea, "broken");
	}
	
	@FindBy(id="submitMessage")
	private WebElement sendButton;
	
	public void clickOnSendButton() {
		clickFunction(sendButton);
	}
	
	@FindBy(css="p.alert-success")
	private WebElement successMessage;
	
	public void assertMessage() {
		Assertion(successMessage,"Your message has been successfully sent to our team.");
	}
	
	
}
