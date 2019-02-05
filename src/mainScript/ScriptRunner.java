package mainScript;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "src/feature/input.feature"
		//features ="C:\\Users\\user\\eclipse-workspace\\TechBodhiCucumber\\src\\feature\\input.feature"
		features = "src/feature/"
		,glue={""}
		,dryRun = false
		)
public class ScriptRunner {


}