package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_addToCart extends BasePage_addToCart {
	
	public HomePage_addToCart(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='search']")
	WebElement searchBar;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement searchProduct;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchBtn;
	
	@FindBy(xpath="//img[@title='MacBook Air']")
	WebElement macBookProduct;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	WebElement shoppingCartBtn;
	
	
	public void clickSearchBar()
	{
		searchBar.click();
	}
	
	public void searchProductName(String ProductName){
		searchProduct.sendKeys(ProductName);
	}
	
	public void clkserchbtn() {
		searchBtn.click();
	}
	
	public void productlink() {
		macBookProduct.click();
	}
	
	public void addtocartbtn() {
		addToCartBtn.click();
	}
	public void chkCart() {
		shoppingCartBtn.click();
	}

	
}
