package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage_Objects;
import utilities.Utilities;

public class HomePage_Steps extends Base {
	HomePage_Objects HomePage = new HomePage_Objects();
	
//===============================================================================================
//           1st - Scenario: User verify currency values change
//===============================================================================================
	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws InterruptedException {
		HomePage.user_is_on_Retail_website();
		logger.info("User entered to retail website successfully");
		Thread.sleep(3000);
	   
	}
	@When("User click on Currency")
	public void user_click_on_currency() throws InterruptedException {
		HomePage.user_click_on_currencydropDown_Tab();
		logger.info("User clicked on Euro currency drowpDown successfully");
		Thread.sleep(3000);
	 
	}
	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws InterruptedException {
		HomePage.User_Chose_Euro_from_dropdown();
		logger.info("user chosed Euro from dropdown successfully");
		Thread.sleep(3000);
	  
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
		Assert.assertTrue(HomePage.currency_value_should_change_to_Euro());
		HomePage.currency_value_should_change_to_Euro();
		logger.info("Currency value changed successfully to Euro.");
		Utilities.takeScreenShot("Currency value");
		   
	}
	
//===============================================================================================
//             2nd -  Scenario: User empty Shopping cart message displays
//===============================================================================================	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws InterruptedException {
		HomePage.user_click_on_shopping_cart();
		logger.info("User clicked on shopping cart successfully");
		Thread.sleep(3000);
		    
	}
	@Then("“Your shopping cart is empty!” message should display")
	public boolean your_shopping_cart_is_empty_message_should_display() throws IOException {
		Assert.assertTrue(HomePage.your_shopping_cart_is_empty_message_should_display());
		HomePage.your_shopping_cart_is_empty_message_should_display();
		logger.info("The empty Shopping cart message displayed successfully ");
		Utilities.takeScreenShot("Shopping cart");
		return false;
	  
	}
}


