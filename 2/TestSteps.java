package stepsdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import EAMavenCucumber.EAMavenCucumber.App;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class TestSteps {
	
	WebDriver driver;
	App a = new App();
	@Given("^Firefox Driver$")
	public void Firefox_Driver() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/home/toshiba/eclipse/jars/geckodriver");
		driver = new FirefoxDriver();  
		
		//System.setProperty("webdriver.chrome.driver", "/home/toshiba/eclipse/jars/chromedriver");
		//driver = new ChromeDriver();  
		
		driver.manage().window().maximize();	
	}

	@When("^I go to FB$")
	public void I_go_to_FB() throws Throwable {
		driver.get("http://www.facebook.com");
	}

	@Then("^I see \"([^\"]*)\"$")
	public void I_see_title(String title) throws Throwable {
	 
	  System.out.println(title);
	  System.out.println(driver.getTitle());
	  
	}
	
	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		driver.close();
		String x = a.retme();
		assertEquals("Root", x);
	}
	
	
}
