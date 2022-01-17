package com.shekar.automation.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.shekar.automation.utilities.ScreenShotUtility;

public class TestCaseActivity implements ITestListener {
	

public void onTestStart(ITestResult result) {
	System.out.println("TC EXECUTION IS "+result.getName());
	
}

public void onTestSuccess(ITestResult result) {
	System.out.println("TC EXECUTED SUCCESSULLY"+result.getName());
	
}


public void onTestFailure(ITestResult result) {
	System.out.println("TC IS FAILED"+result.getName());
	try {
		ScreenShotUtility.takeScreenShot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	
}
public void onTestFailedButWithTimeout(ITestResult result) {
	onTestFailure(result);
	
}


public void onStart(ITestContext context) {
	System.out.println("SUITE EXECUTION IS STARTED");
	
}


public void onFinish(ITestContext context) {
	System.out.println("SUITE EXECUTION IS FINISHED");
	
}

public void onTestSkipped(ITestResult result) {
	System.out.println("TC IS FAILED"+result.getName());
	try {
		ScreenShotUtility.takeScreenShot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
