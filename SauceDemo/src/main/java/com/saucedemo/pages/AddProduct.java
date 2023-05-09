package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {
	Actions actions;
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement addToCartSecond;
	
	@FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
	private WebElement cart;
	
    @FindBy(id = "inventory_container")
    private WebElement addFirstToCart;
	
    @FindBy(xpath = "//select[contains(@class,'product_sort_container')]")
    private WebElement sortItems;
    
    @FindBy(xpath = "//div[contains(@class,'header_secondary_container')]")
    private WebElement sortItemsOnPrice;
    
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement addFirstItemToCart;
    
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addToCartThird;
    
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeFromCart;
    
    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
	private WebElement clickCartAgain;
    
    @FindBy(xpath = "//select[contains(@class,'product_sort_container')]")
    private WebElement sortItemsAgain;
    
    @FindBy(xpath = "//div[contains(@class,'header_secondary_container')]")
    private WebElement sortItemsOnHigh;
    
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement addToCartHigh;
    
	public AddProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickFirstProduct() {
		addToCart.click();
	}
	
	public void clickSecondProduct() {
		addToCartSecond.click();
	}
	
	public void clickCart() {
		cart.click();
	}
	
	public void addFirstProduct() {
		addFirstToCart.click();
	}
	
	public void clickSortItems() {
		sortItems.click();
	}
	
	public void clickSortItemsOnPrice() {
		sortItemsOnPrice.click();
	}
	
	public void addFirstItem() {
		addFirstItemToCart.click();
	}
	
	public void clickThirdProduct() {
		addToCartThird.click();
	}
	
	public void removeFromCart() {
		removeFromCart.click();
	}
	
	public void clickCartAgain() {
		clickCartAgain.click();
	}
	
	public void clickSortItemsAgain() {
		sortItemsAgain.click();
	}
	
	public void clickSortItemsHigh() {
		sortItemsOnHigh.click();
	}
	
	public void addHighPriceItem() {
		addToCartHigh.click();
	}
}
