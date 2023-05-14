package omega.functional.login.scripts;

import org.testng.annotations.Test;

import omega.base.BaseTest;
import omega.functional.login.Login;
import omega.functional.login.pages.CataloguePage;
import omega.utils.SeGenericFunctions;

public class ProductCreationTest extends BaseTest {
	@Override
	@Test(suiteName = "Omega Suite", testName = "Login Scenario")
	public void runScript() {
		executeTest();
		launchBaseUrl();
		Login login=new Login();
		login.perforLogin();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SeGenericFunctions.sleep(220);
		CataloguePage cp =new CataloguePage(BaseTest.driver);
		cp.navigateCatalogueScreen("Manage Products");
		SeGenericFunctions.sleep(220);
		cp.addproduct();
		stopTest();
	}


}
