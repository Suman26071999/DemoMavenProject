package org.automation.elementary_repository;

import org.automation.base.Base_Page;
import org.automation.generic_utility.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Books_Page extends Base_Page  {

	public Books_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Computing and Internet']/../../..//input")
	public WebElement addToCartButton;
	
	public void clickOnAddToCart(){
		addToCartButton.click();
	}
	
	@FindBy(id="products-orderby") 
	public WebElement sortBy;
	
	public void selectsortby() {
	UtilityMethods ut=new UtilityMethods();
	ut.selectDropDown(sortBy,"Price: Low to High");
	}
	
	@FindBy(id="termsofservice")
    public WebElement CheckBox;
    
	public void CheckBox() {
		CheckBox.click();
	}
	
	@FindBy(id="checkout")
	public WebElement CheckOutButton;
	
	public void checkout(){
		CheckOutButton.click();
	}
	
	
	
	
}
