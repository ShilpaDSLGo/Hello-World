package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
  //@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/bharathi1.html"}, //reporting purpose
			monochrome=true,  //console output color
			//tags = "@tag1", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= "stepDefination") //location of step definition files



public class testrunner extends AbstractTestNGCucumberTests{

}
