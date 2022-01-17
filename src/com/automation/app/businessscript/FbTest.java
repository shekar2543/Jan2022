package com.automation.app.businessscript;

import org.testng.annotations.Test;

import com.shekar.automation.base.BaseTest;

public class FbTest extends BaseTest {
	
	@Test	
	public void FbTest() {
		getDriver().get("https://www.facebook.com");
	}

}
