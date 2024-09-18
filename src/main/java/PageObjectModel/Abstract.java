package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.Driver;

public abstract class Abstract {
	private WebDriver driver = Driver.getDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	public void clickFunction(WebElement element) {
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		element.click();
		
	}
	
	public void sendKeysFunction(WebElement element, String text) {
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(text);
		
	}
	
	public void selectElementFromDropdown(WebElement element, String select) {
		
		Select slct = new Select(element);
		
		slct.selectByVisibleText(select);
		
	}
	
	public void Assertion(WebElement actual, String expected) {
		wait.until(ExpectedConditions.visibilityOf(actual));
		
		Assert.assertEquals(actual.getText(), expected);
		
		System.out.println("Message:"+actual.getText());
	}
}
