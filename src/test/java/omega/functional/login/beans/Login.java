package omega.functional.login.beans;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
			Log.info("Pass");
		} else {
			Log.info("Fail");
		}
	}
}
