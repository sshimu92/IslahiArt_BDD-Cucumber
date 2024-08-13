package step_definations;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features"},
                 glue = {"classpath:step_definations"})
//                 plugin = {"pretty", "html:target/cucumber-reports"})
//                                                   
		
		

public class Runner extends AbstractTestNGCucumberTests{

	

   
}