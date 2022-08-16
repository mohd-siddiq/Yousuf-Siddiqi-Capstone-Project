package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebsite;
	@FindBy(xpath = "//a[@class='dropdown-toggle']//i")
	private WebElement myAccount;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLink;
	@FindBy(id = "input-email")
	private WebElement usernameField;
	@FindBy(id = "input-password")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement accountDashboard;
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;
	@FindBy(id = "input-company")
	private WebElement companyNameField;
	@FindBy(id = "input-website")
	private WebElement websiteNameField;
	@FindBy(id = "input-tax")
	private WebElement taxIdField;
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentMethodField;
	@FindBy(id = "input-cheque")
	private WebElement payeeNameField;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUsCheckBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBttn;
	////////////////////////////////////////
	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateAccount;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioBttn;
	@FindBy(id = "input-bank-name")
	private WebElement bankNameField;
	@FindBy(id = "input-bank-branch-number")
	private WebElement abaNumberField;
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCodeField;
	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameField;
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumberField;
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccountInformationLink;
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	@FindBy(id = "input-email")
	private WebElement emailField;
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;

	public String getRetailWebsiteTextFromUI() {
		String textFromUI = retailWebsite.getText();
		return textFromUI;
	}

	public void userClickOnMyAccount() {
		myAccount.click();
	}

	public void userClickOnLogin() {
		loginLink.click();
	}

	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void userClickOnLoginBttn() {
		loginButton.click();
	}

	public String getAccountDashboardTextFromUI() {
		String textFromUI = accountDashboard.getText();
		return textFromUI;
	}

	public void userClickOnResgisterAffilliateAccount() {
		registerForAnAffiliateAccount.click();
	}

	public void enterCompanyName(String company) {
		companyNameField.sendKeys("company");
	}

	public void enterWebsiteName(String website) {
		websiteNameField.sendKeys("website");
	}

	public void enterTaxId(String taxID) {
		taxIdField.sendKeys("taxID");
	}

	public void enterPaymentMethod(String paymentMethod) {
		paymentMethodField.sendKeys(paymentMethod);
	}

	public void enterPayeeName(String payeeName) {
		payeeNameField.sendKeys("payeeName");
	}

	public void userClickOnAboutUsCheckBox() {
		aboutUsCheckBox.click();
	}

	public void userClickOnContinueBttn() {
		continueBttn.click();
	}
///////////////////////////////////////////////////////////
	public String getSuccessMessageFromUI() {
		String textFromUI = successMessage.getText();
		return textFromUI;
	}
	public void userClickOnEditAffiliateAccountButton() {
		editAffiliateAccount.click();
	}
	public void clickOnBankTransferRadioBttn() {
		bankTransferRadioBttn.click();
	}
	public void enterBankName(String bankName) {
		bankNameField.sendKeys(bankName);
	}
	public void enterAbaNumber(String abaNumber) {
		abaNumberField.sendKeys(abaNumber);
	}
	public void enterSwiftcode(String swiftCode) {
		swiftCodeField.sendKeys(swiftCode);
	}
	public void enterAccountName(String accountName) {
		accountNameField.sendKeys(accountName);
	}
	public void enterAccountNumber(String accountNumber) {
		accountNumberField.sendKeys(accountNumber);
	}
	public void userClickOnEditAccountInformation() {
		editAccountInformationLink.click();
	}
	public void enterFirstName(String firstname) {
		firstNameField.clear();
		firstNameField.sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		lastNameField.clear();
		lastNameField.sendKeys(lastname);
	}
	public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}
	public void enterTelephone(String telephone) {
		telephoneField.clear();
		telephoneField.sendKeys(telephone);
	}
	

}
