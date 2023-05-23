package omega.functional.Customerpage.pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import omega.base.BasePage;
import omega.base.BaseTest;

public class CustomerHomePageObj extends BasePage{
	WebDriver driver;
	BaseTest test;
	
	@FindBy(how= How.XPATH,using= "//p[text()='Sign In']")
	public WebElement signuptext;
	
	public CustomerHomePageObj(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	
}
