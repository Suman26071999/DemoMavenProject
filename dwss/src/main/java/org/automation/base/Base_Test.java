package org.automation.base;

import java.time.Duration;

import org.automation.elementary_repository.Login_Page;
import org.automation.generic_utility.InitObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base_Test extends InitObjects {
	

// @Parameters("browser")
// @BeforeClass(alwaysRun = true)	
// public void browserSetUp(@Optional("novalue") String browserName)  {
//	 initClass=new InitObjects();
//	 readData = initClass.getReadTestDaa(driver);
//	 if(browserName.equalsIgnoreCase("naValue")){
//		browserName=readData.readDataFromPropertyFile("browser");
//		if(browserName.equalsIgnoreCase("null")) {
//			Reporter.log("Pass the valid browser name");
//			//throw new InvalidBrowserValueException();
//		}
//	 }
//	 if (browserName.equalsIgnoreCase("chrome")) {
//		driver=new ChromeDriver(); 
//		Reporter.log("Successfully Launched chrome Browser", true );
//	 } else if(browserName.equalsIgnoreCase("firefox")) {
//		 driver=new FirefoxDriver();
//		 Reporter.log("Successfukky launched firefox browser", true);
//	 }
//	 driver.manage().window().maximize();
//	 Reporter.log("Browser window is maximized successfully", true);
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIMEOUT));
//	 explicitWait =new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_TIMEOUT));
//     }
// 
//	 @BeforeMethod(alwaysRun=true)
//	 public void loginToApplication() {
//		 url=readData.readDataFromPropertyFile("url");
//		 emailId=readData.readDataFromPropertyFile("emailId");
//		 password=readData.readDataFromPropertyFile("password");
//		 
//		 driver.get(url);
//		 loginPage=new Login_Page(driver);
//		 homePage=loginPage.login(emailId, password);
//		 
//	 }
	
	@BeforeClass
	public void launchURL() {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIMEOUT));
		initClass=new InitObjects();
		readData = initClass.getReadTestData(driver);
		url=readData.readDataFromPropertyFile("url");
		driver.get(url);
		//driver.findElement(By.linkText("Log in")).click();
	}
	
	@BeforeMethod
	public void loginToAppliacation() {
		
		WebElement mailId = driver.findElement(By.id("Email"));
		WebElement pwd = driver.findElement(By.id("Password"));
		
		mailId.clear();
		mailId.sendKeys(emilId);
		
		pwd.clear();
		pwd.sendKeys(pwdd);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	//@AfterClass
	public void tearDown()
	{
	driver.quit();
	}
	 
}



