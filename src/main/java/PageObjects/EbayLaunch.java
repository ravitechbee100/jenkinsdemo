package PageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeClass;

import helpers.ConfigSettings;

import java.time.Duration;

public class EbayLaunch {

	public static WebDriver driver;
	ConfigSettings config;
	
	public WebDriver browserInitilization(String browserName) {
		config = new ConfigSettings();
		
		if (browserName.equals(config.getbrowserName())) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if (browserName.equals(config.getbrowserName())){
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get(config.getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
	}

}
