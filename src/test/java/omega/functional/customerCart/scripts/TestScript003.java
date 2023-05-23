package omega.functional.customerCart.scripts;

import omega.functional.customerCart.beans.CustomerCart;
import org.testng.annotations.Test;

import omega.base.BaseTest;
import omega.functional.customerCart.beans.CustomerCartVerify;
public class TestScript003 extends BaseTest {

	@Test(suiteName=" Omega Suite", testName="Scenario 2")
	public void runScript() {
		launchBaseUrl("CustomerUrl");
		CustomerCart cart= new CustomerCart();
		CustomerCartVerify cartverify= new CustomerCartVerify();
		cart.performCart();
		cartverify.verifyCart();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
