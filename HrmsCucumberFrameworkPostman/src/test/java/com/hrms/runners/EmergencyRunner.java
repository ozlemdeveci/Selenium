package com.hrms.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/emergencyContact.feature"
		,glue="com/hrms/steps"
		,dryRun=false
		,plugin= {"pretty", "html:target/html/cucumber-default","json:target/cucumber.json"}
		,monochrome=true
		,tags= {"@smoke"}
		)

public class EmergencyRunner {
	

}
