package com.org.wrapperClasses;

import org.openqa.selenium.WebElement;

public class selenuimWrapperMethods {
	public static void Click(WebElement element){
		if(element.isEnabled() && element.isDisplayed()){
			element.click();
			}
	}
	public static void Clear(WebElement element){
		if(element.isEnabled()||element.isDisplayed()){
			element.clear();
			}
	}
	public static void Type(WebElement element,String TypeText){
		if(element.isEnabled() && element.isDisplayed()){
			element.sendKeys(TypeText);
			}
	}
		public static void Submit(WebElement element,String TypeText){
			if(element.isEnabled() && element.isDisplayed()){
				element.submit();
				}
			
			
	}

}
