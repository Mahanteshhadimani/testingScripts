package utils;

public interface IFileLocation {

	String GECKO_KEY="webdriver.gecko.driver";
	String GECKO_VALUE=System.getProperty("user.dir") + "/drivers/geckodriver.exe";
	
	String CHROME_KEY="webdriver.chrome.driver";
	String CHROME_VALUE=System.getProperty("user.dir") + "/drivers/chromedriver.exe";
	
	String EXCEL_PATH="/Not_Have_Access";
	String CONFIG_PATH="./config.properties";
}
