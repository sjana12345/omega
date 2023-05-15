package omega.functional.customer.login.scripts;

import org.testng.annotations.Test;
import omega.functional.customer.login.beans.CustomerLogin;
import omega.functional.Customerpage.beans.CustomerHome;
import omega.base.BaseTest;

public class TestScript002 extends BaseTest {
	
	@Test(suiteName= "Omega Suite", testName="Scenario 2")
	public void runScript() {
		launchBaseCustomerUrl();
		CustomerLogin cuslogin = new CustomerLogin();
		CustomerHome cuhome= new CustomerHome();
		cuslogin.performCustomerLogin();
		cuhome.verifyLogin();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
