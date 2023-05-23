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
	@FindBy(how = How.XPATH, using = "//button//span[contains(text(),'Login')]")
	public WebElement loginButton;
	@FindBy(how = How.XPATH, using = "//li[@class='slide']//img")
	public WebElement slides;
	@FindBy(how = How.XPATH, using = "//img")
	public WebElement img;
	
	//Customer Page Object
	@FindBy(how= How.XPATH, using="//div[@class='MuiBox-root jss26 jss1']")
	public WebElement customerLoginContainer;
	@FindBy(how= How.XPATH, using="//h4[@class='MuiTypography-root MuiTypography-h4 jss4']")
	public WebElement customerLoginTitletext;
	@FindBy(how= How.XPATH, using="//body1[@class='MuiTypography-root MuiTypography-body1 jss5']")
	public WebElement customerLoginSubTitletext;
	@FindBy(how= How.XPATH, using="//input[@placeholder='Enter email or mobile number']")
	public WebElement customerMobileNumber;
	@FindBy(how= How.XPATH, using= "//i[@class='ri-user-line']")
	public WebElement customerSignin;
	@FindBy(how= How.XPATH, using= "//input[@placeholder='Enter your name']")
	public WebElement customerName;
	
	@FindBy(how= How.XPATH, using="//span[text()='Continue']")
	public WebElement customerLoginbtn;
	
	
	public CommonPageObj(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
