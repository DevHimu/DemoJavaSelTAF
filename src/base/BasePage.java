package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class BasePage  extends Base{
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static Timeouts waitForPageToLoad()
	{
		return BasePage.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@BeforeTest
	public void initialize()
	{
		
		Base.navigateToURl(Constants.URL);
		BasePage.getDriver().manage().window().maximize();
		BasePage.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String expTitle="";
		String actTitle="/html/head/title/text()";
		
		//Verify Home Page has displayed
		Assert.assertTrue(actTitle.contains(expTitle)?true:false,expTitle+" page is not displayed");
		
				
	}

	@AfterSuite
	public void truncate()
	{
		//getDriver().close();
		getDriver().quit();
	}
}
