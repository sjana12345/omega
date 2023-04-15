package omega.functional.login;

import org.openqa.selenium.WebDriver;

import omega.base.BaseTest;
import omega.functional.login.pages.LoginPage;

public class Login {
	WebDriver driver;
	LoginPage loginpage = new LoginPage(BaseTest.driver);

	public void perforLogin() {
		
		boolean loginTitleTextVisible=loginpage.checkLoginPageTitleText();
		if(loginTitleTextVisible) {
			loginpage.performLogin();
		}
		
	}
}
