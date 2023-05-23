package omega.functional.customerCart.pageaction;

import org.openqa.selenium.WebDriver;
import omega.base.BasePage;

import omega.functional.customerCart.pageobjectrepo.CustomerCommonPageObj;

public class customerCartPage extends CustomerCommonPageObj {

	WebDriver driver;
	
	public customerCartPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean enterItem() {
		waitforExistence(getlocator(customerSearch),30);
		if(customerSearch.isDisplayed()) {
			writeTextkeybord(getlocator(customerSearch),"drink");
			return true;
		}
		return false;
	}
	
	public boolean performItem() {
		waitforExistence(getlocator(drink),30);
		click(getlocator(drink));
		return true;
	}
	
	public boolean performCart() {
		waitforExistence(getlocator(cartBtn),30);
		click(getlocator(cartBtn));
		return true;
	}
	
}
