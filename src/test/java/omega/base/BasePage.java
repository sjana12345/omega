package omega.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Click Method
    public void click(By by) {
    	waitforExistence(by).click();
    }

    //Write Text
    public void writeText(By by, String text) {
    	waitforExistence(by).sendKeys(text);
    }
    
    public void writeTextkeybord(By by, String text) {
    	waitforExistence(by).sendKeys(text, Keys.ENTER);
    }

    //Read Text
    public String readText(By by) {
        return waitforExistence(by).getText();
    }

    //Wait
    public WebElement waitforExistence(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    
    public List<WebElement> getListofElements(By by) {
    	List<WebElement> webelements=driver.findElements(by);
		return webelements;
    	
    }
    
    public By getlocator(WebElement element) {
		try {
			String[] data;
			if(element.toString().contains("DefaultElementLocator")) {
				data = (element.toString().split("DefaultElementLocator")[1].replace("]'", "]")).split(": ");
			}else {
				data = (element.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + "")).split(":");
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
    
    public WebElement waitforExistence(By by, int sec) {
    	wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
