package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortItemsOnPrice extends Driver{
	
	@Given("User is in the log in Page of SauceDemo")
	public void user_is_in_the_log_in_page_of_sauce_demo() {
	    
	}

	@When("he enters the username in the username box")
	public void he_enters_the_username_in_the_username_box() {
	    landingPage.enterUsername("standard_user");
	}

	@When("he enters the password to pasword box")
	public void he_enters_the_password_to_pasword_box() {
	    landingPage.enterPassword("secret_sauce");
	}

	@When("he clicks on the log In button")
	public void he_clicks_on_the_log_in_button() {
	    landingPage.clicklogInBtn();
	}

	@When("he sort the items from low to high price")
	public void he_sort_the_items_from_low_to_high_price() {
	    addProduct.clickSortItems();
	}

	@When("he add  the first product to the cart")
	public void he_add_the_first_product_to_the_cart() {
	    addProduct.addFirstProduct();
	}

	@When("he click on the cart button")
	public void he_click_on_the_cart_button() {
	    addProduct.clickCart();
	}

	@When("he click on the Checkout button")
	public void he_click_on_the_checkout_button() {
	    cart.clickCheckout();
	}

	@When("he enters the First name")
	public void he_enters_the_first_name() {
	    information.enterFirstName("Jamal");
	}

	@When("he enters the Last name")
	public void he_enters_the_last_name() {
	    information.enterLastName("Khan");
	}

	@When("he enters the Postal code")
	public void he_enters_the_postal_code() {
	    information.enterZipCode("30022");
	}

	@When("he clicks on the Continue button")
	public void he_clicks_on_the_continue_button() {
	    information.clickContinueBtn();
	}

	@When("he click on the finish button")
	public void he_click_on_the_finish_button() {
	    overview.clickFinishBtn();
	}

	@Then("User should see the last success message {string}")
	public void user_should_see_the_last_success_message(String string) {
		String expectedTxtMsg = "Thank you for your order!";
		String actualTxtMsg = verifyTextMsg.getVerifyTxtMsg();
		Assert.assertEquals(actualTxtMsg, expectedTxtMsg);
	}


}
