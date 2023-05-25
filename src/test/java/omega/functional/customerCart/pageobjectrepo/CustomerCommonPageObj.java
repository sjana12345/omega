package omega.functional.customerCart.pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import omega.base.BasePage;
import omega.base.BaseTest;

public class CustomerCommonPageObj extends BasePage {

	WebDriver driver;
	BaseTest test;
	
	@FindBy(how= How.XPATH, using="//input[@id='search_product_input']")
	public WebElement customerSearch;
	
	@FindBy(how= How.XPATH, using="//h1[text()='Boost Nutrition Drink - Health, Energy & Sports, 200 gm Jar']")
	public WebElement drink;
	
	@FindBy(how= How.XPATH, using="//h1[text()='Alo Frut Orange Juice With Aloe Vera, 300 ml']")
	public WebElement fruit;
	
	@FindBy(how= How.XPATH, using="//span[@class='MuiIconButton-label']/input[0]")
	public WebElement FilterJuice;
	
	@FindBy(how= How.XPATH, using="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-disableElevation MuiButton-fullWidth']")
	public WebElement cartBtn;
	
	@FindBy(how= How.XPATH, using="//p[text()='My Cart']")
	public WebElement myCartBtn;
	
	@FindBy(how= How.XPATH, using="//button[@id='confirm_order_cart_new']")
	public WebElement confirmbtn; 
	
	@FindBy(how= How.XPATH, using="//span[@class='material-icons MuiIcon-root']")
	public WebElement homeAddress;
	
	@FindBy(how= How.XPATH, using="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained mt-30px MuiButton-containedPrimary MuiButton-disableElevation MuiButton-fullWidth']")
	public WebElement paybtn;
	
	
	public CustomerCommonPageObj(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
