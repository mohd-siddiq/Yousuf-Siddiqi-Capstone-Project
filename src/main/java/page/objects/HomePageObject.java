package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html[@dir='ltr']/descendant::div[3]//i[@class='fa fa-caret-down']")
	private WebElement currencyLink;
	@FindBy(xpath = "/html[@dir='ltr']/descendant::div[3]//button[@type='button']")
	private WebElement euroLink;
	
	@FindBy(xpath = "/html[@dir='ltr']/descendant::div[12]//i[@class='fa fa-shopping-cart']")
	private WebElement shoppingCart;
	@FindBy(xpath = "/html[@dir='ltr']/descendant::div[12]//p[@class='text-center']")
	private WebElement cartEmptyMessage;
	
	public void userClickOnCurrency() {
		currencyLink.click();
	}
	public void userClickOnEuroItem() {
		euroLink.click();
		
	}
	public void userClickOnShoppingCart() {
		shoppingCart.click();
	}
	public String getCartEmptyMessageFromUI() {
		String textFromUI = cartEmptyMessage.getText();
		return textFromUI;
	}
	

}
