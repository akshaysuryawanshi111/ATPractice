package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
	@FindBy (xpath ="//a[@class='text-light']") private WebElement signUp;
	@FindBy (xpath= "//input[@id='user_mobile']") private WebElement enterMobNo;
	@FindBy (xpath= "//button[@type='submit']") private WebElement clickOnContinue;
	@FindBy (xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup1;
	@FindBy (xpath= "(//a[@href='https://signup.zerodha.com'])[1]") private WebElement signup2;
	@FindBy (xpath= "(//a[@href='https://zerodha.com/about/'])[1]") private WebElement about;
	@FindBy (xpath= "(//a[@href='https://zerodha.com/products/'])[1]") private WebElement products;
	@FindBy (xpath= "(//a[@href='https://zerodha.com/pricing/'])[1]") private WebElement pricing;
	@FindBy (xpath= "(//a[@href='https://support.zerodha.com'])[1]") private WebElement support;
	@FindBy (xpath ="//div[@class='cursor-pointer']") private WebElement curserPointer;
 
	public ZerodhaSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignUp1() {
		signUp.click();
	}
	
	public void enterMobileNo(String enterNo) {
		enterMobNo.sendKeys(enterNo);
	}
	
	public void clickOnContinue() {
		clickOnContinue.click();
	}
	
	public void clickOnsignUp() {
		signup1.click();
	}
	
	public void clickOnSignup2() {
		signup2.click();
	}
	
	public void clickOnAbout() {
		about.click();
	}
	
	public void clickOnPuducts() {
		products.click();
	}
	
	public void clickOnPricing() {
		pricing.click();
	}
	
	public void clickOnSupport() {
		support.click();
	}
	
	public void clickOnCurserPointer() {
		curserPointer.click();
	}
	public void switchFocusOnSignupPage(WebDriver driver) {
		
		Set<String> hs = driver.getWindowHandles();
		Iterator <String> i = hs.iterator();
		i.next();
		driver.switchTo().window(i.next());
	}
}
