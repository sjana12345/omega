package omega.functional.product.pageaction;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import omega.functional.product.pageobjectrepo.ProductPageObj;

public class ProductPage extends ProductPageObj {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	public boolean validateManageProductPage() {
		if (manageProductHeader.isDisplayed()) {
			boolean addProductBtnDisplayed = waitforExistence(getlocator(addProductBtn)).isDisplayed();
			boolean importProductBtnDisplayed = waitforExistence(getlocator(importProductBtn)).isDisplayed();
			boolean massUpdateBtnDisplayed = waitforExistence(getlocator(massUpdateBtn)).isDisplayed();
			boolean searchProductDisplayed = waitforExistence(getlocator(searchProduct)).isDisplayed();
			boolean filterProductOptionDisplayed = waitforExistence(getlocator(filterProductOption)).isDisplayed();

			if (addProductBtnDisplayed && importProductBtnDisplayed && massUpdateBtnDisplayed && searchProductDisplayed
					&& filterProductOptionDisplayed) {
				return true;
			}
		}
		return false;
	}

	public void createCustomProduct() {
		if (validateManageProductPage()) {
			waitandClick(getlocator(addProductBtn));
			sleep(50);
			waitandClick(getlocator(addCustomProduct));
			waitforExistence(getlocator(addProductHeader));
			sleep(50);
			waitandWriteText(getlocator(productnameField), "10");
			waitandWriteText(getlocator(mrpField), "10");
			waitandWriteText(getlocator(sellingpriceField), "10");
			waitandWriteText(getlocator(productunitField), "1");
			waitandClick(getlocator(productselectunitButton));
			List<WebElement> ele = getListofElements(getlocator(productselectunitOptions));
			ele.stream().forEach(a -> {
				try {
					if (a.getText().equalsIgnoreCase("kg")) {
						navigate(a);
					}
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			});
			sleep(50);
			waitandWriteText(getlocator(skuField), "12345");
			waitandWriteText(getlocator(positionField), "1");
			waitandWriteText(getlocator(barcodeField), "8910322368");
			waitandWriteText(getlocator(descriptionField), "Lorem Ipsum Dolor Sit");
		}
	}

}
