package com.automation.app.businessscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.shekar.automation.base.BaseTest;

public class FacebookTest extends BaseTest {
	
	@Test
	public void facebookTest() {
		
	getDriver().get("https://www.facebook.com");	
	WebElement userName = getDriver().findElement(By.id("email"));
	userName.sendKeys("mulkalapellyshekar@gmail.com");
	
		

	}

}
