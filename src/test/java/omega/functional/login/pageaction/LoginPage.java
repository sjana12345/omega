package omega.functional.login.pageaction;

import org.openqa.selenium.WebDriver;

import omega.functional.login.pageobjectrepo.CommonPageObj;
import omega.utils.logs.Log;
import static omega.base.BaseSettings.*;

public class LoginPage extends CommonPageObj {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean enterMobileNumber() {
		if(mobileNumber.isDisplayed()) {
			writeText(getlocator(mobileNumber), getPropertyValue("mobile"));
			return true;
		}
		return false;
	}

	public boolean checkLoginContainer() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getListofElements(getlocator(slides)).stream().forEach(a->{
			Log.info(a.getAttribute("src"));
		});
//		waitforExistence(getlocator(loginContainer), 60);
//		if (loginContainer.isDisplayed()) {
//			return true;
//		} else {
//			return false;
//		}
		return false;

	}

}
