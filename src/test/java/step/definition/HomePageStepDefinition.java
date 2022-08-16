package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {

	HomePageObject homepageObj = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homepageObj.userClickOnCurrency();
		logger.info("user clicked on currency successfully");
		Utils.hardWait(3000);
	}

	@When("User Choose Euro from dropdown")
	public void user_choose_euro_from_dropdown() {
		homepageObj.userClickOnEuroItem();
		logger.info("user clicked");
		Utils.hardWait(3000);
	}
//	@Then("currency value should change to Euro")
//	public void currency_value_should_change_to_euro() {
//		homepageObj.userClickOnEuroItem();
//		logger.info("user clicked successfully");
//	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepageObj.userClickOnShoppingCart();
		logger.info("User clicked successfully");
		Utils.hardWait(3000);
	}

	@Then("{string} message should display")
	public void message_should_display(String expectedText) {
		System.err.println(expectedText);
		String actualText = homepageObj.getCartEmptyMessageFromUI();
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text was verified successfully");
		Utils.hardWait(3000);

	}

}
