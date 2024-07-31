package step_definations.Register_Page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjectModel.RegisterPage;
import step_definations.Hooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegisterWithValidCredential {

	private WebDriver driver = Hooks.driver;
	private RegisterPage rp = new RegisterPage(driver);
	private Logger logger = LogManager.getLogger(RegisterWithValidCredential.class);
	private WebDriverWait wait;
	
	@Given("user already open the website islahiart")
	public void verifyRegisterPage() {
	
		assertEquals(driver.getCurrentUrl(), "https://islahiart.com/");
		
	}

	@When("user click on My Account link")
	public void clickMyAccountLink() {
	    
		rp.clickOnMyAccount();
	}

	@Then("user click on Sign Up button")
	public void clickOnSignUpButton() {
	    
		rp.clickOnSignUp();
	}

	@Then("user enter {string} as email")
	public void enterEmailAddress(String em) {
	    
		rp.enterEmailAddress(em);
	}

	@And("user enter {string} as First Name {string} as Last Name")
	public void enterFirstAndLastName(String fn, String ln) {
	    
		rp.enterFirstName(fn);
		rp.enterLastName(ln);
	}

	@And("user enter {string} as Password")
	public void enterPassword(String pwd) {
	    
		rp.enterPassword(pwd);
	}
	
	@And("user enter {string} as Confirm Password")
	public void confirmPassword(String cpwd) {
	    
		rp.confirmPassword(cpwd);
    }
	
    @Then("user click on check box")
	public void clickOnCheckBox() {
	    
//    	wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	
    	rp.clickCheckBox();
    	
	}

	@Then("user click on SIGN UP button")
	public void clickSignUpButton() {
	    
		rp.clickSignUpButton();
	}
}
