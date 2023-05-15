package omega.functional.Customerpage.pageaction;

import org.openqa.selenium.WebDriver;

import omega.functional.Customerpage.pageobjectrepo.CustomerHomePageObj;

public class CustomerHomePage extends CustomerHomePageObj{

	WebDriver driver;
	
	public CustomerHomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean VerifyLogin() {
		waitforExistence(getlocator(banner),20);
		if(banner.isDisplayed()) {
			return true;
		}
		return false;
	}
}
