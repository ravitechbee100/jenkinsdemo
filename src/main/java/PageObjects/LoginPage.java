package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;

import helpers.TestDataProvider;

public class LoginPage {
	
	WebDriver driver;
	ExtentTest logger;
	
	
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
	private WebElement sigininLink;

	@FindBy(id = "userid")
	private WebElement username;
	
	

	@FindBy(id = "signin-continue-btn")
	private WebElement continuebtn;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(id = "sgnBt")
	private WebElement signinButton;

	public WebElement signinLInk() {

		return sigininLink;
	}

	public WebElement userName() {

		return username;
	}
	
	
	public WebElement continueButton() {

		return continuebtn;
	}

	public WebElement password() {

		return password;
	}

	public WebElement signBtn() {

		return signinButton;
	}

	public void loginApp(String username, String password) {
		
		
		signinLInk().click();
		//logger.info("Sign Link clicked");
		userName().sendKeys(username);
		//logger.info("User entered username");
		continueButton().click();
		//logger.info("user clicked on continue button");
		password().sendKeys(password);
		//logger.info("user enter password");
		signBtn().click();
		//logger.info("user clicked on sign in button");

	}

}
