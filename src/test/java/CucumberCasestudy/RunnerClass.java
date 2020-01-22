package CucumberCasestudy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/CucumberFeatureFiles/OrderDeclined.feature",
					glue="CucumberCasestudy",
					plugin="html:target/htmlreport"
					)



public class RunnerClass {

}
