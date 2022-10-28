package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilities.Utilities;

public class LaptopNoteBook_PageObjects extends Base {
	
	public LaptopNoteBook_PageObjects() {
		PageFactory.initElements(driver, this);
	}
//=============================================================================================
//                1st Scenario-   Add and Remove a Mac book from Cart
//=============================================================================================
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	private WebElement laptopAndNotebooks_tab;
	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement show_all_Laptop_NoteBook_option;
	@FindBy(xpath = "(//div[@class='product-thumb'])[2]")
	private WebElement user_click_on_MacBook_item;
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement click_add_to_Cart_buttonForMac;
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement success_message_added_to_shopping_cart;
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartShowed_1_602_item;
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement user_click_on_cart_option;
	@FindBy(xpath="//button[@title='Remove']")
	private WebElement redXbutton;
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartShowed0Items;
	
	
	public void clickOnLaptopAndNotebooks_tab() {
		laptopAndNotebooks_tab.click();
	}
	public void Show_all_Laptop_NoteBook_option() {
		show_all_Laptop_NoteBook_option.click();
	}
	public void User_click_on_MacBook_item() {
		user_click_on_MacBook_item.click();
	}
	public void click_add_to_Cart_buttonForMac() {
		click_add_to_Cart_buttonForMac.click();
	}
	public void success_message_added_to_shopping_cart() {
		success_message_added_to_shopping_cart.isDisplayed();
	}
	public void cartShowed_1_602_item() {
		cartShowed_1_602_item.isDisplayed();
	}
	public void user_click_on_cart_option() {
		user_click_on_cart_option.click();
	}
	public void userClickOnRedXbutton() {
		redXbutton.click();
	}

		
		public void itmeShould_be_removed_cartShowed0Items(String fileName) throws IOException {
			Utilities.highlightelementRedBorderAndTakeScreenshot(cartShowed0Items, fileName);
			String expectedMessage = "0 item(s) - $0.00";
			String actualMessage= cartShowed0Items.getText();
			System.out.println(actualMessage);
			try {
				Assert.assertEquals(expectedMessage, actualMessage);
			} catch (Exception e)  {
				e.printStackTrace();
		   }
		}
		
//=========================================================================================
//                   2nd Scenario -Product Comparison  
//=========================================================================================
		
		@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
		private WebElement textToValidate;
		@FindBy(xpath="(//button[@type='button'])[14]")
		private WebElement comparisonIconOnMackBook;
		@FindBy(xpath="(//button[@type='button'])[17]")
		private WebElement comparisonIconOnMacBookAir;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")       
		private WebElement successMessageForMacBookAir;
		@FindBy(xpath="//a[@id='compare-total']")
		private WebElement productCompareLink;
		@FindBy(xpath="//table[@class='table table-bordered']")
		private WebElement productcomparisonChart;
		
		
		public void validateRetailWebsite() {
			String text = textToValidate.getText();
		    if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
				logger.info("Text verified! ");
			}else {
				logger.info("Text does not match !");
			}
		}
		
		public void comparisonIconOnMackBook() {
			comparisonIconOnMackBook.click();
		}
		public void comparisonIconOnMacBookAir() {
			comparisonIconOnMacBookAir.click();
		}
		public void successMessageForMacBookAir() {
			successMessageForMacBookAir.isDisplayed();
		}
		public void productCompareLink() {
			productCompareLink.click();
		}
		public boolean productcomparisonChart() {
			return productcomparisonChart.isDisplayed();
		}
//==============================================================================================
//              3rd Scenario: Adding an item to Wish list
//==============================================================================================
		@FindBy(xpath="(//button[@type='button'])[22]")
		private WebElement add_SonyVaIO_laptop_to_wish_list; 
		
		@FindBy(xpath= "//div[@class='alert alert-success alert-dismissible']")
		private WebElement user_should_get_a_message;

			
		public void add_SonyVaIO_laptop_to_wish_list(String fileName) throws IOException {
				Utilities.scrolldownPage();
				Utilities.highlightelementRedBorderAndTakeScreenshot(add_SonyVaIO_laptop_to_wish_list, fileName);
				add_SonyVaIO_laptop_to_wish_list.click();
	        }
			
		public boolean user_should_see_a_success_message(String fileName) {
			return user_should_get_a_message.isDisplayed();
		}
//================================================================================================
//           4th Scenario: Validate the price of MacBook Pro is 2000
//================================================================================================
		
		@FindBy(xpath="//img[@title='MacBook Pro']")
		private WebElement MacBookPro;
		@FindBy(xpath="//h2[normalize-space()='$2,000.00']")
		private WebElement MacBookProPrice_2000;
		
		public void mackBookPro() {
			MacBookPro.click();
		}
				    
		public void MacBookProPrice_2000(String fileName) throws IOException {
		Utilities.highlightelementRedBorderAndTakeScreenshot(MacBookProPrice_2000, fileName);
			String expectedMessage = "$2,000.00";
			String actualMessage= MacBookProPrice_2000.getText();
			System.out.println(actualMessage);
				try {
					Assert.assertEquals(expectedMessage, actualMessage);
				} catch (Exception e)  {
					e.printStackTrace();
			   }
			}
		}


