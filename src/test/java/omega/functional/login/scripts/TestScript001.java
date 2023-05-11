package omega.functional.login.scripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import omega.base.BaseTest;
import omega.functional.login.beans.Login;
@Listeners(omega.utils.listener.TestListener.class)
public class TestScript001 extends BaseTest {

	@Test(suiteName = "Omega Suite", testName = "Scenario 1")
	public void runScript() {
		launchBaseUrl();
		Login login = new Login();
		login.enterMobilerNumber();
		login.enterPassword();
		login.performLogin();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
