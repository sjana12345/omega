package omega.functional.login.pageaction;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import omega.functional.login.pageobjectrepo.CommonPageObj;

public class CustomerLoginPage extends CommonPageObj{
	
	WebDriver driver;
	
	public CustomerLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean enterCustomerMobile() {
		waitforExistence(getlocator(customerLoginContainer),30);
		if(customerLoginContainer.isDisplayed()) {
			Assert.assertEquals(readText(getlocator(customerLoginTitletext)), "Login / Register");
			Assert.assertEquals(readText(getlocator(customerLoginSubTitletext)), "Provide your Mobile Number or Email to Login/ Sign Up");
			if(customerMobileNumber.isDisplayed()) {
				sendvalue(getlocator(customerMobileNumber),"6290303437", true);
				return true;
			}
		}
		return false;
	}
	
	public boolean performCustomerLogin() {
		click(getlocator(customerLoginbtn));
		return true;
	}
	
	public boolean enterOTP() {
		try {
			Thread.sleep(20000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	
}
