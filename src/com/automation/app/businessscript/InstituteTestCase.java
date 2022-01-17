package com.automation.app.businessscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.shekar.automation.base.BaseTest;

public class InstituteTestCase extends BaseTest {
	
@Test
 public void instituteTest() {
	
	getDriver().get("https://www.rameshsoft.com");
	WebElement videos = getDriver().findElement(By.xpath("//a[text()='Videos']"));
	videos.click();
	
	
		
}

}
