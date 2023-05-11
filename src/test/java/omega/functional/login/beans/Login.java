package omega.functional.login.beans;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import omega.base.BaseTest;
import omega.functional.login.pageaction.LoginPage;
import omega.utils.logs.Log;
import omega.utils.report.ExtentTestManager;

public class Login {
	WebDriver driver;
	LoginPage loginpage = new LoginPage(BaseTest.driver);

	public void enterMobilerNumber() {
		if (loginpage.enterMobileNumber()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully entered the Mobile Number");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to enter the Mobile Number");
		}
	}
	
	public void enterPassword() {
		if (loginpage.enterPassword()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully entered the Password");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to enter the Password");
		}
	}
	
	public void performLogin() {
		if (loginpage.performLogin()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully clicked on login button");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to click on login button");
		}
	}
	
	public void sendOtp() {
		
	}
}
