package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        publish = true,
        features = "src//test//resources//FeatureFiles//",
        glue = {"stepdefns"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty"}
        )


public class POMRunner extends AbstractTestNGCucumberTests {
	
	

}
