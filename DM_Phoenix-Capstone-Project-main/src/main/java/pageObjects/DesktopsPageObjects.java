package pageObjects;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObjects extends Base{
	
	public DesktopsPageObjects() {
		PageFactory.initElements(driver, this);
	}
//================================================================================================
//          1st Scenario User verify all items are present in Desktops tab
//================================================================================================
	
	@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
	private WebElement varifiedhomePage;
	@FindBy(xpath ="//a[text()='Desktops']")
	private WebElement desktopsButton;
	@FindBy(xpath="//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktopsText;
	@FindBy(xpath="//div[@id='content']")
	private WebElement all_items_are_present_in_Desktop_page;
	@FindBy(tagName="a")
	private List<WebElement> allListOfItemsOnDesktopsPage_withTagName_a;
	@FindBy(tagName="span")
	private List<WebElement> allListOfItemsOnDesktopsPage_withTagName_span;
	@FindBy(tagName="div")
	private List<WebElement> allListOfItemsOnDesktopsPage_withTagName_div;
	@FindBy(tagName="button")
	private List<WebElement> allListOfItemsOnDesktopsPage_withTagName_button;
	@FindBy(tagName="li")
	private List<WebElement> allListOfItemsOnDesktopsPage_withTagName_li;

	
	
	public void user_is_on_Retail_website() {
		String text = varifiedhomePage.getText();
	    if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified! ");
		}else {
			logger.info("Text does not match !");
		}
	}
	
	public void user_click_on_desktops_tab() {
		desktopsButton.click();
		}
	public void user_click_on_Show_all_desktops () {
		showAllDesktopsText.click();
	}

	public void allListOfItemsOnDesktopsPage_withTagName_a() throws InterruptedException {
		List<WebElement> list= allListOfItemsOnDesktopsPage_withTagName_a;
		System.out.println(list.size()+ " All elements on Desktops page with TagName_a:");
		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
		System.out.println(text);
		Assert.assertTrue(list.size()!=0);
		}
		
      }
	public void allListOfItemsOnDesktopsPage_withTagName_span() throws InterruptedException {
		List<WebElement> list= allListOfItemsOnDesktopsPage_withTagName_span;
		System.out.println(list.size()+ " All elements on Desktops page with tagName span:");
		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
		Assert.assertTrue(list.size()!=0);
			
			
	      }
     }
	public void allListOfItemsOnDesktopsPage_withTagName_div() throws InterruptedException {
		List<WebElement> list= allListOfItemsOnDesktopsPage_withTagName_div;
		System.out.println(list.size()+ " All elements on Desktops page with tagName div:");
		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			Assert.assertTrue(list.size()!=0);
					
					
	     }
	}
	public void allListOfItemsOnDesktopsPage_withTagName_button() throws InterruptedException {
		List<WebElement> list= allListOfItemsOnDesktopsPage_withTagName_button;
		System.out.println(list.size()+ " All elements on Desktops page with tagName button:");
		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			Assert.assertTrue(list.size()!=0);
					
					
	     }
	}
	public void allListOfItemsOnDesktopsPage_withTagName_li() throws InterruptedException {
		List<WebElement> list= allListOfItemsOnDesktopsPage_withTagName_li;
		System.out.println(list.size()+ " All elements on Desktops page with tagName li:");
		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			Assert.assertTrue(list.size()!=0);
					
		}		
    }
//===============================================================================================
//         2nd Scenario-  User add HPLP3065  from Desktops tab to the cart  PageObjects
//===============================================================================================
	
		@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
		private WebElement addToCartButton;
		@FindBy(className = "form-control")
		private WebElement quatity;
		@FindBy(xpath="(//button[@type='button'])[11]")
		private WebElement addToCartButton2;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement success_message_for_HPLP3065;

	
		public void addToCart() {
			addToCartButton.click();	
		}

		public void clickquatity() {
			quatity.sendKeys("1");
		}
		public void clickaddToCartButton2() {
			addToCartButton2.click();
		}
		public boolean you_have_added_HPLP3065_Successfully_toYourShoppingCart() {
			 return success_message_for_HPLP3065.isDisplayed();
			
		}
