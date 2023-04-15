package omega.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import omega.base.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class SeGenericFunctions{
	public static WebDriver driver=BaseTest.driver;
	
	public static void sleep(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		System.out.println(driver);
	}
	
	public static void Jsfunc(String js) {
		JavascriptExecutor jsx=(JavascriptExecutor) driver;
		jsx.executeScript(js);
	}
	
	public static void waitforExistence(By element, int sec) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

}
