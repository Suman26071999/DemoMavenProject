package TestCases;

import org.automation.base.Base_Test;
import org.automation.elementary_repository.Billingaddress;
import org.automation.generic_utility.ReadTestData;
import org.automation.generic_utility.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utility.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utility.ReadTestData.InvalidTestCaseIdException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC03_BuyProduct extends Base_Test{
	
public ReadTestData readData;
	
	@DataProvider
	public String[][] billingdDetails() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException {
		readData = new ReadTestData();
		String[][] registerationData = readData.readTestDataFromExcel("Sheet2","User-1");
		return registerationData;
	}
	
	@Test(dataProvider="billingdDetails")
	public void registerUser(String [] registrationData) {
		String fname = registrationData[0];
		String lname = registrationData[1];
		String EmanilId = registrationData[2];
		String City = registrationData[3];
		String Address = registrationData[4];
		String phno=registrationData[5];
		String Zipcode = registrationData[6];
		
		System.out.println(fname);
		//Billingaddress aderss=new Billingaddress(driver);
	    
		
		//WebDriver driver = new ChromeDriver();
		//driver.get(readData.readDataFromPropertyFile("url"));
		
		driver.quit();
	}
}



