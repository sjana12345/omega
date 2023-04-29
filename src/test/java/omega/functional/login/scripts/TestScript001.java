package omega.functional.login.scripts;

import org.testng.annotations.Test;

import omega.base.BaseTest;
import omega.functional.login.Login;

public class TestScript001 extends BaseTest {

	@Override
	@Test(suiteName = "Omega Suite", testName = "Login Scenario")
	//Author-Supratik
	public void runScript() {
		executeTest();
		launchBaseUrl();
		Login login=new Login();
		login.perforLogin();
		stopTest();
	}

}
