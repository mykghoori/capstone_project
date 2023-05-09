package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyLastNameErrMsg extends Driver{
	
	@Given("User is in the Log in page of SauceDemo")
	public void user_is_in_the_log_in_page_of_sauce_demo() {
	    
	}

	@When("he Enters the username")
	public void he_enters_the_username() {
	    landingPage.enterUsername("problem_user");
	}

	@When("he enters the password")
	public void he_enters_the_password() {
	    landingPage.enterPassword("secret_sauce");
	}

	@When("he clicks on the log in button")
	public void he_clicks_on_the_log_in_button() {
	    landingPage.clicklogInBtn();
	}

	@When("he adds the fisrt product to cart")
	public void he_adds_the_fisrt_product_to_cart() {
	    addProduct.addFirstProduct();
	}

	@When("he clicks on the cart icon")
	public void he_clicks_on_the_cart_icon() {
	    addProduct.clickCart();
	}

	@When("he click on the checkout button")
	public void he_click_on_the_checkout_button() {
	    cart.clickCheckout();
	}

	@When("he enters the the first name")
	public void he_enters_the_the_first_name() {
	    information.enterFirstName("Yasir");
	}

	@When("he enters the last name")
	public void he_enters_the_last_name() {
	    information.enterLastName("Khan");
	}

	@When("he clicks on the continue button")
	public void he_clicks_on_the_continue_button() {
	    information.clickContinueBtn();
	}

	@Then("User should be able to see last name error message")
	public void user_should_be_able_to_see_last_name_error_message() {
		String expectedErrMsg = "Error: Last Name is required";
		String actualErrMsg = information.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}


}
