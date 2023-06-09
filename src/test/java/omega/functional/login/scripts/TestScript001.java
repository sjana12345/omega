package omega.functional.login.scripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import omega.base.BaseTest;
import omega.functional.login.beans.Login;
import omega.functional.sellerdashboard.beans.Home;
@Listeners(omega.utils.listener.TestListener.class)
public class TestScript001 extends BaseTest {

	@Test(suiteName = "Omega Suite", testName = "Scenario 1")
	public void runScript() {
		launchBaseUrl("Url");
		Login login = new Login();
		Home home=new Home();
		login.performLogin();
		home.verifyLogin();
	}

}
