package com.shekar.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.shekar.automation.utilities.DriverPaths;
import com.shekar.automation.utilities.ScreenShotUtility;

public class BaseTest {
	
	private static WebDriver driver;
	private static String tcName;
	/*
	 * This will opens the browser
	*/
	@Parameters({"browser"})
	@BeforeSuite
public void openBrowser(@Optional("chrome")String browser) throws IOException {
	if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty(DriverPaths.firefoxKey, DriverPaths.firefoxValue);
	    driver = new FirefoxDriver();
	    init();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty(DriverPaths.chromeKey, DriverPaths.chromeValue);
		driver = new ChromeDriver();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
	      String prntw = itr.next();
	      String popwnd = itr.next();
	      driver.switchTo().window(popwnd);
	      driver.switchTo().window(prntw);
	      init();				
	}
	else if(browser.equalsIgnoreCase("ie"))
	{
		System.setProperty(DriverPaths.ieKey, DriverPaths.ieValue);
		driver = new InternetExplorerDriver();
		init();
	}
}	
	public void init()
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	/*
	 * This will close the browser
	 */
	
	 @AfterSuite
     public void closeBrowser() {
	if(driver!=null)
	{
		driver.close();
	}
	else
	{
		System.out.println("Driver is pointing to null");
		//throw exception
	}
 }
	/*
	 * Tracking which test case is going to be executed 
	 */
	 @BeforeMethod
	 public void beforeTCExecution(Method method) 
	 {
		String tcName = method.getName();
		System.out.println("Current execution TestCase Name is: "+tcName);	
	}
	 /*
	  * Tracking test case activity after test case execution
	  * if it is PASS"
	  * if it is FAIL & SKIP: Take screenshots and attaching to reports
	  */
	 
	 @AfterMethod
	 public void afterTCExecution(ITestResult result) throws IOException 
	 {
		String tcName = result.getName();
		 if(result.getStatus() == ITestResult.SUCCESS )
		 {
		System.out.println("TestCase is PASSED: "+tcName);
		 }
	
	 else if(result.getStatus() == ITestResult.FAILURE )
	 {
	System.out.println("TestCase is FAILED: "+tcName);
	ScreenShotUtility.takeScreenShot(tcName);
	 }
	 else if(result.getStatus() == ITestResult.SKIP )
	 {
	System.out.println("TestCase is SKIPPED: "+tcName);
	ScreenShotUtility.takeScreenShot();
	 }
	 
}
	 /*
	  * This getter() is used to get DRIVER OBJECT outside the class
	  */
	 public static WebDriver getDriver() 
	 {
		return driver;
		
	}
	 //This getter() is used to get TestCase name out side the class
	 public static String getTcName()
	 {
		 return tcName;
	 }
}
