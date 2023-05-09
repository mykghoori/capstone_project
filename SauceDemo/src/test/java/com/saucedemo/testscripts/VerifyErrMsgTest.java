package com.saucedemo.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.LandingPage;

public class VerifyErrMsgTest extends BaseTest{
	
	@Test
	public void launchApplication() {
		
		// 1) Enter the username – ‘locked_out_user’ in the ‘Username’ textbox
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUsername("locked_out_user");
		
		// 2) Enter password ‘secret_sauce’ in the ‘Password’ textbox.
		landingPage.enterPassword("secret_sauce");
		
		// 3) Click on Login button.
		landingPage.clicklogInBtn();
		
		// 4) Verify the error message – ‘Epic sadface: Sorry, this user has been locked out.’ is displayed on the web-page.
		String expectedErrMsg = "Epic sadface: Sorry, this user has been locked out.";
		String actualErrMsg = landingPage.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
					
	}
}
