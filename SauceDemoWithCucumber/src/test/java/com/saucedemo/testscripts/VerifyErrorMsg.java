package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyErrorMsg extends Driver{
	
	@Given("user is the login page of SauceDemo web")
	public void user_is_the_login_page_of_sauce_demo_web() {
	}

	@When("he Enters username to login box")
	public void he_enters_username_to_login_box() {
	    landingPage.enterUsername("Yasin");
	}

	@When("he Enters password to password box")
	public void he_enters_password_to_password_box() {
	    landingPage.enterPassword("Jan");
	}

	@When("he clicks on the login button")
	public void he_clicks_on_the_login_button() {
	    landingPage.clicklogInBtn();
	}

	@Then("user should see the error message {string}")
	public void user_should_see_the_error_message(String string) {
		String expectedErrMsg = "Epic sadface: Username and password do not match any user in this service";
		String actualErrMsg = landingPage.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}


}
