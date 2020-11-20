package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
	this.driver = driver;
	}
	//Element Library
	@FindBy(how = How.LINK_TEXT, using = "Customers")
	WebElement CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='city']")
	WebElement CITY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id='state']")
	WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//*[@id='zip']")
	WebElement ZIP_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_FIELD_LOCATOR;
	@FindBy(how=How.XPATH, using ="//*[@id=\'submit\']")
	WebElement SUBMIT_FIELD_LOCATOR;

	//Interactive Method
	public void clickOnCustomerButton() {
		Locatable hoverItem = (Locatable)CUSTOMER_FIELD_LOCATOR;
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		mouse.mouseMove(hoverItem.getCoordinates());
		CUSTOMER_FIELD_LOCATOR.click();
	}
	public void clickOnAddCustomerButton() {
		waitForElement(driver, 3, ADD_CUSTOMER_FIELD_LOCATOR);
		ADD_CUSTOMER_FIELD_LOCATOR.click();
	}
		public void enterName(String name) {
			int randomNum = randomNumGenerator();
			waitForElement(driver, 3, USERNAME_FIELD_LOCATOR);
			USERNAME_FIELD_LOCATOR.sendKeys(name + randomNum);
		}
		public void enterCompanyName(String company) {
		   selectFromDropdown(COMPANY_FIELD_LOCATOR, company);
		}
		public void enterEmail(String email) {
			int randomNum = randomNumGenerator();
			 EMAIL_FIELD_LOCATOR.sendKeys(randomNum  + email);
		}
		public void enterPhoneNumber(String phoneNumber) {
			int randomNum = randomNumGenerator();
			PHONE_FIELD_LOCATOR.sendKeys(randomNum + phoneNumber);
		}
		public void enterAddress(String address) {
			ADDRESS_FIELD_LOCATOR.sendKeys(address);
		}
		public void enterCity(String city) {
			 CITY_FIELD_LOCATOR.sendKeys(city);
		}
		public void enterState(String state) {
			 STATE_FIELD_LOCATOR.sendKeys(state);
		}
		public void enterZip(String zip) {
			ZIP_FIELD_LOCATOR.sendKeys(zip);
		}
		public void enterCountryName(String country) {
			selectFromDropdown(COUNTRY_FIELD_LOCATOR, country);
		}
		public void clickOnSubmitButton() {
			SUBMIT_FIELD_LOCATOR.click();
}
}
			
			
		
		

