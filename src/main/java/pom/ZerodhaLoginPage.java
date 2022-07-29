package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
	
	@FindBy (xpath = "//input[@id='userid']")private WebElement userid;
	@FindBy (xpath = "//input[@id='password']")private WebElement pass;
	@FindBy (xpath = "//button[@class='button-orange wide']")private WebElement submit;
	@FindBy (xpath = "//input[@id='pin']")private WebElement enterpin;
	@FindBy (xpath = "//button[@class='button-orange wide']")private WebElement clickcontinue;
	@FindBy (xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup1;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		public void enterUserId(String user) {
			userid.sendKeys(user);
		}
		
		public void enterPassword(String password) {
			pass.sendKeys(password);
		}
		
		public void clickOnLogin() {
			submit.click();
		}
		
		public void enterPin(WebDriver driver, String pin) 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
			wait.until(ExpectedConditions.visibilityOf(enterpin));
			enterpin.sendKeys(pin);
		}
		 
		public void clickOnContinue() {
			clickcontinue.click();
		}
			
		public void clickOnsignUp() {
			signup1.click();
		}
}

