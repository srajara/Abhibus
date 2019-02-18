package stepdefinition;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/feature/addtriff.feature",glue = { "stepdefinition" },plugin = {"html:target" })
	public class TestRunner {

	}


