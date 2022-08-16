package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktopstabs = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopstabs.userClickOnDesktopsTab();
		logger.info("Desktops tab was clicked successfully");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopstabs.userClickOnShowAllDesktopsLink();
		logger.info("Show all desktops was clicked successfully");
	}

	@Then("User should see all items are present in Desktops page")
	public void user_should_see_all_items_are_present_in_desktops_page() {
		String expectedText = "Desktops (13)";
		System.err.println(expectedText);
		String actualText = desktopstabs.getItemsPresentInDesktopTextFromUI();
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text was verified successfully");

	}

	@When("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopstabs.userClickOnAddToCartOption();
		logger.info("Add to cart option clicked successfully");
		Utils.hardWait(5000);
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktopstabs.userSelectQuantity();
		logger.info("Quantity selected sucessfully");

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopstabs.userclickAddToCartBtton();
		logger.info("Add to cart bttn was clicked successfully");

	}

	@Then("User should see a message Success: You have added HP LP3065 to your shopping cart!")
	public void user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart() {
		String expectedText = "Success: You have added";
		String actualText = desktopstabs.getSuccessMessageFromUI().trim().substring(0, 23);
		Assert.assertEquals(expectedText, actualText);
		logger.info("Expected and actual text was verified successfully");
		Utils.hardWait(5000);
	}

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopstabs.userClickOnAddToCart();
		logger.info("Add to cart clicked successfully");

	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopstabs.userClickOnDropDown();
		logger.info("Drop down was clicked succesfully");
		Utils.hardWait(5000);
	}

	@Then("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopstabs.userSelectQuantity(string);
		logger.info("Quantity selected successfully");
	}

	@Then("User should see a message Success: You have added Canon EOS 5D to your shopping cart!")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		String expectedText = "Success: You have added";
		String actualText = desktopstabs.getSuccessMessageLinkFromUI().trim().substring(0, 23);
		System.err.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		logger.info("Expected and Actual text was verified successfully");

	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopstabs.userClickOnCanonCamera();
		logger.info("Canon Camera was clicked successfully");
		Utils.hardWait(3000);
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopstabs.userClickOnReviewLink();
		logger.info("Review Icon was clicked successfully");
		Utils.hardWait(3000);
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		// The return type of cucumber data table is a list of Map<K,V>
		List<Map<String, String>> reviewInformation = dataTable.asMaps(String.class, String.class);
		desktopstabs.enterYourName(reviewInformation.get(0).get("yourName"));
		desktopstabs.enterYourReview(reviewInformation.get(0).get("yourReview"));
		desktopstabs.selectRating(reviewInformation.get(0).get("rating"));
		logger.info("All of the above data were entered successfully");
		Utils.hardWait(3000);

	}

	@Then("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopstabs.userClickOnContinueBttn();
		logger.info("User successfully clicked on continue bttn");
		Utils.hardWait(3000);
	}

	@Then("User should see a message with Thank you for your review. It has been submitted to the webmaster for approval.")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		String expectedText = "Thank you for your review. It has been submitted to the webmaster for approval.";
		System.err.println(expectedText);
		String actualText = desktopstabs.getThankYouMessageFromUI().trim().substring(0, 79);
		System.err.println(actualText);
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text was verified successfully");
	}

}
