package org.Cucumber.runner;

import java.io.File;

import org.Cucumber.Common.TextContext;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(glue= "org/Cucumber/stepdefinition",//tags="@datatable",
features= "src/test/resources/org/feature",plugin = "pretty",monochrome = true)
//plugin={"html:src\\reports\\rep.html","junit:src\\reports\\rep1.xml","json:\\src\\reports\\rep2.json","rerun:target/rerun.txt",""})
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class JunitRunner {
		
        @AfterClass
        public static void writeExtentReport() {
        }   
        
   
}
