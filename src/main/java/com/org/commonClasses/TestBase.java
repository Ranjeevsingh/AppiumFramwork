package com.org.commonClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.org.dataReadUtility.readProperties;

public class TestBase{
	
	public static WebDriver driver;
	
	WebDriverUtility browserFactory=new WebDriverUtility();
	
	
	@BeforeMethod
	public void LaunchApplication(){
		
		driver=browserFactory.launchBrowser(readProperties.readTestConfig("browser"));
		browserFactory.maximizeWindow();
		
	}
	
	@AfterMethod
	public void disposeDriver(){
		driver.quit();
		driver=null;
	}

}
