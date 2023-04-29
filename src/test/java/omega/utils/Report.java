package omega.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import omega.base.BaseTest;

public class Report {
	static ExtentTest test;
	static ExtentReports report;
	public static WebDriver driver = BaseTest.driver;
	public static void reportInit() {
		report = new ExtentReports(System.getProperty("user.dir")+"/report/System.currentTimeMillis()"+".html");
		test = report.startTest("ExtentDemo");
	}
	
	public static void rlog(LogStatus log,String expected, String actual) {
		test.log(log, expected, actual);
		System.out.println(LogStatus.valueOf("PASS"));
		if(LogStatus.values().equals("pass")) {
			capture();
			test.addScreenCapture(capture());
		}
	}
	
	public static void reportEnd() {
		report.endTest(test);
		report.flush();
	}
	
	public static String capture(){
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/target/" + System.currentTimeMillis()
		+ ".png");
		String errflpath = Dest.getAbsolutePath();
		try {
			FileUtils.copyFile(scrFile, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return errflpath;
		}

}
