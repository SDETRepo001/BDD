package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPage_Obeject;
import utilities.Utilities;

//=================================================================================================
//          1st -  Scenario: Login to My Account Dashboard
//==================================================================================================
    
public class RetailPage_Steps extends Base {
    	RetailPage_Obeject RetailPage = new RetailPage_Obeject();

    @When("User click  on MyAccount")
    	public void user_click_on_my_account() throws InterruptedException {
    	RetailPage.User_click_on_MyAccount();
    	logger.info("user clicked on MyAccount tab successfully");
		Thread.sleep(2000);
	    
	}
	@Then("User click on Login")
	public void user_click_on_login() throws InterruptedException {
		RetailPage.user_click_on_LoginButton1();
		logger.info("user clicked on login button 1 successfully");
		Thread.sleep(2000);
	   
	}
	@Then("User enter username ‘userName’ and password 'password’")
	public void user_enter_username_user_name_and_password_password() throws InterruptedException {
		RetailPage.enterLoginUserName("yasmeen.mangal@gmail.com");
		RetailPage.enterLoginPassword("Mangal123");
	    logger.info("user entered username and password successfully");
	    Thread.sleep(3000);
	    
	}
	@And("User click on Login button")
	public void user_click_on_login_button() throws InterruptedException {
		RetailPage.user_Click_on_login_Button2();
		logger.info("user clicked on login button 2 successfully");
		Thread.sleep(2000);
	   
	}
	@Then("User should be logged in to MyAccount dashboard")
	public boolean user_should_be_logged_in_to_my_account_dashboard() throws IOException {
		Assert.assertTrue(RetailPage.user_should_be_logged_in_to_myAccountDashboard());
		RetailPage.user_should_be_logged_in_to_myAccountDashboard();
		logger.info("user logged into My account dashboard successfuly ");
		Utilities.takeScreenShot("My Account Dashboard");
		return false;
	}

//==================================================================================================
//     2nd Scenario: Register as an Affiliate user with Cheque Payment Method
//=================================================================================================
	
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException {
		RetailPage.user_click_on_affiliatLink();
	    logger.info("User clicked on Affiliate Link successfully");
	    Thread.sleep(2000);
	    
	}
	@When("User click on Continue button1") // Continue buttons xpaths are different. 
	public void user_click_on_continue_button() {
		RetailPage.user_click_on_continueButton1();
		logger.info("user clicked on continue button successfully.");
		
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		
		RetailPage.user_enter_firstName("Yasmeen");
		RetailPage.user_enter_lastName("Mangal");
		RetailPage.user_enter_email("yasmeen.mangal21@gmail.com");// type new email here. And copy and alos paste it to line number 129.
		RetailPage.user_enter_telephoneNumber("222222222");
		Thread.sleep(2000);
		RetailPage.enter_companyName(data.get(0).get("company"));
		RetailPage.enter_website(data.get(0).get("website"));
		RetailPage.enter_taxID(data.get(0).get("taxID"));
		RetailPage.user_click_on_Radio_Button(data.get(0).get("paymentMethod"));
		RetailPage.enter_chequePayeeName("chequeForService");
		RetailPage.enter_password("Mangal123");
		RetailPage.user_enter_passwordConfirmInput("Mangal123");
		logger.info("user filled the the affiliate Registeraion form successfully.");
		Thread.sleep(3000);
	}
	@Then("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		RetailPage.user_check_the_agreeCheckBox();
		logger.info("user checked the agree button successfully");
	   
	}
	@Then("User click on Continue button2")//Continue button xpaths are different, that's why i created mehtod for it. 
	public void user_click_on_Continue_button() {
		RetailPage.user_click_on_continue_Button2();
		logger.info("User clicked on Continue button successfully");
	    
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException {
		RetailPage.verifysuccessMessageforAffiliateAccount("AffiliateAccount");
		logger.info("success message succesfully");
		
	  
	}
//================================================================================================
//    3rd Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
//=================================================================================================
	@When("user is on Affiliate webpage")
	public void user_is_on_affiliate_webpage() {
		RetailPage.user_click_on_AffiliateLink();
		logger.info("User in on Affiliate webPage successfully");
	    
	}

	@When("user enter Affiliate userName and Password")
	public void user_enter_affiliate_user_name_and_password() throws InterruptedException {
		RetailPage.user_enterAffiliate_email("yasmeen.mangal21@gmail.com");// copy email from line number 85 and past it here.  
		RetailPage.user_enterAffiliatePass("Mangal123");
		RetailPage.user_click_on_loginButton();
		logger.info("User entered affiliate email and password successfully");
		Thread.sleep(3000);
	    
	}
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() throws InterruptedException {
		RetailPage.user_click_on_EditYourAffiateInformation();
		RetailPage.user_enter_companyName("HDMZCC");
		RetailPage.user_enter_webStie("www.hdmzcc.com");
		RetailPage.user_enter_taxIDimput("102");
		Thread.sleep(3000);
	   
	}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws InterruptedException {
		RetailPage.user_check_BankTransferRadioBox();
	    logger.info("user clicked on Bank transfer radio button successfully");
	    Thread.sleep(3000);
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		
		RetailPage.user_enter_bank_Name(data.get(0).get("bankName"));
		RetailPage.user_enter_ABA_BSBNumber_BranchNumber(data.get(0).get("abaNumber"));
		RetailPage.user_enter_SWIFT_Code(data.get(0).get("swiftCode"));
		RetailPage.user_enter_AccountName(data.get(0).get("accountName"));
		RetailPage.user_enter_AccountNumber("accountNumber");
		logger.info("user filled the the affiliate Info form successfully.");
		Thread.sleep(3000);
		
	}
	@And("User click on continue button")
		public void user_click_on_continu_button() {
		RetailPage.user_Click_On_continueButton3();
		logger.info("user clicked on continue button successfully");
	}
	@Then("User should see a success message of update")
	public void user_should_see_a_success_message_of_update() throws IOException {
		RetailPage.successMessageOf_Affiliated_Info_tUpdated("AffiliateInfo");
		logger.info("user can see the success message successfully");
	    
	}
//================================================================================================
//                4th Scenario: Edit your account Information
//================================================================================================
        
	@And("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() throws InterruptedException {
		RetailPage.user_Click_on_edit_your_account_information();
		logger.info("User clicked on Affiliate link successfuly");
		Thread.sleep(2000);
	 
	}
	@And("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		RetailPage.user_enter_firstName(data.get(0).get("firstName"));
		RetailPage.user_enter_lastName(data.get(0).get("lastName"));
		RetailPage.user_enter_email(data.get(0).get("email"));
		RetailPage.user_enter_telephoneNumber(data.get(0).get("telephone"));
		
		logger.info("user filled the the affiliate Info form successfully.");
		Thread.sleep(3000);
		
	}
	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() throws IOException {
		RetailPage.user_should_see_a_success_message("Account Updated");
	}

}
	


