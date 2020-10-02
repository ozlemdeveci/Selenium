package com.hrms.runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features  = "src/test/resources/features",
             glue= {"com.hrms.API.steps.practice"},
		     dryRun=true,
             tags="@APITEST")


public class APIRunner {

}
