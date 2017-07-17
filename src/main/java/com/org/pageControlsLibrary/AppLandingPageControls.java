package com.org.pageControlsLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AppLandingPageControls {
	
	WebDriver driver;
	
	public AppLandingPageControls(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement txt_userName(){return driver.findElement(By.xpath("//input[@name='UserName']"));}
	public WebElement txt_password(){return driver.findElement(By.xpath("//input[@name='Password']"));}
	public WebElement button_login(){return driver.findElement(By.xpath("//input[@id='login-button']"));}
	
}
