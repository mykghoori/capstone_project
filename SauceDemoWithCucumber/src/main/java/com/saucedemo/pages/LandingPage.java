package com.saucedemo.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	Actions actions;
	
	@FindBy(id = "user-name")
	private WebElement UsernameTxtBox;
	
	@FindBy(id = "password")
	private WebElement passwordTxtBox;
	
	@FindBy(id = "login-button")
	private WebElement logInBtn;
	
	@FindBy(xpath = "//div[contains(@class,'error-message-container error')]")
	private WebElement errMsg;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void enterUsername(String username) {
		UsernameTxtBox.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordTxtBox.sendKeys(password);
	}
	
	public void clicklogInBtn() {
		logInBtn.click();
	}

	public String getErrMsg() {
		String message = errMsg.getText();
		return message;
	}
}
