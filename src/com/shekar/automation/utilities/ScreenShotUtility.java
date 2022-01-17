package com.shekar.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.shekar.automation.base.BaseTest;

public interface ScreenShotUtility {
	
	public static String takeScreenShot(String tcName) throws IOException
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot)BaseTest.getDriver();
		File image = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String imagePath = System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg";
		FileUtils.copyFile(image, new File(imagePath));
		return imagePath;
	}
	public static String takeScreenShot() throws IOException
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot)BaseTest.getDriver();
		File image = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String imagePath = System.getProperty("user.dir")+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg";
		FileUtils.copyFile(image, new File(imagePath));
		return imagePath;
	}

}
