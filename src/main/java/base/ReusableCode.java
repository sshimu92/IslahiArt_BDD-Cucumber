package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableCode {

	private static WebDriver driver;
	private static Logger logger = LogManager.getLogger(ReusableCode.class);
	
	public ReusableCode(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public static WebDriver invokeDriver() {
		
		return driver = DriverSetup.invokeBrowser();
	}
	
	public void openWebsite(String url) {
		
		driver.get(url);
	}
	
	public void sendKeys(WebElement ele, String txt) {
		
		ele.clear();
		ele.sendKeys(txt);
		
	}
	
	public void click(WebElement ele) {
		
		ele.click();
	}
	
	public String getText(WebElement ele) {
		
		return ele.getText();
	}
	
	public void selectDropDown(WebElement ele, String dp) {
		
		Select sc= new Select(ele);
		sc.selectByVisibleText(dp);
		
	}
	
	public void closeBrowser() {
		
		driver.quit();
	}
	
	public static void takeScreenShot(String filePath) {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(src, new File("screenshots"+filePath+".png"));
		
		} catch (IOException e) {
			
			logger.error(e.getMessage());
			
		}
	
	}
	
	
}
