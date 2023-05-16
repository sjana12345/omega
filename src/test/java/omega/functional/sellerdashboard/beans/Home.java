package omega.functional.sellerdashboard.beans;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import omega.base.BaseTest;
import omega.functional.login.pageaction.LoginPage;
import omega.functional.sellerdashboard.pageaction.HomePage;
import omega.utils.logs.Log;
import omega.utils.report.ExtentTestManager;

public class Home {
	WebDriver driver;
	
	
	HomePage homepage = new HomePage(BaseTest.driver);

	public void verifyLogin() {
		if (homepage.verifyLogin()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	
	public void verifyDasboard() {
		if (homepage.verifydashboard()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	
	public void click() {
		homepage.clickonlineswitch();
		//homepage.clickonlineswitch();
		
	}
		
	
	
	public void verifySales() {
		if (homepage.verifysales()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	public void verifyAvgorder() {
		if (homepage.avgorder()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	public void verifyPendingorder() {
		if (homepage.pendorder()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	public void verifyCustomer2() {
		if (homepage.customeri()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	public void verifyTrend() {
		if (homepage.salestre()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	public void verifySellerCertificate() {
		if (homepage.sellercertificate()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	public void verifySellerInventory() {
		if (homepage.sellerinventory()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	
	public void verifySellerOperationmetrics() {
		if (homepage.selleroperationmetrics()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
	
	public void verifySellerReview() {
		if (homepage.selleroperationmetrics()) {
			ExtentTestManager.getTest().log(Status.PASS, "Successfully Logged in");
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "Failed to Login");
		}
	}
}
