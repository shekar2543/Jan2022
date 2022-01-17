package com.shekar.automation.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.shekar.automation.utilities.ScreenShotUtility;

public class ScreenShotAdapter extends TestListenerAdapter {
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
