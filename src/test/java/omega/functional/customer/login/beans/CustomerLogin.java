package omega.functional.customer.login.beans;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import omega.functional.login.pageaction.CustomerLoginPage;
import omega.utils.report.ExtentTestManager;
import omega.base.BaseTest;

public class CustomerLogin {

	WebDriver driver;
	CustomerLoginPage clogin= new CustomerLoginPage(BaseTest.driver);
	
	public void performCustomerLogin() {
		if(clogin.enterCustomerMobile()&& clogin.enterOTP() && clogin.performCustomerLogin() ) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
}
