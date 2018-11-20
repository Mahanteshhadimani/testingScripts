package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;

import utils.BrowserSetup;
import utils.CommonSteps;

public class viewStoreHomeSearchProduct extends BrowserSetup{
//  WebDriver driver;
	//Logger log=Logger.getLogger(verifyLoginFunctionality.class);
  @Test
  public void SearchProductInvalid() throws InterruptedException
  {
	  HomePage hPage=new HomePage(driver);
	  Thread.sleep(2000);
      hPage.enterProductId("203KDDD");
      Thread.sleep(2000);
      hPage.clickOnSearchButton();
      Thread.sleep(3000);


  }
  @Test
  public void SearchProductValid() throws InterruptedException
  {
	  HomePage hPage=new HomePage(driver);
      Thread.sleep(2000);
      hPage.enterProductId("203KDD");
      Thread.sleep(2000);
      hPage.clickOnSearchButton();
      Thread.sleep(2000);


  }
 
}
