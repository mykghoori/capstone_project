package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	Actions actions;
	
	@FindBy(id = "checkout")
	private WebElement checkout;
	
	@FindBy(xpath = "//span[contains(@class,'title')]")
	private WebElement verifyText;
	
	@FindBy(id = "continue-shopping")
	private WebElement continueShop;
	
	@FindBy(xpath = "//span[contains(@class,'shopping_cart_badge')]")
	private WebElement verifyItemsOnCart;
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickCheckout() {
		checkout.click();
		
	}
	
	public String getVerifyTxt() {
		String message = verifyText.getText();
		return message;
	}
	
	public void clickContinueShop() {
		continueShop.click();
	}
	
	public String getVerifyItemsOnCart() {
		String message = verifyItemsOnCart.getText();
		return message;
	}
}
