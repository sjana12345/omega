package omega.functional.sellerdashboard.pageaction;

import org.openqa.selenium.WebDriver;
import omega.functional.sellerdashboard.pageobjectrepo.HomePageObj;

public class HomePage extends HomePageObj {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean verifyLogin() {
		waitforExistence(getlocator(dashstorename), 20);
		if(dashstorename.isDisplayed()) {
			return true;
		}
		return false;
	}
}
