package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	private WebDriver driver;

	public RegisterPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='/my-account/'])[1]")
	private WebElement clickmyaccount;

	@FindBy(xpath = "(//li[contains(text(),'Sign Up')][@class='xoo-el-reg-tgr'])[1]")
	private WebElement clicksignup;

	@FindBy(xpath = "(//input[@name='xoo_el_reg_email'])[1]")
	private WebElement email;

	@FindBy(xpath = "(//input[@class='xoo-aff-required xoo-aff-text'][@name='xoo_el_reg_fname'])[1]")
	private WebElement firstname;

	@FindBy(xpath = "(//input[@class='xoo-aff-required xoo-aff-text'][@name='xoo_el_reg_lname'])[1]")
	private WebElement lastname;

	@FindBy(xpath = "(//input[@class='xoo-aff-required xoo-aff-password'])[2]")
	private WebElement password;

	@FindBy(xpath = "(//input[@class='xoo-aff-required xoo-aff-password'])[3]")
	private WebElement confirmpassword;

	@FindBy(xpath = "(//input[@value='yes'])[1]")
	private WebElement checkbox;

	@FindBy(xpath = "(//button[contains(text(),'Sign Up')])[1]")
	private WebElement signupbutton;

	public void clickOnMyAccount() {

		clickmyaccount.click();
	}

	public void clickOnSignUp() {

		clicksignup.click();
	}

	public void enterEmailAddress(String eml) {

		email.sendKeys(eml);
	}

	public void enterFirstName(String fn) {

		firstname.sendKeys(fn);
	}

	public void enterLastName(String ln) {

		lastname.sendKeys(ln);
	}

	public void enterPassword(String pwd) {

		password.sendKeys(pwd);

	}

	public void confirmPassword(String cpwd) {

		confirmpassword.sendKeys(cpwd);

	}

	public void clickCheckBox() {

	   Actions ac = new Actions(driver);
	   ac.moveToElement(checkbox).click().build().perform();
	
	}

	public void clickSignUpButton() {

		signupbutton.click();
		
	}
}
