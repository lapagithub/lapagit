package com.lapa.google.generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	@BeforeMethod
//	public void openBrowser(String browser,String url)
//	{
//		if (browser.equalsIgnoreCase("chrome"))
//				{
//			System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
//			driver=new ChromeDriver();
//				}
//		else if(browser.equalsIgnoreCase("firefox"))
//				{
//			System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
//			driver=new FirefoxDriver();
//				}
//		else
//		{
//			System.out.println("enter the correct browser");
//		}	
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");

	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
