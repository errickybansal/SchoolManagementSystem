package pages;

import org.openqa.selenium.By;

import base.Base;

public class HomePage extends Base {
	
	String loginMenuXpath = "//button[text()='Login']";
	
	public void clickLoginMenu() {
		driver.findElement(By.xpath(loginMenuXpath)).click();
	}

}
