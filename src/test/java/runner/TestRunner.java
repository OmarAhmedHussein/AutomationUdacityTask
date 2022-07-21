package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/features",
                glue = "stepDefinition"
        )
public class TestRunner extends AbstractTestNGCucumberTests {

}