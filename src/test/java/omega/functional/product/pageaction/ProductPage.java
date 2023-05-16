package omega.functional.product.pageaction;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
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
	public void categoryModalOperation(String categoryname, String taxonomy) {
		wait(4);
		sendvalue(modalCategoryName, categoryname, true);
		wait(4);
		sendvalue(modalGlobalTaxonomy, taxonomy, true);
		wait(4);
		writeTextAction(modalGlobalTaxonomy, "DOWN");
		wait(4);
		writeTextAction(modalGlobalTaxonomy, "ENTER");
		click(save);
	}

	public void createCategory(int level) {
		for (int i = 1; i <= level; i++) {
			if (i == 1) {
				wait(4);
				click(addParentCategory);
				categoryModalOperation("1ZAS1", "Frui");
			} else if (i == 2) {
				wait(4);
				click(getListofElements(getlocator(expandParentCategory)).get(1));
				click(getListofElements(getlocator(addChildCategory)).get(1));
				categoryModalOperation("2ZAS2", "Frui");
			} else if (i == 3) {
				wait(4);
				click(getListofElements(getlocator(addSubChildCategory)).get(1));
				categoryModalOperation("3ZAS3", "Frui");
				wait(4);
				click(getListofElements(getlocator(activeCategorylevel)).get(getListofElements(getlocator(activeCategorylevel)).size()-1));
			}
		}
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
						click(a);
					}
				} catch (Exception e) {
				}
			});
			sendvalue(getlocator(skuField), "12345", true);
			sendvalue(getlocator(positionField), "1", true);
			sendvalue(getlocator(barcodeField), "8910322368", true);
			sendvalue(getlocator(descriptionField), "Lorem Ipsum Dolor Sit", true);
			wait(4);
			scrollIntoView(addCategory);
			waitforExistence(getlocator(addCategory));
			click(addCategory);
			waitforExistence(getlocator(addParentCategory));
			wait(4);
			createCategory(3);
			wait(4);
			click(saveproduct);
			wait(4);
			click(publishproduct);
			wait(4);
			wait(4);
		}
	}

}
