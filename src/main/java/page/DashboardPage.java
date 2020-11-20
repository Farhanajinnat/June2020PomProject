package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.testng.Assert;



//import static org.junit.Assert.assertEquals;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Element Library
	@FindBy(how = How.XPATH,using = "//h2[contains(text(), 'Dashboard')]")
	WebElement DASHBOARD_VALIDATION_ELEMENT;
	
	//Interactive Method
	
	public void validateDashboard() {
        Assert.assertEquals(DASHBOARD_VALIDATION_ELEMENT.getText(),"Dashboard", "Wrong page!!");
		//String actual = DASHBOARD_VALIDATION_ELEMENT.getText();
		//System.out.println("Actual Dahsboard Text: "+actual);
		//assertEquals("Dashboard", actual);

}
}