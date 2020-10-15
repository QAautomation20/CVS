package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith (Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Hamro\\Selenium\\BDDWithCucumberforCVS\\src\\test\\java\\feature", 
					 glue = "steps", 
					 dryRun = false,
					 monochrome = true,
					 plugin = {"pretty", "html:test-output"})

public class Zipcoderunner {

}
