package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import utility.Parametrization;

public class ZerodhaLoginMethod {
	public static void loginToZerodha(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String user =Parametrization.getData("Credentials", 0, 1);
		String pass =Parametrization.getData("Credentials", 1, 1);
		String pin =Parametrization.getData("Credentials", 2, 1);
		
		zerodhaLoginPage.enterUserId(user);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		
		zerodhaLoginPage.enterPin(driver, pin);
		zerodhaLoginPage.clickOnContinue();
	}

}
