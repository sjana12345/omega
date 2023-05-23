package omega.functional.customerCart.pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import omega.base.BasePage;
import omega.base.BaseTest;

public class CustomerMyCartPageObj extends BasePage{

	WebDriver driver;
	BaseTest test;
	
	@FindBy(how= How.XPATH, using="//p[text()='My Cart']")
	public WebElement myCartBtn;
	
	@FindBy(how= How.XPATH, using="//h2[text()='Boost Nutrition Drink - Health, Energy & Sports, 200 gm Jar ']")
	public WebElement item;
	
	public CustomerMyCartPageObj(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
