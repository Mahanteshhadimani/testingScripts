package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Reporter;
import org.testng.Reporter;

/**
 * @author Mahantesh
 *
 */
public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}*/
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_searchInput']")
	WebElement searchBox;
	
	@FindBy(how = How.XPATH, using="//button[@class='btn btn-search']")
	WebElement searchButton;
	
	@FindBy(how = How.XPATH, using="//ul[@id='atg_store_catNav']/li/a[contains(text(),'Products')]")
	WebElement productsMenu;
	
	@FindBy(how = How.XPATH, using="//li[@id='sub-li']/a[contains(text(),'Bearings')]")
	WebElement bearingsProductMenu;
	
	@FindBy(how = How.XPATH, using="//div[@class='row']//a[@title='Mounted Bearings']")
	WebElement firstCategoryLink;
	
	@FindBy(how = How.XPATH, using="//div[@class='row']//a[@title='Ball']")
	WebElement firstProductLink;
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'Pillow Block & Flanges')]")
	WebElement firstSubProductLink;
	
	@FindBy(how = How.XPATH, using="//h3[contains(text(),'100-MS_STAMPED STEEL HOUSING')]")
	WebElement firstproductTitleLink;
	
	@FindBy(how = How.XPATH, using="//h3[contains(text(),'200CL_CONNECTING LINK ')]")
	WebElement productTitleLink;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_behavior_addItemToCart']")
	WebElement addToCartButtononPDP;
	
	@FindBy(how = How.XPATH, using="//span[@id='cartItems']")
	WebElement viewCartLink;
	
	@FindBy(how = How.XPATH, using="//a[@id='viewFullCartUrl']")
	WebElement viewFullCartButton;
	
	@FindBy(how = How.XPATH, using="//input[@title='Quantity' and @targetbutton='atg_store_update_2']")
	WebElement cartQTYinputBox;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_update_2']")
	WebElement cartUpdateButton;
	
	@FindBy(how = How.XPATH, using="//span/input[@id='atg_store_checkout']")
	WebElement cartCheckoutButton;
	
	@FindBy(how = How.XPATH, using="//input[@value='Guest Checkout']")
	WebElement guestCheckoutButton;
	//----------------------------
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_EmailInput']")
	WebElement emailInputBox;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_lastNameInput']")
	WebElement lastNameInputBox;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_firstNameInput']")
	WebElement firstNameInputBox;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_streetAddressInput']")
	WebElement streetNameInputBox;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_localityInput']")
	WebElement cityNameInputBox;
	
	@FindBy(how = How.XPATH, using="//select[@id='atg_store_stateSelect']")
	WebElement stateDropDown;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_postalCodeInput']")
	WebElement zipCodeInputBox;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_telephoneInput']")
	WebElement phoneInputBox;
	
	@FindBy(how = How.XPATH, using="//input[@value='Ship to this Address']")
	WebElement shipThisAddressButton;
	
	@FindBy(how = How.XPATH, using="//h3[contains(text(),' UM-5309-B')]")
	WebElement productTitle1Link;
	
	@FindBy(how = How.XPATH, using="//span[@class='atg_store_basicButton']")
	WebElement continueButtonOnShippingMethod;
	
	@FindBy(how = How.XPATH, using="//*[@class='atg_store_creditCardForm fix-cc-form-fields']/div[@class='section-2 title toggle-trigger']")
	WebElement expandCreditCardSection;
	
	//-----------------
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_nickNameInput']")
	WebElement nickNameCC;
	
	@FindBy(how = How.XPATH, using="//select[@id='atg_store_cardTypeSelect']")
	WebElement selectCC;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_cardNumberInput']")
	WebElement enterCC;
	
	@FindBy(how = How.XPATH, using="//select[@id='atg_store_expirationDateMonthSelect']")
	WebElement selectMonth;
	
	@FindBy(how = How.XPATH, using="//select[@id='atg_store_expirationDateYearSelect']")
	WebElement selectYear;
	
	@FindBy(how = How.XPATH, using="//input[@id='atg_store_verificationNumberInput']")
	WebElement enterCVV;
	
	@FindBy(how = How.XPATH, using="//*[@id='atg_store_selectAddress']/div[@class='section-2 title toggle-trigger']")
	WebElement useExistingAddress;
	
	@FindBy(how = How.XPATH, using="//*[@id='creditcard_savedaddress']//input[@value='Continue']")
	WebElement continueOnBilling;
	
	public void enterNickNameCC(String nickName)
	{
		nickNameCC.sendKeys(nickName);
	}
	
	public void clickOncontinueOnBilling()
	{
		continueOnBilling.click();
	}

      public void selectCCValue(int index)
       {
           Select cc=new Select(selectCC);
            cc.selectByIndex(2);
       }

        public void enterCCnumber(String ccNumber)
	{
		enterCC.sendKeys(ccNumber);
	}

