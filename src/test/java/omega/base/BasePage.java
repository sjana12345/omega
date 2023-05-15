package omega.base;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	JavascriptExecutor js;
	Actions actions;

	// Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
	}

	// Click Method
	public void waitandClick(By by) {
		waitforExistence(by).click();
	}

	public void navigate(WebElement element) {
		element.click();
	}

	public void writeText(WebElement element, String text) {
		element.sendKeys(text);
	}

	@SuppressWarnings("deprecation")
	public void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// Write Text
	public void waitandWriteText(By by, String text) {
		waitforExistence(by).clear();
		waitforExistence(by).sendKeys(text);
	}

	// Read Text
	public String readText(By by) {
		return waitforExistence(by).getText();
	}

	// Wait
	public WebElement waitforExistence(By by) {
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public List<WebElement> getListofElements(By by) {
		List<WebElement> webelements = driver.findElements(by);
		return webelements;

	}

	public void actionClick(WebElement element) {
		actions.click(element).perform();
	}

	public void writeTextAction(WebElement element, String text) {
		switch (text) {
		case "UP":
			actions.moveToElement(element).sendKeys(Keys.ARROW_UP).perform();
			break;
		case "DOWN":
			actions.moveToElement(element).sendKeys(Keys.ARROW_DOWN).perform();
			break;
		case "RIGHT":
			actions.moveToElement(element).sendKeys(Keys.ARROW_RIGHT).perform();
			break;
		case "LEFT":
			actions.moveToElement(element).sendKeys(Keys.ARROW_LEFT).perform();
			break;
		case "ENTER":
			actions.moveToElement(element).sendKeys(Keys.ENTER).perform();
			break;

		default:
			break;
		}
		
	}

	public By getlocator(WebElement element) {
		try {
			String[] data;
			if (element.toString().contains("DefaultElementLocator")) {
				data = (element.toString().split("DefaultElementLocator")[1].replace("]'", "]")).split(": ");
			} else {
				data = (element.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + "")).split(": ");
			}

			String locator = data[0].replace("'By.", "").trim();
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
//			Report.capture();
			return (By) null;
		}
	}

	public void sleep(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public void smartWait(By by, int sec) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public WebElement waitforExistence(By by, int sec) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public void scrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
}
