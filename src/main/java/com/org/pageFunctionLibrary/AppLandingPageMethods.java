package com.org.pageFunctionLibrary;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.org.dataReadUtility.readProperties;
import com.org.pageControlsLibrary.AppLandingPageControls;

public class AppLandingPageMethods{

	WebDriver driver;
	
	public AppLandingPageMethods(WebDriver driver) {
		this.driver=driver;
	}
	
	AppLandingPageControls _appLandingPageControls;
	
	

	
/*	@FindBy(how=How.XPATH,using="//input[@name='UserName']")
	WebElement txt_userName;
	
	@FindBy(how=How.XPATH,using="//input[@name='Password']")
	WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-button']")
	WebElement button_login;
	
	public AppLandingPageMethods(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}*/
	

	
	public void openApplication()
	{
		driver.get(readProperties.readTestConfig("url"));
	}
	
	public void validateLandingPageTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Agile Cockpit Identity Server");
	}
	
	public void loginToApplication(String userName, String password)
	{
		_appLandingPageControls=new AppLandingPageControls(driver);
		_appLandingPageControls.txt_userName().sendKeys(userName);
		_appLandingPageControls.txt_password().sendKeys(password);
		_appLandingPageControls.button_login().click();
	}
	public void validateSuccessfulLogin()
	{
		Assert.assertEquals(driver.findElement(By.linkText("Me")).getText(),"Me");
	}
	

}
