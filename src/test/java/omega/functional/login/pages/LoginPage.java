package omega.functional.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;

import omega.functional.login.pageobjects.CommonPageObj;
import omega.utils.SeGenericFunctions;

public class LoginPage extends CommonPageObj{
	
	WebDriver driver;
	private static Logger logger = LoggerFactory.getLogger(LoginPage.class);
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	public boolean checkLoginPageTitleText() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(loginTitleText.isDisplayed()) {
			Reporter.log(loginTitleText.toString());
			return true;
		}
		return false;
	}
	
	public void performLogin() {
		SeGenericFunctions.sleep(220);
//		SeGenericFunctions.Jsfunc("alert('test')");
		SeGenericFunctions.waitforExistence(By.xpath("//h3[@class='new_title_text']"), 20);
		logger.debug("Waiting");
		mobileNumber.sendKeys("9804557370");
		logger.debug("Waiting");
		toggleLogin.click();
		logger.debug("Waiting");
		password.sendKeys("12345678");
		logger.debug("Waiting");
		loginButton.click();
		
//		SeGenericFunctions.sleep(50);
	}

}
