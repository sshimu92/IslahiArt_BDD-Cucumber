package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartPage {

	private static WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//input[@name='xoo-el-username'])[1]")
	private WebElement username;

	@FindBy(xpath = "(//input[@name='xoo-el-password'])[1]")
	private WebElement password;
	
	@FindBy(xpath = "(//button[contains(text(),'Sign in')])[1]")
	private WebElement signinbutton;
	
	@FindBy(xpath = "//a[contains(text(),'Best Selling')]")
	private WebElement bestselling ;

	@FindBy(xpath = "//h2[contains(text(),'Islamic Calligraphy Canvas Gallery Wraps')]")
	private WebElement item ;

	@FindBy(xpath = "//button[@name='add-to-cart']")
	private WebElement addtocartitem ;
	
	@FindBy(xpath = "(//span[@class='ast-icon icon-bag'])[1]")
	private WebElement shoppingcart;
	
	
	public void enterUsernameAndPassword(String uname, String pwd) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", username);
		js.executeScript("arguments[0].scrollIntoView(true);", password);
		username.clear();
		username.sendKeys(uname);
		password.sendKeys(pwd);
		
	}
	
	public void clickSignInButton() {

		signinbutton.click();
	}
	
	public void clickOnBestSellingLink() {
	
		bestselling.click();
	}

	public void clickonItem() {
		
		item.click();
	}

	public void addItemToCart() {
		
		addtocartitem.click();
	}

	public void clickOnShoppingCart() {
		
		shoppingcart.click();
	}

	
}
