package page.objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsLink;
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement ItemsPresentInDesktopPage;

	@FindBy(xpath = "/html[@dir='ltr']/descendant::div[64]//span[@class='hidden-xs hidden-sm hidden-md']")
	private WebElement addToCartLink;
	@FindBy(id = "input-quantity")
	private WebElement quantityField;
	@FindBy(id = "button-cart")
	private WebElement addToCartBttn;
	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement successMessage;

	@FindBy(xpath = "/html[@dir='ltr']//descendant::div[55]//span[@class='hidden-xs hidden-sm hidden-md']")
	private WebElement addToCart;
	@FindBy(xpath = "/html[@dir='ltr']/descendant::select[@name='option[226]']")
	private WebElement selectOnDropDownAndSelectColorRed;
	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement cameraQuantityField;
	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement successMessageLink;

	@FindBy(xpath = "/html[@dir='ltr']//descendant::div[57]//img[@class='img-responsive']")
	private WebElement canonCamera;
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement ReviewLink;
	@FindBy(id = "input-name")
	private WebElement yourNameField;
	@FindBy(id = "input-review")
	private WebElement yourReviewField;
//	@FindBy(xpath = "/html[@dir='ltr']//descendant::div[40]//label[@class='control-label']")
//	private List<WebElement> ratingLink;
	@FindBy(xpath = "/html[@dir='ltr']//descendant::div[40]//input[@value='5']")
	private WebElement ratingLink;
	@FindBy(id = "button-review")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement thankYouMessage;

	public void userClickOnDesktopsTab() {
		desktopTab.click();
	}

	public void userClickOnShowAllDesktopsLink() {
		showAllDesktopsLink.click();
	}

	public String getItemsPresentInDesktopTextFromUI() {
		String textFromUI = ItemsPresentInDesktopPage.getText();
		return textFromUI;
	}

	public void userClickOnAddToCartOption() {
		addToCartLink.click();

	}

	public void userSelectQuantity() {
		quantityField.clear();
		quantityField.sendKeys("4");

	}

	public void userclickAddToCartBtton() {
		addToCartBttn.click();

	}

	public String getSuccessMessageFromUI() {
		String textFromUI = successMessage.getText();
		return textFromUI;
	}

	public void userClickOnAddToCart() {
		addToCart.click();
	}

	public void userClickOnDropDown() {
		selectOnDropDownAndSelectColorRed.click();
		selectOnDropDownAndSelectColorRed.sendKeys("red");
		selectOnDropDownAndSelectColorRed.click();
	}

	public void userSelectQuantity(String quantityValue) {
		cameraQuantityField.clear();
		cameraQuantityField.sendKeys(quantityValue);
	}

	public void userClickSelectOnCameraQuantity() {
		cameraQuantityField.click();
		quantityField.clear();
		cameraQuantityField.sendKeys("5");
	}

	public String getSuccessMessageLinkFromUI() {
		String textFromUI = successMessageLink.getText();
		return textFromUI;

		// This is another way to get the success message(concat method)
		// public void String successMessage() {
		// you need to copy the complete message from UI
		// String actualResult = Success: You have added
		// "+successMessageLink.getText()+" to your shopping cart!
		// return actualResult;
	}

	public void userClickOnCanonCamera() {
		canonCamera.click();
	}

	public void userClickOnReviewLink() {
		ReviewLink.click();
	}

	public void enterYourName(String yourName) {
		yourNameField.click();
		// yourNameField.clear();
		yourNameField.sendKeys(yourName);
	}

	public void enterYourReview(String yourReview) {
		yourReviewField.click();
		// yourReviewField.clear();
		yourReviewField.sendKeys(yourReview);
	}

	public void selectRating(String rating) {
		ratingLink.click();
		ratingLink.sendKeys(rating);

//	public void selectRating(String ratingValue) {
//		List<WebElement> ratingElements = ratingLink;
//		for (WebElement element : ratingElements) {
//			if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
//				element.click();
//				break;
//			}
//		}

	}

	public void userClickOnContinueBttn() {
		continueButton.click();
	}

	public String getThankYouMessageFromUI() {
		String textFromUI = thankYouMessage.getText();
		return textFromUI;
	}
}
