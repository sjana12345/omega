package omega.functional.login.pageaction;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import omega.functional.login.pageobjectrepo.CommonPageObj;
import omega.utils.logs.Log;

public class LoginPage extends CommonPageObj {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public Boolean enterMobileNumber() {
		waitforExistence(getlocator(loginContainer), 30);
		if (loginContainer.isDisplayed()) {
			Assert.assertEquals(readText(getlocator(loginTitleText)), "Welcome to ndhgo");
			Assert.assertEquals(readText(getlocator(loginSubTitleText)),
					"Enter account details to manage or create your online business");
			if (loginFieldsContainer.isDisplayed()) {
				waitandWriteText(getlocator(mobileNumber), "8910682813");
				return true;
			}
		}
		return false;
	}

	public Boolean enterPassword() {
		if (enterMobileNumber()) {
			waitandClick(getlocator(toggleLogin));
			waitandWriteText(getlocator(password), "12345678");
			return true;
		}
		return false;
	}

	public Boolean performLogin() {
		waitandClick(getlocator(loginButton));
		return true;
	}

	public boolean checkLoginContainer() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getListofElements(getlocator(slides)).stream().forEach(a -> {
			Log.info(a.getAttribute("src"));
		});
		return false;

	}

}
