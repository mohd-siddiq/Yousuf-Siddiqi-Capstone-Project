package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject laptopsAndNotebooks = new LaptopNoteBooksPageObject();

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopsAndNotebooks.userClickOnLaptopsAndNotebooksTab();
		logger.info("User clicked successfully");
	}

	@When("User click on Show all Laptops & NoteBooks")
	public void user_click_on_show_all_laptops_note_books() {
		laptopsAndNotebooks.userClickOnShowAllLaptopsAndNotebooksLinks();
		logger.info("User clicked successfully");
		Utils.hardWait(3000);
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopsAndNotebooks.userClickOnMacBookItem();
		logger.info("User clicked successfully");
		Utils.hardWait(3000);
	}

	@Then("User should see a message Success: You have added MacBook to your shopping cart!")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		String expectedText = "Success: You have added MacBook to your shopping cart!";
		System.err.println(expectedText);
		String actualText = laptopsAndNotebooks.getSuccessMessageLinkFromUI().trim().substring(0, 54);
		System.err.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text verified successfully");
		Utils.hardWait(3000);
	}

	@Then("User should see {int} item\\(s){double} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(Integer int1, Double double1) {
		String expectedText = "1 item(s) - $602.00";
		System.err.println(expectedText);
		String actualText = laptopsAndNotebooks.getItemShowedToTheCartMessageFromUI().trim().substring(0, 19);
		System.err.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text verified successfully");
		Utils.hardWait(3000);
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopsAndNotebooks.userClickOnCartOption();
		logger.info("User clicked successfully");
		Utils.hardWait(3000);
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopsAndNotebooks.userClickOnRedXButton();
		logger.info("User clicked Successfully");
		Utils.hardWait(3000);
	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		String expectedText = "0 item(s) - $0.00";
		String actualText = laptopsAndNotebooks.getItemRemovedFromCartFromUI();
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text was verified successfully");
		Utils.hardWait(3000);

	}

	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopsAndNotebooks.userClickOnmacBookCompareButton();
		logger.info("User clicked successfully");
		Utils.hardWait(3000);
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopsAndNotebooks.userClickOnmacBookAirCompareButton();
		logger.info("Comparison icon was clicked successfully");
		Utils.hardWait(3000);
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedText) {
		System.err.println(expectedText);
		String actualText = laptopsAndNotebooks.getMacBookAirSuccessMessageFromUI().trim().substring(0, 63);
		System.err.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text was verified");
		Utils.hardWait(3000);
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopsAndNotebooks.userClickOnProductComparisonLink();
		logger.info("user clicked successfully");
		Utils.hardWait(3000);
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		String expectedText = "Product Comparison";
		System.err.println(expectedText);
		String actualText = laptopsAndNotebooks.getProductComparisonTextFromUI().trim().substring(0, 18);
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text verified successfully");
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopsAndNotebooks.userClickOnMacBookPro();
		logger.info("user clicked successfully");
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String expectedText) {
		System.err.println(expectedText);
		String actualText = laptopsAndNotebooks.getMacBookProPriceTagFromUI().trim().substring(0, 9);
		System.err.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text was verified successfully");
	}

}
