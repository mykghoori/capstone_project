package com.saucedemo.testscripts;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.AddProduct;
import com.saucedemo.pages.Cart;
import com.saucedemo.pages.Information;
import com.saucedemo.pages.LandingPage;

public class VerifyLastNameErrMsgTest extends BaseTest {
	
	@Test
	public void launchApplication() {
		
		// 1) Enter the username – ‘problem_user’
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUsername("problem_user");
		
		// 2) Enter the username 'secret_sauce'
		landingPage.enterPassword("secret_sauce");
		// 3) Click Login Button.
		landingPage.clicklogInBtn();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		String windowHandleOfSecondTab = tabs.get(0);
		driver.switchTo().window(windowHandleOfSecondTab);
		
		// 4) Add the 1st product to the cart.
		AddProduct addProduct = new AddProduct(driver);
		addProduct.addFirstProduct();
		
		// 5) Click On the Cart icon.
		addProduct.clickCart();
		
		// 6) Click on the Checkout Button.
		Cart cart = new Cart(driver);
		cart.clickCheckout();
		
		// 7) Enter First Name.
		Information information = new Information(driver);
		information.enterFirstName("Yasin");
		
		// 8) Enter Last Name
		information.enterLastName("Karimi");
		
		// 9) Enter Postal Code.
		information.enterZipCode("30021");
		
		// 10) Click on Continue Button.
		information.clickContinueBtn();
		
		// 11) Verify Last Name Error Message.
		String expectedErrMsg = "Error: Last Name is required";
		String actualErrMsg = information.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
		
	}
}
