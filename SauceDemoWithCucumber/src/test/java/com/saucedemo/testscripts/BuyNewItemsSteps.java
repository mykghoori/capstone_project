package com.saucedemo.testscripts;

import java.util.ArrayList;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyNewItemsSteps extends Driver{
	
	@Given("User is in the login page of SauceDemo")
	public void user_is_in_the_login_page_of_sauce_demo() {
	}

	@When("he enters username to login box")
	public void he_enters_username_to_login_box() {
	    landingPage.enterUsername("standard_user");
	}

	@When("he enters password to pasword boc")
	public void he_enters_password_to_pasword_boc() {
	    landingPage.enterPassword("secret_sauce");
	}

	@When("he clicks on th login button")
	public void he_clicks_on_th_login_button() {
	    landingPage.clicklogInBtn();
	}

	@When("User is on new page of products")
	public void user_is_on_new_page_of_products() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		String windowHandleOfSecondTab = tabs.get(0);
		driver.switchTo().window(windowHandleOfSecondTab);
	}

	@When("he add the first product to the cart")
	public void he_add_the_first_product_to_the_cart() {
	    addProduct.clickFirstProduct();
	}

	@When("he add the second product to the cart")
	public void he_add_the_second_product_to_the_cart() {
	    addProduct.clickSecondProduct();
	}

	@When("he clicks on the cart button")
	public void he_clicks_on_the_cart_button() {
	    addProduct.clickCart();
	}

	@When("he clicks on the checkout button")
	public void he_clicks_on_the_checkout_button() {
	    cart.clickCheckout();
	}

	@When("he enters his first name")
	public void he_enters_his_first_name() {
	    information.enterFirstName("Khan");
	}

	@When("he enters his last name")
	public void he_enters_his_last_name() {
	    information.enterLastName("Taqdeer");
	}

	@When("he enters the postal code")
	public void he_enters_the_postal_code() {
	    information.enterZipCode("30021");
	}

	@When("he clicks on the contiue button")
	public void he_clicks_on_the_contiue_button() {
	    information.clickContinueBtn();
	}

	@When("he clicks on the finish button")
	public void he_clicks_on_the_finish_button() {
	    overview.clickFinishBtn();
	}

	@Then("User should see the last Message {string}")
	public void user_should_see_the_last_message(String string) {
		String expectedVerifyMsg = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualVerifyMsg = verifyTextMsg.geVerifyMsg();
		Assert.assertEquals(actualVerifyMsg, expectedVerifyMsg);
	}


}
