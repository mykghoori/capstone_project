package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information {
	Actions actions;
	
	@FindBy(id = "last-name")
	private WebElement lastname;
	
	@FindBy(id = "first-name")
	private WebElement firstname;
	
	@FindBy(id = "postal-code")
	private WebElement zipcode;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//div[contains(@class,'error-message-container error')]")
	private WebElement errMsg;

	public Information(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void enterLastName(String lastName) {
		lastname.sendKeys(lastName);
	}
	
	public void enterFirstName(String firstName) {
		firstname.sendKeys(firstName);
	}
	
	public void enterZipCode(String zipCode) {
		zipcode.sendKeys(zipCode);
	}
	
	public void clickContinueBtn() {
		continueBtn.click();
	}
	
	public String getErrMsg() {
		String message = errMsg.getText();
		return message;
	}

}
