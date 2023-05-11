package omega.functional.sellerdashboard.pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import omega.base.BasePage;
import omega.base.BaseTest;

public class HomePageObj extends BasePage{
	
	WebDriver driver;
	BaseTest test;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dash-store-name']")
	public WebElement dashstorename;	
	
	public HomePageObj(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
