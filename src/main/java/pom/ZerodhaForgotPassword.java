package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPassword {
	
	@FindBy (xpath = "//a[text()='Forgot user ID or password?']")private WebElement forgotlink;
	@FindBy(xpath ="(//input[@name='is-userid'])[2]") private WebElement userId;
	@FindBy(xpath ="(//label[@class='su-radio-label'])[2]") private WebElement forgotUserId;
	@FindBy(xpath ="//input[@placeholder='E-mail (as on account)']") private WebElement enterEmail;
	@FindBy(xpath ="//input[@placeholder='PAN']") private WebElement pan;
	@FindBy(xpath ="//label[text()='SMS']") private WebElement smsRadio;
	@FindBy (xpath ="//input[@placeholder='Mobile number (as on account)']") private WebElement mobileNo;
	@FindBy (xpath ="//a[contains(@class,'text-xsmall text-')]") private WebElement backToLoginPage;


	public ZerodhaForgotPassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	public void clickOnForgotIdOrPassLink() {
		forgotlink.click();
	}
	
	public void clickOnForgotUserIdRadio() {
		forgotUserId.click();
	}
	
	public void enterUserId(String Id) {
		userId.sendKeys(Id);
	}
	
	public void enterPanNo(String panNo) {
		pan.sendKeys(panNo);
	}
	
	public void enterEmailId(String mail) {
		enterEmail.sendKeys(mail);
	}
	
	public void clickOnSms() {
		smsRadio.click();
	}
	
	public void enterMobNo(String mobNo) {
		mobileNo.sendKeys(mobNo);
	}
	public void clickOnBackToLoginPageLink() {
		backToLoginPage.click();
	}
	
}
