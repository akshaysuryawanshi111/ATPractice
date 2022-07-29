package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginPage;
import utility.Parametrization;
import utility.TakeSceenshot;

public class ZerodhaHomePageTest {
	WebDriver driver; 
	
	@BeforeMethod
	public void loginToZerodha() throws EncryptedDocumentException, IOException, InterruptedException {
		driver =ChromeBrowser.openBrowser();
		
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String user =Parametrization.getData("Credentials",0,1);
		String pass=Parametrization.getData("Credentials", 1,1);
		String pin =Parametrization.getData("Credentials", 2, 1);
		
		zerodhaLoginPage.enterUserId(user);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		
		zerodhaLoginPage.enterPin(driver, pin);
		zerodhaLoginPage.clickOnContinue();
	}
	
	@Test
	public void selectStockAndBuy() throws InterruptedException {
		ZerodhaHomePage zerodhaHomePage =new ZerodhaHomePage(driver);
		zerodhaHomePage.searchAStock(driver, "Tata");
		zerodhaHomePage.selectStockFromSearchList(driver, "TATACOFFEE");
	
	}
	
    @AfterMethod
    public void takeScrenshot() throws IOException {
    	TakeSceenshot takeSceenshot = new TakeSceenshot ();
    	takeSceenshot.takeScreenshot(driver, "Zerodha Buy & Sell Page");
    }
  
       
}
