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

public class SortItemsOnPriceTest extends BaseTest {
	
	@Test
	public void launchApplication() {
		
		// 1) Enter the username – ‘standard_user’ 
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUsername("standard_user");
		
		// 2) Enter the Password.
		landingPage.enterPassword("secret_sauce");
		
		// 3) Click on the login Button.
		landingPage.clicklogInBtn();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		String windowHandleOfSecondTab = tabs.get(0);
		driver.switchTo().window(windowHandleOfSecondTab);
		
		// 4) Click Sort Items options
		AddProduct addProduct = new AddProduct(driver);
		addProduct.clickSortItems();
		
		// 5) Sort the Item from low price to High price.
		addProduct.clickSortItemsOnPrice();
		
		// 6) Add the First item.
		addProduct.addFirstItem();
		
		// 7) Click on the Cart
		addProduct.clickCart();
		
		// 8) Click on the Checkout Button.
		Cart cart = new Cart(driver);
		cart.clickCheckout();
		
		// 9) Enter First Name.
		Information infromation = new Information(driver);
		infromation.enterFirstName("Jhon");
		
		// 10) Enter Last Name.
		infromation.enterLastName("Khan");
		
		// 11) Enter Postal Code.
		infromation.enterZipCode("30021");
		
		// 12) Click on the continue button.
		infromation.clickContinueBtn();
		
		// 13) click on finish button.
		Overview overview = new Overview(driver);
		overview.clickFinishBtn();
		
		// 14) Verify the Last complete Message 'Thank you for your order'.
		VerifyTextMsg verifyTextMsg = new VerifyTextMsg(driver);
		String expectedTxtMsg = "Thank you for your order!";
		String actualTxtMsg = verifyTextMsg.getVerifyTxtMsg();
		Assert.assertEquals(actualTxtMsg, expectedTxtMsg);
	}
}
