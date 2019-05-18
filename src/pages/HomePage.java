package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import base.BasePage;
import base.Constants;

public class HomePage extends BasePage {
	
	
	
	static WebDriver driver=BasePage.getDriver();
	
	private static  WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
	

	
	public static void searchItem()
	{
		System.out.println("Let's search the item : "+Constants.itemToSearch);
		searchBox.sendKeys(Constants.itemToSearch);
		searchBox.sendKeys(Keys.ENTER);	
		BasePage.waitForPageToLoad();
	}
	
	
	
}
