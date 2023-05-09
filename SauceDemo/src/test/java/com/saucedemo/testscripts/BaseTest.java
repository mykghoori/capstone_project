package com.saucedemo.testscripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void buyNewItem() {
		    // 1) Open the browser
		System.setProperty("webdriver.chrome", "reources//chromedriver.exe");
		    driver = new ChromeDriver();
		    
		    // 2) Maximize it
		    driver.manage().window().maximize();
		    
	     	// 3) Navigate to application
		    driver.get("https://www.saucedemo.com/");
		}
		
		@AfterClass
		// 4) Close the browser
		public void closeBrowser() {
			driver.quit();
		}
	}

