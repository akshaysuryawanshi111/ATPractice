package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaBuyWindow {
	@FindBy (xpath= "(//input[@type='number'])[1]")private WebElement enterQuantity;
	@FindBy (xpath= "//input[@title='Buy at market price']")private WebElement marketRadioButton;
	@FindBy (xpath= "//button[@class='submit']")private WebElement clickOnBuy;
	@FindBy (xpath ="//label[text()='AMO']")private WebElement clickOnAMO;
	@FindBy (xpath ="(//a[@href='/orders'])[1]")private WebElement clickOnOrders;
	@FindBy (xpath ="//label[text()='Regular']")private WebElement regularOrder;
	@FindBy (xpath = "//input[@value='BSE']")private WebElement BSE;
	@FindBy (xpath = "//input[@value='NSE']")private WebElement NSE;
	@FindBy (xpath = "//label[text()='Cover']")private WebElement coverOrder;
	@FindBy (xpath = "//label[text()='Iceberg']")private WebElement icebergOrder;
	@FindBy (xpath = "//*[@id=\"app\"]/form/section/div/div[2]/div[1]/div/div[1]/label")private WebElement MIS;
	@FindBy (xpath = "//*[@id=\"app\"]/form/section/div/div[2]/div[1]/div/div[2]/label")private WebElement longterm;
	@FindBy (xpath = "//input[@label='Trigger price']")private WebElement triggerPrice;
	@FindBy (xpath = "//input[@value='LIMIT']")private WebElement limitRadioBtn;
	@FindBy (xpath ="//input[@value='SL']")private WebElement slradioBtn;
	@FindBy (xpath ="//input[@value='SL-M']")private WebElement slmRadioBtn;
	@FindBy (xpath ="//img[@alt='GTT logo']")private WebElement gttLogo;
	@FindBy (xpath ="//span[text()='Stoploss']")private WebElement stoplossCheckBox;
	@FindBy (xpath ="(//input[@type='number'])[4]")private WebElement stoplossValue; 
	
	
	public ZerodhaBuyWindow(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void placeAMOOrder(WebDriver driver) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(clickOnAMO));
		clickOnAMO.click();
	}
	
	public void enterQuantityInQty()
	{
		enterQuantity.sendKeys("11");
		
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.NUMPAD1);
//		act.sendKeys(Keys.NUMPAD0);
//		act.build().perform();
}

		
	public void clickOnMarketRadioButton(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(marketRadioButton);
		act.contextClick();
		act.build().perform();
	}
	
	public void clickOnBuyBotton()
	{
		clickOnBuy.click();
	}
	
	public void clickOnOrdersTab()
	{
		clickOnOrders.click();
	}
	
}

	
