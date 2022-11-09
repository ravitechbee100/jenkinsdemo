package July2022BatchSeleniumDemo.seleniumdemojuly2022;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.*;


import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjects.Base;
import PageObjects.EbayLaunch;
import PageObjects.LoginPage;
import helpers.TakeScreenShotI;
import helpers.TestDataProvider;
import junit.framework.Assert;

public class LoginTest {

	
	//EbayHomePage eBayHomePage = new EbayHomePage();
	//SoftAssert softAssert = new SoftAssert();
	
	WebDriver driver;
	TestDataProvider testdata;
	EbayLaunch ebay;
	TakeScreenShotI sshot;
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeClass
	public void setUp() {

		ebay = new EbayLaunch();
		testdata = new TestDataProvider();
		driver = ebay.browserInitilization("chrome");
		sshot = new TakeScreenShotI();
		ExtentSparkReporter reporter = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports/ebay.html"));
		report = new ExtentReports();
		logger = report.createTest("MyFirstTest");
		report.attachReporter(reporter);
	}
	
	@Test
	public void loginTestCase() {
		
		logger.log(Status.INFO,"Starting the Test");
		logger.info(" Login Test Case");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.loginApp(testdata.getUsername(0, 1, 0), testdata.getpassword(0, 1, 1));
		//assertEquals(eBayHomePage.greetingMessage, "Hello");
		//softAssert.assertEquals(EbayHomePage.greetingMessage, "Hello","validate Hello Greeting");
		sshot.takescreenshots(driver);
		
		report.flush();
		
	}
	
	@Test
	public void loginTestCase2() {
		
		driver = ebay.browserInitilization("chrome");
		logger.log(Status.INFO,"Starting the Test2");
		logger.info(" Login Test Case2");
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.loginApp(testdata.getUsername(0, 1, 0), testdata.getpassword(0, 1, 1));
		
		sshot.takescreenshots(driver);
		
		report.flush();
		
	}
	
	

	
}
