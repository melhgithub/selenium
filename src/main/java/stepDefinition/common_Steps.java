package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import utils.Driver;

public class common_Steps {
	private WebDriver driver;
	@Given("Navigate to Website")
    public void navigate_to_website() {
		driver = Driver.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.automationpractice.pl/index.php");
    }

}
