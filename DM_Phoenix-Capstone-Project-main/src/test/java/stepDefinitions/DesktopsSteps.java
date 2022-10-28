package stepDefinitions;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObjects;
import utilities.Utilities;


public class DesktopsSteps extends Base {
	DesktopsPageObjects desktops = new DesktopsPageObjects();
//=================================================================================================
//             1st Scenario - User verify all items are present in Desktops tab
//=================================================================================================

	@And("user click on Desktops tab")
	public void user_click_on_desktops_tab() throws InterruptedException {
		desktops.user_click_on_desktops_tab();
		logger.info("user clicked on Desktops tab successfully");
		Thread.sleep(4000);  
	}

	@And("user click on Show all desktops")
	public void user_click_on_show_all_desktops() throws InterruptedException  {
		desktops.user_click_on_Show_all_desktops();
		logger.info("user clicked on Show all desktops button successfully" );
		Thread.sleep(3000);
		   
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException, InterruptedException {
		desktops.allListOfItemsOnDesktopsPage_withTagName_a();
		desktops.allListOfItemsOnDesktopsPage_withTagName_span();
		desktops.allListOfItemsOnDesktopsPage_withTagName_div();
		desktops.allListOfItemsOnDesktopsPage_withTagName_button();
		desktops.allListOfItemsOnDesktopsPage_withTagName_li();
		logger.info("User can see all items are present in the Desktops page successfully");
	   
	}
	 
//=================================================================================================
//          2nd Scenario: User add HPLP3065  from Desktops tab to the cart
//=================================================================================================
	
	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
		public void user_click_add_to_cart_option_on_hp_lp3065_item() throws InterruptedException {
		desktops.addToCart();
		logger.info("added to Cart successfully");
		Thread.sleep(2000); 
}

	@And("User select quantity {int}")
		public void user_select_quantity(Integer int1) throws InterruptedException {
		desktops.clickquatity();
		logger.info("user selected quantity 1 successfully");
		Thread.sleep(4000);
}

	@And("User click add to Cart button")
		public void user_click_add_to_cart_button() throws InterruptedException {
		desktops.clickaddToCartButton2();
		logger.info("user clicked Add to Cart button successfully");
		Thread.sleep(4000);
    
}
	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
		public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) throws IOException, InterruptedException {
		Assert.assertTrue(desktops.you_have_added_HPLP3065_Successfully_toYourShoppingCart());
		desktops.you_have_added_HPLP3065_Successfully_toYourShoppingCart();
		logger.info("user added HPLP3065 to Shopping Cart successfully");
		Utilities.takeScreenShot("HPL3065");
			
   
}
//================================================================================================
//           3rd  Scenario: User add CanonEOS 5D from Desktops tab to the cart
//=================================================================================================

	
	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktops.addToCartOptionCanonEOS5D1();
		logger.info("user added Canon EOS 5D successfully");
	   
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktops.selectRedColor();
		logger.info("User selected red color successfully");
	    
	}
	@When("User select quantity1")
	public void user_select_quantity1() {
		desktops.selectQuantity();
		logger.info("User successfully added quantity");
	    
	}
	@When("User click add to Cart button here")
	public void user_click_add_to_cart_button_here() {
		desktops.addToCartButtonCanonEOS5D2();
		logger.info("User clicked to Cart Button successfully");
	   
	}
	
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public boolean user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws IOException {
		Assert.assertTrue(desktops.success_you_have_added_CanonEOS_5D_to_your_Shopping_cart());
		desktops.success_you_have_added_CanonEOS_5D_to_your_Shopping_cart();
		logger.info("user can see all items on Desktop page successfully");
		return false;
		   
	}	
//================================================================================================
//              4th Scenario: User add a review to Canon EOS 5D item in Desktops tab
//================================================================================================
	@Given("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktops.canonEOS5DCamera_item();
		logger.info("User clicked on Canon EOS 5D item successfully");
	   
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktops.User_click_on_write_a_review_link();
		logger.info(" User clicked on write a review link successfully ");
	    
	}
	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, IOException {
		 List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		 desktops.enterYourName(data.get(0).get("yourName"));
		 desktops.enterReview_in_Text_Box(data.get(0).get("yourReview"));
		 desktops.ratingRadioButton(data.get(0).get("Rating"));
		 logger.info("user filled the review input text Box successfully.");
		 Utilities.takeScreenShot("Review Text Form");
		 Thread.sleep(3000); 
		 
	}
	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		desktops.reviewContinueButton();
		logger.info("User clicked on review button successfully");
	 }
	
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public boolean user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() throws IOException {
	    Assert.assertTrue(desktops.reviewMessageSent());
	    desktops.reviewMessageSent();
	    logger.info("The user review has been sent successfully ");
	    Utilities.takeScreenShot("Reviews");
		return false;
	}
}


		
 

