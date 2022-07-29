package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.ZerodhaLoginPage;
import utility.Parametrization;
import utility.Reports;
public class LoginPageTest {
	WebDriver driver;
	@BeforeTest
	public void configureReport()
	{
		Reports.generateReports();	
	}
	@BeforeMethod
	public void launchBrowser() {
		driver =ChromeBrowser.openBrowser();
	}
	
	@Test
	public void zerodhaLoginTest() throws EncryptedDocumentException, IOException, InterruptedException {
		Reports.testName("zerodhaLoginTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String user =Parametrization.getData("Credentials", 0, 1);
		String pass =Parametrization.getData("Credentials", 1, 1);
		String pin =Parametrization.getData("Credentials", 2, 1);
		
		zerodhaLoginPage.enterUserId(user);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		
		zerodhaLoginPage.enterPin(driver, pin);
		zerodhaLoginPage.clickOnContinue();
		
	}
	
	@AfterMethod
	public void postExcution()
	{
		Reports.postExcution(null);
	}
	
	@AfterTest
	public void publishReports()
	{
		Reports.publishReport();
	}
}
