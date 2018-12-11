package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.runtime.model.CucumberFeature;



import org.testng.annotations.*;

@CucumberOptions(
			plugin = {"pretty"},
			glue = {"stepdefs"},//Your step definitions package.
			features = {"E:\\CODE1\\Selenide_BDD_JSON_Framework\\src\\main\\java\\features\\Login.feature"})
	
public class TestRunner extends AbstractTestNGCucumberTests {

}
