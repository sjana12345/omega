package omega.functional.customer.order.beans;

import omega.functional.customer.order.pageaction.CustomerOrderVerifyPage;
import omega.utils.report.ExtentTestManager;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import omega.base.BaseTest;

public class CustomerOrderVerify {

	WebDriver driver;
	CustomerOrderVerifyPage verify= new CustomerOrderVerifyPage(BaseTest.driver);
	
	public void verifyOrder() {
		if(verify.checkOrderId()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully order placed");
		}else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to place order");
		}
	}
}
