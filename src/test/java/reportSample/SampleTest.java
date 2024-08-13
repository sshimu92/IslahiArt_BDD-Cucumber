package reportSample;

import org.testng.annotations.Test;

import step_definations.Hooks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(ListenersSample.class)
public class SampleTest extends ListenersSample {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
		driver = Hooks.driver;
		
	}
	
	@Test
	public void test() {
		
		driver.get("https://islahiart.com/");
		assert true;
	}
	
//	@Test
//	public void test1() {
//		
//		driver.get("https://www.saucedemo.com");
//		assert false;
//	}

	public WebDriver getDriver() {
		
		return driver;
		
	}
}
