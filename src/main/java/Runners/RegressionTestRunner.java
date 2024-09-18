package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest",
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false,
        plugin = {"pretty",
                "html:target/site/regression-cucumber-html-report.html",
                "json:target/regression-cucumber-json-report.json",
                "junit:target/regression-cucumber-xml-report.xml"}
)
public class RegressionTestRunner extends AbstractTestNGCucumberTests {

}
