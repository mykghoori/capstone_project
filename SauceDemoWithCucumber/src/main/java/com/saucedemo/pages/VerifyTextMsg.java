package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyTextMsg {
	Actions actions;
	
	@FindBy(xpath = "//div[contains(@class,'complete-text')]")
	private WebElement verifyMsg;
	
	@FindBy(xpath = "//h2[contains(@class,'complete-header')]")
	private WebElement verifyTxtMsg;
	
	public VerifyTextMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public String geVerifyMsg() {
		String message = verifyMsg.getText();
		return message;
	}
	
	public String getVerifyTxtMsg() {
		String message = verifyTxtMsg.getText();
		return message;
	}
}
