package pageObjects;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilities.Utilities;
//===============================================================================================
//              1st-  Scenario: Login to My Account Dashboard
//===============================================================================================
public class RetailPage_Obeject extends Base {
	
	public RetailPage_Obeject() {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath ="//span[text()='My Account']")
	private WebElement myAccount_Tab;
	@FindBy(xpath ="//a[text()='Login']")
	private WebElement userClickOnloginButton1;
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement userNameInputBox;
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordInputBox;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement userClickOnloginButton2;
	@FindBy(xpath="//div[@id='content']")
	private WebElement myAccountDashboard;
	
	
	
	public void User_click_on_MyAccount() {
		myAccount_Tab.click();	
	}
	public void user_click_on_LoginButton1() {
		userClickOnloginButton1.click();	
	}
	public void enterLoginUserName(String userEmail) {
		userNameInputBox.sendKeys(userEmail);
	}
	public void enterLoginPassword(String userPassword) {
		passwordInputBox.sendKeys(userPassword);
	}
	public void user_Click_on_login_Button2() {
		userClickOnloginButton2.click();
	}
	public boolean user_should_be_logged_in_to_myAccountDashboard() {
		return myAccountDashboard.isDisplayed();
	}
//================================================================================================
//       2nd Scenario: Register as an Affiliate user with Cheque Payment Method
//================================================================================================
	
	@FindBy(xpath="//a[normalize-space()='Affiliate']")
	private WebElement affiliateLink;
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement coninueButton1;/////////////////////////////////////////////////////
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstNameInput;
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastNameInput;
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailInput;
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement telephoneInput;
	@FindBy(xpath="//input[@id='input-company']")
	private WebElement companyNameInput;
	@FindBy(xpath="//input[@id='input-website']")
	private WebElement websiteInput;
	@FindBy(xpath="//input[@id='input-tax']")
	private WebElement taxIDinput;
	@FindBy(xpath="//label[normalize-space()='Cheque']")
	private WebElement chequeRadioButton;
	@FindBy(xpath="//input[@value='paypal']")
	private WebElement payPalRadioButton;
	@FindBy(xpath="//input[@value='bank']")
	private WebElement BankTransferRadioButton;
	@FindBy(xpath="//input[@id='input-cheque']")
	private WebElement chequePaymentNameInput;
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordInput;
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement passwordConfirmInput;
	@FindBy(xpath="//input[@name='agree']")
	private WebElement agreeCheckRadioButton;
	@FindBy(xpath="//input[@class='btn btn-primary']")///////////////////////////
	private WebElement coninueButton2;//////////////////////////////////////////////////////////
	@FindBy(xpath="//h1[text()='Your Affiliate Account Has Been Created!']")
	private WebElement successMessage;
//	@FindBy(xpath="//a[@class='btn btn-primary']")
//	private WebElement continueButton3;/////////////////////////////////////////////////////////
	
	
	public void user_click_on_affiliatLink() {
		affiliateLink.click();
	}
	public void user_click_on_continueButton1() {
		coninueButton1.click();
	}
	public void user_enter_firstName(String firstName) {
		firstNameInput.clear();
		firstNameInput.sendKeys(firstName);
	}
	public void user_enter_lastName(String lastName) {
		lastNameInput.clear();
		lastNameInput.sendKeys(lastName);
	}
	public void user_enter_email(String email) {
		emailInput.clear();
		emailInput.sendKeys(email);
	}
	public void user_enter_telephoneNumber(String telephoneNumber) {
		telephoneInput.clear();
		telephoneInput.sendKeys(telephoneNumber);
		
	}
	public void enter_companyName(String company) {
		companyNameInput.sendKeys(company);
	}
	public void enter_website(String website) {
		websiteInput.sendKeys(website);
	}
	public void enter_taxID(String taxID) {
		taxIDinput.sendKeys(taxID);
	}
	public void user_click_on_Radio_Button(String paymentMethod ) {
		if(paymentMethod.equalsIgnoreCase("Cheque")) {
			  chequeRadioButton.click();
			  System.out.println(chequeRadioButton.getAttribute("Cheque"));
		}else if(paymentMethod.equalsIgnoreCase("PayPal")) {
			  payPalRadioButton.click();
			  System.out.println(payPalRadioButton.getAttribute("PayPal"));
		}else if(paymentMethod.equalsIgnoreCase("Bank Transfer")) {
			BankTransferRadioButton.click();
			  System.out.println(BankTransferRadioButton.getAttribute("Bank Transfer"));
		}	  
	}
	public void enter_chequePayeeName(String chequeForService) {
		chequePaymentNameInput.sendKeys(chequeForService);	
	}
	public void enter_password(String Mangal123) {
		passwordInput.sendKeys(Mangal123);	
	}
	public void user_enter_passwordConfirmInput(String Mangal123) {
		passwordConfirmInput.sendKeys("Mangal123");
	}
	public void user_check_the_agreeCheckBox() {
		agreeCheckRadioButton.click();
	}
	public void user_click_on_continue_Button2() {/////////////////////////////////////////
		coninueButton2.click();
	}
	public void verifysuccessMessageforAffiliateAccount(String fileName) throws IOException {
		Utilities.highlightelementRedBorderAndTakeScreenshot(successMessage, fileName);
		String expectedMessage = "Your Affiliate Account Has Been Created!";
		String actualMessage= successMessage.getText();
		System.out.println(actualMessage);
		try {
			Assert.assertEquals(expectedMessage, actualMessage);
		} catch (Exception e)  {
			e.printStackTrace();
	   }
		
	}
//===============================================================================================
//       3rd Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
//===============================================================================================
	@FindBy(xpath="//a[@href='http://tek-school.com/retail/index.php?route=affiliate/login']")
	private WebElement user_clickOn_AffiliateLink;
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement affiliate_Email;
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement affiliate_password;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement clickOnLoginButton;
	
