package stepDefinition;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

public class jMeter_Steps {

	@Given("I have prepared a JMeter test")
	public void prepareJMeterTest() throws Exception {
	    try {
	        // Update the path to the correct location of jmeter.properties
	        String jmeterPropertiesPath = "C:\\apache-jmeter-5.6.3\\bin\\jmeter.properties";
	        JMeterUtils.loadJMeterProperties(jmeterPropertiesPath);
	        JMeterUtils.setJMeterHome("C:\\apache-jmeter-5.6.3");
	        JMeterUtils.initLogging();
	        JMeterUtils.initLocale();
	    } catch (Exception e) {
	        throw new RuntimeException("Failed to prepare JMeter test environment", e);
	    }
	}


    @When("I execute the JMeter test")
    public void executeJMeterTest() throws Exception {
        StandardJMeterEngine jmeter = new StandardJMeterEngine();
        try {
            File testPlan = new File("src/test/resources/jmeter/test_plan.jmx");
            if (!testPlan.exists()) {
                throw new RuntimeException("Test plan file not found: " + testPlan.getAbsolutePath());
            }

            HashTree testPlanTree = SaveService.loadTree(testPlan);
            jmeter.configure(testPlanTree);
            jmeter.run();
        } catch (Exception e) {
            throw new RuntimeException("Failed to execute JMeter test", e);
        }
    }



    @Then("I should get the performance results")
    public void verifyResults() {
        System.out.println("Test completed. Results can be checked.");
    }
}
