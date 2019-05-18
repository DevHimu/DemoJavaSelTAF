package tests;

import base.BasePage;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SearchPage;

public class ProceedForCheckOut extends BasePage{
	
	
	@org.testng.annotations.Test
	public void proceedForCheckOutWithOutLogin()
	{		
		HomePage.searchItem();
		SearchPage.clickedOnSearchedItem();
		ProductPage.addToCart();
		ProductPage.verifyItemHasProceededForCheckOut();
		ProductPage.proceedForCheckout();
		LoginPage.verifySignInPageHasDisplayed();
	}

}
