package org.Cucumber.runner;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue= "org/Cucumber/stepdefinition",
				 features= {"src/test/resources/org/feature"},tags= "@datatable and not @tag1",
				plugin={"html:src\\reports\\rep.html","json:\\src\\reports\\rep2.json","pretty"},monochrome = true)


public class TestngRunner extends AbstractTestNGCucumberTests{
	
	/*
	 * @AfterSuite public void intialize() { System.out.println("init");
	 * 
	 * }
	 */
	
	
	public void after(Scenario scenario) {
		System.out.println("after 12");
		System.out.println(scenario.getStatus());
		System.out.println("after status");
	}

	
	
	

}
