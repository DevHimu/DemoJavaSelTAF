package com.amazonTest.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Intialize the driver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//navigate to Amazon.com
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		
		//Home Page
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		//Send text to Input box 
		//Bburago Ferrari Race and Play LaFerrari 1/24 Scale Diecast Model Vehicle Red
		String itemToSearch="Bburago Ferrari Race and Play LaFerrari 1/24 Scale Diecast Model Vehicle Red";
		searchBox.sendKeys(itemToSearch);
		searchBox.sendKeys(Keys.ENTER);
				
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.findElement(By.cssSelector("a[href*='Bburago-Ferrari-LaFerrari-Diecast-Vehicle']")).click();
		
		//Go to product page
		//And do add to cart item
		WebElement addcart= driver.findElement(By.id("add-to-cart-button"));
		addcart.click();
		
		//Verify Proceed to checkout
		WebElement proceedToCheckOut=driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input"));
		proceedToCheckOut.click();
		
		Thread.sleep(5000);
		System.out.println("Test has completed");
		
		driver.close();		
		
	}

}
