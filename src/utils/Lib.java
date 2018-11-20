package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Lib implements IFileLocation{

	public static String getPropertyValue(String key){
		String propertyValue="";
		Properties prop=new Properties();
		try{
			prop.load(new FileInputStream(CONFIG_PATH));
			propertyValue= prop.getProperty(key);
		}catch (Exception e) {
			
		}
		return propertyValue;
	}
	
	
	public static void getFailedTestCaseScreenShot(WebDriver driver, String testCaseName){
		try {
			Date date=new Date();
			String currentDate = date.toString().replaceAll(":", "_");
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileHandler.copy(srcFile, new File("./failedTestScreenShot/"+testCaseName+"_"+currentDate+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
