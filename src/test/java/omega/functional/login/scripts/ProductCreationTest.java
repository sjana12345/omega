package omega.functional.login.scripts;

import org.testng.annotations.Test;

import omega.base.BaseTest;
import omega.constants.UrlConstants;
import omega.functional.login.beans.Login;
import omega.functional.login.pages.CataloguePage;
import static omega.constants.UrlConstants.*;

public class ProductCreationTest extends BaseTest {
	@Override
	@Test(suiteName = "Omega Suite", testName = "Login Scenario")
	public void runScript() {
		launchBaseUrl(SELLER_STAGE.value);
		Login login=new Login();
		login.performLogin();
		CataloguePage cp =new CataloguePage(BaseTest.driver);
		cp.navigateCatalogueScreen("Manage Products");
		cp.addproduct();
	}


}
