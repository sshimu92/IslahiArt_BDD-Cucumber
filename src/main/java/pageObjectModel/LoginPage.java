package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//li[@data-tab='login'])[1]")
	private WebElement logintab;

	@FindBy(xpath = "(//input[@name='xoo-el-username'])[1]")
	private WebElement username;

	@FindBy(xpath = "(//input[@name='xoo-el-password'])[1]")
	private WebElement password;

	@FindBy(xpath = "(//button[contains(text(),'Sign in')])[1]")
	private WebElement signinbutton;
	
	@FindBy(xpath = "//p[contains(text(),'Hello')][1]")
	private WebElement verifytxt;

	
	public void clickOnLogin() {

		Actions actions = new Actions(driver);
		actions.moveToElement(logintab).click().perform();
		
	}

	public void enterUserName(String uname) {

		username.clear();
		username.sendKeys(uname);
	}

	public void enterPassword(String pwd) {

		password.clear();
		password.sendKeys(pwd);
	}

	public void clickSignInButton() {

		signinbutton.click();
	}

	public String verifyText() {
		
		return verifytxt.getText();
	}

}
