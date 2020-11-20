package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	@Test
	public void userShouldBeAbleToAddCustomer() {
             driver = BrowserFactory.init();
	
		//LoginPage login1 = new LoginPage();  
                                                 //arguments
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSigninButton();
	
		DashboardPage dashboard = PageFactory.initElements(driver,  DashboardPage.class);
		dashboard.validateDashboard();
		
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.clickOnCustomerButton();
		addCustomer.clickOnAddCustomerButton();
		addCustomer.enterName("JuneSelenium");
		addCustomer.enterCompanyName("Techfios");
		addCustomer.enterEmail("@techfios.com");
		addCustomer.enterPhoneNumber("3467028060");
		addCustomer.enterAddress("19221 Beechnut st.");
		addCustomer.enterCity("Richmond");
		addCustomer.enterState("Texas");
		addCustomer.enterZip("77407");
		addCustomer.enterCountryName("Austria");
		addCustomer.clickOnSubmitButton();
		//BrowserFactory.tearDown();
		
		
		
}
	
	
}