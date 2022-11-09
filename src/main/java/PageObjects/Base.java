package PageObjects;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import helpers.TakeScreenShotI;
import helpers.TestDataProvider;

public class Base {
	
	WebDriver driver;
	TestDataProvider testdata;
	EbayLaunch ebay;
	TakeScreenShotI sshot;
	ExtentReports report;
	ExtentTest logger;

	
	
	@AfterMethod
	public void afterMethod(ITestResult testResult) {

		if (testResult.getStatus() == ITestResult.FAILURE) {
			sshot.takescreenshots(driver);
			//logger
			System.out.println("This testcase was failed: " + testResult.getMethod().getMethodName());
			
		}
		else if (testResult.getStatus() == ITestResult.SUCCESS) {
			
			sshot.takescreenshots(driver);
			System.out.println("This testcase is passed: " + testResult.getName());

		}

	}
	
	@AfterClass
	public void tearDown() {

		driver.quit();

	}


}