//===============================================================================================
//       3rd Scenario: User add Canon EOS 5D from Desktops tab to the cart
//================================================================================================
		
		@FindBy(xpath="//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[1]")
		private WebElement addToCartOptionCanonEOS5Ditem;
		@FindBy(xpath="//option[@value='15']")
		private WebElement redColor;
		@FindBy(xpath="//input[@name='quantity']")
		private WebElement selectQuantity;
		@FindBy(xpath="//button[@id='button-cart']")
		private WebElement addToCartButtonCanonEOS5D2;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement success_message;
		
		
		
		public void addToCartOptionCanonEOS5D1() {
			addToCartOptionCanonEOS5Ditem.click();
		}
		public void selectRedColor() {
			redColor.click();
		}
		public void selectQuantity() {
			selectQuantity.sendKeys("1");
		}
		public void addToCartButtonCanonEOS5D2() {
			addToCartButtonCanonEOS5D2.click();
		}
		public boolean success_you_have_added_CanonEOS_5D_to_your_Shopping_cart() {
			return success_message.isDisplayed();
			

	   }
		
//===============================================================================================
//         4th Scenario   Scenario: User add a review to Canon EOS 5D item in Desktops tab
//===============================================================================================

	@FindBy(xpath="(//div[@class='product-thumb'])[2]")
	private WebElement canonEOS5DCamera_item;
	@FindBy(xpath="//a[normalize-space()='Reviews (0)']")
	private WebElement ReviewsTab;
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement enterYourName;
	@FindBy(xpath="//textarea[@id='input-review']")
	private WebElement enterReview_in_Text_Box;
	@FindBy(xpath ="//input[@value='1']")
	private WebElement ratingRadiobutton1;
	@FindBy(xpath ="//input[@value='2']")
	private WebElement ratingRadiobutton2;
	@FindBy(xpath ="//input[@value='3']")
	private WebElement ratingRadiobutton3;
	@FindBy(xpath ="//input[@value='4']")
	private WebElement ratingRadiobutton4;
	@FindBy(xpath="//input[@value='5']")
	private WebElement ratingRadiobutton5;
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement ContinueButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewMessageSent;



	public void canonEOS5DCamera_item() {
		canonEOS5DCamera_item.click();
	}
	public void User_click_on_write_a_review_link() {
		ReviewsTab.click();
	}
	public void enterYourName(String yourName,String yourReview,String Rating) {
	
}
public void enterYourName(String yourname) {
	enterYourName.sendKeys("Daud Mangal");
	}
	public void enterReview_in_Text_Box(String yourReview) {
		enterReview_in_Text_Box.sendKeys(yourReview);
	}
	public void ratingRadioButton(String Rating) {
	if(Rating.equalsIgnoreCase("1")) {
		ratingRadiobutton1.click();
		System.out.println(ratingRadiobutton1.getAttribute("value"));
	}else if(Rating.equalsIgnoreCase("2")) {
		ratingRadiobutton2.click();
		System.out.println(ratingRadiobutton2.getAttribute("value"));
	}else if(Rating.equalsIgnoreCase("3")) {
		ratingRadiobutton3.click();
		System.out.println(ratingRadiobutton3.getAttribute("value"));
	}else if(Rating.equalsIgnoreCase("4")) {
		ratingRadiobutton4.click();
		System.out.println(ratingRadiobutton4.getAttribute("value"));
	}else if(Rating.equalsIgnoreCase("5")) {
		ratingRadiobutton5.click();
		System.out.println(ratingRadiobutton5.getAttribute("value"));
		}  
	}
	public void reviewContinueButton() {
		ContinueButton.click();
	}
	public boolean reviewMessageSent() {
		return reviewMessageSent.isDisplayed();
    }
}

	

