package omega.functional.customerCart.pageaction;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import omega.functional.customerCart.pageobjectrepo.CustomerMyCartPageObj;

public class customerMyCartPage extends CustomerMyCartPageObj{
	
	WebDriver driver;
	
	public customerMyCartPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean performMyCart() {
		waitforExistence(getlocator(myCartBtn),30);
		if(myCartBtn.isDisplayed()) {
			click(getlocator(myCartBtn));
			return true;
		}
		return false;
	}
	
	public boolean verifycart() {
		waitforExistence(getlocator(item),30);
			if(item.isDisplayed()) {
				//Assert.assertEquals(getlocator(item), "Boost Nutrition Drink - Health, Energy & Sports, 200 gm Jar");
				return true;
			}
			return false;
		
	}

}
