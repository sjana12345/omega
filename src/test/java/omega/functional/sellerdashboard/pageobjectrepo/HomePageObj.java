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
	
	@FindBy(how = How.XPATH,using ="//h1[@id='main-content-title']")
	public WebElement dashboard;
	
	@FindBy (how = How.XPATH,using="//input[@id='toggle_switch']")
	public WebElement planswitch;
	
	@FindBy(how = How.XPATH, using="(//div[@class='dash_store_info'])[1]")
	public WebElement sales;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='dash_store_info'])[2]")
	public WebElement averageorder;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='dash_store_info'])[3]")
	public WebElement pendingorder;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='dash_store_info'])[4]")
	public WebElement customer;
	
	@FindBy(how = How.XPATH, using ="(//img[@alt='awarded'])[1]")
	public WebElement certificate;
	
	@FindBy(how = How.XPATH, using ="(//div[@class='card_body'])[7]")
	public WebElement salestrend;
	
	@FindBy (how = How.XPATH, using ="(//div[@class='card_body'])[8]")
	public WebElement inventory;
	
	@FindBy (how =How.XPATH, using ="(//div[@class='card_body'])[12]")
	public WebElement operationmetrics;
	
	@FindBy(how = How.XPATH, using="(//div[@class='card_body'])[9]")
	public WebElement review;
	
	public HomePageObj(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
