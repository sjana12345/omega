package omega.functional.product.scripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import omega.base.BaseTest;
import omega.functional.login.beans.Login;
import omega.functional.product.beans.Product;
import omega.functional.sellerdashboard.beans.Home;

@Listeners(omega.utils.listener.TestListener.class)
public class CreateProductWithExistingCategory extends BaseTest{

	@Test(suiteName = "Omega Suite", testName = "Create Custom Product")
	public void runScript() {
		launchBaseUrl("Url");
		Login login = new Login();
		Home home=new Home();
		Product product=new Product();
		login.performLogin();
		home.verifyLogin();
		navigate("/seller/products");
		product.validateManageProductPage();
		product.createCustomProduct();
	}

}
