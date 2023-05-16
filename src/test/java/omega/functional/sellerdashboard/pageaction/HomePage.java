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
	public Boolean verifydashboard() {
		waitforExistence(getlocator(dashboard), 20);
		if(dashboard.isDisplayed()) {
			return true;
		}
		return false;
	}
	public Boolean clickonlineswitch() {
		click(getlocator(planswitch));
		waitforExistence(getlocator(planswitch),20);
		//click(getlocator(planswitch));
		return true;
	}
	
	public Boolean verifysales() {
		waitforExistence(getlocator(sales),20);
		if(sales.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public Boolean avgorder() {
		waitforExistence(getlocator(averageorder),20);
		if(averageorder.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public Boolean pendorder() {
		waitforExistence(getlocator(pendingorder),20);
		if(pendingorder.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public Boolean customeri() {
		waitforExistence(getlocator(customer),20);
		if(customer.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public Boolean salestre() {
		waitforExistence(getlocator(salestrend),5);
		if(salestrend.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	
	public Boolean sellercertificate() {
		waitforExistence(getlocator(certificate),20);
		if(certificate.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public Boolean sellerinventory() {
		waitforExistence(getlocator(inventory),20);
		if(inventory.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	public Boolean selleroperationmetrics() {
		waitforExistence(getlocator(operationmetrics),20);
		if(operationmetrics.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	
	public Boolean sellerreview() {
		waitforExistence(getlocator(review),20);
		if(review.isDisplayed()) {
			return true;
		}
		return false;
	}
}
