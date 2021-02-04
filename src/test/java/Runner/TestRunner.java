package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Login1.feature",glue={"StepExecution"}//this is to run the step files
,monochrome=true,//this is to see the console output in a better way)
dryRun=false,//this is to check all the methods are impleimented properly
strict=true,// To check did i miss any steps
plugin ={"html:testoutpu/testoutput.html","junit:testoutput/cucumber.xml"}
)
public class TestRunner {

}
