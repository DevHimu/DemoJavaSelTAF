package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.BasePage;
import base.Constants;

public class LoginPage extends BasePage{

	static WebDriver driver=BasePage.getDriver();
	
	public static void verifySignInPageHasDisplayed()
	{
		BasePage.waitForPageToLoad();
		Assert.assertEquals(driver.getTitle(),Constants.AmazonLoginTitle,"Amazon Sign In page has not displayed");
		System.out.println(Constants.AmazonLoginTitle+" Page has displayed successfully");
	}
	
	
	
}
