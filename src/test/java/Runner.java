

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/utkatsh1999/eclipse-workspace/jenkinsdemo/src/main/resources/data.feature",
glue = "jenkinsdemo")

public class Runner extends AbstractTestNGCucumberTests{


}
