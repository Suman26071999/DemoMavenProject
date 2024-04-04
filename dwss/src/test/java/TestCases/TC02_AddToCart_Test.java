package TestCases;

import org.automation.base.Base_Page;
import org.automation.base.Base_Test;
import org.automation.elementary_repository.Billingaddress;
import org.automation.elementary_repository.Books_Page;
import org.automation.generic_utility.ReadTestData;
import org.automation.generic_utility.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utility.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utility.ReadTestData.InvalidTestCaseIdException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC02_AddToCart_Test extends Base_Test{
	
	@Test
	public void AddProd() {
		Base_Page bp=new Base_Page(driver);
		bp.getBooksModule().click();
		
		Books_Page books=new Books_Page(driver);
	    books.clickOnAddToCart();
	    books.selectsortby();
	    bp.getShoppingCartLink().click();
	    books.CheckBox();
	    books.checkout();
	    
	    Billingaddress address=new Billingaddress(driver);

	}
}
	   
	


