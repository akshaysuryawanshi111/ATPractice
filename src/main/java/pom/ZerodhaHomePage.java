package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import pojo.ChromeBrowser;

public class ZerodhaHomePage {
	@FindBy (xpath= "//input[@icon='search']")private WebElement search;
	@FindBy (xpath= "//span[@class='tradingsymbol']")private List<WebElement> stocks;
	@FindBy (xpath= "//button[@data-balloon='Buy']")private WebElement buyStock;
	@FindBy (xpath= "//button[@data-balloon='Sell']")private WebElement sellStock;
	@FindBy (xpath= "(//span[@class='icon icon-trending-up'])[1]")private WebElement chart;
	@FindBy (xpath= "//button[@data-balloon='Market depth widget']")private WebElement marketDept;
	@FindBy (xpath= "//span[@class='icon icon-plus']")private WebElement plusicon;
	@FindBy (xpath= "(//span[@data-balloon='Open chart'])[1]")private WebElement clickOnNifty;
	@FindBy (xpath= "(//span[@data-balloon='Open chart'])[2]")private WebElement clickOnSensex;
	
	public ZerodhaHomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchAStock(WebDriver driver, String stockName) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys(stockName);
	}
	
	public void selectStockFromSearchList(WebDriver driver, String nameOfStock) throws InterruptedException {
		for(int i=0; i<stocks.size(); i++) {
			WebElement currentName =stocks.get(i);
			String Name =currentName.getText();
				if(Name.equals(nameOfStock))
				{
					Actions act = new Actions(driver);
					act.moveToElement(currentName);
					act.perform();
					Thread.sleep(1000);
					buyStock.click();
				}
		}
	}
	
	public void selectStockFromSearchListtoSell(WebDriver driver, String nameOfStock) {
		for (int i =0; i<stocks.size(); i++) {
			WebElement currentName =stocks.get(i);
			String Name =currentName.getText();
				if(Name.equals(nameOfStock)) 
				{
					Actions act = new Actions(driver);
					act.moveToElement(currentName);
					act.perform();
					sellStock.click();
				}
					
			
	}
	
	
	}
	
}
