package com.automation.app.businessscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.shekar.automation.base.BaseTest;

public class GmailTestCase extends BaseTest {
	
	@Test
	public void GmailTestCase() {
		//BaseTest.getDriver().get("https://www.gmail.com");
		getDriver().get("https://www.gmail.com");
		System.out.println("Gmail page will be opened");
		WebElement userName = getDriver().findElement(By.id("identifierId"));
		userName.clear();
		userName.sendKeys("mulkalapellyshekar@gmail.com");
		WebElement next = getDriver().findElement(By.id("identifierNext"));
		next.click();
		
		
	}

}
