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

	public void performLogin() {
		if (loginpage.enterMobileNumber()&&loginpage.enterPassword()&&loginpage.performLogin()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
}
