package org.automation.elementary_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billingaddress extends Base_Page{
	
	public Billingaddress(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstname;

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lastname;

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement EmailId;

	@FindBy(id = "BillingNewAddress_City")
	public WebElement City;

	@FindBy(id = "BillingNewAddress_Address1")
	public WebElement Address;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement Zipcode;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phno;

	public WebElement getZipcode() {
		return Zipcode;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return EmailId;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getPhno() {
		return phno;
	}

	public void Users(String fname,String lname,String Email,String address,String city, String zipcode, String Phno) {
		
		firstname.clear();
		firstname.sendKeys(fname);
		lastname.clear();
		lastname.sendKeys(lname);
		EmailId.clear();
		EmailId.sendKeys(Email);
		City.clear();
		City.sendKeys(city);
		Address.clear();
		Address.sendKeys(address);
		phno.clear();
		phno.sendKeys(Phno);
		Zipcode.clear();
		Zipcode.sendKeys(zipcode);
		
		
	}
}
