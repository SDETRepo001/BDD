package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopNoteBook_PageObjects;
import utilities.Utilities;

public class LaptopNoteBook_Steps extends Base{
	LaptopNoteBook_PageObjects LaptopNoteBook = new LaptopNoteBook_PageObjects();
			
//========================================================================================
//                1st scenario -   Add and Remove a Mac book from Cart
//========================================================================================
			
	@Given("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws InterruptedException {
		LaptopNoteBook.clickOnLaptopAndNotebooks_tab();
		logger.info("user cliked on laptop % Notebook tab successfully");
     	Thread.sleep(2000);
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws InterruptedException {
		LaptopNoteBook.Show_all_Laptop_NoteBook_option();
		logger.info("User clicked on show all laptop & Notebook successfully");
		Thread.sleep(2000);  
	}

	@Then("User click on MacBook  item")
	public void user_click_on_mac_book_item() throws InterruptedException {
		LaptopNoteBook.User_click_on_MacBook_item();
		logger.info("user clicked on MacBook item successfully");
		Thread.sleep(2000);	   
	}

	@Then("User click add to Cart buttonForMac")
	public void user_click_add_to_cart_button_for_mac() throws InterruptedException {
		LaptopNoteBook.click_add_to_Cart_buttonForMac();
		logger.info("user clicked on Cart Button for Mac successfully");
		Thread.sleep(2000);   
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() throws InterruptedException {
		LaptopNoteBook.success_message_added_to_shopping_cart();
	   logger.info("User can see the success message for MacBook successfully");
	   Thread.sleep(2000);
	}

	@Then("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) throws InterruptedException {
		LaptopNoteBook.cartShowed_1_602_item();
		logger.info("User can see ‘1 tem(s)-602.00’ showed to the cart  ");
		Thread.sleep(2000);
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
		LaptopNoteBook.user_click_on_cart_option();
		logger.info("user clicked on Cart option successfully");
		Thread.sleep(2000);	   
	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws InterruptedException {
		LaptopNoteBook.userClickOnRedXbutton();
		logger.info("User clicked on Red X successfully");
		Thread.sleep(2000);	   
	}

	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) throws IOException {
		LaptopNoteBook.itmeShould_be_removed_cartShowed0Items("Cart Show 0");
		logger.info("User removed the item successfully from shopping cart");
		   
	}
//===========================================================================================
//                2nd Scenario -    Product Compirson 
//===========================================================================================
	
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
		LaptopNoteBook.comparisonIconOnMackBook();
		logger.info("User clicked on comparison icon on MacBook successfully");
		Thread.sleep(2000);
	}

	@And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
		LaptopNoteBook.comparisonIconOnMacBookAir();
		logger.info("User clicked on comparison icon on MacBook Air successfully");
		Thread.sleep(2000);	   
	}
	@And("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() throws InterruptedException {
		LaptopNoteBook.successMessageForMacBookAir();
		logger.info("User can see the the success Message for MacBook Air successfully");
		Thread.sleep(2000);
	}

	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		LaptopNoteBook.productCompareLink();
		logger.info("User clicked on product comparison link successfully");
		Thread.sleep(2000);	   
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException {
		Assert.assertTrue(LaptopNoteBook.productcomparisonChart());
		LaptopNoteBook.productcomparisonChart();
		logger.info("User can see the product comparison chart Successfully");
		Utilities.takeScreenShot("Comparison Chart");  
	}
//===============================================================================================
//       3rd Scenario  - Adding an item to Wish list
//================================================================================================

	
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() throws InterruptedException, IOException {
		LaptopNoteBook.add_SonyVaIO_laptop_to_wish_list("WishList Icon");
		logger.info("User clicked on wish list successfully");
		Thread.sleep(2000);
	    
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws IOException {
	  	Assert.assertTrue(LaptopNoteBook.user_should_see_a_success_message("WishList"));
	  	Utilities.takeScreenShot("WishList");
	  	logger.info("user can see the message successfully");

	}
//===============================================================================================
//      4th Scenario -  Validate the price of MacBook Pro is 2000
//===============================================================================================

	@And("User click on ‘MacBook Pro’ item")
		public void user_click_on_mac_book_pro_item() throws InterruptedException {
		LaptopNoteBook.mackBookPro();
			logger.info("User clicked on MacBook Pro successfully");
			Thread.sleep(2000);
	
	}

	@Then("User should see  ‘$2,000.00’ price tag is present on UI")
			public void user_should_see_mac_book_price_tag_is_present_on_ui() throws IOException {
			LaptopNoteBook.MacBookProPrice_2000("MacBook Price");

     }
}  

	

