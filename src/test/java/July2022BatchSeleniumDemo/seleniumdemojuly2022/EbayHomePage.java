package July2022BatchSeleniumDemo.seleniumdemojuly2022;

import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage {
	
	static String categories;
	
	
	static String greetingMessage;

	public static void main(String[] args) {

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver",
				//"C:\\Users\\ravi_\\eclipse-workspace\\seleniumdemojuly2022\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravi_\\eclipse-workspace\\seleniumdemojuly2022\\chromedriver.exe");
		driver.get("https://www.ebay.com/");// launch website

		driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();

		greetingMessage = driver.findElement(By.id("greeting-msg")).getText();// validate the greeting message
		
		/*if (greetingMessage.equals("Hello")) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login Unsuccessful");
		}*/
		
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		
		driver.manage().window().maximize();
		driver.findElement(By.id("gh-la")).click();
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		
		/*List<WebElement> element = driver.findElements(webelements);
		for (WebElement e: element) {
			
			Select category = new Select(e);
			category.selectByVisibleText(categories);
			
		}*/
		
		//Select category = new Select(driver.findElement(By.id("gh-cat")));
		//category.selectByVisibleText(categories);
		
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[1]/div/a/div/span/input")).click();

		
		
		
		
	}

}
