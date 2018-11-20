package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;

import utils.BrowserSetup;
import utils.CommonSteps;
//import utils.Log;

public class placeOrder extends BrowserSetup{
	
	
	@Test
	  public void PlaceOrder() throws InterruptedException
	  {
		HomePage hPage=new HomePage(driver);
		  //lPage.openLoginPage(super.baseUrl);
		hPage.clickProductsMenu();
	///	Thread.sleep(5000);
		hPage.clickbearingsProductMenu();
		//hPage.clickfirstCategoryLink();
		//hPage.clickaddToCartButton1();
		
		///hPage.clickfirstSubProductLink();
	//	hPage.clickfirstProductLink();
		hPage.clickproductTitle1Link();
		hPage.clickaddToCartButtononPDP();
		Thread.sleep(2000);
		hPage.enterProductId("200CL");
	    hPage.clickOnSearchButton();
	    hPage.clickproductTitleLink();
	    hPage.clickaddToCartButtononPDP();
	    Thread.sleep(2000);
	    hPage.clickviewCartLink();
	    Thread.sleep(5000);
	    hPage.clickviewFullCartButton();
	    Thread.sleep(3000);
	    hPage.updateQtyOnCart("10");
	    Thread.sleep(3000);
	    hPage.clickcartUpdateButton();
	    Thread.sleep(3000);
	    hPage.clickcartCheckoutButton();
	    Thread.sleep(3000);
	    hPage.clickguestCheckoutButton();
	    
	    hPage.enteEmailAddress("abc@gmail.com");
	    hPage.enteFirstName("test1");
	    hPage.enteLastName("test2");
	    hPage.enteStreetName("1st Main");
	    hPage.enteCity("New York");
	    hPage.entePhoneNumber("1234567890");
	    hPage.enterZipcode("12345");
	    hPage.selectState(3);
	    Thread.sleep(2000);
	    hPage.clickshipThisAddressButton();
	    Thread.sleep(2000);
	    hPage.clickcontinueButtonOnShippingMethod();
	    Thread.sleep(2000);
	    hPage.clickexpandCreditCardSection();
	    hPage.enterNickNameCC("test");
	    hPage.selectCCValue(1);
	    hPage.enterCCnumber("4111111111111111");
	    hPage.selectMonthDropDown(2);
	    hPage.selectYearDropDown(5);
	    hPage.enterCVVValue("123");
	    Thread.sleep(2000);
	    hPage.clickuseExistingAddress();
	    Thread.sleep(2000);
	    hPage.clickOncontinueOnBilling();
	    Thread.sleep(2000);
	    
	  
}
}
