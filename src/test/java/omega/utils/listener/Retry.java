package omega.utils.listener;

import static omega.utils.report.ExtentTestManager.getTest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import omega.base.BaseTest;

public class Retry implements IRetryAnalyzer {
	private int count = 0;
	private static int maxTry = 1; // Run the failed test 2 times

	@Override
	public boolean retry(ITestResult result) {
		if (!result.isSuccess()) { // Check if test not succeed
			if (count < maxTry) { // Check if maxTry count is reached
				count++; // Increase the maxTry count by 1
				result.setStatus(ITestResult.FAILURE); // Mark test as failed and take base64Screenshot
				extendReportsFailOperations(result); // ExtentReports fail operations
				return true; // Tells TestNG to re-run the test
			}
		} else {
			result.setStatus(ITestResult.SUCCESS); // If test passes, TestNG marks it as passed
		}
		return false;
	}

	public void extendReportsFailOperations(ITestResult iTestResult) {
		Object testClass = iTestResult.getInstance();
		WebDriver webDriver = BaseTest.driver;
		String base64Screenshot = "data:image/png;base64,"
				+ ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BASE64);
		getTest().log(Status.FAIL, "Test Failed",
				getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));
	}

}
