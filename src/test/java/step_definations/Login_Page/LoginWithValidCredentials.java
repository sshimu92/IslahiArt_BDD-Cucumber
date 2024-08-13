package step_definations.Login_Page;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjectModel.LoginPage;
import step_definations.Hooks;


public class LoginWithValidCredentials {

	private WebDriver driver = Hooks.driver;
	private LoginPage lp = new LoginPage(driver);
	private final Logger logger = LogManager.getLogger(LoginWithValidCredentials.class);
	private WebDriverWait wait;
	
	
	@And("user click on Login")
	public void clickOnLoginButton() {
	    
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		lp.clickOnLogin();
	}

	@Then("user input {string} as Username")
	public void inputUsername(String uname) {
	    
		lp.enterUserName(uname);
	}

	@And("user input {string} as Password")
	public void inputPassword(String pwd) {
	    
		lp.enterPassword(pwd);
		
	}

	@Then("User click on SIGN IN button")
	public void clickOnSignInButton() {
	
		lp.clickSignInButton();
		
	}
	
	@And("user see the successful Hello shawon.shimu message")
	public void verifyMessage() {
	    
		String msg = lp.verifyText();
		logger.info(msg);
		
	}
}
