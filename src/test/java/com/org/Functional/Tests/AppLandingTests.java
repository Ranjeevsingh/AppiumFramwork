package com.org.Functional.Tests;


import org.testng.annotations.Test;

import com.org.commonClasses.TestBase;
import com.org.pageFunctionLibrary.AppLandingPageMethods;

public class AppLandingTests extends TestBase{
	
	
	AppLandingPageMethods _appLandingPage;
	
	
	
	@Test
	public void CheckAppLandingPage() {
		_appLandingPage=new AppLandingPageMethods(driver);
		_appLandingPage.openApplication();
		_appLandingPage.validateLandingPageTitle();
	}
	

	@Test
	public void validateSuccessfulLogin() {
		_appLandingPage=new AppLandingPageMethods(driver);
		_appLandingPage.openApplication();
		_appLandingPage.loginToApplication("r.singh@prowareness.nl", "Nov@2017");
		_appLandingPage.validateSuccessfulLogin();
	}

}
