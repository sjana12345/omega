package omega.base;

import static omega.utils.report.ExtentTestManager.xstartTest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import omega.config.CoreTestParameters;
import omega.config.WebdriverConfig;

public abstract class BaseTest extends BaseSettings {

	public CoreTestParameters ctp;
	public WebdriverConfig configuration;
	public static WebDriver driver;
	public ITestContext testContext;

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void startTest() {
			configuration = new WebdriverConfig();
			driver = configuration.getConfig(getProperty("Browser"));
	}

	@AfterClass
	public void teardown() {
//        Log.info("Tests are ending!");
		if (driver != null) {
			driver.quit();
		}
	}
	
	@BeforeMethod
	public void extentTest(ITestContext context) {
		xstartTest(context.getName() , "Invalid Login Scenario with invalid username and password.");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("fail");
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("pass");
		}
	}

	public void launchBaseUrl() {
		String url = getProperty("Url");
		if (!url.isBlank()) {
			driver.get(url);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setProperty("TestStatus", "Running");
		}
	}

	public abstract void runScript();
}
