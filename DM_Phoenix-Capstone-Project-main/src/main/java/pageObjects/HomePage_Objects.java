package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage_Objects extends Base {
	
	public HomePage_Objects() {
		PageFactory.initElements(driver, this);

   }
	@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
	private WebElement User_is_on_Retail_website;
	@FindBy(xpath="//i[@class='fa fa-caret-down']")
	private WebElement User_click_on_Currency_Tab ;
	@FindBy(xpath="//button[@name='EUR']")
	private WebElement User_Chose_Euro_from_dropdown ;
	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currency_value_should_change_to_Euro;
	
	
	
	public void user_is_on_Retail_website() {
		String text = User_is_on_Retail_website.getText();
	    if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified! ");
		}else {
			logger.info("Text does not match !");
		}
	}
	public void user_click_on_currencydropDown_Tab() {
		User_click_on_Currency_Tab.click();
    }
	public void User_Chose_Euro_from_dropdown() {
		User_Chose_Euro_from_dropdown.click();
	}
	public boolean currency_value_should_change_to_Euro() {
		return currency_value_should_change_to_Euro.isDisplayed();
		
	}
//=============================================================================================
//======================Empty Shopping Cart message Display ===================================
//=============================================================================================
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement user_click_on_shopping_cart; 
	@FindBy(xpath="//ul[@class='dropdown-menu pull-right']")
	private WebElement shopping_Cart_Message_should_display;

	public void user_click_on_shopping_cart() {
	user_click_on_shopping_cart.click();
	}
	public boolean your_shopping_cart_is_empty_message_should_display() {
		return shopping_Cart_Message_should_display.isDisplayed();
   }

}