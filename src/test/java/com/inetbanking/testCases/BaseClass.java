package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl = "http://www.demo.guru99.com/v4/";
	public String userName = "mngr298389";
	public String password = "haqeneq";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
	System.setProperty("webDriver.chrome.driver","C:\\User\\user\\MyWorkSpace\\InetBankingV1\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
