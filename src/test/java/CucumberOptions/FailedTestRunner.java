package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"@target/failed_scenarios.txt"},
        glue={"StepDefinitions"},
        monochrome = true,tags = "@SmokeTest",plugin = {"pretty","html:target/Report.html","json:target/Report.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)
public class FailedTestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}