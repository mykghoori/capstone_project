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

public class VerifyAndBuyProductsTest extends BaseTest {
	
	@Test
	public void launchApplication() {
		Cart cart;
		// 1) Enter the username – ‘standard_user’
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUsername("standard_user");
		
		// 2) Enter Password.
		landingPage.enterPassword("secret_sauce");
		
		// 3) Click on login Button.
		landingPage.clicklogInBtn();
		
		// 4) Switch to new tab.
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		String windowHandleOfSecondTab = tabs.get(0);
		driver.switchTo().window(windowHandleOfSecondTab);
		
		// 5) Add First product
		AddProduct addProduct = new AddProduct(driver);
		addProduct.clickFirstProduct();
		
		// 6) Add Third product.
		addProduct.clickThirdProduct();
		
		// 7) Remove product from cart.
		addProduct.removeFromCart();
		
		// 8) click on  cart.
		addProduct.clickCart();
		
		// 9) Verify Cart Text Message 'Your Cart'
		cart = new Cart(driver);
		String expectedVerifyText = "Your Cart";
		String actualVerifyText = cart.getVerifyTxt();
		Assert.assertEquals(actualVerifyText, expectedVerifyText);
		
		// 10) Click on continue button.
		cart.clickContinueShop();
		
		addProduct.clickSortItemsAgain();
		
		// 11) click sort items option.
		addProduct.clickSortItemsHigh();
		
		// 12) sort items from high price to low price.
		addProduct.addHighPriceItem();
		
		// 13) click on Cart Again.
		addProduct.clickCartAgain();
		
		// 14) Verify the added products in cart.
		String expectedVerifyItemsOnCart = "2";
		String actualVerifyItemsOnCart = cart.getVerifyItemsOnCart();
		Assert.assertEquals(actualVerifyItemsOnCart, expectedVerifyItemsOnCart);
		
		// 15) click Checkout button.
		cart.clickCheckout();
		
		// 16) Enter First Name.
		Information infromation = new Information(driver);
		infromation.enterLastName("Khan");
		
		// 17) Enter Last Name.
		infromation.enterFirstName("Taqdeer");
		
		// 18) Enter Postal Code.
		infromation.enterZipCode("30021");
		
		// 19) Click continue button.
		infromation.clickContinueBtn();
		
		// 20) click finish button.
		Overview overview = new Overview(driver);
		overview.clickFinishBtn();
		
		// 21) Verify the Last Text Message 'Thank You for your order!'.
		VerifyTextMsg verifyTextMsg = new VerifyTextMsg(driver);
		String expectedTxtMsg = "Thank you for your order!";
		String actualTxtMsg = verifyTextMsg.getVerifyTxtMsg();
		Assert.assertEquals(actualTxtMsg, expectedTxtMsg);
	}
}
