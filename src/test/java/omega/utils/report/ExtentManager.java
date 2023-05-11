package omega.utils.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import cn.hutool.core.date.DateTime;

public class ExtentManager {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		String dateTime = new DateTime().toString(" dd-MM-yy HH-mm-ss");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/ndhgo-test-report"+dateTime+".html");
		reporter.config().setReportName("Ndhgo Test Report");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Blog Name", "Ndhgo");
		extentReports.setSystemInfo("Author", "Supratik Jana");
		return extentReports;
	}
}
