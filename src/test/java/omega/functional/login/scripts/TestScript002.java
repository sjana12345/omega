package omega.functional.login.scripts;

import org.testng.annotations.Test;

import omega.base.BaseTest;
import omega.functional.login.beans.Login;
public class TestScript002 extends BaseTest {

	
	@Test(suiteName = "Omega Suite", testName = "Scenario 2")
	public void runScript() {
		launchBaseUrl();
		Login login = new Login();
		login.enterMobilerNumber();
	}

}
