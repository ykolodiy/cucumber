package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	
	@Given("^Open Chrome and start application$")
	public void Open_Chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver ();
	   driver.manage().window().maximize();
	   driver.get("http://www.facebook.com");
	}

	@When("^I enter valid \"([^\"]*)\" and valid password$")
	public void I_enter_valid_user_name_and_valid_password(String uname) throws Throwable {
	   driver.findElement(By.id("email")).sendKeys(uname);
	   driver.findElement(By.id("pass")).sendKeys("yuriw@ukr.net");
	   
	}

	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
		 driver.findElement(By.id("loginbutton")).click();
	}
	
	
	
	
	
}
