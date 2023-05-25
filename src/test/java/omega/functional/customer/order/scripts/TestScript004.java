package omega.functional.customer.order.scripts;

import org.testng.annotations.Test;
import omega.functional.customer.order.beans.CustomerOrderVerify;
import omega.functional.customer.order.beans.CustomerOrder;

import omega.base.BaseTest;
import omega.functional.customer.login.beans.CustomerLogin;

public class TestScript004 extends BaseTest {

	@Test(suiteName= "Omega Suite", testName=" Scenario 4")
	public void runScript() {
		launchBaseUrl("CustomerUrl");
		CustomerLogin cuslogin = new CustomerLogin();
		CustomerOrder corder= new CustomerOrder();
		CustomerOrderVerify orderverify= new CustomerOrderVerify();
		cuslogin.performCustomerLogin();
		corder.performOrderplace();
		orderverify.verifyOrder();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
