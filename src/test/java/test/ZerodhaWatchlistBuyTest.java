package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.WatchlistStocks;
import pom.ZerodhaLoginMethod;

public class ZerodhaWatchlistBuyTest {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		driver=ChromeBrowser.openBrowser();
		ZerodhaLoginMethod.loginToZerodha(driver);
	}
	
	@Test
	public void selectStockFromWatchListStockTest()
	{
		WatchlistStocks watchlistStocks = new WatchlistStocks(driver);
		watchlistStocks.selectStockFromWatchListStock(driver, "ADANIPOWER");
		
		watchlistStocks.clickOnBuy();
		
	}
}
