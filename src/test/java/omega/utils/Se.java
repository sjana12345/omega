package omega.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import omega.base.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Se {
	public static WebDriver driver = BaseTest.driver;

	public static void sleep(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		System.out.println(driver);
	}

	public static void Jsfunc(String js) {
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript(js);
	}

	public static void waitforExistence(By element, int sec) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		} catch (Exception e) {
			Report.capture();
		}
		
	}

	public static By getlocator(WebElement element) {
		try {
			String[] data = element.toString().split(" -> ")[1].replace("']", "'").split(": ");
			String locator = data[0];
			String term = data[1];
			switch (locator) {
			case "xpath":
				return By.xpath(term);
			case "css selector":
				return By.cssSelector(term);
			case "id":
				return By.id(term);
			case "tag name":
				return By.tagName(term);
			case "name":
				return By.name(term);
			case "link text":
				return By.linkText(term);
			case "class name":
				return By.className(term);
			}
			return (By) element;
		} catch (Exception e) {
			Report.capture();
			return (By) null;
		}
	}

	public static void action(WebElement element, String actionperformed, String value) {
		Actions action = new Actions(driver);
		switch (actionperformed) {
		case "CLICK":
			action.moveToElement(element).click().perform();
			break;
		case "ENTER":
			action.moveToElement(element).sendKeys(value).perform();
			break;
		default:
			break;
		}
	}

}
