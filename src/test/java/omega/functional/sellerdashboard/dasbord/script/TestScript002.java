package omega.functional.sellerdashboard.dasbord.script;

import omega.base.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import omega.base.BaseTest;
import omega.functional.login.beans.Login;
import omega.functional.sellerdashboard.beans.Home;
@Listeners(omega.utils.listener.TestListener.class)

public class TestScript002 extends BaseTest {
	
	@Test(suiteName = "Omega Suite", testName = "Scenario 4")

	public void runScript() {
		launchBaseUrl();
		Login login = new Login();
		Home home=new Home();
		login.performLogin();
		
		home.verifyDasboard();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*home.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		home.verifySales();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		home.verifyAvgorder();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		home.verifyPendingorder();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		home.verifyCustomer2();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		home.verifyTrend();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home.verifySellerCertificate();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		home.verifySellerInventory();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		home.verifySellerOperationmetrics();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		home.verifySellerReview();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
	

}
