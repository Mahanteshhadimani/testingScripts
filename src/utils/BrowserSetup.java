package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BrowserSetup implements IFileLocation {

	public static WebDriver driver;

	static{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	@BeforeClass
	public void openApplication(){

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url = Lib.getPropertyValue("URL");
		driver.get(url);
		String ITO = Lib.getPropertyValue("ImplicitWait");
		long timeOuts = Long.parseLong(ITO);
		driver.manage().timeouts().implicitlyWait(timeOuts, TimeUnit.SECONDS);
		
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		  String browserName = caps.getBrowserName();
		  String browserVersion = caps.getVersion();
		  
		  //Get OS name.
		  String os = System.getProperty("os.name").toLowerCase();
		 // System.out.println("OS = " + os + ", Browser = " + browserName + " "+ browserVersion);
		Reporter.log("Browser : " + browserName + ", Version : "+ browserName +" on OS : "+ os +" launched", true);
	//	Log.info("Browser Launched");
		
	}
	@AfterMethod
	public void TakeScreenshot(ITestResult result){
		try {
			if(ITestResult.FAILURE==result.getStatus()){
				Lib.getFailedTestCaseScreenShot(driver, result.getName());
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			
		}
		
	}
	
	@AfterClass
	public void closeBrowser(){
	
			driver.close();
		}
}
