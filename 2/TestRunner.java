package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features= "features", 
				glue="stepsdefinition", 
                plugin= {"html:target/html-report", "pretty:target/cucumber-pretty.txt"}
				)
public class TestRunner {
	
}
