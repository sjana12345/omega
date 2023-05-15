package omega.functional.product.beans;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import omega.base.BaseTest;
import omega.functional.product.pageaction.ProductPage;
import omega.utils.report.ExtentTestManager;

public class Product {
	
	WebDriver driver;
	ProductPage productpage=new ProductPage(BaseTest.driver);
	
	public void validateManageProductPage() {
		if(productpage.validateManageProductPage()) {
			ExtentTestManager.getTest().log(Status.PASS, "Manage Product Page loaded Successfully");
		}else {
			ExtentTestManager.getTest().log(Status.FAIL, "Manage Product Page load Failure");
		}
			
	}
	
	public void createCustomProduct() {
		productpage.createCustomProduct();
	}

}
