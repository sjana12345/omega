package omega.functional.customerCart.beans;
import omega.functional.customerCart.pageaction.customerCartPage;
import omega.utils.report.ExtentTestManager;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import omega.base.BaseTest;

public class CustomerCart {

	WebDriver driver;
	customerCartPage cart= new customerCartPage(BaseTest.driver);
	
	public void performCart() {
		if(cart.enterItem() && cart.performItem() && cart.performCart()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully cart");
		}else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to cart");
		}
	}
}
