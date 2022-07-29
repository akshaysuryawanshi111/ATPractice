package utility;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	static ExtentReports extent;
	static ExtentTest test;
	public static ExtentReports generateReports() 
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Test", "Zerodha");
		extent.setSystemInfo("Akshay", "QA");
		extent.setSystemInfo("Build", "Regression");
		return extent;
	}
	
	public static void testName(String name)
	{
		test=extent.createTest(name);
	}
	
	public static void postExcution(ITestResult result)
	{
		
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}if (result.getStatus() ==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		} else 
		{
			test.log(Status.SKIP, result.getName());
		}
	} 
	
	public static void publishReport()
	{
		extent.flush();
	}
}
