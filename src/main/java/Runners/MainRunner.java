package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false,
        plugin = {"pretty",
                "html:target/site/cucumber-html-report.html",
                "json:target/cucumber-json-report.json",
                "junit:target/cucumber-xml-report.xml"}
)
public class MainRunner extends AbstractTestNGCucumberTests {

}
