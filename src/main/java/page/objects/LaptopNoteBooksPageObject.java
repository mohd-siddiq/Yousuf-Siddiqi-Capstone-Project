package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopsAndNotebooksTab;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksLink;
	@FindBy(xpath = "/html[@dir='ltr']//descendant::div[57]//img[@class='img-responsive']")
	private WebElement macBookItem;
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement successMessageLink;
	@FindBy(id = "cart-total")
	private WebElement itemsShowedToTheCart;
	@FindBy(xpath = "//span//i[@class='fa fa-shopping-cart']")
	private WebElement cartOptionBttn;
	@FindBy(xpath = "//td//i[@class='fa fa-times']")
	private WebElement redXButton;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itemRemovedFromCart;
	/////////////////////////////////////////////////////////
	
	@FindBy(xpath = "/html[@dir='ltr']//descendant::div[61]//i[@class='fa fa-exchange']")
	private WebElement macBookCompareButton;
	@FindBy(xpath = "/html[@dir='ltr']//descendant::div[63]//i[@class='fa fa-exchange']")
	private WebElement macBookAirCompareButton;
	@FindBy(xpath = "/html[@dir='ltr']//descendant::div[27]")
	private WebElement macBookAirSuccessMessage;
	@FindBy(xpath = "/html[@dir='ltr']//descendant::div[27]//a[text()='product comparison']")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement productComparisonText;
	@FindBy(xpath = "/html//div[@class='image']//img[@title='MacBook Pro']")
	private WebElement macBookProItem;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPriceTag;
	public void userClickOnLaptopsAndNotebooksTab() {
		LaptopsAndNotebooksTab.click();
	}

	public void userClickOnShowAllLaptopsAndNotebooksLinks() {
		showAllLaptopsAndNotebooksLink.click();
	}

	public void userClickOnMacBookItem() {
		macBookItem.click();
	}

	public void userClickOnAddToCartButton() {
		addToCartButton.click();

	}

	public String getSuccessMessageLinkFromUI() {
		String textFromUI = successMessageLink.getText();
		return textFromUI;
	}

	public String getItemShowedToTheCartMessageFromUI() {
		String textFromUI = itemsShowedToTheCart.getText();
		return textFromUI;
	}

	public void userClickOnCartOption() {
		cartOptionBttn.click();

	}

	public void userClickOnRedXButton() {
		redXButton.click();
	}

	public String getItemRemovedFromCartFromUI() {
		String textFromUI = itemRemovedFromCart.getText();
		return textFromUI;
	}

	/////////////////////////////////////////////////

	public void userClickOnmacBookCompareButton() {
		macBookCompareButton.click();

	}

	public void userClickOnmacBookAirCompareButton() {
		macBookAirCompareButton.click();
	}

	public String getMacBookAirSuccessMessageFromUI() {
		String textFromUI = macBookAirSuccessMessage.getText();
		return textFromUI;
	}

	public void userClickOnProductComparisonLink() {
		productComparisonLink.click();
	}

	public String getProductComparisonTextFromUI() {
		String textFromUI = productComparisonText.getText();
		return textFromUI;
	}
	public void userClickOnMacBookPro() {
		macBookProItem.click();
	}
	public String getMacBookProPriceTagFromUI() {
		String textFromUI = macBookProPriceTag.getText();
		return textFromUI;
	}
}
