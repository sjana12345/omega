package omega.functional.login;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import omega.base.BaseTest;
import omega.functional.login.pages.LoginPage;
import omega.utils.Report;

public class Login{
	WebDriver driver;
	LoginPage loginpage = new LoginPage(BaseTest.driver);

	public void verifyLoginContainer() {
		if(loginpage.checkLoginContainer()) {
			Report.rlog(LogStatus.PASS, "Login Countainer should be visible", "Login Countainer is visible");
		}else {
			Report.rlog(LogStatus.FAIL, "Login Countainer should be visible", "Login Countainer not Found");
		}
	}
}
