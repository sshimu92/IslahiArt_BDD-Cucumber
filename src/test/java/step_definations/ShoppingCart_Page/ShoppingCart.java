package step_definations.ShoppingCart_Page;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjectModel.LoginPage;
import pageObjectModel.ShoppingCartPage;
import step_definations.Hooks;

public class ShoppingCart {

    private WebDriver driver = Hooks.driver;
    private ShoppingCartPage sc = new ShoppingCartPage(driver);
    private Logger log = LogManager.getLogger(ShoppingCartPage.class);
    
  
    @When("user input {string} as Username {string} as Password")
    public void enterUsernameAndPass(String user, String pass) {
        
    	sc.enterUsernameAndPassword(user, pass);
    	
    }

    @Then("user succesfully logged in")
    public void verifyLoginSuccesfully() {
        
    	Assert.assertEquals(driver.getCurrentUrl(), "https://islahiart.com/my-account/");
    	
    }
    

	@Then("user click on Best Selling link")
	public void clickOnBestSelling() {
	    
		sc.clickOnBestSellingLink();
	}

	@Then("user click on the item {string} to the Shopping Cart")
	public void clickOnItem(String item) {

		sc.clickonItem();
		sc.addItemToCart();
	}

	@Then("user navigate to Shopping Cart page")
	public void clickOnShoppingCartLink() {
	    
		sc.clickOnShoppingCart();
		
	}
	
}
