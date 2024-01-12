package componentsTests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base {
	
	@BeforeSuite
	public void startUp() {
		driver.get("https://www.jobhero.com/");
	}
	
	@Test
	public void testUserName() {
		HomePage hp = new HomePage();
		
		hp.clickLoginMenu();
		LoginPage lp = new LoginPage();
		lp.enterDataInEmailAddress("ricky@an.com");
	}



}
