package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShotI {
	
	
	public String takescreenshots(WebDriver driver) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotpath = System.getProperty("user.dir")+"/.Screenshots/"+getCurrentDateTime()+"ebay.png";
		
		try {
			FileHandler.copy(src,new File("./Screenshots/"+getCurrentDateTime()+".png"));
		} catch (Exception e) {
			
			System.out.println(" screenshot not available "+e.getMessage());
		}
		
		return screenshotpath;
		
	}
	
	public String getCurrentDateTime() {
		
		DateFormat format = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return format.format(currentDate);
	}
	
	
	

}
