package org.outomation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	@FindBy(linkText="Log in") 
	private WebElement loginLink;
	
	@FindBy(linkText="Register") 
	private WebElement registerLink;
	

}