	@FindBy(xpath="//a[normalize-space()='Edit your affiliate information']")
	private WebElement user_click_on_EditYourAffiliateInformation;
	@FindBy(xpath="//input[@id='input-company']")
	private WebElement companyNameinput;
	@FindBy(xpath="//input[@id='input-website']")
	private WebElement websiteNameinpute;
	@FindBy(xpath="//input[@id='input-tax']")
	private WebElement taxIDNameinput;
	
	@FindBy(xpath="//input[@value='bank']")
	private WebElement checkBankTransferRadioButton;
	@FindBy(xpath="//input[@id='input-bank-name']")
	private WebElement bank_Name;
	@FindBy(xpath="//input[@id='input-bank-branch-number']")
	private WebElement ABA_BSBNumber_BranchNumber;
	@FindBy(xpath="//input[@id='input-bank-swift-code']")
	private WebElement SWIFT_Code;
	@FindBy(xpath="//input[@id='input-bank-account-name']")
	private WebElement account_Name;
	@FindBy(xpath="//input[@id='input-bank-account-number']")
	private WebElement account_Number;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement agreeCheckBoxRadioButton;
	@FindBy(xpath="//input[@type='submit']")///////////////////////////////////////
	private WebElement click_on_continueButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement success_message_of_Affiliate_upadated;
	
	
	
	
	public void user_click_on_AffiliateLink() {
		user_clickOn_AffiliateLink.click();
	}
	public void user_enterAffiliate_email(String affiliateEmail) {
		affiliate_Email.sendKeys(affiliateEmail);	
	}
	public void user_enterAffiliatePass(String affiliatePass){
		affiliate_password.sendKeys(affiliatePass);
	}
	public void user_click_on_loginButton() {
		clickOnLoginButton.click();
	}
	public void user_click_on_EditYourAffiateInformation() {
		user_click_on_EditYourAffiliateInformation.click();
	}
	public void user_enter_companyName(String firstName) {
		companyNameinput.clear();
		companyNameinput.sendKeys(firstName);
	}
	public void user_enter_webStie(String lastName) {
		websiteNameinpute.clear();
		websiteNameinpute.sendKeys(lastName);
	}
	public void user_enter_taxIDimput(String email) {
		taxIDNameinput.clear();
		taxIDNameinput.sendKeys(email);
	}
	public void user_check_BankTransferRadioBox() {
		checkBankTransferRadioButton.click();
	}
    public void user_checkBankTransferRadioButton() {
	    checkBankTransferRadioButton.click();
   }
    public void user_enter_bank_Name(String BankName){
	    bank_Name.clear();
	    bank_Name.sendKeys(BankName);
   }
    public void user_enter_ABA_BSBNumber_BranchNumber(String ABABSBnumber) {
    	ABA_BSBNumber_BranchNumber.clear();
    	ABA_BSBNumber_BranchNumber.sendKeys(ABABSBnumber);
   }
    public void user_enter_SWIFT_Code(String swiftCode) {
    	SWIFT_Code.clear();
    	SWIFT_Code.sendKeys(swiftCode);
    }
    public void user_enter_AccountName(String accountName) {
    	account_Name.clear();
    	account_Name.sendKeys(accountName);
    }
    public void user_enter_AccountNumber(String accountNumber) {
    	account_Number.clear();
    	account_Number.sendKeys(accountNumber);
    }
    public void User_click_on_agree_radio_box() {
    	agreeCheckBoxRadioButton.click();
    }
    public void user_Click_On_continueButton3() {
	click_on_continueButton.click();
    }
	public void successMessageOf_Affiliated_Info_tUpdated(String fileName) throws IOException {
		Utilities.highlightelementRedBorderAndTakeScreenshot(success_message_of_Affiliate_upadated, fileName);
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage= success_message_of_Affiliate_upadated.getText();
		System.out.println(actualMessage);
		try {
			Assert.assertEquals(expectedMessage, actualMessage);
		} catch (Exception e)  {
			e.printStackTrace();
		}
	}
//================================================================================================
//             4th Scenario: Edit your account Information
//================================================================================================
    	@FindBy(xpath="//a[normalize-space()='Affiliate']")
		private WebElement user_click_onAffiliateLink;
		@FindBy(xpath="//a[normalize-space()='Edit your account information']")
		private WebElement user_click_on_Edit_your_account_information;
		@FindBy(xpath="//input[@type='submit']")//////////////////////////////////////////
		private WebElement continueButton;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement success_message_of_update;
		
		
				
		public void user_click_onAffiliateLink() {
			user_click_onAffiliateLink.click();
		}
		public void enter_affiliate_Email(String affiliateEmail) {
			affiliate_Email.sendKeys(affiliateEmail);
		}
		public void enter_affiliate_password(String affiliatePass) {
			affiliate_password.sendKeys(affiliatePass);
		}
		public void user_clickOnLoginButton() {
			clickOnLoginButton.click();	
		}
		public void user_Click_on_edit_your_account_information() {
			user_click_on_Edit_your_account_information.click();
		}
		public void user_click_on_continueButton() {
			continueButton.click();
		}	
		public void user_should_see_a_success_message(String fileName) throws IOException {
			Utilities.highlightelementRedBorderAndTakeScreenshot(success_message_of_update, fileName);
			String actualMessage= success_message_of_update.getText();
			System.out.println(actualMessage);
			String expectedMessage = "Success: Your account has been successfully updated.";
			try {
				Assert.assertEquals("Test case Passed", expectedMessage,actualMessage);
				
			} catch (Exception e)  {
				e.printStackTrace();
		   }
		}
	}




