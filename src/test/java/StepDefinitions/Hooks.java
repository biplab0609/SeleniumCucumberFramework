package StepDefinitions;

import Utilities.TestContextSetup;
import com.aventstack.extentreports.reporter.FileUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks {
    TestContextSetup testContextSetup;
    public Hooks(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
    }

    @After
    public void AfterScenario() throws IOException {
        testContextSetup.testBase.WebDriverManager().quit();
    }

    @AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            //Take screenshot
           File sourcepath = ((TakesScreenshot)testContextSetup.testBase.WebDriverManager()).getScreenshotAs(OutputType.FILE);
           byte[] fileContent = FileUtils.readFileToByteArray(sourcepath);
           scenario.attach(fileContent,"image/png","image");

        }
    }
}
