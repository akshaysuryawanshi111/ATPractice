package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {
	
	public static WebDriver openBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Akshay Suryawanshi ST\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
