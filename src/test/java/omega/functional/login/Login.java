package omega.functional.login;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import omega.base.BaseTest;
import omega.functional.login.pages.LoginPage;

public class Login {
	WebDriver driver;
	LoginPage loginpage = new LoginPage(BaseTest.driver);

	public void verifyLoginContainer() {
		if(loginpage.checkLoginContainer()) {
			Reporter.log("Login Container Visible");
		}else {
			Reporter.log("Login Container not Visible");
		}
	}
}
