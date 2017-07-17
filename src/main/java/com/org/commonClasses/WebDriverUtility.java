package com.org.commonClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverUtility {
	
	public WebDriver driver;
	
	public WebDriver launchBrowser(String BrowserName)
		{		
		if(BrowserName.toLowerCase().contains("firefox"))
		{
			driver= new FirefoxDriver();
			
		}
		
		else if (BrowserName.toLowerCase().contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else
		{
			System.out.println("Please provide a valid browser name.");
		}
				
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public void maximizeWindow()
	{
		driver.manage().window().maximize();
	}

	
}
