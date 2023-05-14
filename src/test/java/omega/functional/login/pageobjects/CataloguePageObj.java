package omega.functional.login.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import omega.base.BaseTest;

public class CataloguePageObj {
	WebDriver driver;
	BaseTest test;
	
//	@FindBy(how = How.XPATH, using = "//div[@class='login_main_div']")
//	public WebElement loginConatainer;
	@FindBy(how = How.XPATH, using = "//div[@id='menu_itam' ]/li[contains(text(),'Catalogue')]")
	public WebElement catalogueMenuItem;
	@FindBy(how = How.XPATH, using = "//div[@id='menu_itam' ]/ul/li[contains(text(),'Manage Products')]")
	public WebElement manageProductMenuItem;
	@FindBy(how = How.XPATH, using = "//div[@id='menu_itam' ]/ul/li[contains(text(),'Manage Categories')]")
	public WebElement manageCategoriesMenuItem;
	@FindBy(how = How.XPATH, using = "//div[@id='menu_itam' ]/ul/li[contains(text(),'Manage Collections')]")
	public WebElement manageCollectionMenuItem;
	@FindBy(how = How.XPATH, using = "//button[@id='composition-button' and @name='Add Product']//i")
	public WebElement addProductBtn;
	@FindBy(how = How.XPATH, using = "//ul[@id='composition-menu1']//div[text()='Custom Product']")
	public WebElement customProductBtn;
	@FindBy(how = How.XPATH, using = "//input[@id='upload-store-image']")
	public WebElement uploadImage1;
	
 
	
	public CataloguePageObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
