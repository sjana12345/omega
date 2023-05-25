package omega.functional.customer.order.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import omega.base.BasePage;
import omega.base.BaseTest;

public class OrderPageObj extends BasePage{

	WebDriver driver;
	BaseTest test;
	
	@FindBy(how= How.XPATH, using="//h3[text()='Order ID: #']")
	public WebElement orderId;
	
	
	public OrderPageObj(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
}
