package omega.functional.sellerdashboard.beans;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import omega.base.BaseTest;
import omega.functional.login.pageaction.LoginPage;
import omega.functional.sellerdashboard.pageaction.HomePage;
import omega.utils.logs.Log;
import omega.utils.report.ExtentTestManager;

public class Home {
	WebDriver driver;
	HomePage homepage = new HomePage(BaseTest.driver);

	public void verifyLogin() {
		if (homepage.verifyLogin()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
}
