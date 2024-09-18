package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
	features = {"src/test/java"},
    glue = {"stepDefinition"},
    		plugin = {
    			    "pretty", 
    			    "html:target/performance-cucumber-html-report.html",
    			    "json:target/performance-cucumber-json-report.json",
    			    "junit:target/performance-cucumber-xml-report.xml"
    			},

    monochrome = true,
    tags = "@PerformanceTest"
)
public class jMeterRunner extends AbstractTestNGCucumberTests {
}