package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginPage;
import utility.Parametrization;

public class SamplePractice {
	WebDriver driver;
	
	@Test
		public void loginToZerodha() throws EncryptedDocumentException, IOException, InterruptedException
		{
			driver =ChromeBrowser.openBrowser();
			ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
			String user =Parametrization.getData("Credentials", 0, 1);
			String pass =Parametrization.getData("Credentials", 1, 1);
			String pin =Parametrization.getData("Credentials", 2, 1);
			
			zerodhaLoginPage.enterUserId(user);
			zerodhaLoginPage.enterPassword(pass);
			zerodhaLoginPage.clickOnLogin();
			zerodhaLoginPage.enterPin(driver, pin);
			zerodhaLoginPage.clickOnContinue();
			
			ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
			zerodhaHomePage.searchAStock(driver, "tata");
			zerodhaHomePage.selectStockFromSearchList(driver, "TATAPOWER");
			
			
	}
}
