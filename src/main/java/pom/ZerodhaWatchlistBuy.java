package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import utility.Parametrization;

public class ZerodhaWatchlistBuy {
	WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
		driver =ChromeBrowser.openBrowser();
	}
	
	@Test
	public void openZerodhaAccountTest() throws EncryptedDocumentException, IOException
	{
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

}
