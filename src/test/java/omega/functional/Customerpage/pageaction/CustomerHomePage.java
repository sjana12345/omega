package omega.functional.Customerpage.pageaction;

import org.openqa.selenium.WebDriver;

import omega.functional.Customerpage.pageobjectrepo.CustomerHomePageObj;

public class CustomerHomePage extends CustomerHomePageObj{

	WebDriver driver;
	
	public CustomerHomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean VerifyLogin() {
		
		if(signuptext.isDisplayed()) {
			return false;
		}
		return true;
	}
}
