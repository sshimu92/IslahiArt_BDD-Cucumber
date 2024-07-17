package step_definations;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features/ShoppingCart.feature"},
                 glue = {"classpath:step_definations"} )

public class Runner extends AbstractTestNGCucumberTests{

	
}
