package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overview {
	Actions actions;
	
	@FindBy(id = "finish")
	private WebElement finishBtn;
	
	public Overview(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickFinishBtn() {
		finishBtn.click();
	}
	
}
