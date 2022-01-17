package com.automation.app.businessscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shekar.automation.base.BaseTest;
import com.shekar.automation.utilities.POJOReader;

public class InstTest extends BaseTest {
	
	@Test
	public void InstTest() throws IOException {
		
		String inst_url = POJOReader.getPRorConfObj().getPropertyValue("inst_url");
		getDriver().get(inst_url);
		System.out.println("@Test: InstTest");
		String inst_videos = POJOReader.getPRorConfObj().getPropertyValue("inst_videos_xpath");
		getDriver().findElement(By.xpath(inst_videos)).click();
	}

}
