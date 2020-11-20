package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.junit.Assert;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	@Test(priority =1 )
	public void validUserShouldBeAbleToLogInlogin() {
		
		driver = BrowserFactory.init();
		
		
		//LoginPage login1 = new LoginPage();                                          //arguments
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSigninButton();
	
		DashboardPage dashboard = PageFactory.initElements(driver,  DashboardPage.class);
		dashboard.validateDashboard();
		
		BrowserFactory.tearDown();
		
	}
		
		
		@Test(priority = 2)
		public void invalidUserShouldBeAbleToLogInlogin() {
			
			driver = BrowserFactory.init();
			
			//LoginPage login1 = new LoginPage();
			                                          //arguments
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.enterUserName("demo@techfios.commmm");
			login.enterPassword("abc12333");
			login.clickSigninButton();
			DashboardPage dashboard = PageFactory.initElements(driver,  DashboardPage.class);
			dashboard.validateDashboard();
			
			BrowserFactory.tearDown();
		}
}	
		
		
	
			 