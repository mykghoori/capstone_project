package com.saucedemo.testscripts;

import org.testng.Assert;

import com.saucedemo.pages.VerifyTextMsg;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyAndBuyProducts extends Driver{

	@Given("User is in the Log in Page of SauceDemo")
	public void user_is_in_the_log_in_page_of_sauce_demo() {
	    
	}

	@When("he enters username to username box")
	public void he_enters_username_to_username_box() {
	    landingPage.enterUsername("standard_user");
	}

	@When("he enters password to password box")
	public void he_enters_password_to_password_box() {
	    landingPage.enterPassword("secret_sauce");
	}

	@When("he clicks on th log in button")
	public void he_clicks_on_th_log_in_button() {
	    landingPage.clicklogInBtn();
	}

	@When("he add the First product to the cart")
	public void he_add_the_first_product_to_the_cart() {
	    addProduct.addFirstProduct();
	}

	@When("he add the third product to the cart")
	public void he_add_the_third_product_to_the_cart() {
	    addProduct.clickThirdProduct();
	}

	@When("he rmoves the first product from cart")
	public void he_rmoves_the_first_product_from_cart() {
	     //addProduct.removeFromCart();
	}

	@When("he clicks on the Cart button")
	public void he_clicks_on_the_cart_button() {
	    addProduct.clickCart();
	}

	@When("User shoud be able to see the cart Msg {string}")
	public void user_shoud_be_able_to_see_the_cart_msg(String string) {
		String expectedVerifyText = "Your Cart";
		String actualVerifyText = cart.getVerifyTxt();
		Assert.assertEquals(actualVerifyText, expectedVerifyText);
	}

	@When("he clicks the Continue shopping button")
	public void he_clicks_the_continue_shopping_button() {
	    cart.clickContinueShop();
	}

	@When("he sorts the items from high to low price")
	public void he_sorts_the_items_from_high_to_low_price() {
	    addProduct.clickSortItemsAgain();
	}

	@When("he adds the most expensive items to the cart")
	public void he_adds_the_most_expensive_items_to_the_cart() {
	    addProduct.addHighPriceItem();
	}

	@When("he clicks on the Cart icon")
	public void he_clicks_on_the_cart_icon() {
	    addProduct.clickCartAgain();
	}

	@When("he should be able to see two items on the Cart icon")
	public void he_should_be_able_to_see_two_items_on_the_cart_icon() {
		String expectedVerifyItemsOnCart = "2";
		String actualVerifyItemsOnCart = cart.getVerifyItemsOnCart();
		Assert.assertEquals(actualVerifyItemsOnCart, expectedVerifyItemsOnCart);
	}

	@When("he clicks on the Checkout button")
	public void he_clicks_on_the_checkout_button() {
	    cart.clickCheckout();
	}

	@When("he enters the First Name")
	public void he_enters_the_first_name() {
	    information.enterFirstName("Belal");
	}

	@When("he enters his Last Name")
	public void he_enters_his_last_name() {
	    information.enterLastName("Karimi");
	}

	@When("he enters the Postal Code")
	public void he_enters_the_postal_code() {
	    information.enterZipCode("30022");
	}

	@When("he clicks on the Contiue Button")
	public void he_clicks_on_the_contiue_button() {
	    information.clickContinueBtn();
	}

	@When("he clicks on the Finish Button")
	public void he_clicks_on_the_finish_button() {
	    overview.clickFinishBtn();
	}

	@Then("User should see the Last Message {string}")
	public void user_should_see_the_last_message(String string) {
		VerifyTextMsg verifyTextMsg = new VerifyTextMsg(driver);
		String expectedTxtMsg = "Thank you for your order!";
		String actualTxtMsg = verifyTextMsg.getVerifyTxtMsg();
		Assert.assertEquals(actualTxtMsg, expectedTxtMsg);
	}

}
