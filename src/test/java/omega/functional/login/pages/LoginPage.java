package omega.functional.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;

import omega.functional.login.pageobjects.CommonPageObj;
import omega.utils.Se;
import omega.utils.SeGenericFunctions;

public class LoginPage extends CommonPageObj{
	
	WebDriver driver;
	private static Logger logger = LoggerFactory.getLogger(LoginPage.class);
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
public boolean checkLoginContainer() {
		
		Se.waitforExistence(Se.getlocator(loginContainer), 30);
		if(loginContainer.isDisplayed()) {
			return true;
		}else {
			return false;
		}
		
	}

}
