package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchlistStocks {
	
			@FindBy (xpath= "//span[@class='nice-name']")private List<WebElement> watchlistStocks;
			@FindBy (xpath ="//button[contains(text(),'B')]\r\n"
					+ "")private WebElement selectStock;
		 
			public WatchlistStocks(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			public void selectStockFromWatchListStock(WebDriver driver, String enterStockName)
			{
				int s =watchlistStocks.size();
				
				
				for(int i=0; i<s; i++)
				{
					WebElement ws =watchlistStocks.get(i);
					String stockName =ws.getText();
					String name =enterStockName;
					
						if(name.equals(stockName))
						{
							System.out.println(stockName);
							Actions act = new Actions (driver);
							act.moveToElement(ws);
							act.doubleClick();
							act.build().perform();
							
						}
				}
			}
			
			public void clickOnBuy()
			{
				selectStock.click();				
				
			}
			

}
