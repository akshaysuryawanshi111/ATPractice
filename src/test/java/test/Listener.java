package test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Parametrization;
import utility.TakeSceenshot;

public class Listener extends BaseTest implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Has Started " +result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed " +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Has Failed " +result.getName());
		
		try {
			TakeSceenshot.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Has Skipped" +result.getName());
	}
}
