package omega.functional.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;

import omega.base.BaseSettings;
import omega.functional.login.pageobjects.CataloguePageObj;
import omega.utils.SeGenericFunctions;

public class CataloguePage extends CataloguePageObj {

	
	
	WebDriver driver;
	private static Logger logger = LoggerFactory.getLogger(CataloguePage.class);
	
	public CataloguePage(WebDriver driver) {
		
		super(driver);
	}
	public void navigateCatalogueScreen(String screenName) {
		catalogueMenuItem.click();
		if(screenName.equals("Manage Products"))
			manageProductMenuItem.click();
		else if(screenName.equals("Manage Categories"))
			manageCategoriesMenuItem.click();
		else if(screenName.equals("Manage Collections"))
			manageCollectionMenuItem.click();
			
	}
	public void addproduct() {
		addProductBtn.click();
		customProductBtn.click();
		uploadImage1.sendKeys("C:\\Users\\uaash\\eclipse-workspace\\omega\\src\\main\\resources\\LtuwoJ.jpg");
	}
	
	

}
