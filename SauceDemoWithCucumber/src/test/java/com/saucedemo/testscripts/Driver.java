package com.saucedemo.testscripts;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.saucedemo.pages.AddProduct;
import com.saucedemo.pages.Cart;
import com.saucedemo.pages.Information;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.Overview;
import com.saucedemo.pages.VerifyTextMsg;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static Cart cart;
	protected static AddProduct addProduct;
	protected static Information information;
	protected static Overview overview;
	protected static VerifyTextMsg verifyTextMsg;
	
	
	public static void init() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
	    driver = new ChromeDriver(option);
	    driver.manage().window().maximize();
	    driver.get("https://saucedemo.com/");
	    
	    landingPage = new LandingPage(driver);
	    cart = new Cart(driver);
	    addProduct = new AddProduct(driver);
	    information = new Information(driver);
	    overview = new Overview(driver);
	    verifyTextMsg = new VerifyTextMsg(driver);
	}
	

}
