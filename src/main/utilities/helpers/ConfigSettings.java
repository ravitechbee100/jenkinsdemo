package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class ConfigSettings {

	Properties prop;
	public ConfigSettings() {
		 
		File src = new File("./resources/config.properties");
		System.out.println("Properties file loaded");
		try {
						
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
	
	public String getbrowserName() {
		
		return prop.getProperty("browser");
	}
	
	public String getUrl() {
		
		return prop.getProperty("url");
	}

}
