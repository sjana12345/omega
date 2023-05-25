package omega.functional.customer.order.pageaction;

import org.openqa.selenium.WebDriver;

import omega.functional.customerCart.pageobjectrepo.CustomerCommonPageObj;

public class CustomerOrderPage extends CustomerCommonPageObj {
	
	WebDriver driver;
	
	public CustomerOrderPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean enterItem() {
		waitforExistence(getlocator(customerSearch),30);
		if(customerSearch.isDisplayed()) {
			writeTextkeybord(getlocator(customerSearch),"fruits");
			return true;
		}
		return false;
	}
	
	public boolean performItem() {
		waitforExistence(getlocator(fruit),30);
		click(getlocator(fruit));
		return true;
	}
	
	public boolean performCart() {
		waitforExistence(getlocator(cartBtn),30);
		click(getlocator(cartBtn));
		return true;
	}
	
	public boolean performMyCart() {
		waitforExistence(getlocator(myCartBtn),30);
		click(getlocator(myCartBtn));
		return true;
	}
	
	public boolean performConfirm() {
		waitforExistence(getlocator(confirmbtn),30);
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(getlocator(confirmbtn));
		return true;
	}
	
	public boolean setAddress() {
		waitforExistence(getlocator(homeAddress), 30);
		if(homeAddress.isDisplayed()) {
			click(getlocator(homeAddress));
		}
		return true;
	}
	
	public boolean performPayment() {
		waitforExistence(getlocator(paybtn),30);
		click(getlocator(paybtn));
		return false;
	}
	
	

	
}
