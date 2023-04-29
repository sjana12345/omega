package omega.base;

import org.openqa.selenium.WebDriver;

import omega.config.CoreTestParameters;
import omega.config.WebdriverConfig;
import omega.utils.Report;

public abstract class BaseTest extends BaseSettings {

	public CoreTestParameters ctp;
	public WebdriverConfig configuration;
	public static WebDriver driver;

	public void startTest() {
		configuration=new WebdriverConfig();
		driver = configuration.getConfig(getProperty("Browser"));
		Report.reportInit();
	}

	public void stopTest() {
		if(driver!=null) {
			driver.quit();
		}
		Report.reportEnd();
	}

	public void executeTest() {
		startTest();
	}

	public void launchBaseUrl() {
		String url = getProperty("Url");
		if (!url.isBlank()) {
			driver.get(url);
			setProperty("TestStatus", "Running");
		}
	}

	public abstract void runScript();
}
