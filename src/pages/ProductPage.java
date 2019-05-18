package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BasePage;

public class ProductPage {
	

	static WebDriver driver=BasePage.getDriver();
	static WebElement addcart=driver.findElement(By.id("add-to-cart-button"));
	public static WebElement proceedToCheckout()
	{
		return driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input"));
	}
	//static WebElement proceedtoCheckout=
	
	
	private static void verifyCorrectitemHasDisplayed()
	{
		Assert.assertTrue(addcart.isDisplayed(),"Product Page is not displayed ");
		System.out.println("Product Page is displayed");
	}
	
	public static void addToCart()
	{
		verifyCorrectitemHasDisplayed();
		
		System.out.println("Let's add item to cart");
		addcart.click();
		BasePage.waitForPageToLoad();
		
	}
	
	public static void verifyItemHasProceededForCheckOut()
	{
		WebDriverWait wait=new WebDriverWait(driver,15);
		WebElement proceedToCheckout=wait.until((ExpectedConditions.visibilityOf(proceedToCheckout())));
		Assert.assertTrue(proceedToCheckout.isDisplayed()," proceed for checkout is not displayed for product");
		
	}
	
	public static void proceedForCheckout()
	{
		proceedToCheckout().click();
		System.out.println("item is proceeded for checkout");
		BasePage.waitForPageToLoad();
	}
}
