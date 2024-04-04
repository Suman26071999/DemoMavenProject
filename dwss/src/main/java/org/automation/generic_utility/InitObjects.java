package org.automation.generic_utility;



import org.automation.elementary_repository.Home_Page;
import org.automation.elementary_repository.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitObjects implements FrameWorkConstants {
	
	public static WebDriver static_driver_ref;
	public static WebDriver driver;
	public InitObjects initClass; 
	public ReadTestData readData;
	public WebDriverWait explicitWait;
	public Login_Page loginPage;
    public Home_Page homePage;
	public String url;
	public String emailId;
	public String password;
	
    public ActionsUtil getActionsUtil(WebDriver driver) {
	    return new ActionsUtil(driver);
    }
	
	public JavaScriptUtil getJavaScriptUtil(WebDriver driver) {
		return new JavaScriptUtil();
	}
	 public ReadTestData getReadTestData(WebDriver driver) {
		 return new ReadTestData();
    }
	 public UtilityMethods getUtilityMethods() {
		 return new UtilityMethods();
	}

}