package omega.functional.customer.order.pageaction;

import org.openqa.selenium.WebDriver;

import omega.functional.customer.order.pageobject.OrderPageObj;

public class CustomerOrderVerifyPage extends OrderPageObj{

	WebDriver driver;
	
	public CustomerOrderVerifyPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean checkOrderId() {
		waitforExistence(getlocator(orderId),30);
		if(orderId.isDisplayed()) {
			return true;
		}
		return false;
	}
}
