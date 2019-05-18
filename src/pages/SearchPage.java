package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BasePage;

public class SearchPage extends BasePage{

	static WebDriver driver=BasePage.getDriver();
	static WebElement searchedItem=driver.findElement(By.cssSelector("a[href*='Bburago-Ferrari-LaFerrari-Diecast-Vehicle']"));
	
	private static void verifyCorrectitemHasDisplayed()
	{
		Assert.assertTrue(searchedItem.isDisplayed(),"Item is not displayed on page");
	}
	public static void clickedOnSearchedItem()
	{
		verifyCorrectitemHasDisplayed();
		System.out.println("Item has displayed on page");
		System.out.println("Let's Click On item for product page");
		searchedItem.click();
		BasePage.waitForPageToLoad();
	}
}
