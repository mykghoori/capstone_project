package com.saucedemo.testscripts;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.AddProduct;
import com.saucedemo.pages.Cart;
import com.saucedemo.pages.Information;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Overview;
import com.saucedemo.pages.VerifyTextMsg;

public class BuyNewItemsTest extends BaseTest{
	
	@Test
	public void launchApplication() {
		
		// 1) Enter the username – ‘standard_user’
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUsername("standard_user");
		
		// 2) Enter the Password 'secret_sauce'
		landingPage.enterPassword("secret_sauce");
		
		// 3) click on Login button.
		landingPage.clicklogInBtn();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		String windowHandleOfSecondTab = tabs.get(0);
		driver.switchTo().window(windowHandleOfSecondTab);
		
		// 4) Add the first product to the cart.
		AddProduct addProduct = new AddProduct(driver);
		addProduct.clickFirstProduct();
		
		// 5) Add the Second product to the cart.
		addProduct.clickSecondProduct();
		
		// 6) Click on the cart icon
		addProduct.clickCart();
		
		// 7) Click on ‘Checkout’ button.
		Cart cart = new Cart(driver);
		cart.clickCheckout();
		
		// 8) Enter your first name in ‘First Name’ textbox.
		Information information = new Information(driver);
		information.enterLastName("Yasin");
		
		// 9) Enter your last name in ‘Last Name’ textbox.
		information.enterFirstName("Karimi");
		
		// 10) Enter Postal Code in ‘Postal Code’ textbox.
		information.enterZipCode("30021");
		
		// 11) Click on ‘Continue’ button.
		information.clickContinueBtn();
		
		// 12) Click on ‘Finish’ button on the next page.
		Overview overview = new Overview(driver);
		overview.clickFinishBtn();
		
		// 13) Verify the success message – ‘Your order has been dispatched, and will arrive just as fast as the pony can get there!’ is displayed.
		VerifyTextMsg verifyTextMsg = new VerifyTextMsg(driver);
		String expectedVerifyMsg = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualVerifyMsg = verifyTextMsg.geVerifyMsg();
		Assert.assertEquals(actualVerifyMsg, expectedVerifyMsg);
					
	}

}
