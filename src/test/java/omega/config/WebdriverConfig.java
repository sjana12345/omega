package omega.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverConfig {

	public static WebDriver driver;
	public List<String> arguments;

	public WebDriver getConfig(String browser) {
		List<String> arguments = new ArrayList<>(Arrays.asList("--start-maximized", "--remote-allow-origins=*", "--incognito", "--user-data-dir=" + System.getProperty("java.io.tmpdir")));
		switch (browser) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments(arguments);
			driver=new ChromeDriver(chromeoptions);
			break;
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			firefoxoptions.addArguments(arguments);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "EDGE":
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeoptions = new EdgeOptions();
			edgeoptions.addArguments(arguments);
			driver=new EdgeDriver(edgeoptions);
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			break;
		case "SAFARI":
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
			driver.manage().window().maximize();
			break;
		default:
			break;
		}
		return driver;
	}

}
