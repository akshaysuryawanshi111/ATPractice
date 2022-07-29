package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pojo.ChromeBrowser;
import pom.ZerodhaForgotPassword;

public class ZerodhaForgotPasswordPageTest {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void configureReport()
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Test", "Zerodha");
		extent.setSystemInfo("Akshay", "QA");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		driver=ChromeBrowser.openBrowser();
		}
	
	@Test 
	public void clickOnForgotpassword() 
	{
		 test = extent.createTest("clickOnForgotpassword");
		
		ZerodhaForgotPassword zerodhaForgotPassword = new ZerodhaForgotPassword(driver);
		zerodhaForgotPassword.clickOnForgotIdOrPassLink();
	}

	@Test(priority =1)
	public void enterDetails() 
	{
		test = extent.createTest("enterDetails");
		
		ZerodhaForgotPassword zerodhaForgotPassword = new ZerodhaForgotPassword(driver);
		zerodhaForgotPassword.clickOnForgotIdOrPassLink();
		
		zerodhaForgotPassword.enterUserId("LKA5435");
		zerodhaForgotPassword.enterPanNo("WKJHD5445C");
		zerodhaForgotPassword.enterEmailId("ajshjasjhd@gmail.com");
	}
	
	@Test(priority =2)
	public void enterDetails1() 
	{
		test = extent.createTest("enterDetails1");
		
		ZerodhaForgotPassword zerodhaForgotPassword = new ZerodhaForgotPassword(driver);
		zerodhaForgotPassword.clickOnForgotIdOrPassLink();
		
		zerodhaForgotPassword.clickOnForgotUserIdRadio();
		zerodhaForgotPassword.enterPanNo("WKJHD5445C");
		zerodhaForgotPassword.enterEmailId("ajshjasjhd@gmail.com");
		
	}
		
	@Test(priority=3)
		public void byMobileNumber()
	{
		test = extent.createTest("byMobileNumber");
		
		ZerodhaForgotPassword zerodhaForgotPassword = new ZerodhaForgotPassword(driver);
		zerodhaForgotPassword.clickOnForgotIdOrPassLink();
		
		zerodhaForgotPassword.enterUserId("LKA5435");
		zerodhaForgotPassword.enterPanNo("WKJHD5445C");
		
		zerodhaForgotPassword.clickOnSms();
		zerodhaForgotPassword.enterMobNo("54946156489");
		
	}
	
	@Test(priority=4)
	public void returnToLoginPage() throws InterruptedException 
	{
		test = extent.createTest("returnToLoginPage");
		
		ZerodhaForgotPassword zerodhaForgotPassword = new ZerodhaForgotPassword(driver);
		zerodhaForgotPassword.clickOnForgotIdOrPassLink();
		
		Thread.sleep(2000);
		
		zerodhaForgotPassword.clickOnBackToLoginPageLink();
	}
		
	@AfterMethod 
	public void postExcution(ITestResult result)
	{
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if (result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
	}
			
	@AfterTest
	public void publishReport()
		{
			extent.flush();
		}
		

}

