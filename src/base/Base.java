package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	
	public static WebDriver  setDriver(String browser)
	{
		if(browser==Constants.ChromeBrowser)
		{
			driver=new ChromeDriver();
		}
		
		return driver;
	}
	
	public  static void navigateToURl(String URL)
	{
		setDriver(Constants.ChromeBrowser).navigate().to(Constants.URL);
	}
	

	
	
}
