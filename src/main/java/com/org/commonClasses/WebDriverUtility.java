package com.org.commonClasses;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
		else if (BrowserName.toLowerCase().contains("ios"))
		{
			File app=new File("TBD AppPath.app");
			
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
			capabilities.setCapability(CapabilityType.VERSION, "6.1");
			capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
			capabilities.setCapability("app", app.getAbsolutePath());
			
			try {
				driver=new RemoteWebDriver(new URL("TBD Appium URL ex - http://localhost:4723/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
			
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
