package omega.functional.product.pageobjectrepo;

import org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi.withSha224;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import omega.base.BasePage;

public class ProductPageObj extends BasePage{
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Manage Product')]")
	public WebElement manageProductHeader;
	
	@FindBy(how = How.XPATH, using = "//button[@name='Add Product']")
	public WebElement addProductBtn;
	
	@FindBy(how = How.XPATH, using = "//ul[@role='menu']/li[2]")
	public WebElement addCustomProduct;
	
	@FindBy(how = How.XPATH, using = "//ul[@role='menu']/li[1]")
	public WebElement addCatalogBuilderProduct;
	
	@FindBy(how = How.XPATH, using = "//button[@name='Import or Export Products']")
	public WebElement importProductBtn;
	
	@FindBy(how = How.XPATH, using = "//button[@name='Mass Update']")
	public WebElement massUpdateBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search Product']")
	public WebElement searchProduct;
	
	@FindBy(how = How.XPATH, using = "//h4[@class='active_filter']")
	public WebElement filterProductOption;
	
	@FindBy(how = How.CSS, using = "div.card_body")
	public WebElement filterProductCardOption;
	
	@FindBy(how = How.XPATH, using = "//p[@class='filter_menu_text']//ancestor::div[1]")
	public WebElement filterAccordianHeaders;
	
	@FindBy(how = How.XPATH, using = "//div[@class='product-filter-list-item']/div[@class='MuiFormGroup-root']")
	public WebElement filterAccordianListItem;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Add Product')]")
	public WebElement addProductHeader;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'MRP')]//following-sibling::div[1]//input")
	public WebElement mrpField;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Selling Price')]//following-sibling::div[1]//input")
	public WebElement sellingpriceField;
	//
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Product Name')]//following-sibling::div[1]//input")
	public WebElement productnameField;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Product Unit')]//following-sibling::div[1]//input")
	public WebElement productunitField;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Select Unit']")
	public WebElement productselectunitField;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Select Unit']//following-sibling::div/button[@title='Open']")
	public WebElement productselectunitButton;
	
	@FindBy(how = How.XPATH, using = "//div[@role='presentation']//ul[@role='listbox']/li")
	public WebElement productselectunitOptions;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Position')]//following-sibling::div[1]//input")
	public WebElement positionField;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'SKU')]//following-sibling::div[1]//input")
	public WebElement skuField;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Barcode/EAN')]//following-sibling::div[1]//input")
	public WebElement barcodeField;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Description')]//following-sibling::div[1]//textarea")
	public WebElement descriptionField;
	
	@FindBy(how = How.XPATH, using = "//button//span[contains(text(),'+ Add Category')]")
	public WebElement addCategory;
	
	@FindBy(how = How.XPATH, using = "//div[@class='add-category-product']//parent::div[contains(@class,'MuiDrawer-paper')]")
	public WebElement categoryDrawer;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Parent')]")
	public WebElement addParentCategory;
	
	@FindBy(how = How.XPATH, using = "//li[contains(@class,'lable1_li')]/div/button")
	public WebElement expandParentCategory;
	
	@FindBy(how = How.XPATH, using = "//li[contains(@class,'lable1_li')]//div[@class='product_title']")
	public WebElement categoryNames;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Child')]")
	public WebElement addChildCategory;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Sub-Child')]")
	public WebElement addSubChildCategory;
	
	@FindBy(how = How.XPATH, using = "//li[contains(@class,'active_lable')]//li")
	public WebElement activeCategorylevel;
	
	@FindBy(how = How.XPATH, using = "//div[@role='dialog']")
	public WebElement modalDialog;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(@class,'MuiTypography-root')]")
	public WebElement modalDialogTitle;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Category Name')]//following-sibling::div[1]//input")
	public WebElement modalCategoryName;
	
	@FindBy(how = How.ID, using = "category_image_input_0")
	public WebElement modalCategoryImage;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Search')]//following-sibling::div/input")
	public WebElement modalGlobalTaxonomy;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'SAVE')]")
	public WebElement save;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
	public WebElement saveproduct;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Publish')]")
	public WebElement publishproduct;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'CLOSE')]")
	public WebElement close;
	
	public ProductPageObj(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
