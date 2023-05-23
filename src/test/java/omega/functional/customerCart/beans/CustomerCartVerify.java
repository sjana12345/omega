package omega.functional.customerCart.beans;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import omega.functional.customerCart.pageaction.customerMyCartPage;
import omega.utils.report.ExtentTestManager;
import omega.base.BaseTest;

public class CustomerCartVerify {

	WebDriver driver;
	customerMyCartPage mycart= new customerMyCartPage(BaseTest.driver);
	
	public void verifyCart() {
		if(mycart.performMyCart() && mycart.verifycart()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully open cart");
		}else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to open cart");
		}
	}
}
