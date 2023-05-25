package omega.functional.customer.order.beans;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import  omega.functional.customer.order.pageaction.CustomerOrderPage;
import omega.utils.report.ExtentTestManager;
import omega.base.BaseTest;

public class CustomerOrder {

	WebDriver driver;
	CustomerOrderPage order= new CustomerOrderPage(BaseTest.driver);
	
	public void performOrderplace() {
		if(order.enterItem() && order.performItem() && order.performCart() && order.performMyCart() && order.setAddress() && order.performConfirm() && order.performPayment()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully order place");
		}else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed To place order");
		}
	}
}