public void selectMonthDropDown(int index)
       {
           Select mm=new Select(selectMonth);
            mm.selectByIndex(2);
       }

public void selectYearDropDown(int index)
       {
           Select yy=new Select(selectYear);
            yy.selectByIndex(2);
       }

public void enterCVVValue(String cvv)
       {
           enterCVV.sendKeys(cvv);
       }





public void clickuseExistingAddress()
{
	useExistingAddress.click();
}

	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
	public void clickexpandCreditCardSection()
	{
		expandCreditCardSection.click();
	}

	public void clickcontinueButtonOnShippingMethod()
	{
		continueButtonOnShippingMethod.click();
	}
	
	public void clickproductTitle1Link()
	{
		productTitle1Link.click();
	}
	public void enterProductId(String productID)
	{
		searchBox.sendKeys(productID);
	}
	
	public void clickProductsMenu()
	{
		productsMenu.click();
	}
	
	public void clickbearingsProductMenu()
	{
		bearingsProductMenu.click();
	}
	//firstSubProductLink
	
	public void clickfirstSubProductLink()
	{
		firstSubProductLink.click();
	}
	public void clickfirstCategoryLink()
	{
		firstCategoryLink.click();
	}
	
	public void clickaddToCartButton1()
	{
		firstProductLink.click();
	}
	
	public void clickfirstProductLink()
	{
		firstproductTitleLink.click();
	}
		
	public void clickproductTitleLink()
	{
		productTitleLink.click();
	}
	
	public void clickaddToCartButtononPDP()
	{
		addToCartButtononPDP.click();
	}
	
	public void clickviewCartLink()
	{
		viewCartLink.click();
	}
	public void clickviewFullCartButton()
	{
		viewFullCartButton.click();
	}
	public void updateQtyOnCart(String qty)
	{
		cartQTYinputBox.clear();
		cartQTYinputBox.sendKeys(qty);;
	}
	
	public void clickcartUpdateButton()
	{
		cartUpdateButton.click();
	}
	
	public void clickcartCheckoutButton()
	{
		cartCheckoutButton.click();
	}


	
	public void clickguestCheckoutButton()
	{
		guestCheckoutButton.click();
	}
	
	//----------------
	
	public void enteEmailAddress(String email)
	{
		emailInputBox.sendKeys(email);
	}

        public void enteFirstName(String fName)
	{
		firstNameInputBox.sendKeys(fName);
	}

        public void enteLastName(String lName)
	{
		lastNameInputBox.sendKeys(lName);
	}

        public void enteStreetName(String streetName)
	{
		streetNameInputBox.sendKeys(streetName);
	}

        public void enteCity(String cityName)
	{
		cityNameInputBox.sendKeys(cityName);
	}

        public void enterZipcode(String zipCode)
	{
		zipCodeInputBox.sendKeys(zipCode);
	}

        public void entePhoneNumber(String phoneNumber)
	{
		phoneInputBox.sendKeys(phoneNumber);
	}

    public void selectState(int index)
    {
      Select state=new Select(stateDropDown);
      state.selectByIndex(index);
    }

    
	public void clickshipThisAddressButton()
	{
    	shipThisAddressButton.click();
	}

}
