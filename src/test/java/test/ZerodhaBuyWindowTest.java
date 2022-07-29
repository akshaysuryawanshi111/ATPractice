package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.ZerodhaBuyWindow;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginMethod;
import pom.ZerodhaLoginPage;
import utility.Parametrization;
import utility.TakeSceenshot;
@Listeners(Listener.class)
public class ZerodhaBuyWindowTest extends BaseTest {
//No Need To Declare WebDriver Since Base Class Has public static WebDriver In It.
	@BeforeClass()
	public void loginToZerodha() throws EncryptedDocumentException, IOException
	{
		driver =ChromeBrowser.openBrowser();
		ZerodhaLoginMethod.loginToZerodha(driver);
	}
	
	@Test
	public void searchAndBuyStock() throws InterruptedException
	{
		ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
		zerodhaHomePage.searchAStock(driver, "adani");
		zerodhaHomePage.selectStockFromSearchList(driver, "ADANIPOWER");
	}
	 
	@Test(priority = 1)
	public void buyStockUsingCNC()
	{
	ZerodhaBuyWindow zerodhaBuyWindow = new ZerodhaBuyWindow(driver);
	zerodhaBuyWindow.placeAMOOrder(driver);
	zerodhaBuyWindow.enterQuantityInQty();
	zerodhaBuyWindow.clickOnMarketRadioButton(driver);
	zerodhaBuyWindow.clickOnBuyBotton();
	zerodhaBuyWindow.clickOnOrdersTab();
	
	}
		
}

