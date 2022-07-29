package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSignUpPage;

public class ZerodhaSignUpPageTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() {
		driver =ChromeBrowser.openBrowser();
	}
	
	@Test
	public void clickOnSignUp1() throws InterruptedException {
		ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
		zerodhaSignUpPage.clickOnSignUp1();
		zerodhaSignUpPage.switchFocusOnSignupPage(driver);

		zerodhaSignUpPage.enterMobileNo("8421857791");
		zerodhaSignUpPage.clickOnContinue();
		
		}
	@Test
	public void clickOnAboutTab() {
		ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
		zerodhaSignUpPage.clickOnSignUp1();
		zerodhaSignUpPage.switchFocusOnSignupPage(driver);
		
		zerodhaSignUpPage.clickOnAbout();
		}
	@Test
	public void clickOnPuductsTab() {
		ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
		zerodhaSignUpPage.clickOnSignUp1();
		zerodhaSignUpPage.switchFocusOnSignupPage(driver);
		zerodhaSignUpPage.clickOnPuducts();
		}
	
	@Test
	public void clickOnPricingTab() {
			ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
			zerodhaSignUpPage.clickOnSignUp1();
			zerodhaSignUpPage.switchFocusOnSignupPage(driver);
			zerodhaSignUpPage.clickOnPricing();
		}
	
	@Test
	public void clickOnSupportTab() {
			ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
			zerodhaSignUpPage.clickOnSignUp1();
			zerodhaSignUpPage.switchFocusOnSignupPage(driver);
			zerodhaSignUpPage.clickOnSupport();
		}
	
	@Test
	public void clickOnCurserPointerTab() {
			ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
			zerodhaSignUpPage.clickOnSignUp1();
			zerodhaSignUpPage.switchFocusOnSignupPage(driver);
			
			zerodhaSignUpPage.clickOnCurserPointer();
					
		}
	}
		

