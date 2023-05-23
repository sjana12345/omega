package omega.functional.login.pageaction;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import omega.functional.login.pageobjectrepo.CommonPageObj;

public class CustomerLoginPage extends CommonPageObj{
	
	WebDriver driver;
	
	public CustomerLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean performCustomerSigninbtn() {
		waitforExistence(getlocator(customerSignin),30);
		if(customerSignin.isDisplayed()) {
			click(getlocator(customerSignin));
			return true;
		}
		return false;
	}
	
	public Boolean enterCustomerMobile() {
		if(customerMobileNumber.isDisplayed()) {
			System.out.println("pass");
			writeText(getlocator(customerMobileNumber),"6290303437");
			return true;
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
