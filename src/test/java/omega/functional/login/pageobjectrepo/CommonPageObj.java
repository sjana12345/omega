package omega.functional.login.pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import omega.base.BasePage;
import omega.base.BaseTest;

public class CommonPageObj extends BasePage{
	
	WebDriver driver;
	BaseTest test;
	
	@FindBy(how = How.XPATH, using = "//div[@class='signin-cont']")
	public WebElement loginContainer;
	@FindBy(how = How.XPATH, using = "//h3[@class='new_title_text']")
	public WebElement loginTitleText;
	@FindBy(how = How.XPATH, using = "//p[@class='new_Sub_Title_text']")
	public WebElement loginSubTitleText;
	@FindBy(how = How.XPATH, using = "//div[@class='all_field_body']")
	public WebElement loginFieldsContainer;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter your phone number']")
	public WebElement mobileNumber;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Password']")
	public WebElement password;
	@FindBy(how = How.XPATH, using = "//strong")
	public WebElement toggleLogin;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Login')]")
	public WebElement loginButton;
	@FindBy(how = How.XPATH, using = "//li[@class='slide']//img")
	public WebElement slides;
	@FindBy(how = How.XPATH, using = "//img")
	public WebElement img;
	
	
	public CommonPageObj(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
