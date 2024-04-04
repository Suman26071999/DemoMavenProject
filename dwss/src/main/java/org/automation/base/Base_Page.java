package org.automation.base;


import org.automation.generic_utility.InitObjects;
import org.automation.generic_utility.ReadTestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class Base_Page extends InitObjects {
	  
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(linkText="Login")
    private WebElement LoginLink;
    
    @FindBy(linkText="Register")
    private WebElement RegisterLink;
    
    @FindBy(linkText="Shopping cart") 
	private WebElement shoppingCartLink;
    
    @FindBy(linkText="Wishlist") 
	private WebElement wishListLink;
    
    @FindBy(id="id=small-searchterms")
    private WebElement Searchbar;
    
    @FindBy(xpath="//input[@value='Search']")
    private WebElement searchbutton;
    
    @FindBy(linkText="BOOKS")
    private WebElement BooksModule;
    
    public WebElement getBooksModule() {
		return BooksModule;
	}

	@FindBy(partialLinkText="COMPUTERS")
    private WebElement ComputersModule;
    
    @FindBy(partialLinkText="ELECTRONICS")
    private WebElement ElectronicsModule;
    
    @FindBy(partialLinkText="APPAREL & SHOES")
    private WebElement ApparelAndShoesModule;
    
    @FindBy(partialLinkText="DIGITAL DOWNLOADS")
    private WebElement DigitalDownloadsModule;
    
    @FindBy(partialLinkText="JEWELRY")
    private WebElement JewelryModule;
    
    @FindBy(partialLinkText="GIFTCARDS")
    private WebElement GiftCardsModule;

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getSearchbar() {
		return Searchbar;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getElectronicsModule() {
		return ElectronicsModule;
	}

	public WebElement getApparelAndShoesModule() {
		return ApparelAndShoesModule;
	}

	public WebElement getDigitalDownloadsModule() {
		return DigitalDownloadsModule;
	}

	public WebElement getJewelryModule() {
		return JewelryModule;
	}

	public WebElement getGiftCardsModule() {
		return GiftCardsModule;
	}

	public void setComputersModule(WebElement computersModule) {
		ComputersModule = computersModule;
	}
	
	public ReadTestData readData;
	
  }
