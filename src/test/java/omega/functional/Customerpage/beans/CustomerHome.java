package omega.functional.Customerpage.beans;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import omega.base.BaseTest;
import omega.functional.Customerpage.pageaction.CustomerHomePage;
import omega.utils.report.ExtentTestManager;

public class CustomerHome {

	WebDriver driver;
	CustomerHomePage custohome= new CustomerHomePage(BaseTest.driver);
	
	public void verifyLogin() {
		if(custohome.VerifyLogin()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login" );
		}
	}
}
