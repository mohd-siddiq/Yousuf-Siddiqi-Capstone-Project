package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {

	RetailPageObject retailpageobj = new RetailPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = retailpageobj.getRetailWebsiteTextFromUI();
		Assert.assertEquals(expectedText, actualText);
		Utils.TakesScreenshotForEachStep();
		logger.info("expected and actual text was verfied successfully");
	}

	@And("User click on my account")
	public void user_click_on_my_account() {
		retailpageobj.userClickOnMyAccount();
		logger.info("my account was clicked successfully");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailpageobj.userClickOnLogin();
		logger.info("login was clicked successfully");
	}
	@When("User enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		retailpageobj.enterUsername(string);
		retailpageobj.enterPassword(string2);
	}
	
	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailpageobj.userClickOnLoginBttn();
		logger.info("login bttn was clicked successfully");
	}

	@Then("User should be logged in to My account dashborad")
	public void user_should_be_logged_in_to_my_account_dashborad() {
		String expectedText = "My Account";
		String actualText = retailpageobj.getAccountDashboardTextFromUI();
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual text was verified successfully");
		Utils.hardWait(2000);
	}
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	    retailpageobj.userClickOnResgisterAffilliateAccount();
	    logger.info("Register for an affiliate account was clicked");
	}

	
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	   List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	   retailpageobj.enterCompanyName(data.get(0).get("company"));
	   retailpageobj.enterWebsiteName(data.get(0).get("website"));
	   retailpageobj.enterTaxId(data.get(0).get("taxID"));
	   retailpageobj.enterPaymentMethod(data.get(0).get("paymentMethod"));
	   retailpageobj.enterPayeeName(data.get(0).get("payeeName"));
	   Utils.TakesScreenshotForEachStep();
	   logger.info("company, website, taxId  paymentMethod and payeeName was entered successfully");
	}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailpageobj.userClickOnAboutUsCheckBox();
		logger.info("check box was clicked successfully");
	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailpageobj.userClickOnContinueBttn();
		logger.info("Continue button was clicked successfully");
	}
	///////////////////////////////////////////////////////
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		String expectedText = "Success: Your account has been successfully updated.";	
	    String actualText = retailpageobj.getSuccessMessageFromUI();
	    System.err.println(actualText);
	    Assert.assertEquals(expectedText, actualText);
	    logger.info("expected and actual text was verified successfully");
	}
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailpageobj.userClickOnEditAffiliateAccountButton();
		logger.info("Edit your affiliate information was clicked successfully");
	}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailpageobj.clickOnBankTransferRadioBttn();
		logger.info("Bank transfer radio button was clicked successfully");
		
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
	    List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
	    retailpageobj.enterBankName(data1.get(0).get("bankName"));
	    retailpageobj.enterAbaNumber(data1.get(0).get("abaNumber"));
	    retailpageobj.enterSwiftcode(data1.get(0).get("swiftCode"));
	    retailpageobj.enterAccountName(data1.get(0).get("accountName"));
	    retailpageobj.enterAccountNumber(data1.get(0).get("accountNumber"));
	    logger.info("All the above data were entered succesfully");
	}
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailpageobj.userClickOnEditAccountInformation();
		logger.info("account information link was edited successfully");
		Utils.hardWait(2000);
	}
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data2 = dataTable.asMaps(String.class, String.class);
		retailpageobj.enterFirstName(data2.get(0).get("firstname"));
		retailpageobj.enterLastName(data2.get(0).get("lastname"));
		retailpageobj.enterEmail(data2.get(0).get("email"));
		retailpageobj.enterTelephone(data2.get(0).get("telephone"));
		logger.info("Above data were entered succesfully");
	}
	@Then("User should see a success message {string}")
	public void user_should_see_a_success_message(String expectedText) {
	   String actualText = retailpageobj.getSuccessMessageFromUI().trim().substring(0, 52);
	   System.err.println(actualText);
	   Assert.assertEquals(expectedText, actualText);
	   logger.info("expected and actual text was verified successfully" );
	   
	}

}
