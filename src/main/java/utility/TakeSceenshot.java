package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v103.browser.Browser;
import org.openqa.selenium.io.FileHandler;

import pojo.ChromeBrowser;

public class TakeSceenshot {
	
	public static void takeScreenshot(WebDriver driver , String name) throws IOException {
		
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		String s = dateFormat.format(date);
		
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinetion = new File ("F:\\Akshay Suryawanshi ST\\Automation\\ATSScreenShots\\Maven Screenshot\\"+name+ " "+s+".png");
		FileHandler.copy(source, destinetion);
		
				
	}
	
//	public static void main(String [] args) throws IOException
//	{
//		WebDriver driver =ChromeBrowser.openBrowser();
//		
//		Sceenshot.takeScreenshot(driver, "Zerodha Sample");
		
		
	}


