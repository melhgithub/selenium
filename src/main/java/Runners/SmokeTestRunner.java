package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false,
        plugin = {"pretty",
                "html:target/site/smoke-cucumber-html-report.html",
                "json:target/smoke-cucumber-json-report.json",
                "junit:target/smoke-cucumber-xml-report.xml"}
)
public class SmokeTestRunner extends AbstractTestNGCucumberTests {

}
